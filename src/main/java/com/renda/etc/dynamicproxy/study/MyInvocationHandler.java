package com.renda.etc.dynamicproxy.study;
/**
 * 实现InvocationHandler，回调类
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	//接收目标对象
	private Object object;

	public MyInvocationHandler(Object object) {
		this.object = object;
	}
	
	public void befordMethod(){
		System.out.println("--------前");
	}

	public void afterMethod(){
		System.out.println("--------后");
	}
	/**
	 * 方法名:invoke
	 * 返回类型：Object
	 * 第一个参数：使用Proxy 的静态方法创建的动态代理对象，也就是 $Proxy0的实例
	 * 第二个参数：调用的方法的Method对象
	 * 第三个参数：方法的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		befordMethod();
		/**
		 * 使用invoke方法调用目标对象的方法
		 */
		Object returnObj=method.invoke(object, args);
		afterMethod();
		return returnObj;
	}

}
