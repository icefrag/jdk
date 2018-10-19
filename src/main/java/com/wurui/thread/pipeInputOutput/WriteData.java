package com.wurui.thread.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-12 16:25
 **/
public class WriteData {
    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write :");
            for (int i=0;i<300;i++){
                String outData = "" + (i+1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
