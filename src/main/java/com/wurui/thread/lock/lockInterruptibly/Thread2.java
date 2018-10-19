package com.wurui.thread.lock.lockInterruptibly;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-20 11:07
 **/
public class Thread2 extends Thread{
    private MyService service;

    public Thread2(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.do1();
    }
}
