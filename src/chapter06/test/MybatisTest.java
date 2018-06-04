package chapter06.test;

import chapter06.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/4/2018
 * Time: 2:24 PM
 */

public class MybatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = sqlSession.selectOne("chapter06.mapper.CustomerMapper.findCustomerById", 1);

        System.out.println(customer);
        sqlSession.close();
    }
}
