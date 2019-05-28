package com.wurui.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: wurui
 * @create: 2018-10-19 11:44
 **/
public class PersonProxy<T> implements InvocationHandler{
    private Class<T> personInterface;

    public PersonProxy(Class<T> personInterface) {
        this.personInterface = personInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
