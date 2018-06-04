package chapter06.mybatis_introduction.test;

import chapter06.mybatis_introduction.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/4/2018
 * Time: 2:24 PM
 */

public class MybatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception {
        String resource = "chapter06/mybatis_introduction/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = sqlSession.selectOne("chapter06.mybatis_introduction.mapper.CustomerMapper.findCustomerById", 1);

        System.out.println(customer);
        sqlSession.close();
    }

    @Test
    public void findCustomerByNameTest() throws Exception {
        String resource = "chapter06/mybatis_introduction/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Customer> customers = sqlSession.selectList("chapter06.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByName", "j");

        System.out.println(customers);
        sqlSession.close();
    }

    @Test
    public void addCustomerTest() throws Exception {
        String resource = "chapter06/mybatis_introduction/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Customer customer = new Customer();
        customer.setUsername("Marry");
        customer.setJobs("Doctor");
        customer.setPhone("12332324545");

        int row = sqlSession.insert("chapter06.mybatis_introduction.mapper.CustomerMapper." +
                "addCustomer", customer);

        sqlSession.commit();

        if (row > 0) {
            System.out.println("Success: " + row);
        } else {
            System.out.println("Failure");
        }
    }
}
