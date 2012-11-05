package com.renda.design.patterns.state.lift;

public class RunningState extends LiftState {

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		

	}

	@Override
	public void run() {
		System.out.println("The Lift is running now...");

	}

	@Override
	public void stop() {
		super.context.setCurrentLiftSate(LiftContext.stoppingState);
		super.context.stop();
	}

}
