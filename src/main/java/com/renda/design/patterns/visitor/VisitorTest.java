/**
 * @title: VisitorTest.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午02:02:55
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @className: VisitorTest
 * @description: 
 */
public class VisitorTest {

	@Ignore
	@Test
	public void a() {
		ConcreteVisitableElementA a = new ConcreteVisitableElementA();
		a.accept(new RealVisitorA());
		a.a();
	}
	
	@Test
	public void all () {
		ObjectStructure os = new ObjectStructure();
		ConcreteVisitableElementA a = new ConcreteVisitableElementA();
		ConcreteVisitableElementB b = new ConcreteVisitableElementB();
		RealVisitorAll all = new RealVisitorAll();
		os.add(a).add(b).action(all);
	}
}
