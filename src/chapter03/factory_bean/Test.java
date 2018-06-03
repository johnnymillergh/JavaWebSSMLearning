package chapter03.factory_bean;

import chapter03.aspect_jdk_proxy.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String xmlPath="chapter03/factory_bean/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
        userDao.addUser();
        userDao.deleteUser();
    }
}
