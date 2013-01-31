/**
 * @author hyd 2013-1-31 下午1:37:45 
 * @version 1.0
 */
package com.renda.etc.threadLocal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO
 * <p>
 * 
 */
public class Logger {
	private PrintWriter writer = null;

	// 初始化writer
	public Logger(String filename) {
		try {
			writer = new PrintWriter(new FileWriter(filename));
			writer.println("==== Start of log ====");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 日志写入文件
	public void println(String s) {
		writer.println(s);
	}

	// 关闭文件
	public void close() {
		writer.println("==== End of log ====");
		writer.close();
	}
}
