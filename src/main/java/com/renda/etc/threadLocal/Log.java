/**
 * @author hyd 2013-1-31 下午1:38:35 
 * @version 1.0
 */
package com.renda.etc.threadLocal;

/**
 * TODO
 * <p>
 * 
 */
public class Log {
	
	// 线程局部变量，可以为每个线程创建一个仅且一个的日志文件(其实就是使logger对象线程局部化)
	private static final ThreadLocal<Logger> loggerThreadLocal = new ThreadLocal<Logger>();

	// 记录日志
	public static void println(String s) {
		getLogger().println(s);
	}

	// 关闭日志
	public static void close() {
		getLogger().close();
	}

	/**
	 * 取得调用Log类的当前线程所持有的Logger日志记录器 这样确保每个线程所记录的日志记录到同一文件中
	 * 
	 * @return
	 */
	private static Logger getLogger() {
		Logger logger = (Logger) loggerThreadLocal.get();

		// 如果线程是第一次呼叫，就建立新挡案并登陆log
		if (logger == null) {
			logger = new Logger(Thread.currentThread().getName() + "-log.txt");

			// 为每个线程提供唯一一个logger对象
			loggerThreadLocal.set(logger);
		}

		return logger;
	}
}
