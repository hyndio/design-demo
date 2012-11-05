package com.renda.design.patterns.mediator;

public class ColleagueB {
	
	private final static String TYPE = "B";
	private String name;
	
	public ColleagueB() {
		super();
	}

	public void compileProcedure(String name) {
		this.name = name;
		MediatorImpl mediatorImpl = MediatorImpl.getInstance();
		mediatorImpl.bchange(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public static String getType() {
		return TYPE;
	}
}
