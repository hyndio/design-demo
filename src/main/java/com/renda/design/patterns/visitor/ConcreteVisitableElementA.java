/**
 * @title: ConcreteVisitableElementA.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午01:50:12
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

/**
 * @className: ConcreteVisitableElementA
 * @description: 
 */
public class ConcreteVisitableElementA implements Visitable {

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void a() {
		System.out.println("This is the visitable element A!");
	}

}
