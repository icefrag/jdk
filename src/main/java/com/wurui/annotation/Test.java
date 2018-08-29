package com.wurui.annotation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
	@UseCase(id = 10, desc = "nima")
	public void say() {
	}

	public static void add(int a) {
		a = a * 2;
		if (a > 5000) {
			return;
		}
		add(a);
	}

	public static void main(String[] args) throws InterruptedException {
		//		add(1);

		//		Pattern pattern = Pattern.compile("[0-9]*");
		//
		//		Matcher isNum = pattern.matcher("13911111111,");
		//		System.out.println(isNum.matches());
		//		if (560140 < 560145 && 560140 > 560135 || 560140 == 560130 && 560140 != 560140) {
		//			System.out.println("true");
		//		} else {
		//			System.out.println("false");
		//		}
		System.out.println(System.currentTimeMillis());

		ExecutorService es = Executors.newFixedThreadPool(5);

		es.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println(12323232);
			}
		});
		TimeUnit.SECONDS.sleep(10);
	}
}
