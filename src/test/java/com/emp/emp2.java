package com.emp;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.emp.common.readPropertyFile;

public class emp2 {
readPropertyFile pf=null;
 @BeforeTest
 public void abcd() throws IOException {
	pf=new readPropertyFile();
	Properties prop=pf.getProp();
	String s=prop.getProperty("brouserType");
	prop.getProperty("brouserType");
	System.out.println(s);
 }

 
 
 @Test
  public void f() {
  }
  @Test
  public void f1() {
  }	
  @Test
  public void f3() {
	  //hiii
  }
}
