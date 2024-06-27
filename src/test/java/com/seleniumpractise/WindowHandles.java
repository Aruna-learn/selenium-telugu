package com.seleniumpractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		// single window

		String parentwindowhandle = driver.getWindowHandle();// every window has unique address called windowhandle so
																// asking driver to give the windowhandle and get window gives id  or address of single brwoser window
		System.out.println("parent window-" + parentwindowhandle + driver.getTitle());// title of parent window
		Thread.sleep(5000);
		driver.manage().window().fullscreen();// if click not working we can use full screen so it will work
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);

		Set<String> windowhandles = driver.getWindowHandles();// set using because window address is unique, get
																// windowhandles is the id of multiple window handle and
																// stores in set because of unique
		for (String windowhandle : windowhandles) {
			if (!windowhandle.equals(parentwindowhandle)) {
				driver.switchTo().window(windowhandle);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				System.out.println(windowhandle + driver.getTitle());
				driver.findElement(By.id("firstName")).sendKeys("aruna");// type text in child window
				Thread.sleep(3000);
				driver.close();

			}

			// driver.switchTo().window(windowhandle);// switch to child or new window
			// System.out.println(windowhandle + driver.getTitle());// title of child window
		}
		driver.switchTo().window(parentwindowhandle);// switch to parent window
		driver.findElement(By.id("name")).sendKeys("chinni");// type txt in parent window
		Thread.sleep(3000);
		driver.quit();

	}

}
