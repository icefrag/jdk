package com.wurui.thread.lock.lockInterruptibly;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-20 11:11
 **/
public class Run {
    public static void main(String[] args){
        try {
            MyService service = new MyService();
            Thread1 a = new Thread1(service);
            a.setName("A");
            a.start();
            Thread.sleep(500);
            Thread2 b = new Thread2(service);
            b.setName("B");
            b.start();

            b.interrupt();
            
            System.out.println("main end");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
