package com.pack.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Neo
 * @date 2020/8/2 21:21
 */
@Aspect
@Component
public class LogAspects2 {
    @Pointcut("execution(public Integer com.pack.bean.MathCaculator.*(..))")
    public void pointcut(){}

    @Before("execution(public Integer com.pack.bean.MathCaculator.*(..))")
    public void beforeLog2(){
        System.out.println("before2");
    }

    @After("pointcut()")
    public void afterLog2(){
        System.out.println("after2");
    }

    @AfterReturning("pointcut()")
    public void returnLog2(){
        System.out.println("After Returning2");
    }

    @Around("pointcut()")
    public void aroundLog2(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start around2");
        joinPoint.proceed();
        System.out.println("end around2");
    }

    @AfterThrowing("pointcut()")
    public void exceptionLog2(){
        System.out.println("exception2");
    }
}
