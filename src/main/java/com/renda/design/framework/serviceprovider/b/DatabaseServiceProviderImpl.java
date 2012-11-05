package com.renda.design.framework.serviceprovider.b;

import com.renda.design.framework.serviceprovider.ServiceInterface;
import com.renda.design.framework.serviceprovider.ServiceManager;
import com.renda.design.framework.serviceprovider.ServiceProviderInterface;

/**
 * 服务提供者实现
 * 具体厂商实现
 * @author Administrator
 *
 */
public class DatabaseServiceProviderImpl implements ServiceProviderInterface {
	
	static {
		ServiceManager.registerProvider("huangyuandong", new DatabaseServiceProviderImpl());
	}

	public ServiceInterface getService() {
		return new DatabaseServiceImpl();
	}

}
