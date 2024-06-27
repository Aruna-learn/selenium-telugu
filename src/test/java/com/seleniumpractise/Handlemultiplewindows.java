package com.seleniumpractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlemultiplewindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		Thread.sleep(3000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> windowlis=new ArrayList(windowhandles);
				
		for (String window : windowlis) {
			String title=driver.switchTo().window(window).getTitle();
			System.out.println(title);
			
			if(title.equals("XPath Practice - H Y R Tutorials"))
			{
		driver.switchTo().window("XPath Practice - H Y R Tutorials");
		driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("aruna");
		driver.close();
	}
	
	if(title.equals("Basic Controls - H Y R Tutorials"))
	{
driver.switchTo().window("Basic Controls - H Y R Tutorials");
driver.findElement(By.id("lastName")).sendKeys("poololla");
driver.close();
}
	
	
		}	
		
		String parentwindowhandle = driver.getWindowHandle();

		
		
		driver.switchTo().window(parentwindowhandle);// switch to parent window
		driver.findElement(By.id("name")).sendKeys("chinni");// type txt in parent window
		Thread.sleep(3000);
		driver.quit();
		
}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
					
					
					
					
				
			
			
				
		
				
