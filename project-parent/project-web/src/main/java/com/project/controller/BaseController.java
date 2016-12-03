package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lihengjie on 2016/11/30.
 */
@Controller
public class BaseController {
    @RequestMapping("/init")
    public String init(HttpServletRequest request) {
        System.out.println("==============init begin===============");
        return "index";
    }
}


