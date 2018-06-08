package chapter10.integration.dao;

import chapter10.integration.po.Customer;

public interface CustomerDao {
    Customer findCustomerById(Integer id);
}
