/**
 * @Title: Door.java
 * @Package hyd.aabstract.iinterface
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 下午03:17:55
 * @version v1.0
 */
package com.renda.etc.aabstract.iinterface;

/**
 * @ClassName: Door
 * @Description: 抽象类
 */
public abstract class Door {
	/**
	 * @Title: open
	 * @Description: 开门
	 */
	public abstract void open();
	/**
	 * @Title: close
	 * @Description: 关门
	 */
	public abstract void close();
	/**
	 * @Title: number
	 * @Description: 门牌号，实现好了的方法
	 */
	public void number() {
		System.out.println("门牌号为888");
	}
}
