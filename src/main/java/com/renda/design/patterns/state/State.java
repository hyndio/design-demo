package com.renda.design.patterns.state;
/**
 * 状态抽象类
 * @author hyd
 *
 */
public abstract class State {
	/** 定义一个环境角色，提供子类访问 */
	protected Context context;

	/** 设置环境角色 */
	public void setContext(Context context) {
		this.context = context;
	}
	
	/** 行为一 */
	public abstract void handle1();
	
	/** 行为二 */
	public abstract void handle2();

	
}
