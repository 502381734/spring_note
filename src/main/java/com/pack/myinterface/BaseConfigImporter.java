package com.pack.myinterface;

import com.pack.configration.BaseConfig;
import org.springframework.context.annotation.Bean;

/**
 * @author Neo
 * @date 2020/7/15 22:15
 */
public interface BaseConfigImporter {
    @Bean
    BaseConfig baseConfig();
}