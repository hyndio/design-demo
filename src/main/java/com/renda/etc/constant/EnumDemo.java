/**
 * @Title: EnumDemo.java
 * @Package hyd.finance.iworkflow
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 上午11:20:10
 * @version v1.0
 */
package com.renda.etc.constant;

import org.junit.Test;

/**
 * @ClassName: EnumDemo
 * @Description: 学习枚举: 枚举，固定好的实例组合
 */
public class EnumDemo {
	private enum Season {
		SPRING("I like it!"), 
		SUMMER("I also like it!"), 
		AUTUMN("Also, like it!"), 
		WINTER("I hate it!");
		
		private final String str;
		
		private Season(String str) {
			this.str = str;
		}
		
		public String getStr() {
			return str;
		}
	}
	
	@Test
	public void printSeasonName () {
		switchUse(Season.WINTER);
		switchUse(Season.SUMMER);
	}
	
	private static void switchUse (Season s) {
		switch (s) {
		case SPRING:
			System.out.println("春天！" + s.getStr());
			break;
		case SUMMER:
			System.out.println("夏天！" + s.getStr());
			break;
		case AUTUMN:
			System.out.println("秋天！" + s.getStr());
			break;
		default:
			System.out.println("冬天！" + s.getStr());
		}
	}
}
