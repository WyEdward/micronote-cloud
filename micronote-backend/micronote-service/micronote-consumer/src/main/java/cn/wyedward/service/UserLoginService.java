package cn.wyedward.service;

import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import cn.wyedward.demo.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    private UserService userService;

    public User login(LoginMessage loginMessage){
        return userService.login(loginMessage);
    }

    public String Info(){
        return userService.Info();
    }
}
