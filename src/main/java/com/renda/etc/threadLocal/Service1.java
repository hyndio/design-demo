/**
 * @author hyd 2013-1-31 下午1:39:41 
 * @version 1.0
 */
package com.renda.etc.threadLocal;

/**
 * TODO
 * <p>
 * 
 */
public class Service1 {
	public void method1() {
		Log.println(Thread.currentThread().getName() + " - Service1.method1()");
		new Service2().method2();
	}
}
