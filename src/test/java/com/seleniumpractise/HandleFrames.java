package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("text1");//type text1 in text box main document
		Thread.sleep(3000);

		driver.switchTo().frame("frm1");//focus in frame1 and frame as name
		Select coursenamedropdown=new Select(driver.findElement(By.id("course")));
		coursenamedropdown.selectByVisibleText("Dot Net");//select dot net in frame1
		
		
		driver.switchTo().defaultContent();//frameout and went to main content/main document main frame
		driver.findElement(By.id("name")).clear();//clear text1
		driver.findElement(By.id("name")).sendKeys("text2");//enter text2
		
	}

}
