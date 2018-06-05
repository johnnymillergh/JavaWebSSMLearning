package chapter07.mybatis_introduction.test;

import chapter07.mybatis_introduction.po.Customer;
import chapter07.mybatis_introduction.po.User;
import chapter07.mybatis_introduction.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/4/2018
 * Time: 2:24 PM
 */

public class MybatisTest {
    @Test
    public void findCustomerByIdTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        Customer customer = sqlSession.selectOne("chapter07.mybatis_introduction.mapper.CustomerMapper.findCustomerById", 1);

        System.out.println(customer);
        sqlSession.close();
    }

    @Test
    public void findCustomerByNameTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        List<Customer> customers = sqlSession.selectList("chapter07.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByName", "j");

        System.out.println(customers);
        sqlSession.close();
    }

    @Test
    public void addCustomerTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setUsername("Marry");
        customer.setJobs("Doctor");
        customer.setPhone("12332324545");

        int row = sqlSession.insert("chapter07.mybatis_introduction.mapper.CustomerMapper." +
                "addCustomer", customer);

        sqlSession.commit();

        if (row > 0) {
            System.out.println("Success: " + row);
        } else {
            System.out.println("Failure");
        }
    }

    @Test
    public void updateCustomerTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setId(5);
        customer.setUsername("Marry222");
        customer.setJobs("Doctor");
        customer.setPhone("12332324545");

        int row = sqlSession.update("chapter07.mybatis_introduction.mapper.CustomerMapper." +
                "updateCustomer", customer);

        sqlSession.commit();

        if (row > 0) {
            System.out.println("Success: " + row);
        } else {
            System.out.println("Failure");
        }
    }

    @Test
    public void deleteCustomerTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        int row = sqlSession.update("chapter07.mybatis_introduction.mapper.CustomerMapper." +
                "deleteCustomer", 5);

        sqlSession.commit();

        if (row > 0) {
            System.out.println("Success: " + row);
        } else {
            System.out.println("Failure");
        }
    }

    @Test
    public void findAllUserTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        List<User> users = sqlSession.selectList("chapter07.mybatis_introduction.mapper.UserMapper." +
                "findAllUser");

        System.out.println(users);
    }
}
