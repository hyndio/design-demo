/**
 * @title: RealVisitorAll.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午02:15:34
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

/**
 * @className: RealVisitorAll
 * @description: 
 */
public class RealVisitorAll extends Visitor {
	public void visit(ConcreteVisitableElementA a) {
		System.out.println("This is RealVisitor A!");
	}
	public void visit(ConcreteVisitableElementB b) {
		System.out.println("This is realVisitor B!");
	}
}
