package com.wurui.thread.nodifyandwait.p_c;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-07 19:29
 **/
public class ThreadP extends  Thread{
    private P p;
    public ThreadP(P p){
        this.p = p;
    }
    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
