/**
 * @title: Subject.java
 * @package hyd.design.patterns.observer
 * @author 
 * @date 2011-1-18 下午06:05:09
 * @version v1.0
 */
package com.renda.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: Subject
 * @description: 被观察者的抽象类
 */
public abstract class Subject {
	List<Observer> observers = new ArrayList<Observer>();
	/** 注册观察者 */
	public Subject registerObserver(Observer o) {
		observers.add(o);
		return this;
	}
	/** 删除观察者 */
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	/** 状态变化时通知观察者 */
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(this);
		}
	}
	/** 获取数字  */
	public abstract int getNumber();
}
