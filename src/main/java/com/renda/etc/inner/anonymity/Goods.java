/**
 * @title: Goods.java
 * @package hyd.inner.anonymity
 * @author 
 * @date 2011-1-19 下午01:58:10
 * @version v1.0
 */
package com.renda.etc.inner.anonymity;

/**
 * @className: Goods
 * @description: 
 */
public class Goods {
	private int valueRate = 2;
	/** 内部类一 */
	private class Content implements Contents {
		private int i = 11*Goods.this.valueRate;
		public int value() {
			return i;
		}
	}
	
	/** 内部类二 */
	protected class GDestination implements Destination {
		private String label;
		public GDestination(String label) {
			super();
			this.label = label;
		}
		public String readLabel() {
			return this.label;
		}
		
	}
	
	public Contents cont() {
		return new Content();
	}
	
	public Destination dest(String s) {
		return new GDestination(s);
	}
}
