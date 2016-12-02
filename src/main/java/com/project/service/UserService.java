package com.project.service;

import com.project.model.User;

/**
 * Created by lihengjie on 2016/12/1.
 */
public interface UserService extends   BaseService{

    void doRegister(User user);

}
