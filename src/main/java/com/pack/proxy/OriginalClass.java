package com.pack.proxy;

import com.pack.proxy.jdkproxy.ProxyInterface;

/**
 * @author Neo
 * @date 2020/7/31 9:36
 */
public class OriginalClass implements ProxyInterface {
    public OriginalClass() {
    }

    @Override
    public void doSomething() {
        System.out.println("do something...");
    }
}
