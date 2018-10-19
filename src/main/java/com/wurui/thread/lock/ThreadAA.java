package com.wurui.thread.lock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-13 16:20
 **/
public class ThreadAA extends Thread{
    private MyService myService;
    public ThreadAA(MyService myService){
        this.myService = myService;
    }
    @Override
    public void run() {
        myService.methodB();
    }
}
