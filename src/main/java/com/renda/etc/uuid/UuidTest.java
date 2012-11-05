/**
 * @title: UuidTest.java
 * @package hyd.uuid
 * @author 
 * @date 2011-3-4 下午04:59:10
 * @version v1.0
 */
package com.renda.etc.uuid;

import java.util.UUID;

import org.junit.Test;

/**
 * @className: UuidTest
 * @description: 
 */
public class UuidTest {
	
	@Test
	public void uuid() {
		 String str = UUID.randomUUID().toString().replace("-", "");
		    String s = str.substring(str.length()-20);
		    System.out.println(s);
		    System.out.println(System.currentTimeMillis());
		    System.out.println(UUID.randomUUID().toString());
	}

}
