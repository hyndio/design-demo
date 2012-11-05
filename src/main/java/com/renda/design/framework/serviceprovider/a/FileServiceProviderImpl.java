/**
 * @date 2012-10-9 下午4:29:14 
 * @version V1.0   
 */
package com.renda.design.framework.serviceprovider.a;

import com.renda.design.framework.serviceprovider.ServiceInterface;
import com.renda.design.framework.serviceprovider.ServiceManager;
import com.renda.design.framework.serviceprovider.ServiceProviderInterface;

/** 
 * <p>Description: 文件服务提供者实现</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午4:29:14 
 *  
 */
public class FileServiceProviderImpl implements ServiceProviderInterface {
	
	static {
		ServiceManager.registerProvider("fileService", new FileServiceProviderImpl());
	}

	/* (non-Javadoc)
	 * @see com.renda.framework.serviceprovider.ServiceProviderInterface#getService()
	 */
	public ServiceInterface getService() {
		return new FileServiceImpl();
	}

}
