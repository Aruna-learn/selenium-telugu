package com.seleniumpractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractise1011 {

	
		private static WebDriver driver;

		public static void main(String[] args) throws Exception {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			chapter10();
	}
		
		public static void highlight(WebDriver driver, WebElement element) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green')",
					element);

		}
		//Xpath 3rd party tools
		public static void chapter10() {
			//chropath
			//selectorhub
			//LetXpath
			
			
		}
		
		//common mistakes in xpath
		public static void chapter11() {
			//should not use double quotes in xpaths
			//never copy chrome default xpath
			//use chrome devtools search bar wisely
			//look for frames
			
		}

}


