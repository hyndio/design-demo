package com.renda.input;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class One {

	public static void main(String[] args) throws IOException {
		Second s = new Second();
		
		InputStream is = s.getResourceAsStream();
		File storefile = new File("E:" + File.separator + "22.java");

		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;

		try {
			bos = new BufferedOutputStream(new FileOutputStream(storefile));
			bis = new BufferedInputStream(is);
			int c;
			while ((c = bis.read()) != -1) {
				bos.write(c);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bos.close();
			bis.close();
		}
		
		
	}
}
