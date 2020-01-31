package com.franz.aspect;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforePrinting implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Called before any prints");
    }
}
