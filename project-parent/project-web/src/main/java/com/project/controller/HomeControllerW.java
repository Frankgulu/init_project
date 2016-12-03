package com.project.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lihengjie on 2016/12/3.
 */
@Controller
@RequestMapping("/home")
public class HomeControllerW {
    private Logger logger = Logger.getLogger(HomeControllerW.class);
    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        logger.debug("========home index=======");
        return "index";
    }
}

