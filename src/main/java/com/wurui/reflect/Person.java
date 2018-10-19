package com.wurui.reflect;

/**
 * @description:
 * @author: wurui
 * @create: 2018-08-29 16:06
 **/
public class Person {
    protected String subject;
    public String name;
    private int age;
    static{
        System.out.println("初始化:person类");
    }


    public void say(String word){
        System.out.println(name + ",say:" + word);
    }

    @Override
    public String toString() {
        return "Person{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
