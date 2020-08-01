package com.pack.configration;

import org.springframework.context.annotation.*;

/**
 * @author Neo
 * @date 2020/7/15 22:13
 */
public class BaseConfig {
    public BaseConfig() {
    }

    @Bean
    @Scope("prototype")
    public BaseClass baseClass(){
        return new BaseClass();
    }
}
