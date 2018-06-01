package com.jm.dependency_injection;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        userDao.say();
        System.out.println("UserServiceImpl says Hi.");
    }
}
