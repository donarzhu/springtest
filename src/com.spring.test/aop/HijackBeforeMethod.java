package com.spring.test.aop;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

/**
 * Created by donar on 2016/11/3.
 */


public class HijackBeforeMethod implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked!");
    }
}