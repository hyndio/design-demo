/**
 * @date 2012-10-9 下午4:25:45 
 * @version V1.0   
 */
package com.renda.design.framework.serviceprovider.a;

import com.renda.design.framework.serviceprovider.ServiceInterface;

/** 
 * @ClassName: FileServiceImpl 
 * <p>Description: 文件服务实现</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午4:25:45 
 *  
 */
public class FileServiceImpl implements ServiceInterface {

	/* (non-Javadoc)
	 * @see com.renda.framework.serviceprovider.ServiceInterface#in()
	 */
	public boolean in() {
		System.out.println("FileService in...");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.renda.framework.serviceprovider.ServiceInterface#out()
	 */
	public boolean out() {
		System.out.println("FileService out...");
		return false;
	}

}
