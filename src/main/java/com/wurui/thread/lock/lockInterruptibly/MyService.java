package com.wurui.thread.lock.lockInterruptibly;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-20 11:04
 **/
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void do1(){
        try {
            // lock.lock();
            lock.lockInterruptibly();
            System.out.println("lock begin : " + Thread.currentThread().getName());
            for (int i=0;i<Integer.MAX_VALUE/10; i++){
                Math.random();
            }

            System.out.println("lock end : " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
