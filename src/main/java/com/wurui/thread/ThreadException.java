package com.wurui.thread;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-21 11:16
 **/
public class ThreadException {
    public static void main(String[] args){
        Thread a = new Thread(()->{
            throw new RuntimeException("丢个异常玩玩");
        });
        a.setUncaughtExceptionHandler((t,e) ->{
            System.out.println(t.getName()+",出现了异常");
            e.printStackTrace();
        });

        a.start();
    }
}
