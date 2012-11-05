/**
 * @title: Engineer.java
 * @package hyd.command
 * @author 
 * @date 2011-1-17 下午02:27:20
 * @version v1.0
 */
package com.renda.design.patterns.command;

/**
 * @className: Engineer
 * @description: 
 */
public class Engineer implements Command {
	
	private ConcreteExecuteOne one;

	/**
	 * @param one
	 */
	public Engineer(ConcreteExecuteOne one) {
		super();
		this.one = one;
	}

	public void execute() {
		one.complete();
	}

}
