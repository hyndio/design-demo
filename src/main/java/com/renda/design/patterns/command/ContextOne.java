/**
 * @title: ContextOne.java
 * @package hyd.command
 * @author 
 * @date 2011-1-17 下午02:35:58
 * @version v1.0
 */
package com.renda.design.patterns.command;

/**
 * @className: ContextOne
 * @description: 
 */
public class ContextOne {

	private Command cmd;

	/**
	 * @param cmd
	 */
	public ContextOne(Command cmd) {
		super();
		this.cmd = cmd;
	}

	public void execute() {
		this.cmd.execute();
	}
	
}
