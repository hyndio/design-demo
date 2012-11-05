/**
 * @title: Visitable.java
 * @package hyd.visitor
 * @author 
 * @date 2011-1-17 下午01:47:10
 * @version v1.0
 */
package com.renda.design.patterns.visitor;

/**
 * @className: Visitable
 * @description: 被观察者用接口类型比较合适
 */
public interface Visitable {
	void accept(Visitor visitor);
}
