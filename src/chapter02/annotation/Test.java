package chapter02.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String xmlPath = "chapter02/annotation/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
