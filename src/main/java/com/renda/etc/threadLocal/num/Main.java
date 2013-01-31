/**
 * @author hyd 2013-1-31 下午4:44:39 
 * @version 1.0
 */
package com.renda.etc.threadLocal.num;

/**
 * TODO
 * <p>
 * 
 */
public class Main {
	public static void main(String[] args) {
		SequenceNumber sn = new SequenceNumber();
		// ③ 3个线程共享sn，各自产生序列号
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		t1.start();
		t2.start();
		t3.start();
	}
}
