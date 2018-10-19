package com.wurui.thread.lock.awaitUninterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-20 11:53
 **/
public class Run {
    public static void main(String[] args){
        try {
            final ReentrantLock lock = new ReentrantLock();
            final Condition condition = lock.newCondition();
            Thread a = new Thread(() -> {
                System.out.println("准备await..");
                lock.lock();
                try {
                    // condition.await();
                    condition.awaitUninterruptibly();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("await结束..");
                lock.unlock();
            });

            a.start();

            Thread.sleep(500);

            a.interrupt();

            Thread.sleep(3000);

            lock.lock();
            condition.signal();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
