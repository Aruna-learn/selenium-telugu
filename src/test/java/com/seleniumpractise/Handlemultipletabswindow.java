package com.seleniumpractise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlemultipletabswindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		String parentwindowhandle = driver.getWindowHandle();// every window has unique address called windowhandle so
		// asking driver to give the windowhandle
		System.out.println("parent window-" + parentwindowhandle + driver.getTitle());// title of parent window
		driver.manage().window().maximize();
		
		//new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("newWindowsBtn"))).click();

		
		driver.findElement(By.xpath("//button[@class='whButtons']")).click();
		//Thread.sleep(3000);
		Set<String> windowhandles = driver.getWindowHandles();// set using because window address is unique
		for (String windowhandle : windowhandles) {
			if (!windowhandle.equals(parentwindowhandle)) {
				String basic = driver.getWindowHandle();
				String padding=driver.getWindowHandle();
				if(windowhandle.equals(basic)) {
					driver.switchTo().window(basic);
					
					Thread.sleep(3000);
					driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("aruna");
					Thread.sleep(3000);
					driver.quit();
					
				}
			
				
				else if
					(!windowhandle.equals(basic)) {
					driver.switchTo().window(padding);
				
					Thread.sleep(3000);
					driver.findElement(By.xpath("//input[@name='name']")).sendKeys("aruna");
					Thread.sleep(3000);
					driver.quit();
				}
				
			}
				
		
				

			}
	
			driver.switchTo().window(parentwindowhandle);// switch to parent window
			driver.findElement(By.id("name")).sendKeys("chinni");// type txt in parent window
			Thread.sleep(3000);
			driver.quit();
			
	}

}
