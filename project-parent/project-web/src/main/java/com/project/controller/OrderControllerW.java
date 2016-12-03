package com.project.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lihengjie on 2016/12/3.
 */
@Controller
@RequestMapping("/order")
public class OrderControllerW {

    private Logger logger = Logger.getLogger(OrderControllerW.class);


    @RequestMapping("/index")
    public String index() {
        logger.debug("======order index1===========");
        return  "/order/order_index";
    }
}
