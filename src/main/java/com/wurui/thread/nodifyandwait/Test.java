package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 14:53
 **/
public class Test {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            Mythread2 t2 = new Mythread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
