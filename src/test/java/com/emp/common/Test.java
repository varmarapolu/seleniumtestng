package com.emp.common;

import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		readPropertyFile rf=new readPropertyFile();
		Properties prop=rf.getProp();
		System.out.println(prop.getProperty("brouserType"));
	}

}
