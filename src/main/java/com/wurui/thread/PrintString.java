package com.wurui.thread;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-06 19:43
 **/
public class PrintString implements Runnable{
    public static boolean isContinuePrint = true;

    @Override
    public void run() {
        printStringMethod();
    }

    public void printStringMethod(){
        try {
            while (isContinuePrint == true){
                System.out.println("run print:" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            System.out.println(Thread.currentThread().getName() + ",我被停止了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
