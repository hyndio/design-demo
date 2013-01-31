/**
 * @author hyd 2013-1-31 下午3:07:31 
 * @version 1.0
 */
package com.renda.etc.threadLocal;

import org.junit.Test;

/** 
 * TODO
 * <p>
 *  
 */
public class ThreadTest {

	@Test
	public void p() {
		MyThread t1 = new MyThread();
		t1.print("11111");
		MyThread t2 = new MyThread();
		t2.print("22222");
		MyThread t3 = new MyThread();
		t3.print("33333");
	}
}
