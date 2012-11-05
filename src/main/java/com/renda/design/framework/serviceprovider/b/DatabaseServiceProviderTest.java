package com.renda.design.framework.serviceprovider.b;

import org.junit.Test;

import com.renda.design.framework.serviceprovider.ServiceInterface;
import com.renda.design.framework.serviceprovider.ServiceManager;

/**
 * 测试
 * @author Administrator
 *
 */
public class DatabaseServiceProviderTest {
	
	@Test
	public void service() throws ClassNotFoundException {
		Class.forName("com.renda.framework.serviceprovider.b.DatabaseServiceProviderImpl");
		ServiceInterface service = ServiceManager.getService("huangyuandong");
		service.in();
		service.out();
	}
	
}
