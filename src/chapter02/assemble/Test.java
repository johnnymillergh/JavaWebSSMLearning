package chapter02.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String xmlPath = "chapter02/assemble/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        User user1 = (User) applicationContext.getBean("user1");
        User user2 = (User) applicationContext.getBean("user2");

        System.out.println(user1);
        System.out.println(user2);
    }
}
