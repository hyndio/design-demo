/**
 * @date 2012-10-10 下午12:04:58 
 * @version V1.0   
 */
package com.renda.design.patterns.singlecall;

/**
 * <p>
 * Description: 组合的实现
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-10 下午12:04:58
 * 
 */
public class Engine {
	private Engine() {
	}

	static Engine getobject(Car o) {
		if (o.can_load()) {
			return (new Engine());
		} else {
			return null;
		}
	}

	public void start() {
		System.out.println("engine started");
	}

	public void stop() {
		System.out.println("engine stopped");
	}
}
