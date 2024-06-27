package com.seleniumpractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabSHandle {

	public static void main(String[] args) throws InterruptedException {
		
         WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("newTabsBtn")).click();
		Thread.sleep(3000);
		Set<String> multi=driver.getWindowHandles();
		List<String> tablist=new ArrayList(multi);
		
		for (String tab : tablist) {
			
			String table=driver.switchTo().window(tab).getTitle();
			System.out.println(table);
			
		}
		
		
		
		
		
		
		
	}

}
