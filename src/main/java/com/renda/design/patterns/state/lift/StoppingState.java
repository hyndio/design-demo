package com.renda.design.patterns.state.lift;

public class StoppingState extends LiftState {

	@Override
	public void open() {
		super.context.setCurrentLiftSate(LiftContext.openningState);
		super.context.open();

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		super.context.setCurrentLiftSate(LiftContext.runningState);
		super.context.run();
	}

	@Override
	public void stop() {
		System.out.println("The lift is stopping now...");

	}

}
