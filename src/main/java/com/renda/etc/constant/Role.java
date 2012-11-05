/**
 * @date 2012-10-24 上午9:27:12 
 * @version V1.0   
 */
package com.renda.etc.constant;

/** 
 * <p>
 * Description: 角色
 * 测试枚举
 * </p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-24 上午9:27:12 
 *  
 */
public enum Role {
	Admin("管理员");
	
	private String name;

	private Role(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
