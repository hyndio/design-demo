/**
 * @Title: Box.java
 * @Package hyd.generics
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 下午05:19:01
 * @version v1.0
 */
package com.renda.etc.generics;

/**
 * @ClassName: Box
 * @Description: 泛型
 */
public interface Box<T> {
	T get();
	void put(T element);
}
