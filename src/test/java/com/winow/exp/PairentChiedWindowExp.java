package com.winow.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PairentChiedWindowExp {
	WebDriver driver=null;
	
	
	
	By professional=By.name("userType");
	By name=By.id("fname");
	By emailId=By.id("email");
	By password=By.name("password");
	By passwordType=By.id("typePassword");
	By formSubmitted=By.name("formSubmitted");
	By otp=By.id("OTP");
	
	
	
	@BeforeTest
	public void init() {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium_brouser\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://my.naukri.com/account/register/basicdetails");
	}
	@Test
	public void m1() throws InterruptedException {
	   	driver.findElement(professional).click();
	   	driver.findElement(name).sendKeys("test");
	   	driver.findElement(emailId).sendKeys("test2@gmail.com");
		driver.findElement(password).sendKeys("");
		String mainWindow = driver.getWindowHandle();
		System.out.println("------------1----"+driver.getWindowHandle());
		 System.out.println("--------2---------------"+driver.getWindowHandles());
		 
		 for(String curWindow : driver.getWindowHandles()){
			    driver.switchTo().window(curWindow);
			    Thread.sleep(2000);
			    driver.findElement(passwordType).sendKeys("1234");
			    driver.findElement(formSubmitted).click();
			    Thread.sleep(2000);
			    driver.findElement(otp).sendKeys("234567");
			    
			}
	}
  }
