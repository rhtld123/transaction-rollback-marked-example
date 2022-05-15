package com.example.transactionrollbackmark.point.aop.annotation;

import com.example.transactionrollbackmark.point.domain.entity.PointType;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PointSave {
    PointType type();
}
