package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 14:47
 **/
public class MyThread1 extends Thread{
    private Object lock;
    public MyThread1(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("开始 wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
