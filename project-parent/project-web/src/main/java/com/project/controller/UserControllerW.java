package com.project.controller;

import com.project.model.Users;
import com.project.service.UserServiceW;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by lihengjie on 2016/12/1.
 */
@Controller
public class UserControllerW {
    private Logger logger = Logger.getLogger(UserControllerW.class);
    @Autowired
    private UserServiceW userServiceW;

    @RequestMapping("/register")
    public String register(HttpServletRequest request) {
        logger.debug("==========user register start==============");
        Users user = new Users();
        user.setId(UUID.randomUUID().toString().substring(0,31));
        user.setMobile("13299998888");
        userServiceW.doRegister(user);
        return "index";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        logger.debug("==========user login==============");
        return "login";
    }
}
