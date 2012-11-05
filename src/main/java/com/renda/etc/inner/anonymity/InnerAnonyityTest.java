/**
 * @title: InnerAnonyityTest.java
 * @package hyd.inner.anonymity
 * @author 
 * @date 2011-1-19 下午02:04:32
 * @version v1.0
 */
package com.renda.etc.inner.anonymity;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @className: InnerAnonyityTest
 * @description: 
 */
public class InnerAnonyityTest {
	
	@Test
	public void third() {
		Goods2 g = new Goods2();
		Contents c = g.cont();
		System.out.println(c.value());
	}
	
	@Ignore
	@Test
	public void second () {
		Goods1 g = new Goods1();
		Destination d = g.dest("yuandong.huang@gmail.com");
		System.out.println(d.readLabel());
	}
	
	@Ignore
	@Test
	public void first () {
		Goods g = new Goods();
		Contents cont = g.cont();
		System.out.println(cont.value());
		Destination dest = g.dest("yuandong.huang@gmail.com");
		System.out.println(dest.readLabel());
	}

}
