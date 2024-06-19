package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitch {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("text1");//type text1 in text box main document
		Thread.sleep(3000);

		driver.switchTo().frame("frm1");//focus in frame1
		Select coursenamedropdown=new Select(driver.findElement(By.id("course")));
		coursenamedropdown.selectByVisibleText("Dot Net");//select dot net in frame1
		Thread.sleep(3000);

		driver.switchTo().defaultContent();//frame1 out and went to main content/main document hen only we can go to frame2
		
		Thread.sleep(3000);

		driver.switchTo().frame("frm2");//frame2
		driver.findElement(By.id("firstName")).sendKeys("Poololla");
		Thread.sleep(3000);

		driver.switchTo().defaultContent();//frame 2 out and went to main content/main document then only we can go to frame1
		Thread.sleep(3000);

		driver.switchTo().frame("frm1");//focus in frame1
		coursenamedropdown.selectByVisibleText("Java");
		Thread.sleep(3000);

		driver.switchTo().defaultContent();//frame1 out and went to main content/main document
		driver.findElement(By.id("name")).clear();//clear text1
		driver.findElement(By.id("name")).sendKeys("text2");//enter text2
		
	}

}
