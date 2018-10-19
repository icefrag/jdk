package com.wurui.gc;

/**
 * @description:
 * @author: wurui
 * @create: 2018-09-29 11:33
 **/
public class TestAllocation {
    private static final int _1MB = 1024*1024;
    public static void testAllocation(){
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4* _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
     }
     
     public static void main(String[] args){
         TestAllocation.testAllocation();
     }
}
