package com.pack.bean;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Neo
 * @date 2020/7/13 16:46
 */
public class FalseCondition implements Condition {
    public FalseCondition() {
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
