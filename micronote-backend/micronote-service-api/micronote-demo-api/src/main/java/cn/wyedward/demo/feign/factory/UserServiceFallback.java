package cn.wyedward.demo.feign.factory;

import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import cn.wyedward.demo.feign.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserService{
    @Override
    public User login(LoginMessage loginMessage) {
        User user = new User();
        user.setName("defaultName");
        user.setUsername("defaultUserName");
        return user;
    }

    @Override
    public String Info() {
        return "defaultInfo";
    }
}
