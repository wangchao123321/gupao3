package com.gupao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    // 目标对象
    private Object target;

    //    构造方法，给我们要代理的真实对象赋初值
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强");
        method.invoke(target,args);
        System.out.println("后置增强");
        return null;
    }
}
