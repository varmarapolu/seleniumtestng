package com.emp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.emp.common.CreateBrouserObject;
import com.emp.pageobjects.EmployeePage;

public class employeeScript {
	CreateBrouserObject cob = null;
	EmployeePage ep=null;

	@Parameters({ "Browser" })
	@BeforeTest
	public void config(String BrouserName) {
		cob = new CreateBrouserObject();
		WebDriver driver=cob.brouserObject(BrouserName);
		
		ep=new EmployeePage(driver);
		
		
		System.out.println("----------->" + BrouserName);

	}

	@Test
	public void f() {
		System.out.println("in test");
	}
}
