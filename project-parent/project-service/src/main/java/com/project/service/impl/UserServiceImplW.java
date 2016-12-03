package com.project.service.impl;

import com.project.dao.UsersMapper;
import com.project.model.Users;
import com.project.service.UserServiceW;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lihengjie on 2016/12/1.
 */
@Service
public class UserServiceImplW implements UserServiceW {

    private Logger logger =  Logger.getLogger(UserServiceImplW.class);
    @Autowired
    private UsersMapper userMapper;
    @Override
    public void doRegister(Users user) {
        logger.debug("==========user service doRegister start==userId==["+user.getId()+"]===========");
        userMapper.insertSelective(user);
    }
}
