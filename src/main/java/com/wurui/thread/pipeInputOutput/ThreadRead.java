package com.wurui.thread.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-12 16:39
 **/
public class ThreadRead extends  Thread{
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input){
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
