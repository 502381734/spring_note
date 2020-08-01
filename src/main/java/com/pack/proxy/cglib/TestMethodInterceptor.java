package com.pack.proxy.cglib;

import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * @author Neo
 * @date 2020/7/31 10:26
 */
public class TestMethodInterceptor implements MethodInterceptor {
    public TestMethodInterceptor() {
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("proxy start to invoke method");
        methodProxy.invokeSuper(o, objects);
        System.out.println("end of proxy invoke method");
        return o;
    }
}
