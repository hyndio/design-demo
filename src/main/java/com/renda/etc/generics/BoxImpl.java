/**
 * @Title: BoxImpl.java
 * @Package hyd.generics
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 下午05:41:13
 * @version v1.0
 */
package com.renda.etc.generics;

/**
 * @ClassName: BoxImpl
 * @Description: 实现Box接口
 */
public class BoxImpl<T> implements Box<T> {
	private T t;

	/* 
	 * @see hyd.generics.Box#get()
	 */
	public T get() {
		return t;
	}

	/* 
	 * @see hyd.generics.Box#put(java.lang.Object)
	 */
	public void put(T element) {
		this.t = element;
	}

}
