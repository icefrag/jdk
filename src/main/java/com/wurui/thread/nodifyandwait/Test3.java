package com.wurui.thread.nodifyandwait;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-12 15:24
 **/
public class Test3 {
    public static void main(String[] args){
        String newString = null;
        try {
            newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
