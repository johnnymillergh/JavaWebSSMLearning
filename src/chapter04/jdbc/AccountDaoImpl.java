package chapter04.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/3/2018
 * Time: 10:06 PM
 */

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAccount(Account account) {
        String sql = "insert into account(username, balance) value(?,?)";
        Object[] obj = new Object[]{account.getUsername(), account.getBalance()};
        return jdbcTemplate.update(sql, obj);
    }

    @Override
    public int updateAccount(Account account) {
        String sql = "update account set username=?, balance=? where id=?";
        Object[] obj = new Object[]{account.getUsername(), account.getBalance(), account.getId()};
        return jdbcTemplate.update(sql, obj);
    }

    @Override
    public int deleteAccount(int id) {
        String sql = "delete from account where id=?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id=?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
}
