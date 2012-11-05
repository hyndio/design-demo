package com.renda.design.patterns.state;

public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		/** 设置当前状态为state1，此时改变为状态也改变为了当前的环境角色 */
		super.context.setCurrentState(Context.STATE1);
		/** 过渡到state1状态，由context实现 */
		super.context.handle1();
	}

	@Override
	public void handle2() {
		/** 本状态下必须处理的逻辑 */
		System.out.println("现在是state2.");
	}

}
