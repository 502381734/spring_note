package com.pack.proxy;

import com.pack.proxy.cglib.TestMethodInterceptor;
import com.pack.proxy.jdkproxy.*;
import org.junit.*;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Proxy;
import java.lang.reflect.*;

/**
 * @author Neo
 * @date 2020/7/31 9:38
 */
public class ProxyTest {
    @Test
    public void jdkProxyTest() {
        ProxyInterface jdkProxy = (ProxyInterface) Proxy
                .newProxyInstance(OriginalClass.class.getClassLoader(), OriginalClass.class.getInterfaces(),
                        new TestInvocationHandler(new OriginalClass()));
        jdkProxy.doSomething();
    }

    @Test
    public void cglibProxyTest(){
        TestMethodInterceptor methodInterceptor = new TestMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OriginalClass.class);
        enhancer.setCallback(methodInterceptor);

        OriginalClass cglibProxy = (OriginalClass) enhancer.create();
        cglibProxy.doSomething();
    }
    
    //使用CallbackHelper去拦截方法
    @Test
    public void testCallbackFilter() throws Exception{
        Enhancer enhancer = new Enhancer();
        CallbackHelper callbackHelper = new CallbackHelper(OriginalClass.class, new Class[0]) {
            @Override
            protected Object getCallback(Method method) {
                return new TestMethodInterceptor();
            }
        };
        enhancer.setSuperclass(OriginalClass.class);
        enhancer.setCallbackFilter(callbackHelper);
        enhancer.setCallbacks(callbackHelper.getCallbacks());
        OriginalClass proxy = (OriginalClass) enhancer.create();
        proxy.doSomething();
    }
}