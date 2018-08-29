package com.wurui.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NotifyAndWait {
	private static volatile List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		final Object lock = new Object();
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("睡醒了");
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					try {
						while (true) {
							System.out.println("加入一个元素");
							list.add("1");
							TimeUnit.SECONDS.sleep(1);
							if (list.size() == 5) {
								lock.notify();
								System.out.println("发出notify通知！");
							}

							if (list.size() == 10) {
								throw new RuntimeException();
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
