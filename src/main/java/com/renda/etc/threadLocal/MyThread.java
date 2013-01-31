/**
 * @author hyd 2013-1-31 下午3:06:06 
 * @version 1.0
 */
package com.renda.etc.threadLocal;

/** 
 * TODO
 * <p>
 *  
 */
public class MyThread extends Thread {
	void print(String words) {
		new MyThread().start();
	}
	public void run() {
		Log.println("111");
		Log.close();
	}
}
