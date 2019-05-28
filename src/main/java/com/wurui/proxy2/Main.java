package com.wurui.proxy2;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: wurui
 * @create: 2018-10-19 11:46
 **/
public class Main {
    public static void main(String[] args){
        PersonProxy<Person> proxy = new PersonProxy<>(Person.class);

        Person p = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{Person.class},proxy);
        p.say("123");
    }
}
