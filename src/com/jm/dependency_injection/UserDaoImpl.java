package com.jm.dependency_injection;

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("UserDaoImpl says Hi.");
    }
}
