package chapter03.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/3/2018
 * Time: 12:50 PM
 */

public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        chech_Permissions();

        Object object = methodInvocation.proceed();

        log();

        return object;
    }

    private void chech_Permissions() {
        System.out.println("Checking permissions...");
    }

    private void log(){
        System.out.println("Logging...");
    }
}
