package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verfiypagetitle(String browsername){
		
	if(browsername.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
		
	else if(browsername.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	else if(browsername.equalsIgnoreCase("IE")){
		
		System.setProperty("webdriver.ie.driver","C:\\Seleniumdrivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	 
	driver.manage().window().maximize();
	 driver.get("http://learn-automation.com");
	 System.out.println(driver.getTitle());
	 driver.close();
	}

}
