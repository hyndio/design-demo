package com.renda.input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Third {

	public Third() {
		super();
	}
	
	public InputStream getResourceAsStream() throws FileNotFoundException {
		InputStream is = null;
		
		is = new BufferedInputStream(new FileInputStream("D:" + File.separator + "ServletContext.java"));
		
		return is;
		
	}

}
