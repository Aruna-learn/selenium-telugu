package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathPractise7 {

	private static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		chapter7();
		
	}

	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green')",
				element);

	}
	
	//Xpath functions- text, contains, starts-with, normalize-space,last position
	//text
	public static void chapter7() throws Exception {
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//highlight(driver,driver.findElement(By.xpath("//a[text()='Sign in into account']")));
		//Thread.sleep(3000);
		//highlight(driver,driver.findElement(By.xpath("//a[text()='Click']")));
		
		//contains -partial text identification
		
		//highlight(driver,driver.findElement(By.xpath("//div[contains(@class,'signin')]")));//identify elements using partial text attribute
	//	Thread.sleep(3000);
		//highlight(driver,driver.findElement(By.xpath("//a[contains(text(),'account')]")));//identify element using partial text
		//Thread.sleep(3000);

		//starts-with
	//	highlight(driver,driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")));//highlight all elements starts with sign in into
		Thread.sleep(3000);
		
		//normalize-space
		//highlight(driver,driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));//remove start and ending extra spaces in First Name(ingithub login username or email address has spaces so we can use that also)

		//last
		//highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")));
		
		//position
		highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")));//highlight the >2 elements in table
		
		System.out.println(driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")).size());
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
		
}

