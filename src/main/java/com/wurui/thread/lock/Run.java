package com.wurui.thread.lock;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-13 16:32
 **/
public class Run {
    public static void main(String[] args){
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();
    }
}
