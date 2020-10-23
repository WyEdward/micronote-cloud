package cn.wyedward.demo.entity.po;

import lombok.Data;

@Data
public class User {
    //id
    private Integer id;
    //昵称
    private String name;
    //用户名
    private String username;
    //密码
    private String password;
}
