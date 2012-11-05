package com.renda.etc.io;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class IoUtil {

  public static final int BUFFERSIZE = 4096;

  private IoUtil() {
    // prevent instantiation
  }

  public static byte[] readBytes(InputStream in) throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    transfer(in, out);
    return out.toByteArray();
  }
  
  public static void close(Closeable closeable) {
	    if (closeable != null) {
	      try {
	        closeable.close();
	      }
	      catch (IOException e) {
	      }
	    }
	  }

  public static long transfer(InputStream in, OutputStream out) throws IOException {
    long total = 0;
    byte[] buffer = new byte[BUFFERSIZE];
    for (int count; (count = in.read(buffer)) != -1;) {
      out.write(buffer, 0, count);
      total += count;
    }
    return total;
  }
}
