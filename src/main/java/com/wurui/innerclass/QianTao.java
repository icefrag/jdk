package com.wurui.innerclass;

public class QianTao {
	private static String abc = "abc";
	static class Inner {
		void say() {
			System.out.println("hellow" + abc);
		}
	}

	public static void main(String[] args) {
		Inner inner = new Inner();
	}
}
