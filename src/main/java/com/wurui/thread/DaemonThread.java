package com.wurui.thread;

/**
 * @description: 守护线程
 * @author: wurui
 * @create: 2018-08-30 18:20
 **/
public class DaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("我是守护线程,我还没死!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        DaemonThread thread  = new DaemonThread();
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(6*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程结束!");
    }
}
