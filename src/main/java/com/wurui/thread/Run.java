package com.wurui.thread;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 10:40
 **/
public class Run {
    public static void main(String[] args){
        PrintString p  = new PrintString();
        new Thread(p).start();
        System.out.println("我要停止它");
        PrintString.isContinuePrint = false;
        try {
            TimeUnit.SECONDS.sleep(3600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
