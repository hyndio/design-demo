package com.renda.design.framework.serviceprovider.b;

import com.renda.design.framework.serviceprovider.ServiceInterface;

/**
 * 服务实现
 * 具体厂商实现
 * @author Administrator
 *
 */
public class DatabaseServiceImpl implements ServiceInterface {

	public boolean in() {
		System.out.println("DBService in……");
		return true;
	}

	public boolean out() {
		System.out.println("DBService out……");
		return true;
	}

}
