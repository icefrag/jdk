package com.wurui.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 使用condition实现顺序执行.
 * @author: wurui
 * @create: 2018-09-20 17:14
 **/
public class ConditionTest {
    private static ReentrantLock lock = new ReentrantLock();
    final private static java.util.concurrent.locks.Condition conditionA = lock.newCondition();
    final private static java.util.concurrent.locks.Condition conditionB = lock.newCondition();
    final private static java.util.concurrent.locks.Condition conditionC = lock.newCondition();
    volatile private static int nextWho = 1;
    public static void main(String[] args){
        Thread a = new Thread(() ->{
            try {
                lock.lock();
                while (nextWho != 1){
                    conditionA.await();
                }

                for (int i=0;i<4;i++){
                    System.out.println("Thread-" + Thread.currentThread().getName() + "--:"+i);
                }

                nextWho = 2;

                conditionB.signal();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });


        Thread b = new Thread(() ->{
            try {
                lock.lock();
                while (nextWho != 2){
                    conditionB.await();
                }

                for (int i=0;i<4;i++){
                    System.out.println("Thread-" + Thread.currentThread().getName() + "--:"+i);
                }
                nextWho = 3;
                conditionC.signal();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });


        Thread c = new Thread(() ->{
            try {
                lock.lock();
                while (nextWho != 3){
                    conditionC.await();
                }

                for (int i=0;i<4;i++){
                    System.out.println("Thread-" + Thread.currentThread().getName() + "--:"+i);
                }

                nextWho = 4;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        a.setName("A");
        b.setName("B");
        c.setName("C");
        b.start();
        c.start();
        a.start();

        try {
            a.join();
            b.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
