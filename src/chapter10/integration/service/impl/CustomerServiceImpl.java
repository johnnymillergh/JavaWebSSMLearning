package chapter10.integration.service.impl;

import chapter10.integration.mapper.CustomerMapper;
import chapter10.integration.po.Customer;
import chapter10.integration.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/8/2018
 * Time: 12:00 PM
 */

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);

//        int i = 1 / 0;

        System.out.println(getClass().getSimpleName() + " addCustomer: " + customer);
    }
}
