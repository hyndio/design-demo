/**
 * @author hyd 2013-1-9 上午10:26:31 
 * @version 1.0
 */
package com.renda.design.framework.plugins.demo;

import com.renda.design.framework.plugins.Plugin;

/**
 * TODO
 * <p>
 * 
 */
public class PeterSaidPlugin implements Plugin, Said {
	private Said said;

	public boolean canWork() {
		try {
			said = (Said) (Class.forName("com.renda.design.framework.plugins.demo.PeterSaid").newInstance());
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	public String say() {
		return said.say();
	}
}
