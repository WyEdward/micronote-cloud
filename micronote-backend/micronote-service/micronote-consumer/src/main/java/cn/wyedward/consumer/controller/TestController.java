package cn.wyedward.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {
    @Value("${server.port}")
    private String name;

    @GetMapping("/main")
    public String main() {
        return name;
    }
}
