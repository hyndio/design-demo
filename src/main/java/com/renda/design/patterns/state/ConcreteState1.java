package com.renda.design.patterns.state;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		/** 本状态下必须处理的逻辑 */
		System.out.println("现在是state1.");
	}

	@Override
	public void handle2() {
		/** 设置当前状态为state2，此时改变为状态也改变为了当前的环境角色 */
		super.context.setCurrentState(Context.STATE2);
		/** 过渡到state2状态，由context类实现 */
		super.context.handle2();
	}

}
