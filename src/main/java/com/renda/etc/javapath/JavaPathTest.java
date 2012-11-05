/**
 * @title: JavaPathTest.java
 * @package hyd.javapath
 * @author 
 * @date 2011-4-27 下午06:12:23
 * @version v1.0
 */
package com.renda.etc.javapath;

import org.junit.Test;
/**
 * @className: JavaPathTest
 * @description: 当前ClassPath的绝对URI路径
 */
public class JavaPathTest {

	@Test
	public void path() {
		/** 得到的是当前类JavaPathTest.class文件的URI目录。不包括自己！ */
		System.out.println(JavaPathTest.class.getResource(""));
		/** 当前ClassPath的绝对URI路径 */
		System.out.println(JavaPathTest.class.getResource("/"));
		/** 当前ClassPath的绝对URI路径, 推荐使用 */
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
		/** 当前ClassPath的绝对URI路径 */
		System.out.println(JavaPathTest.class.getClassLoader().getResource(""));
		/** 当前ClassPath的绝对URI路径 */
		System.out.println(ClassLoader.getSystemResource(""));
		/** 不是classPath */
		System.out.println(System.getProperty("user.dir"));
		/**
		 * 在Web应用程序中，我们一般通过ServletContext.getRealPath("/")方法得到Web应用程序的根目录的绝对路径。
		 * 准确说在项目被集成开发环境编译后
		 * src目录下的东西会编译到 classes目录下
		 * 而classes目录就是所谓的classpath
		 * 而编译的过程（我说的不完全）中，java-》class  ； 其他文件还会复制一份到classpath对应的目录下，
		 * 所以可以说  src下就是在classpath下，只不过是编译以后了。
		 */
	}
}
