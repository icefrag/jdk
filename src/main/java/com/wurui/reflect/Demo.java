package com.wurui.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description: 反射api
 * @author: wurui
 * @create: 2018-08-29 16:02
 **/
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 不会初始化
        Class p = Person.class;
        System.out.println("------------");
        // 会初始化
        Class personClass = Class.forName("com.wurui.reflect.Person");
        // System.out.println(person.getName());
        // 获取类中定义的所有成员变量
        // getFields 获取定义的public成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("-----------------------------");
        fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        
        // 获取某个属性
        Field field = personClass.getField("name");
        System.out.println(field.getName());

        // 获取私有的成员变量提示 java.lang.NoSuchFieldException: age
        try {
            field = personClass.getField("age");
            System.out.println(field.getName() + "------");

        }catch (Exception e){
            e.printStackTrace();
        }

        field = personClass.getDeclaredField("age");
        System.out.println(field.getName() + "------");

       // 生成对象
        // 1.改造方法对象
        // 2.install

        Constructor constructor = personClass.getConstructor();
        Person person1 = (Person) constructor.newInstance();
        field.setAccessible(true);
        field.set(person1,10);
        System.out.println(person1);

        person1 = (Person) personClass.newInstance();


        // 操作方法
        Method method = personClass.getMethod("say", String.class);
        method.invoke(person1,"小朋友你好");
    }

}
