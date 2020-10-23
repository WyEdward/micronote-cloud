package cn.wyedward.demo.feign;

import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import cn.wyedward.demo.feign.factory.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "Server-Provider-demo", fallback = UserServiceFallback.class)
public interface UserService {
    @PostMapping("/login")
    User login(@RequestBody LoginMessage loginMessage);


    @GetMapping("/info")
    String Info();
}
