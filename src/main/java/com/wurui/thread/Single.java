package com.wurui.thread;

import java.util.concurrent.CopyOnWriteArrayList;

public class Single {
	private static class SingleInstance {
		private static Single single = new Single();
	}

	private Single() {

	}

	public static Single getInstance() {
		return SingleInstance.single;
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Single.getInstance());
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Single.getInstance());
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Single.getInstance());
			}
		});

		t1.start();
		t2.start();
		t3.start();
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
	}
}
