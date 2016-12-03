package com.project.systems.setting;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

/**
 * Created by lihengjie on 2016/12/1.
 */
@Aspect
@Service
public class AspectService {

    @Pointcut("execution(* com.project.service.impl.UserServiceImplW.doRegister(..))")
    public void aspect(){}



    @Before("aspect()")
    public  void regiterBefore() {
        System.out.println("before_____________________________________");
    }

    @After("aspect()")
    public void registerAfter() {
        System.out.println("after+++++++++++++++++++++++++++++++++");
    }

    @Around("aspect()")
    public Object registerAround(ProceedingJoinPoint joinPoint) {
        System.out.println("around begin++++++++++++++++++++++");
        Object[] args = joinPoint.getArgs();
        Object obj=null;
        try {
            obj = joinPoint.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("arount end+++++++++++++++++++++");
        return obj;
    }

}
