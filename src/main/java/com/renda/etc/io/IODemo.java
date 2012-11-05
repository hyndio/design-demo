/**
 * @Title: IODemo.java
 * @Package hyd.io
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-8 下午02:22:04
 * @version v1.0
 */
package com.renda.etc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: IODemo
 * @Description: 文件流
 */
public class IODemo {
	@Ignore
	@Test
	public void listFile () {
		File file = new File("F:");
		File[] fs = file.listFiles();
		for (File f : fs) {
			System.out.print(f.getName() + " ");
			System.out.print(f.getFreeSpace() + " ");
			System.out.print(f.length());
			System.out.println();
		}
	}
	
	@Ignore
	@Test
	public void delFile () {
		File file = new File("F:" + File.separator + "create" + File.separator + "1.txt");
		if (file.exists()) {
			System.out.println(file.delete());
		}
	}
	
	@Ignore
	@Test
	public void createFile () throws IOException {
		File dir = new File("F:" + File.separator + "create");
		if (!dir.exists()) {
			dir.mkdir();
		}
		//System.out.println(file.isDirectory());
		File file = new File(dir, "1.txt");
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		OutputStreamWriter writer = null;
		try {
			fout = new FileOutputStream(file);
			bout = new BufferedOutputStream(fout);
			byte[] b = "abcde".getBytes();
			bout.write(b);
			bout.flush();
			/*
			byte[] b = "abcd".getBytes();
			fout.write(b);
			fout.flush();

			writer = new OutputStreamWriter(fout);
			String str = "1234567890";
			writer.write(str);
			writer.flush();
						*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
			if (fout != null) {
				fout.close();
			}
		}
	}
	
	@Ignore
	@Test
	public void filePath() throws IOException {
		File file = new File("F:" + File.separator + "inputByte.txt");
		File subFile = new File("F:" + File.separator + "sub" + File.separator + "subsub" + File.separator + "sub.txt");
		System.out.println("-----------------");
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getAbsolutePath());
		System.out.println("-----------------");
		System.out.println(file.getCanonicalFile());
		System.out.println(file.getAbsoluteFile());
		System.out.println("-----------------");
		System.out.println(System.getProperty("user.dir"));
		System.out.println(file.getParent());
		System.out.println(subFile.getParent());
		System.out.println(subFile.getCanonicalPath());
	}
	
	@Ignore
	@Test
	public void stream() throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入：");
		System.out.println(stdin.readLine());
		
	}
	
	@Ignore
	@Test
	public void inputByte () throws IOException {
		File file = new File("F:\\inputByte.txt");
		FileInputStream fin = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fin);
		BufferedReader br = new BufferedReader(isr);
		String out = br.readLine();
		System.out.println(out);
	}
	
	@Ignore
	@Test
	public void inOut () throws IOException {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		BufferedInputStream bin = null;
		byte[] buffer = new byte[1024];
		try {
			fin = new FileInputStream("F:\\oa_2010_11_09.dmp");
			bin = new BufferedInputStream(fin);
			fout = new FileOutputStream("f:\\oa_2010_11_09.dmp.txt");
			while (true) {
				if (bin.available() < 1024) {
					int b = -1;
					while ((b = bin.read()) != -1) {
						fout.write(b);
					}
					break;
				} else {
					bin.read(buffer);
					fout.write(buffer);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fout != null) {
				fout.close();
			}
			if (bin != null) {
				bin.close();
			}
			if (fin != null) {
				fin.close();
			}
		}
	}
}
