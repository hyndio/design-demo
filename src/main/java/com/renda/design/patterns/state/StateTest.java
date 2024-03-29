package com.renda.design.patterns.state;

import org.junit.Test;

public class StateTest {
	
	@Test
	public void state() {
		/** 定义环境角色 */
		Context context = new Context();
		/** 初始化状态 */
		context.setCurrentState(new ConcreteState1());
		/** 行为执行 */
		context.handle1();
		context.handle2();
	}
}
