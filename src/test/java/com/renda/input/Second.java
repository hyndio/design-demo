package com.renda.input;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Second {

	public Second() {
		super();
	}

	public InputStream getResourceAsStream() throws FileNotFoundException {
		InputStream is = null;
		
		Third d = new Third();
		is = d.getResourceAsStream();
		
		return is;
		
	}
	
}
