/**
 * @title: ClassLoaderTest.java
 * @package hyd.classLoader
 * @author 
 * @date 2011-4-28 下午03:25:00
 * @version v1.0
 */
package com.renda.etc.classLoader;

import org.junit.Test;

/**
 * @className: ClassLoaderTest
 * @description: 
 */
public class ClassLoaderTest {
	
	@Test
	public void cloader() {
		Class c;
        ClassLoader cl;
        cl  =  ClassLoader.getSystemClassLoader();
        System.out.println(cl);
         while  (cl  !=   null ) {
            cl  =  cl.getParent();
            System.out.println(cl);
        }
         try  {
            c  =  Class.forName("java.lang.Object");
            cl  =  c.getClassLoader();
            System.out.println("java.lang.Object's loader is " + cl);
            c  =  Class.forName("hyd.classLoader.ClassLoaderTest");
            cl  =  c.getClassLoader();
            System.out.println("LoaderSample1's loader is " + cl);
        }  catch  (Exception e) {
            e.printStackTrace();
        }
	}

}
