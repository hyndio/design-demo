/**
 * @Title: Scene.java
 * @Package hyd.generics.bound
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-5 上午10:48:34
 * @version v1.0
 */
package com.renda.etc.generics.bound;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: Scene
 * @Description: 场景类，测试泛型的上下界
 */
public class Scene {
	
	/**
	 * @Title: upperbound
	 * @Description: 上界，[null | ?, 父类]，子类未确定，不能用增加数据
	 * @param list
	 * @param p
	 */
	public void upperBound(List<? extends Person> list, Person p) {
		Person per = list.get(0);
		System.out.println(per.getName());
	}
	
	/**
	 * @Title: lowerBound
	 * @Description: 下界，[子类，? | Object]，父类未确定，不能用获取数据
	 * @param list
	 * @param d
	 */
	public void lowerBound(List<? super Driver> list, Driver d) {
		list.add(d);
	}
	
	/**
	 * @Title: genericLower
	 * @Description: 使用泛型
	 * @param <T>
	 * @param list
	 * @param t
	 * 我应该什么时候使用泛型方法，什么时候使用通配符类型呢？
	 * 返回类型并不依赖于类型参数或其他传递给该方法的实参（这种是只有一个实参的简单 
	 * 情况）。这就告诉我们类型实参是用于多态的，它的作用只是对不同的调用可以有一 
	 * 系列的实际的实参类型。如果是那样的话，就应该使用通配符，通配符就是设计来支 
	 * 持灵活的子类型的，这也是我们这里所要表述的东西。 
	 * 泛型方法允许类型参数用于表述一个或多个的实参类型的方法或及其返回类型的 
	 * 依赖关系。如果没有那样的一个依赖关系的话，泛型方法就不应用使用。
	 * ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
	 * 泛型方法：多个实参类型，并且返回类型依赖于实参类型
	 * 通配符类型：只有一个实参类型，并且返回类型不依赖于类型参数或其他给该方法的实参
	 */
	public <T> void genericUpper (List<? extends T> list, T t) {
		T tl = list.get(0);
		for (T o : list) {
			System.out.println(o);
		}
		System.out.println(tl.getClass().getName());
		System.out.println(t.getClass().getName());
	}
	
	@Test
	public void genup () {
		//List<Driver> dl = new ArrayList<Driver>();
		List<Person> dl = new ArrayList<Person>();
		dl.add(new Driver("张三", "Benz"));
		dl.add(new Person("王五"));
		genericUpper(dl, new Person("李四"));
	}
	
	@Ignore
	@Test
	public void upper () {
		List<Driver> dl = new ArrayList<Driver>();
		dl.add(new Driver("张三", "Benz"));
		upperBound(dl, new Person("李四"));
	}
	
	@Ignore
	@Test
	public void lower () {
		List<Person> pl = new ArrayList<Person>();
		Driver d = new Driver("张三", "Benz");
		lowerBound(pl, d);
	}
	
	/**
	 * @Title: genericMethod
	 * @Description: 泛型方法
	 * @param <T>
	 * @param t
	 * @param list
	 */
	public <T> void genericMethod(T t, List<T> list) {
		list.add(t);
		System.out.println(list.size());
		for (T o : list) {
			System.out.println(o);
		}
	}
	
	@Ignore
	@Test
	public void generic () {
		String s = "新增的字符串";
		List<String> list = new ArrayList<String>();
		list.add("内置的字符串");
		genericMethod(s, list);
	}

}
