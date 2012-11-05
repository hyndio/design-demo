/**
 * @title: ObjectStructure.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午02:08:45
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: ObjectStructure
 * @description: 
 */
public class ObjectStructure {
	List<Visitable> list = null;

	/**
	 * @param list
	 */
	public ObjectStructure() {
		super();
		this.list = new ArrayList<Visitable>();
	}
	
	public ObjectStructure add(Visitable v) {
		list.add(v);
		return this;
	}
	
	public void action(Visitor visitor) {
		for (Visitable v : list) {
			v.accept(visitor);
		}
	}
}
