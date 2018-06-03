package chapter03.aspect_jdk_proxy;

public class Test {
    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);

        userDao1.addUser();
        userDao1.deleteUser();
    }
}
