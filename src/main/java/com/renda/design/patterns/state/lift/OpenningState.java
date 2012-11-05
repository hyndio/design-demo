package com.renda.design.patterns.state.lift;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("The lift is openning now...");
	}

	@Override
	public void close() {
		super.context.setCurrentLiftSate(LiftContext.closingSate);
		super.context.close();
	}

	@Override
	public void run() {

	}

	@Override
	public void stop() {
		
	}

}
