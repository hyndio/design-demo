package com.renda.etc.dynamicproxy.study;

/**
 * 实现Person接口
 * 2010-2-22
 */
public class Student implements Person {
	public void work(String job) {
		System.out.println("今天做什么："+job);
	}

	public void eat(String food) {
		System.out.println("今天吃什么："+food);
	}

}