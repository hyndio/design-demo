/**
 * @author hyd 2013-1-9 上午10:28:51 
 * @version 1.0
 */
package com.renda.design.framework.plugins;

import java.util.List;

import org.junit.Test;

import com.renda.design.framework.plugins.demo.Said;

/**
 * TODO
 * <p>
 * 
 */
public class PluginTest {

	@Test
	public void said() {
		PluginManager<Said> plugins = new SimplePluginManager<Said>(
				"com.renda.design.framework.plugins.demo.PeterSaidPlugin", "com.renda.design.framework.plugins.demo.TomSaidPlugin");
		Said said = plugins.get();
		System.out.println(said.say());
	}
	
	@Test
	public void saidlist() {
		PluginManager<Said> plugins = new SimplePluginManager<Said>(
				"com.renda.design.framework.plugins.demo.PeterSaidPlugin", "com.renda.design.framework.plugins.demo.TomSaidPlugin");
		List<Said> saids = plugins.gets();
		for (Said said : saids) {
			System.out.println(said.say());
		}
	}
}
