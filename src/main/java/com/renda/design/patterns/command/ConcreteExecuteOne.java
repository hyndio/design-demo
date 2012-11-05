/**
 * @title: ConcreteExecuteOne.java
 * @package hyd.command
 * @author 
 * @date 2011-1-17 下午02:29:38
 * @version v1.0
 */
package com.renda.design.patterns.command;

/**
 * @className: ConcreteExecuteOne
 * @description: 命令具体执行的人
 */
public class ConcreteExecuteOne {
	
	private String name;

	/**
	 * @param name
	 */
	public ConcreteExecuteOne(String name) {
		super();
		this.name = name;
	}
	
	public void complete() {
		System.out.println(this.name + " do the job!");
	}
}
