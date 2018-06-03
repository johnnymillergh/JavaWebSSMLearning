package chapter03.aspect_jdk_proxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl:addUser()");
    }

    @Override
    public void deleteUser() {
        System.out.println("UserDaoImpl:deleteUser()");
    }
}
