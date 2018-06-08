package chapter10.integration.mapper;

import chapter10.integration.po.Customer;

public interface CustomerMapper {
    Customer findCustomerById(Integer id);
}
