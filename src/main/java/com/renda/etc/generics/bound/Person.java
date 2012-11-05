/**
 * @Title: Person.java
 * @Package hyd.generics.bound
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-5 上午10:42:47
 * @version v1.0
 */
package com.renda.etc.generics.bound;

/**
 * @ClassName: Person
 * @Description: 人，超类
 */
public class Person {
	private String name;

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
