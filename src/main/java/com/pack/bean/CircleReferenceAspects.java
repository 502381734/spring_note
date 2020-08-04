package com.pack.bean;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Neo
 * @date 2020/8/4 21:44
 */
@Component
@Aspect
public class CircleReferenceAspects {

    @Before("execution(public * com.pack.bean.CircleReferenceWithAop.*(..))")
    public void before(){
    }

    @Before("execution(public * com.pack.bean.CircleReference.*(..))")
    public void before2(){
    }
}
