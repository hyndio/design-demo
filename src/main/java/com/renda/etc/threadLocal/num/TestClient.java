/**
 * @author hyd 2013-1-31 下午4:42:50 
 * @version 1.0
 */
package com.renda.etc.threadLocal.num;

/**
 * TODO
 * <p>
 * 
 */
public class TestClient extends Thread {
	
	private SequenceNumber sn;

	public TestClient(SequenceNumber sn) {
		this.sn = sn;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {// ④每个线程打出3个序列值
			System.out.println("thread[" + Thread.currentThread().getName()
					+ "] sn[" + sn.getNextNum() + "]");
		}
	}
}
