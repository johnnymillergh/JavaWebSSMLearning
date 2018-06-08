package chapter10.integration.test;

import chapter10.integration.po.Customer;
import chapter10.integration.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/8/2018
 * Time: 12:06 PM
 */

public class TransactionTest {
    @Test
    public void findCustomerByIdMapperTest() {
        String xmlPath = "chapter10/integration/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        Customer customer = new Customer();
        customer.setUsername("Zhangsan");
        customer.setJobs("Manager");
        customer.setPhone("13334446657");

        customerService.addCustomer(customer);

        System.out.println(customer);
    }
}
