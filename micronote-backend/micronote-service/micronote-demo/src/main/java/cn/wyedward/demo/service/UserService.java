package cn.wyedward.demo.service;

import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;

public interface UserService {
    User login(LoginMessage loginMessage);
}
