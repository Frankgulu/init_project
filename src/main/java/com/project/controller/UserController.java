package com.project.controller;

import com.project.model.User;
import com.project.service.UserService;
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
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(HttpServletRequest request) {
        logger.debug("==========user register start==============");
        User user = new User();
        user.setId(UUID.randomUUID().toString().substring(0,31));
        user.setUserMobile("13299998888");
        userService.doRegister(user);
        return "index";
    }
}
