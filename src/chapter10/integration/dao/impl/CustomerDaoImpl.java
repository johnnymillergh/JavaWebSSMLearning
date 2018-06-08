package chapter10.integration.dao.impl;

import chapter10.integration.dao.CustomerDao;
import chapter10.integration.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/8/2018
 * Time: 10:51 AM
 */

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {


    @Override
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("chapter10.integration.po.CustomerMapper.findCustomerById", id);
    }
}
