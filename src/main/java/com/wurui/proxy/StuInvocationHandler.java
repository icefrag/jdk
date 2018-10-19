package com.wurui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: wurui
 * @create: 2018-10-18 20:00
 **/
public class StuInvocationHandler<T> implements InvocationHandler{
    // 被代理的对象
    T target;

    public StuInvocationHandler(T target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" + method.getName() + "方法");
        MonitorUtil.start();
        Object result = method.invoke(target,args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
