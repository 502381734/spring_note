package com.pack.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Neo
 * @date 2020/3/12 21:37
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    public TestBeanPostProcessor() {
    }


    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof Animal)
            System.out.println(o.getClass().getSimpleName() + " postProcessBeforeInitialization.....");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (o instanceof Animal)
            System.out.println(o.getClass().getSimpleName() + " postProcessAfterInitialization....");
        return o;
    }
}
