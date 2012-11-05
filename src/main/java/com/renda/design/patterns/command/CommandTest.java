/**
 * @title: CommandTest.java
 * @package hyd.command
 * @author 
 * @date 2011-1-17 下午02:37:21
 * @version v1.0
 */
package com.renda.design.patterns.command;

import org.junit.Test;

/**
 * @className: CommandTest
 * @description: 
 */
public class CommandTest {
	
	@Test
	public void engineer() {
		ConcreteExecuteOne one = new ConcreteExecuteOne("工程师");
		Command engineer = new Engineer(one);
		ContextOne co = new ContextOne(engineer);
		co.execute();
	}
	
	@Test
	public void programmer() {
		ConcreteExecuteOne one = new ConcreteExecuteOne("程序员");
		Command programmer = new Programmer(one);
		ContextOne co = new ContextOne(programmer);
		co.execute();
	}

}
