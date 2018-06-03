package chapter03.cglib;

public class Test {
    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        UserDao userDao = new UserDao();
        UserDao userDao1 = (UserDao) cgLibProxy.createProxy(userDao);

        userDao1.addUser();
        userDao1.deleteUser();
    }
}
