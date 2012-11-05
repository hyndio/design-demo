/**
 * @title: Goods1.java
 * @package hyd.inner.anonymity
 * @author 
 * @date 2011-1-19 下午03:16:57
 * @version v1.0
 */
package com.renda.etc.inner.anonymity;

/**
 * @className: Goods1
 * @description: 
 */
public class Goods1 {
	
	public Destination dest(String s) {
		/** 局部内部类 */
		class GDestination implements Destination {
			private String label;
			/**
			 * @param label
			 */
			public GDestination(String label) {
				super();
				this.label = label;
			}

			public String readLabel() {
				return label;
			}
			
		}
		return new GDestination(s);
	}
}
