package chapter10.integration.test;

import chapter10.integration.dao.CustomerDao;
import chapter10.integration.po.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/8/2018
 * Time: 10:56 AM
 */

public class DaoTest {
    @Test
    public void findCustomerByIdDaoTest() {
        String xmlPath = "chapter10/integration/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

//        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        // Another way to get been
        CustomerDao customerDao = applicationContext.getBean(CustomerDao.class);

        Customer customer = customerDao.findCustomerById(1);

        System.out.println(customer);
    }
}
