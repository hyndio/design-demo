/**
 * @title: Goods2.java
 * @package hyd.inner.anonymity
 * @author 
 * @date 2011-1-19 下午03:23:26
 * @version v1.0
 */
package com.renda.etc.inner.anonymity;

/**
 * @className: Goods2
 * @description: 
 */
public class Goods2 {

	private int valueRate = 2;
	public Contents cont() {
		return new Contents() {
			/** 匿名类 */
			private int i = 11*valueRate;
			public int value() {
				return i;
			}
		};
	}
}
