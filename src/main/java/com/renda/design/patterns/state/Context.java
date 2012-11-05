package com.renda.design.patterns.state;

public class Context {
	/** 有多少种状态就有多少个状态具体子类，这里就有多少个静态常量 */
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();
	
	/** 当前状态 */
	public State currentState;

	/** 获取当前状态 */
	public State getCurrentState() {
		return currentState;
	}

	/** 设置当前状态 */
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		this.currentState.setContext(this);
	}
	
	/** 行为委托 */
	public void handle1() {
		this.currentState.handle1();
	}
	
	public void handle2() {
		this.currentState.handle2();
	}
}
