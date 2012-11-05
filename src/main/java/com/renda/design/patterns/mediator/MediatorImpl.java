package com.renda.design.patterns.mediator;

public class MediatorImpl {
	
	private static MediatorImpl mediatorImpl = null;
	
	private String data;
	
	private MediatorImpl() {}
	
	public static MediatorImpl getInstance() {
		if (mediatorImpl == null) {
			mediatorImpl = new MediatorImpl();
		}
		return mediatorImpl;
	}

	public void achange(ColleagueA a) {
		this.doAthings(a.getName());
	}
	
	public void bchange(ColleagueB b) {
		this.doBthings(b.getName());
	}
	
	public void doAthings(String name) {
		System.out.println("Do A things name: " + name);
		this.data = name + ":A";
		ColleagueB b = new ColleagueB();
		b.compileProcedure(this.data);
	}
	
	public void doBthings(String name) {
		System.out.println("Do B things type:" + name);
	}
	
}
