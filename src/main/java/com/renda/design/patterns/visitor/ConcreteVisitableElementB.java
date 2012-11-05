/**
 * @title: ConcreteVisitableElementB.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午01:55:26
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

/**
 * @className: ConcreteVisitableElementB
 * @description: 
 */
public class ConcreteVisitableElementB implements Visitable {
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void b() {
		System.out.println("This is the visitable element B!");
	}
}
