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
}
