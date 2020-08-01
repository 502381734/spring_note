package com.pack.proxy.jdkproxy;

import com.pack.proxy.OriginalClass;

import java.lang.reflect.*;

/**
 * @author Neo
 * @date 2020/7/31 9:32
 */
public class TestInvocationHandler implements InvocationHandler {

    private OriginalClass originalClass;

    public TestInvocationHandler(OriginalClass originalClass) {
        this.originalClass = originalClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy start to invoke method");
        originalClass.doSomething();
        System.out.println("end of proxy invoke method");
        return null;
    }
}
