package com.wurui.thread.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-12 16:43
 **/
public class Run {
    public static void main(String[] args){
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            outputStream.connect(inputStream);

            ThreadRead threadRead = new ThreadRead(readData,inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
