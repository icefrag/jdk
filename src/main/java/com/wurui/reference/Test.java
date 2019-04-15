package com.wurui.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: wurui
 * @create: 2019-04-15 14:15
 **/
public class Test {
    public static void main(String[] args){
        Object value = new Object();
        Map<Object, Object> map = new HashMap<>();
        ReferenceQueue referenceQueue = new ReferenceQueue();

        Thread thread = new Thread(() -> {
            try {
                int cnt = 0;
                WeakReference<byte[]> k;
                while((k = (WeakReference) referenceQueue.remove()) != null) {
                    System.out.println((cnt++) + "回收了:" + k);
                }
            } catch(InterruptedException e) {
                //结束循环
            }
        });
        thread.setDaemon(true);
        thread.start();

        for(int i = 0;i < 10000;i++) {
            byte[] bytes = new byte[1024*1024];
            WeakReference<byte[]> weakReference = new WeakReference<byte[]>(bytes, referenceQueue);
            map.put(weakReference, value);
        }
        System.out.println("map.size->" + map.size());
    }
}
