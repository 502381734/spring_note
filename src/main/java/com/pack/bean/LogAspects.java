package com.pack.bean;

import org.aspectj.lang.annotation.*;

/**
 * @author Neo
 * @date 2020/3/18 21:33
 */
@Aspect
public class LogAspects {
    public LogAspects() {
    }

    @Pointcut("execution(public int com.pack.bean.MathCaculator.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void beforeLog(){
        System.out.println("before");
    }

    @After("pointcut()")
    public void afterLog(){
        System.out.println("after");
    }

    @AfterReturning("pointcut()")
    public void returnLog(){
        System.out.println("return");
    }

    @AfterThrowing("pointcut()")
    public void exceptionLog(){
        System.out.println("exception");
    }
}
