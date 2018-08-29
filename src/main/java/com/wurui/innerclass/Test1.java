package com.wurui.innerclass;


public class Test1 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					a.waitMethod(b);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					b.waitMethod(a);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

	}
}

class A {
	public synchronized void waitMethod(B b) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "：正在执行a的等待方法，持有a的对象锁");
		Thread.sleep(2000L);
		System.out.println(Thread.currentThread().getName() + "：试图调用b的死锁方法，尝试获取b的对象锁");
		b.deadLockMethod();
	}

	public synchronized void deadLockMethod() {
		System.out.println(Thread.currentThread().getName() + "：正在执行a的死锁方法，持有a的对象锁");
	}
}

class B {
	public synchronized void waitMethod(A a) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "：正在执行b的等待方法，持有b的对象锁");
		Thread.sleep(2000L);
		System.out.println(Thread.currentThread().getName() + "：试图调用a的死锁方法，尝试获取a的对象锁");
		a.deadLockMethod();
	}
	public synchronized void deadLockMethod() {
		System.out.println(Thread.currentThread().getName() + "：正在执行B的死锁方法，持有B的对象锁");
	}
}