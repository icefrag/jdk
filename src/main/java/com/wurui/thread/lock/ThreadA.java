package com.wurui.thread.lock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-13 16:19
 **/
public class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        this.myService = myService;
    }
    @Override
    public void run() {
//        myService.methodA();
        myService.await();
    }
}
