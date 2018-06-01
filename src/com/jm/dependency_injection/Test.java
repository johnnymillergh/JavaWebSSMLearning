package com.jm.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String xmlPath = "com/jm/dependency_injection/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.say();
    }
}
