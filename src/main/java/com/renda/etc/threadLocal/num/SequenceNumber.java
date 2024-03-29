/**
 * @author hyd 2013-1-31 下午4:41:47 
 * @version 1.0
 */
package com.renda.etc.threadLocal.num;

/**
 * TODO
 * <p>
 * 
 */
public class SequenceNumber {
	
	// ①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return 0;
		}
	};

	// ②获取下一个序列值
	public int getNextNum() {
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}
	
}
