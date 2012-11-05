/**
 * @Title: NIODemo.java
 * @Package hyd.nio
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-11 下午04:43:27
 * @version v1.0
 */
package com.renda.etc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: NIODemo
 * @Description: java nio
 */
public class NIODemo {	
	
	/**
	 * 将文件映射到内存
	 * @throws IOException
	 */
	@Ignore
	@Test
	public void mappedByteBuffer() throws IOException {
		File inFile = new File("F:" + File.separator + "create", "1.txt");
		File outFile = new File("F:" + File.separator + "create", "mappedByteBuffer.txt");
		FileChannel fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(inFile).getChannel();
			fout = new FileOutputStream(outFile);
			int size = (int) fin.size();
			int position = 0;
			MappedByteBuffer dst = fin.map(FileChannel.MapMode.READ_ONLY, position, size);
			while (dst.hasRemaining()) {
				byte b = dst.get();
				fout.write(b);
				fout.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fin != null) {
				fin.close();
			}
			if (fout != null) {
				fout.close();
			}
		}
		
	}
	
	@Ignore
	@Test
	/**
	 * Buffer主要有四个主要的属性：
	 * 容 量（Capacity ）： 容量描述了这个缓冲区最多能够存放多少，也是Buffer的最大存储元素量，这个值是在创建Buffer的时候指定的，而且不可以更改
	 * 限 制（Limit ）： 不能够进行读写的缓冲区的第一个元素，换句话说就是这个Buffer里面的活动元素数量
	 * 位 置（Position ）： 下一个需要进行读写的元素的索引，当Buffer缓冲区调用相对get()和set()方法的时候会自动更新Position的值
	 * 标记（ Mark ）： 一个可记忆的 Position位置的值，当调用mark()方法的时候会执行mark = position，
	 * 一旦调用reset()的时候就执行position = mark,和Position有点不一样，除非进行设置，否则Mark值是不存在的。
	 */
	public void byteBuffer () throws IOException {
		File file = new File("F:" + File.separator + "create", "1.txt");
		File file2 = new File("F:" + File.separator + "create", "byteBuffer.txt");
		FileChannel fin = null;
		FileChannel fout = null;
		try {
			fin = new FileInputStream(file).getChannel();
			fout = new FileOutputStream(file2).getChannel();
			// 设置缓冲区的容量
			int capacity = 1024;
			ByteBuffer dst = ByteBuffer.allocate(capacity);
			int position = 0;
			int limit = 0;
			while (true) {
				// 0 <= 标记 <= 位置 <= 限制 <= 容量 
				// 0 <= 标记 <= position <= limit <= capacity
				// 文件流装入channel中
				limit = fin.read(dst, position);
				/*
				System.out.println("当前位置: " + position);
				System.out.println("当前限制: " + limit);
				System.out.println("还剩下: " + dst.remaining());
				System.out.println("------------------------");
				*/
				if(limit == -1) {
					break;
				}
				dst.flip();
				fout.write(dst, position);
				position = position + limit;
				dst.clear();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fin != null) {
				fin.close();
			}
			if (fout != null) {
				fout.close();
			}
		}
	}
	
	/**
	 * 全面解读Java NIO工作原理
	 * http://developer.51cto.com/art/201112/307463.htm
	 * 
	 * @throws IOException
	 */
	@Test
	public void nio() throws IOException {
		/**
		 * 读取文件涉及三个步骤：(1) 从 FileInputStream 获取 Channel，(2) 创建 Buffer，(3) 将数据从 Channel 读到 Buffer 中。
		 */
		FileInputStream in = new FileInputStream("F:\\f.txt");
		FileChannel fic = in.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(2048);
		
		FileOutputStream out = new FileOutputStream("f:\\fout.txt");
		FileChannel foutc = out.getChannel();
		try {
			int i = 0;
			while (true) {
				i++;
				System.out.println(i);
				
				buffer.clear();
				int n = fic.read(buffer);
				if (n == -1) {
					break;
				}
				buffer.flip();
				foutc.write(buffer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fic != null) {
				fic.close();
			}
			if (foutc != null) {
				foutc.close();
			}
		}
	}
}
