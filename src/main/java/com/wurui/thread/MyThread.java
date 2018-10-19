package com.wurui.thread;

/**
 * @description: interrupted方法理解
 * @author: wurui
 * @create: 2018-08-30 11:41
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<500000;i++){
            System.out.println("i=" + (i+1));
        }
    }

    public static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
//            Thread.currentThread().interrupt();
//            System.out.println("是否停止1?=" + thread.interrupted());// interrupted是测试当前线程mian,线程肯定是没有停止 false
//            System.out.println("是否停止2?=" + thread.interrupted());// interrupted是测试当前线程mian,线程肯定是没有停止 false
            System.out.println("是否停止1?=" + thread.isInterrupted());
            System.out.println("是否停止2?=" + thread.isInterrupted());
            System.out.println("end");
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

    public static void main1(String[] args){
            Thread.currentThread().interrupt();
            System.out.println("是否停止1? = " + Thread.interrupted());// true
            System.out.println("是否停止2? = " + Thread.interrupted());// false
            
            System.out.println("end!");
    }
}
