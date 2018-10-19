package com.wurui.thread;

/**
 * @description: 线程暂停和启动
 * @author: wurui
 * @create: 2018-08-30 16:33
 **/
public class MyThreadPause extends Thread{
    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    private long i = 0;

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
    
    public static void main(String[] args){
        try {
            MyThreadPause thread = new MyThreadPause();
            thread.start();;
            Thread.sleep(5000);
            thread.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());

            thread.resume();
            Thread.sleep(5000);


            thread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
