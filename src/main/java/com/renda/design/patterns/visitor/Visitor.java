/**
 * @title: Visitor.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午01:45:42
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

/**
 * @className: Visitor
 * @description: 观察者用抽象类型比较合适
 */
public abstract class Visitor {
	public Visitor() {
	}

	public void visit(ConcreteVisitableElementA a) {
	}
	
	public void visit(ConcreteVisitableElementB b) {
	}
}
