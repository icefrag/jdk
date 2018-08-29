package com.wurui.innerclass;

import com.wurui.innerclass.Test1.I1;

public class Test2 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		I1 i1 = t1.new I1();
		i1.say();
	}
}
