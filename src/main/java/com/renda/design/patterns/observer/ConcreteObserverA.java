/**
 * @title: ConcreteObserverA.java
 * @package hyd.design.patterns.observer
 * @author 
 * @date 2011-1-18 下午06:16:39
 * @version v1.0
 */
package com.renda.design.patterns.observer;

/**
 * @className: ConcreteObserverA
 * @description: 具体的观察者A
 */
public class ConcreteObserverA implements Observer {
	
	public void update(Subject s) {
		System.out.println("----------ConcreteObserverA------------");
		System.out.println("Now, the number is " + s.getNumber());
	}

}
