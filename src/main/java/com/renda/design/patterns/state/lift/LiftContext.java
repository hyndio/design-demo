package com.renda.design.patterns.state.lift;

public class LiftContext {
	
	public final static OpenningState openningState = new OpenningState();
	public final static ClosingState closingSate = new ClosingState();
	public final static RunningState runningState = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();
	
	private LiftState currentLiftSate;

	public LiftState getCurrentLiftSate() {
		return currentLiftSate;
	}

	public void setCurrentLiftSate(LiftState currentLiftSate) {
		/** 改变当前状态 */
		this.currentLiftSate = currentLiftSate;
		/** 改变当前状态中环境角色 */
		this.currentLiftSate.setContext(this);
	}
	
	public void open() {
		this.currentLiftSate.open();
	}
	
	public void close() {
		this.currentLiftSate.close();
	}
	
	public void run() {
		this.currentLiftSate.run();
	}
	
	public void stop() {
		this.currentLiftSate.stop();
	}

}
