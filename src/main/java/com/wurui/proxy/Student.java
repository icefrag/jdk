package com.wurui.proxy;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: wurui
 * @create: 2018-10-18 19:55
 **/
public class Student implements Person{
    private String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + "上交班费50元!");
    }
}
