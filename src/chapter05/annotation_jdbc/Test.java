package chapter05.annotation_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/3/2018
 * Time: 9:30 PM
 */

public class Test {

    @org.junit.Test
    public void mainTest() {
        String xmlPath = "chapter05/annotation_jdbc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        accountDao.transfer("Johnny Miller", "Jack", 100d);
    }
}
