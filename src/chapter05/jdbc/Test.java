package chapter05.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/3/2018
 * Time: 9:30 PM
 */

public class Test {

    @org.junit.Test
    public void mainTest() {
        String xmlPath = "chapter05/jdbc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        accountDao.transfer("Johnny Miller", "Jack", 12d);
    }
}
