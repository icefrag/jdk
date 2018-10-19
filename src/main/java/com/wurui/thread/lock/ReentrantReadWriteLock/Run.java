package com.wurui.thread.lock.ReentrantReadWriteLock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-20 17:57
 **/
public class Run {
    public static void main(String[] args){
        final Service service = new Service();
        Thread A = new Thread(() -> {
            service.read();
        });
        Thread B = new Thread(() -> {
            service.read();
        });
        Thread C = new Thread(() -> {
            service.write();
        });

        A.setName("A");
        B.setName("B");
        C.setName("C");

        A.start();
        B.start();
        C.start();

    }
}
