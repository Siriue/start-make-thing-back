package com.dlmu.Controller;

import com.dlmu.Entity.User;
import com.dlmu.Entity.UserPass;
import com.dlmu.Service.UserService;
import com.dlmu.VO.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/user")
    List<UserVO> queryUser() {
        return userService.queryUser();
    }

    @PostMapping("/user/login")
    Integer login(@RequestBody UserPass userPass) {
        return userService.login(userPass.getUserName(), userPass.getPassword());
    }

    @PostMapping("/user/add")
    void insertUser(@RequestBody User user) {
        userService.insetUser(user);
    }

    @PostMapping("/user/delete")
    void deleteUser(@RequestBody User user) {
        userService.deleteUser(user.getUserId());
    }

    @PostMapping("/user/update")
    void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
}
