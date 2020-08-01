package com.pack.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.*;
import org.springframework.stereotype.Component;

/**
 * @author Neo
 * @date 2020/8/1 21:40
 */
@Component
public class TestFactoryBean implements FactoryBean {

    public TestFactoryBean() {
    }

    @Override
    public Object getObject() throws Exception {
        return new TestFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return TestFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
