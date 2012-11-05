/**
 * @date 2012-10-9 下午4:31:54 
 * @version V1.0   
 */
package com.renda.design.framework.serviceprovider.a;

import org.junit.Test;

import com.renda.design.framework.serviceprovider.ServiceInterface;
import com.renda.design.framework.serviceprovider.ServiceManager;

/** 
 * <p>Description: 测试</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午4:31:54 
 *  
 */
public class FileServiceProviderTest {
	
	@Test
	public void service() throws ClassNotFoundException {
		Class.forName("com.renda.framework.serviceprovider.a.FileServiceProviderImpl");
		ServiceInterface service = ServiceManager.getService("fileService");
		service.in();
		service.out();
	}

}
