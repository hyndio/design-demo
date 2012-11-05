package com.renda.design.framework.serviceprovider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务提供者注册、管理
 * 框架实现
 * @author Administrator
 * 
 */
public class ServiceManager {
	// 构造方法私有
	private ServiceManager() {
	}

	// 服务提供者
	public static final Map<String, ServiceProviderInterface> providers = new ConcurrentHashMap<String, ServiceProviderInterface>();

	// 注册服务提供者
	public static void registerProvider(String name, ServiceProviderInterface provider) {
		if (provider != null) {
			providers.put(name, provider);
		}
	}
	
	// 获取服务
	public static ServiceInterface getService(String name) {
		ServiceProviderInterface p = providers.get(name);
		if (p == null) {
			throw new IllegalArgumentException("No provider registered with name:" + name);
		}
		return p.getService();
	}
	
	
}
