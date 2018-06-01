package chapter02.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
        System.out.println("UserServiceImpl is saving something...");
    }
}
