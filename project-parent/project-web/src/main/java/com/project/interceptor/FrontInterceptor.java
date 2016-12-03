package com.project.interceptor;

import com.project.systems.utils.Config;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by lihengjie on 2016/12/3.
 */
public class FrontInterceptor implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(FrontInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        logger.debug("========FrontInterceptor start=============");
        HttpSession session = request.getSession();
        Object isLogin = session.getAttribute(Config.IS_LOGIN);
        if (isLogin == null || StringUtils.isBlank(isLogin.toString())) {
            logger.debug("========check login if false ===islogin==[" + isLogin + "]");
           // request.getRequestDispatcher(Config.LOGIN_URL).forward(request, response);
            response.sendRedirect("/login");
            return false;//一定要有return false
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
