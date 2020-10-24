package cn.wyedward.demo.controller;

import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import cn.wyedward.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @Transactional
    @PostMapping("/login")
    public User login(@RequestBody LoginMessage loginMessage){
        return userService.login(loginMessage);
    }

    @GetMapping("/info")
    public String Info(){
        return "hello,info";
    }
}
