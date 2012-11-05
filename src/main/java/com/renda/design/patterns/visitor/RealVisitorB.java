/**
 * @title: RealVisitorB.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午02:01:44
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

/**
 * @className: RealVisitorB
 * @description: 
 */
public class RealVisitorB extends Visitor {
	public void visit(ConcreteVisitableElementB b) {
		System.out.println("This is realVisitor B!");
	}
}
