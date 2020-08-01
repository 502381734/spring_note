package com.pack.configration;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Neo
 * @date 2020/3/11 22:48
 */
public class AnimalCondition implements Condition {
    public AnimalCondition() {
    }

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
    }
}
