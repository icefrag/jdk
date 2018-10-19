package com.wurui.thread.nodifyandwait.p_c;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 19:32
 **/
public class ThreadC extends Thread {
    private  C c;
    public ThreadC(C c){
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.getValue();
        }
    }
}
