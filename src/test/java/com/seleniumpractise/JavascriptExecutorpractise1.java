package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorpractise1 {

	public static void main(String[] args) throws Throwable {
		
		//highlight the  elements usng javascript executor
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jsex=(JavascriptExecutor) driver;
		
		
jsex.executeScript("document.getElementById('email').style.border='12px pink solid';");//border[if no px provided defaault it takes and solid no means none and color no means black it takes]
Thread.sleep(3000);
	jsex.executeScript("document.querySelector('#pass').style.background='green';");	//background
		
	Thread.sleep(3000);
		jsex.executeScript("document.getElementsByName('email').setAttribute('style','border:2px solid red; background:green');");//border +background
		
		
		//scroll
//		driver.get("https://www.hyrtutorials.com/");
//		jsex.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(3000);
//		jsex.executeScript("window.scrollBy(0,500)");
//		
//		Thread.sleep(3000);
//		
//		jsex.executeScript("document.getElementById('ty_footer').scrollIntoView();");

		
//		WebElement usr=driver.findElement(By.id("email"));//find element using selenium webdriver
//		jsex.executeScript("arguments[0].style.background='green';", usr);//perform actions using javascript executor
		
		
		
		
		
	}

}
