package com.wurui.thread.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-12 16:35
 **/
public class ThreadWrite extends Thread{
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write,PipedOutputStream out){
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
