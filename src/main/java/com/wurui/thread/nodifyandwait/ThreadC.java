package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 16:28
 **/
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end wait() ThreadName=" + Thread.currentThread().getName());
        }
    }
}
