package com.project.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lihengjie on 2016/12/4.
 */
@Controller
@RequestMapping("/admin/home")
public class HomeContrllerA {

    private Logger logger = Logger.getLogger(HomeContrllerA.class);

    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        printAdmin();

        return "index";

    }

    private void printAdmin() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.print("        *        ******          ***     ***      *********   ***        *  ");
        System.out.println("");
        System.out.print("       * *       *      *       *   *   *   *         *       *  *       *  ");
        System.out.println("");
        System.out.print("      *   *      *        *    *     * *     *        *       *   *      *  ");
        System.out.println("");
        System.out.print("     *     *     *        *   *       *       *       *       *    *     *  ");
        System.out.println("");
        System.out.print("    * *******    *        *   *                *      *       *     *    *  ");
        System.out.println("");
        System.out.print("   *         *   *        *   *                *      *       *      *   *  ");
        System.out.println("");
        System.out.print("  *           *  *       *    *                *      *       *       *  *  ");
        System.out.println("");
        System.out.print(" *             * *******      *                *  *********   *        ***  ");
        System.out.println("");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}

