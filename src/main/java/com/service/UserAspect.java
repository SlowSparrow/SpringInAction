package com.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by latham on 17-8-13.
 */
@Aspect
@Component
public class UserAspect {

    @Pointcut("execution(public * com.entity.User.toString(..))")
    public void pointcut(){}


    @Before("execution(public * com.entity.User.toString(..))")
    public void pre(){
        System.out.println("pre.....aspect");
    }

    //transfer params to aspect method
    @Before("execution(public * com.entity.User.add(int,int))"+"&&args(a,b)")
    public void sum(int a,int b){
        System.out.println("UserAspect sum()"+a+b);
    }

/*    @Around("pointcut()")
    public void around(ProceedingJoinPoint jp){
        System.out.println("around...pre");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around...after");
    }*/
}
