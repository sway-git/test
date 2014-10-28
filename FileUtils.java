package com.example.dynamicui;

import java.io.IOException;
import java.io.InputStream;

public class FileUtils {

	public static String getStringFromInputstream(final InputStream is) throws IOException{
		int size = is.available();
		byte[] buffer = new byte[size];
		is.read(buffer);
		System.out.println("this is a joke");
		is.close();
		String bufferString = new String(buffer);
		return bufferString;
	}
}
