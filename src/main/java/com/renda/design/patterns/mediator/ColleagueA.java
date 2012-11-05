package com.renda.design.patterns.mediator;

public class ColleagueA {

	private final static String TYPE = "A";
	private String name = "yuandong";
	
	public ColleagueA() {
		super();
	}

	public void writeProcedure() {
		MediatorImpl mediatorImpl = MediatorImpl.getInstance();
		mediatorImpl.achange(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public static String getType() {
		return TYPE;
	}
}
