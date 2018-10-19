package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 16:45
 **/
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
