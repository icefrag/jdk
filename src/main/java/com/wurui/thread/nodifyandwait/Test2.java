package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 16:44
 **/
public class Test2 {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            ThreadB b = new ThreadB(lock);
            b.start();
            ThreadC c = new ThreadC(lock);
            c.start();
            Thread.sleep(1000);
            NotifyThread nofiNotifyThread = new NotifyThread(lock);
            nofiNotifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
