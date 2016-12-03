package com.project.service.impl;

import com.project.dao.UsersMapper;
import com.project.model.Users;
import com.project.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lihengjie on 2016/12/1.
 */
@Service
public class UserServiceImpl implements UserService{

    private Logger logger =  Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private UsersMapper userMapper;
    @Override
    public void doRegister(Users user) {
        logger.debug("==========user service doRegister start==userId==["+user.getId()+"]===========");
        userMapper.insertSelective(user);
    }
}
