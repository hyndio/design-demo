/**
 * @Title: DateDemo.java
 * @Package hyd.date.us
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-8 上午09:34:11
 * @version v1.0
 */
package com.renda.etc.date.us;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

/**
 * @ClassName: DateDemo
 * @Description: 日期
 */
public class DateDemo {
	@Test
	public void dd() {
		// Mon Nov 08 09:58:59 CST 2010
		java.util.Date ud = new java.util.Date();
		System.out.println(ud);
		// 1289183104234
		System.out.println(ud.getTime());
		// 1289183123140
		System.out.println(System.currentTimeMillis());
		
		// 2010-11-08
		java.sql.Date sd = new java.sql.Date(ud.getTime());
		System.out.println(sd);
		
		// 2010-11-8
		Calendar c = Calendar.getInstance();
		String ymh = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE);// + c.get(Calendar.DAY_OF_WEEK);
		System.out.println(ymh);
		
		// 09:58:59
		java.sql.Time st = new java.sql.Time(ud.getTime());
		System.out.println(st);
		
		// 2010-11-08 10:00:53.078
		java.sql.Timestamp sts = new java.sql.Timestamp(ud.getTime());
		System.out.println(sts);
		
		// 2010-11-08 10:34:13 星期一
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEE");
		System.out.println("yyyy-MM-dd hh:mm:ss EEEE " + df.format(ud));
		
		String s = "1986-05-10";
		try {
			java.util.Date strd = df.parse(s);
			System.out.println(strd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		DateFormat longDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(shortDateFormat.format(ud)); 
		System.out.println(mediumDateFormat.format(ud)); 
		System.out.println(longDateFormat.format(ud));
		System.out.println(fullDateFormat.format(ud));
		
		Calendar cl = new GregorianCalendar();
		cl.setTime(ud);
		System.out.println(fullDateFormat.format(cl.getTime()));
		cl.set(GregorianCalendar.DAY_OF_WEEK, GregorianCalendar.FRIDAY); 
		System.out.println("After Setting Day of Week to Friday: " + fullDateFormat.format(cl.getTime()));
		
		
		
	}
}
