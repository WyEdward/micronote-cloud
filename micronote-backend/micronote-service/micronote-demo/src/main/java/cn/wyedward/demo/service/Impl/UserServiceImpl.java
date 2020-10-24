package cn.wyedward.demo.service.Impl;

import cn.wyedward.demo.dao.UserDao;
import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import cn.wyedward.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User login(LoginMessage loginMessage) {
        return userDao.login(loginMessage);
    }
}
