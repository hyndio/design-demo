/**
 * @title: ObserverTest.java
 * @package hyd.design.patterns.observer
 * @author 
 * @date 2011-1-18 下午06:24:30
 * @version v1.0
 */
package com.renda.design.patterns.observer;

import org.junit.Test;

/**
 * @className: ObserverTest
 * @description: 
 */
public class ObserverTest {
	
	@Test
	public void observer() {
		ConcreteSubject s = new ConcreteSubject();
		s.registerObserver(new ConcreteObserverA())
	     .registerObserver(new ConcreteObserverB());
		s.generate();
	}

}
