package com.pack.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Neo
 * @date 2020/8/4 21:43
 */

public class CircleReference {

    @Autowired
    private CircleReferenceWithAop circleReferenceWithAop;

    public CircleReference() {
    }

    public CircleReferenceWithAop getCircleReferenceWithAop() {
        return circleReferenceWithAop;
    }

    public void setCircleReferenceWithAop(CircleReferenceWithAop circleReferenceWithAop) {
        this.circleReferenceWithAop = circleReferenceWithAop;
    }
}
