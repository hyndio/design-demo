package com.renda.etc.test.study;


import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class RegularExpressionTest {
	private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
	private static Pattern pattern;
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {
	  pattern = Pattern.compile(zipRegEx);
	  System.out.println("第一个");
	 }

	 @Test
	 public void verifyGoodZipCode() throws Exception{		 
	  Matcher mtcher = this.pattern.matcher("221");
	  boolean isValid = mtcher.matches();		
//	  assertTrue("Pattern did not validate zip code", isValid);
	  assertFalse("Pattern did not validate zip code", isValid);
	  System.out.println("-----------------");
	 }
	 
	 @Ignore("忽略它……")
	 @Test
	 public void say() throws Exception {
		 System.out.println("&&&&&&&&&&&&&$$$");
	 }

}
