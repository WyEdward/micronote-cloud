package cn.wyedward.demo.dao;

import cn.wyedward.demo.entity.po.User;
import cn.wyedward.demo.entity.vo.LoginMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component  //解决mapper自动注入报假红的问题
public interface UserDao {
    User login(LoginMessage loginMessage);
}
