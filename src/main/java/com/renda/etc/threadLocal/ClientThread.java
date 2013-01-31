/**
 * @author hyd 2013-1-31 下午1:40:34 
 * @version 1.0
 */
package com.renda.etc.threadLocal;

/**
 * TODO
 * <p>
 * 
 */
public class ClientThread extends Thread {
	
	public static void main(String[] args) {
		new ClientThread().start();
		new ClientThread().start();
		Thread c = new ClientThread("C");
		c.start();
	}
	public ClientThread() {
		super();
	}
	public ClientThread(String name) {
		super(name);
	}

	public void run() {
		System.out.println(getName() + " BEGIN");
		for (int i = 0; i < 10; i++) {
			/*
			 * 每个线程在第一次记录日志时，都会先创建一个新的 Logger ，以后记录 会使用第一次创建的 Logger
			 */
			Log.println("i = " + i);
			// 
			new Service1().method1();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		// 关闭时也只是关闭本线程的文件，对其他线程不影响
		Log.close();
		System.out.println(getName() + " END");
	}
}
