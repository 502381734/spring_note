package com.pack.myinterface;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author Neo
 * @date 2020/7/15 22:01
 */


@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface HaveComponent {
}