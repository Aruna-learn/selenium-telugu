package com.seleniumpractise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowtabhandles {

	public static void main(String[] args) throws InterruptedException {
//single tab
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		String parentwindowhandle = driver.getWindowHandle();// every window has unique address called windowhandle so
		// asking driver to give the windowhandle
		System.out.println("parent window-" + parentwindowhandle + driver.getTitle());// title of parent window
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		
		
		//new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("newTabBtn"))).click();//using explici clickable we open the clck

		//WebElement newTabBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("newTabBtn")));
		//newTabBtn.click();
		
//		driver.findElement(By.id("newTabBtn")).click();
//		driver.manage().window().fullscreen();// if click not working we can use full screen so it will work

		Thread.sleep(3000);
		Set<String> windowhandles = driver.getWindowHandles();// set using because window address is unique
		for (String windowhandle : windowhandles) {
			if (!windowhandle.equals(parentwindowhandle)) {
				driver.switchTo().window(windowhandle);
				System.out.println(driver.findElement(By.id("output")).getText());// prints output
				Thread.sleep(3000);
				driver.findElement(By.id("alertBox")).click();
				Thread.sleep(3000);
				System.out.println(driver.switchTo().alert().getText());
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				System.out.println(driver.findElement(By.id("output")).getText());// prints output
				Thread.sleep(3000);
				driver.close();//close currently focused window 1 window

			}
	}
			driver.switchTo().window(parentwindowhandle);// switch to parent window
			driver.findElement(By.id("name")).sendKeys("chinni");// type txt in parent window
			Thread.sleep(3000);
			driver.quit();
			

}
	}
