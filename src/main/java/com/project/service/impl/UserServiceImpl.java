package com.project.service.impl;

import com.project.dao.UserMapper;
import com.project.model.User;
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
    private UserMapper userMapper;
    @Override
    public void doRegister(User user) {
        logger.debug("==========user service doRegister start==userId==["+user.getId()+"]===========");
        userMapper.insertSelective(user);
    }
}
