package chapter02.scope;

import chapter01.dependency_injection.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String xmlPath = "chapter02/scope/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(applicationContext.getBean("bean1"));
        System.out.println(applicationContext.getBean("bean1"));
        System.out.println(applicationContext.getBean("bean2"));
        System.out.println(applicationContext.getBean("bean2"));
        System.out.println(applicationContext.getBean("bean3"));
        System.out.println(applicationContext.getBean("bean3"));
    }
}
