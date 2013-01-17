/**
 * @author hyd 2013-1-11 下午1:20:21 
 * @version 1.0
 */
package com.renda.etc.joda.time;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.Test;

/**
 * joda-time使用： 
 * http://www.ibm.com/developerworks/cn/java/j-jodatime.html
 * <p>
 * 如果您只是需要对日期/时间信息使用占位符，那么 JDK 完全可以胜任，
 * 但是它在日期/时间计算方面的表现十分糟糕，而这正是 Joda 的长处。
 */
public class TimeTest {
	
	@Test
	public void cal() {
		LocalDate now = new LocalDate();
		LocalDate electionDate = now.monthOfYear()
		 .setCopy(11)        // November
		 .dayOfMonth()       // Access Day Of Month Property
		 .withMinimumValue() // Get its minimum value
		 .plusDays(6)        // Add 6 days
		 .dayOfWeek()        // Access Day Of Week Property
		 .setCopy(1)	// Set to Monday (it will round down)
		 .plusDays(1);       // Gives us Tuesday
		System.out.println(electionDate.toString());
	}
	
	@Test
	public void date() {

		LocalDate localDate = new LocalDate(2009, 9, 6);
		System.out.println(localDate);
		
		LocalTime localTime = new LocalTime(13, 30, 26, 50);// 1:30:26PM
		System.out.println(localTime);
	}
	
	@Test
	public void time() {
		
		DateTime dateTime = new DateTime(
				  2000, //year
				  1,    // month
				  1,    // day
				  0,    // hour (midnight is zero)
				  0,    // minute
				  0,    // second
				  0     // milliseconds
				);
		// 创建的实例
		System.out.println(dateTime.toString());
		
		// 向某一个瞬间加上 90 天并输出结果 
		DateTime dateTime2 = new DateTime(2013, 1, 11, 0, 0, 0, 0);
		System.out.println(dateTime2.plusDays(90).toString("yyyy-MM-dd E HH:mm:ss.SSS"));
		
		// 距离 Y2K 45 天之后的某天在下一个月的当前周的最后一天的日期
		DateTime dateTime3 = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(dateTime3.plusDays(45).plusMonths(1).dayOfWeek()
		  .withMaximumValue().toString("E MM/dd/yyyy HH:mm:ss.SSS"));

		// Joda 和 JDK 互操作性:将 Joda 计算结果插入到 JDK 对象中
		Calendar calendar = Calendar.getInstance();
		DateTime dateTime4 = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(dateTime4.plusDays(45).plusMonths(1).dayOfWeek()
		  .withMaximumValue().toString("E MM/dd/yyyy HH:mm:ss.SSS"));
		calendar.setTime(dateTime4.toDate());
		
		// 当前时间
		DateTime dateTime5 = new DateTime();
		System.out.println(dateTime5.toString());
		System.out.println(DateTime.now().toString());
	}

}
