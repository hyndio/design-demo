/**
 * @Title: AlarmDoor.java
 * @Package hyd.aabstract.iinterface
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 下午03:24:21
 * @version v1.0
 */
package com.renda.etc.aabstract.iinterface;

import org.junit.Test;

/**
 * @ClassName: AlarmDoor
 * @Description: TODO
 */
public class AlarmDoor extends Door implements Alarmable {

	/* (non-Javadoc)
	 * @see hyd.aabstract.iinterface.Door#close()
	 */
	@Override
	public void close() {
		System.out.println("关门");
	}

	/* (non-Javadoc)
	 * @see hyd.aabstract.iinterface.Door#open()
	 */
	@Override
	public void open() {
		System.out.println("开门");
		//return this;
	}

	/* (non-Javadoc)
	 * @see hyd.aabstract.iinterface.Alarmable#alarm()
	 */
	public void alarm() {
		System.out.println("报警");
	}
	
	@Test
	public void execute() {
		super.number();
		open();
		alarm();
		close();
	}

}
