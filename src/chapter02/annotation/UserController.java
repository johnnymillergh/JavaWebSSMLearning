package chapter02.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    public void save() {
        userService.save();
        System.out.println("UserController is saving something...");
    }
}
