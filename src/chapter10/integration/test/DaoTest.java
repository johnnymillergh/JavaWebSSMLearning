package chapter10.integration.test;

import chapter10.integration.mapper.CustomerMapper;
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
    public void findCustomerByIdMapperTest() {
        String xmlPath = "chapter10/integration/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);

        Customer customer = customerMapper.findCustomerById(1);

        System.out.println(customer);
    }
}
