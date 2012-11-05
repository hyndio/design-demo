/**
 * @title: ConcreteObserverB.java
 * @package hyd.design.patterns.observer
 * @author 
 * @date 2011-1-18 下午06:22:47
 * @version v1.0
 */
package com.renda.design.patterns.observer;

/**
 * @className: ConcreteObserverB
 * @description: 
 */
public class ConcreteObserverB implements Observer {

	public void update(Subject s) {
		System.out.println("----------ConcreteObserverB------------");
		System.out.println("Now, the number is " + s.getNumber());
		int count = s.getNumber();  
        for(int i = 0 ; i < count; i ++) {  
            System.out.print("*^_^*  ");  
        }  
		System.out.println();
	}

}
