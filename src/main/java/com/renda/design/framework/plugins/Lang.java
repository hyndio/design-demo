/**
 * @author hyd 2013-1-9 上午10:22:52 
 * @version 1.0
 */
package com.renda.design.framework.plugins;

/** 
 * 加载类
 * <p>
 *  
 */
public class Lang {
    /**
     * 使用当前线程的ClassLoader加载给定的类
     * 
     * @param className
     *            类的全称
     * @return 给定的类
     * @throws ClassNotFoundException
     *             如果无法用当前线程的ClassLoader加载
     */
    public static Class<?> loadClass(String className) throws ClassNotFoundException {
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(className);
        }
        catch (ClassNotFoundException e) {
            return Class.forName(className);
        }
    }
}
