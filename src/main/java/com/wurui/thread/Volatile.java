package com.wurui.thread;

import java.util.concurrent.TimeUnit;

public class Volatile extends Thread {
	private volatile boolean running = true;

	public void setRunning(boolean running) {
		this.running = running;
	}

	@Override
	public void run() {
		System.out.println("进入run");
		while (running == true) {
		}
		System.out.println("线程停止");
	}
	
	public static void main(String[] args) throws Exception {
		Volatile v1 = new Volatile();
		v1.start();
		TimeUnit.SECONDS.sleep(3);
		v1.setRunning(false);
		System.out.println("让你退出");
    }
}
