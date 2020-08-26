package com.emp.common;

import org.openqa.selenium.WebDriver;

public class CreateBrouserObject {
	
	public WebDriver brouserObject(String brouserName) {
		WebDriver element=null;
			if(brouserName.equals("chrome")) {
				System.out.println("in chrome ");
		
				
			}else if(brouserName.equals("FireFox")) {
				brouserName.equals("FireFox Brouser----------------->>>>>");
			}else {
				brouserName.equals("IE brouser");
			}
		return element;
		
	}

}
