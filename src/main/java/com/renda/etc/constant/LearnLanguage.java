/**
 * @Title: LearnLanguage.java
 * @Package hyd.finance.iworkflow
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 上午11:56:05
 * @version v1.0
 */
package com.renda.etc.constant;

import java.util.EnumSet;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: LearnLanguage
 * @Description: 学习枚举
 */
public class LearnLanguage {
	//Language l = Language.JAVA;
	EnumSet<Language> st = EnumSet.allOf(Language.class);
	
	@Ignore
	@Test
	public void currentUse () {
		System.out.println(Language.JAVA.getUsing());
		System.out.println(Language.GROOVY.doSomething());
		for (Language l : st) {
			System.out.println(l);
		}
	} 
	
	@Test
	public void print() {
		String s = Language.GROOVY.toString();
		System.out.println(s);
	}
}
