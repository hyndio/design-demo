package com.renda.design.patterns.state.lift;

public class ClosingState extends LiftState {

	@Override
	public void open() {
		super.context.setCurrentLiftSate(LiftContext.openningState);
		super.context.open();
	}

	@Override
	public void close() {
		System.out.println("The lift is closing now...");

	}

	@Override
	public void run() {
		super.context.setCurrentLiftSate(LiftContext.runningState);
		super.context.run();

	}

	@Override
	public void stop() {
		super.context.setCurrentLiftSate(LiftContext.stoppingState);
		super.context.stop();

	}

}
