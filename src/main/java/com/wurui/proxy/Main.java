package com.wurui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: wurui
 * @create: 2018-10-18 20:12
 **/
public class Main {
    
    public static void main(String[] args){
        Person zhangsan = new Student("张三");

        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);


        Person stuProxy = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),new Class<?>[]{Person.class},stuHandler);

        stuProxy.giveMoney();

    }
}
