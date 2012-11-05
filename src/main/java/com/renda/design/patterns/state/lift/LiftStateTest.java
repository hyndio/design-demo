package com.renda.design.patterns.state.lift;

import org.junit.Test;

public class LiftStateTest {
	
	@Test
	public void lift () {
		LiftContext context = new LiftContext();
		
		context.setCurrentLiftSate(new ClosingState());
		
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
