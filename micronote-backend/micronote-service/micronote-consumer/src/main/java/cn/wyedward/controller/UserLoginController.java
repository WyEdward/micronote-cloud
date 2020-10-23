package cn.wyedward.controller;


import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import cn.wyedward.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("/login")
    public User login(@RequestBody LoginMessage loginMessage){
        return userLoginService.login(loginMessage);
    }

    @GetMapping("/info")
    public String Info(){
        return userLoginService.Info();
    }
}
