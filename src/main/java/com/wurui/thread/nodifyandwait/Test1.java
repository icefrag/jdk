package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 14:41
 **/
public class Test1 {
    public static void main(String[] args){
        String lock = new String("");
        System.out.println("syn上面");

        synchronized (lock){
            System.out.println("syn第一行");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait下一行");
        }

        System.out.println("sync下面");
    }
}
