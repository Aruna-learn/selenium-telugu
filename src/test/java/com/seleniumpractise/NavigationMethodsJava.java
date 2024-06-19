package com.seleniumpractise;

import java.io.File;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethodsJava {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("ci/cd");
		//byte, ScreenshotsWebdriver.java practise
//		TakesScreenshot takeScreenshot=(TakesScreenshot) driver;
//		byte[] byteArr=takeScreenshot.getScreenshotAs(OutputType.BYTES);// bytes in array format
//		File destfile=new File("./Screenshots/img6.jpg");
//		FileOutputStream fos=new FileOutputStream(destfile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");

		Thread.sleep(3000);
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("aruna@gmail.com");
		//byte, ScreenshotsWebdriver.java practise
				TakesScreenshot takeScreenshot=(TakesScreenshot) driver;
				byte[] byteArr=takeScreenshot.getScreenshotAs(OutputType.BYTES);// bytes in array format
				File destfile=new File("./Screenshots/img7.jpg");
				FileOutputStream fos=new FileOutputStream(destfile);
				fos.write(byteArr);
				fos.close();
				System.out.println("Screenshot saved successfully");

		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);

		driver.quit();

	}

}
