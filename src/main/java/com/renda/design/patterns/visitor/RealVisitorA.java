/**
 * @title: RealVisitorA.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午01:59:52
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

/**
 * @className: RealVisitorA
 * @description: 
 */
public class RealVisitorA extends Visitor {
	public void visit(ConcreteVisitableElementA a) {
		System.out.println("This is RealVisitor A!");
	}
}
