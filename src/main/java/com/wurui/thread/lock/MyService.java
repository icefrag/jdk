package com.wurui.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-13 16:04
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void methodA(){
        try {
            lock.lock();
            System.out.println("mehtodA begin ThreadName="+Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("mehtodA end ThreadName="+Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void methodB(){
        try {
            lock.lock();
            System.out.println("mehtodB begin ThreadName="+Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("mehtodB end ThreadName="+Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void await(){
        try {
            lock.lock();
            System.out.println("await 时间为" + System.currentTimeMillis());
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal时间为:" + System.currentTimeMillis());
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
