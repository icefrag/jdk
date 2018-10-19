package com.wurui.thread.nodifyandwait.p_c;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 19:17
 **/
public class P {
    private String lock;
    public P(String lock){
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("生产者" + Thread.currentThread().getName() + "WAITING了*");
                    lock.wait();
                }
                System.out.println("生产者 " + Thread.currentThread().getName() + " RUNNABLE 了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                // lock.notify();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
