package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 14:51
 **/
public class Mythread2 extends Thread {
    private Object lock;
    public  Mythread2(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("开始 notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time=" + System.currentTimeMillis());
        }
    }
}
