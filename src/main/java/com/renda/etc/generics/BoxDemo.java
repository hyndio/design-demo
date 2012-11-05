/**
 * @Title: BoxDemo.java
 * @Package hyd.generics
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 下午05:47:41
 * @version v1.0
 */
package com.renda.etc.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: BoxDemo
 * @Description: 测试类
 */
public class BoxDemo {
	@Ignore
	@Test
	public void Box1() {
		Box<String> b1 = new BoxImpl<String>();
		b1.put("测试一：String");
		System.out.println(b1.get());
	}
	@Ignore
	@Test
	public void Box2() {
		Box<Integer> b = new BoxImpl<Integer>();
		b.put(new Integer(9));
		System.out.println(b.get());
	}
	@Ignore
	@Test
	public void List1() {
		List<String> ls = new ArrayList<String>();
		//List<Object> lo = ls;
		//lo.add(new Object());
		String s = ls.get(0);
		System.out.println(s);
	}
	
	@Test
	public void List2 () {
		List<String> ls = new ArrayList<String>();
		ls.add("aaa");
		ls.add("bbb");
		ls.add("ccc");
		printCollection(ls);
	}
	
	public void printCollection(Collection<?> c) {
		for (Object o : c) {
			System.out.println(o);
		}
	}

}
