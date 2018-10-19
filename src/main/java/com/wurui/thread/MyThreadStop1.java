package com.wurui.thread;

/**
 * @description: 使用interrupt停止线程
 * @author: wurui
 * @create: 2018-08-30 15:03
 **/
public class MyThreadStop1 extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0;i< 500000; i++){
                if (this.isInterrupted()){
                    System.out.println("需要停止,我要退出了!");
                    // return;
                    // 此处也可以抛出异常
                    throw new InterruptedException();
                }

                System.out.println("i=" + (i+1));
            }

            System.out.println("我在for下面,我不应该被执行");
        }catch (InterruptedException e){
            System.out.println("进 mythread.java类run方法中的catch了!");
            e.printStackTrace();
        }

    }
    
    public static void main(String[] args){
        try {
            MyThreadStop1 thread = new MyThreadStop1();
            thread.start();
            thread.sleep(2000);
            thread.interrupt();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        System.out.println("end!");
    }
}
