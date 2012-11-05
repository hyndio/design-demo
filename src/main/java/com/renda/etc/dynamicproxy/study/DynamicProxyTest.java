package com.renda.etc.dynamicproxy.study;


import java.lang.reflect.Proxy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicProxyTest {
	@Before
	public void before(){
		System.out.println("+++++++++++");
	}
	
	@After
	public void after(){
		System.out.println("+++++++++++");
	}

	@Test
	public void dynamicProxy(){
		/**
		 * 产生代理类
		 * Object proxy = Proxy.newProxyInstance(定义代理对象的类加载器, 
		 * 要代理的目标对象的归属接口数组,回调接口InvocationHandler);
		 */
		Object proxy=Proxy.newProxyInstance(Student.class.getClassLoader(),
				Student.class.getInterfaces(), new MyInvocationHandler(new Student()));
		//将代理类强制转换为接口类,必须是接口类
		Person person=(Person) proxy;
		//调用接口中的方法
		person.eat("大鱼大肉,哈哈");
		person.work("上学");
	}
	
	@Test
	public void dd(){
		System.out.println("111111111111111111111");
	}

}
