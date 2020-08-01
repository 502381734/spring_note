package com.pack.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author Neo
 * @date 2020/7/23 22:16
 */
@Component
public abstract class TestLookup {
    public TestLookup() {
        return;
    }

    @Lookup("prototypeAnimal")
    public abstract Animal createAnimal();

    public void overload(){
        System.out.println("no args");
    }

    public void overload(String args){
        System.out.println("have args");
    }
}
