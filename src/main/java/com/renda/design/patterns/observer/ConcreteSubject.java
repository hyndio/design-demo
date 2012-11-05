/**
 * @title: ConcreteSubject.java
 * @package hyd.design.patterns.observer
 * @author 
 * @date 2011-1-18 下午06:14:03
 * @version v1.0
 */
package com.renda.design.patterns.observer;

import java.util.Random;

/**
 * @className: ConcreteSubject
 * @description: 具体的被观察者
 */
public class ConcreteSubject extends Subject {
	private Random random = new Random();
    private int number; 
  
    public void generate() {  
        for(int i=0 ; i < 3; i++) {  
            this.number = random.nextInt(10);
            /** 如果有新产生的数字，通知所有注册的观察者  */
            this.notifyObserver();
        }  
    }  
    /** 获得数字*/  
    public int getNumber() {  
        return number;  
    }  
}
