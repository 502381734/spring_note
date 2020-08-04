package com.pack.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Neo
 * @date 2020/8/4 21:44
 */
public class CircleReferenceWithAop {

    @Autowired
    private CircleReference circleReference;

    public CircleReferenceWithAop() {
    }

    public CircleReference getCircleReference() {
        return circleReference;
    }

    public void setCircleReference(CircleReference circleReference) {
        this.circleReference = circleReference;
    }
}
