package com.wurui.thread.lock.ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-20 17:52
 **/
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        try {
            lock.readLock().lock();
            System.out.println("Thread :" + Thread.currentThread().getName() + ",获取读锁");
            try {
                Thread.sleep(10*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write(){
        try {
           lock.writeLock().lock();
            System.out.println("Thread :" + Thread.currentThread().getName() + ",获取写锁");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
