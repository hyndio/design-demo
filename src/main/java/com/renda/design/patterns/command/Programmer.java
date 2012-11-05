/**
 * @title: Programmer.java
 * @package hyd.command
 * @author 
 * @date 2011-1-17 下午02:34:31
 * @version v1.0
 */
package com.renda.design.patterns.command;

/**
 * @className: Programmer
 * @description: 
 */
public class Programmer implements Command {
	private ConcreteExecuteOne one;

	/**
	 * @param one
	 */
	public Programmer(ConcreteExecuteOne one) {
		super();
		this.one = one;
	}

	public void execute() {
		one.complete();
	}
}
