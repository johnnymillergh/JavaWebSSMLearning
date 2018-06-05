package chapter09.mybatis_introduction.test;

import chapter09.mybatis_introduction.po.Customer;
import chapter09.mybatis_introduction.po.Person;
import chapter09.mybatis_introduction.po.User;
import chapter09.mybatis_introduction.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
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
        Customer customer = sqlSession.selectOne("chapter09.mybatis_introduction.mapper.CustomerMapper.findCustomerById", 1);

        System.out.println(customer);
        sqlSession.close();
    }

    @Test
    public void findCustomerByNameTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        List<Customer> customers = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
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

        int row = sqlSession.insert("chapter09.mybatis_introduction.mapper.CustomerMapper." +
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

        int row = sqlSession.update("chapter09.mybatis_introduction.mapper.CustomerMapper." +
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

        int row = sqlSession.update("chapter09.mybatis_introduction.mapper.CustomerMapper." +
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

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.UserMapper." +
                "findAllUser");

        System.out.println(users);
    }

    @Test
    public void findCustomerByNameAndJobsTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setJobs("teacher");
        customer.setUsername("");

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByNameAndJobs", customer);

        System.out.println(users);
    }

    @Test
    public void findCustomerByNameAndJobs2Test() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setJobs("teacher");
        customer.setUsername("");

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByNameAndJobs2", customer);

        System.out.println(users);
    }

    @Test
    public void findCustomerByNameAndJobs3Test() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setJobs("teacher");
        customer.setUsername("");

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByNameAndJobs3", customer);

        System.out.println(users);
    }

    @Test
    public void findCustomerByNameOrJobsTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setJobs("teacher");
        customer.setUsername("jack");

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByNameOrJobs", customer);

        System.out.println(users);
    }

    @Test
    public void findCustomerByNameOrJobs2Test() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setJobs("teacher");
        customer.setUsername(null);

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByNameOrJobs2", customer);

        System.out.println(users);
    }

    @Test
    public void findCustomerByIdsTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);

        int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByIds", array);

        System.out.println(users);
    }

    @Test
    public void findCustomerByName2Test() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Customer customer = new Customer();
        customer.setUsername("j");

        List<User> users = sqlSession.selectList("chapter09.mybatis_introduction.mapper.CustomerMapper." +
                "findCustomerByName2", customer);

        System.out.println(users);
    }

    @Test
    public void findPersonByIdTest() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        Person person = sqlSession.selectOne("chapter09.mybatis_introduction.mapper.PersonMapper." +
                "findPersonById", 1);

        System.out.println(person);
    }
}
