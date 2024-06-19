package com.seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

	public static void main(String[] args) {
		
		//how to open browser and open the application
		  WebDriver driver =new ChromeDriver(); 
		  driver.get("https://www.myntra.com/");
		 
	//WebDriver driver=new EdgeDriver();//edge browser
	//driver.get("https://www.flipkart.com");//giving any   application url(flipkart, mesho google etc) that we want to see the application in edge
      
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.myntra.com/");
		
//		WebDriver driver=new InternetExplorerDriver();
//		driver.get("https://www.myntra.com/");
		
		
		
		
		// System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe" );//if browser not opened we need to use driver executable and download it and paste in resources and same for fire fox, edge, internet exploree   
		
		
		
		
		
		
		
	}

}
