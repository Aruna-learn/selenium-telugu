package com.seleniumpractise;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicaionPopertiesURLTitlePagesource {

	public static void main(String[] args) {
                
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.seleniumhq.org");

		 //URL
	String currenturl=driver.getCurrentUrl();
	System.out.println("Current Url is:" +currenturl);
	
		 
		 //Title
	String title=driver.getTitle();
	System.out.println("Title is:"+title);
	
	
	//HTML Pagesource
	 String pagesource=driver.getPageSource();
	 System.out.println(pagesource);
	
	
	
	driver.quit();
		 
	}

}
