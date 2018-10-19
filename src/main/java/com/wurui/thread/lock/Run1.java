package com.wurui.thread.lock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-13 16:32
 **/
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();

    }
}
