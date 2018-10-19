package com.wurui.thread;

/**
 * @description: 使用Thread的stop方法去停止
 * @author: wurui
 * @create: 2018-08-30 15:23
 **/
public class MyThreadStop2 extends Thread{
    private  int i = 0;
    @Override
    public void run() {
        try {
            i++;
            System.out.println("i="+i);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.sleep(8000);
            thread.stop();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
