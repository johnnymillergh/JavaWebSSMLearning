package chapter04.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/3/2018
 * Time: 9:30 PM
 */

public class Test {
//    public static void main(String[] args) {
//        String xmlPath = "chapter04/jdbc/applicationContext.xml";
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//
//        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
//
//        jdbcTemplate.execute("create table account(" +
//                "id int primary key auto_increment," +
//                "username varchar(50)," +
//                "balance double)");
//        System.out.println("Created table: account.");
//    }

    @org.junit.Test
    public void mainTest() {
        String xmlPath = "chapter04/jdbc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

        jdbcTemplate.execute("create table account(" +
                "id int primary key auto_increment," +
                "username varchar(50)," +
                "balance double)");
        System.out.println("Created table: account.");
    }

    @org.junit.Test
    public void addAccount() {
        String xmlPath = "chapter04/jdbc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        Account account = new Account();
        account.setUsername("Johnny Miller");
        account.setBalance(1000.0);
        int num = accountDao.addAccount(account);
        if (num > 0) System.out.println("Add success");
        else System.out.println("Add failure");
    }

    @org.junit.Test
    public void updateAccount() {
        String xmlPath = "chapter04/jdbc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        Account account = new Account();
        account.setId(1);
        account.setUsername("Johnny Miller");
        account.setBalance(2000d);
        int num = accountDao.updateAccount(account);
        if (num > 0) System.out.println("Update success");
        else System.out.println("Update failure");
    }

    @org.junit.Test
    public void deleteAccount() {
        String xmlPath = "chapter04/jdbc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        int num = accountDao.deleteAccount(1);
        if (num > 0) System.out.println("Delete success");
        else System.out.println("Delete failure");
    }
}
