package com.renda.design.patterns.state.lift;

public abstract class LiftState {
	
	protected LiftContext context;

	public void setContext(LiftContext context) {
		this.context = context;
	}
	
	public abstract void open();
	
	public abstract void close();
	
	public abstract void run();
	
	public abstract void stop();
	
	

}
