package com.emp.pageobjects;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class EmployeePage {
	WebDriver driver=null;
    public EmployeePage(WebDriver driver) {
    	this.driver=driver;
    	
    }
}
