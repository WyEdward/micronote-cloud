package cn.wyedward.dao;

import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User login(LoginMessage loginMessage);
}
