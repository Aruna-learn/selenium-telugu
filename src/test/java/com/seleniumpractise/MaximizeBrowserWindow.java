package com.seleniumpractise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeBrowserWindow {
	
	
	public static void main(String[] args) throws Exception {
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
//		Thread.sleep(3000);
//		driver.manage().window().maximize();//1.after browser opened, 1st open in specific size or minimum size then open in maximize then url opens and we can use for different browsers as chrome, edge, firefox etc
//		driver.get("https://www.google.com");
		
		
		
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver driver=new EdgeDriver();
//		Thread.sleep(3000);
//		driver.manage().window().maximize();//1.after browser opened, 1st open in specific size or minimum size then open in maximize then url opens and we can use for different browsers as chrome, edge, firefox etc
//		Thread.sleep(3000);
//		driver.get("https://www.google.com");
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();//1.after browser opened, 1st open in specific size or minimum size then open in maximize then url opens and we can use for different browsers as chrome, edge, firefox etc
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriverManager.chromedriver().setup();
//ChromeDriver options=new ChromeDriver();//2. way before open the browser itself we are maximizig using the options class and apllicable to edge and in firefox there is no add aguments method
//options.AddArguments("start-maximized");
//ChromeDriver.driver=new ChromeDriver(options);
//driver.get("https://www.google.com");

//WebDriverManager.edgedriver().setup();
//edgeDriver options=new edgeDriver();//2. way before open the browser itself we are maximizig using the options class and apllicable to edge and in firefox there is no add aguments method and for edge is we are using before selenium 4 we have to use the selenium edge tools pom in pom.xml and import selenium ms edge
//options.AddArguments("start-maximized");
//edgeDriver.driver=new edgeDriver(options);
//driver.get("https://www.google.com");

		
		
		driver.close();
		
	}
	
	
	
	
	
	
	

}
