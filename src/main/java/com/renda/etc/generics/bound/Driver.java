/**
 * @Title: Driver.java
 * @Package hyd.generics.bound
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-5 上午10:43:47
 * @version v1.0
 */
package com.renda.etc.generics.bound;

/**
 * @ClassName: Driver
 * @Description: 驾驶员，子类
 */
public class Driver extends Person {
	private String car;

	public Driver() {
		super();
	}
	
	public Driver(String name) {
		super(name);
	}

	public Driver(String name, String car) {
		super(name);
		this.car = car;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
}
