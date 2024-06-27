package com.seleniumpractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlebySDET {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		String singleid=driver.getWindowHandle();
//		System.out.println(singleid);
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> multi=driver.getWindowHandles();
		
		//1 to get the window handles id
		
//		  Iterator<String> it =multi.iterator();
//		  
//		  String Parentid= it.next(); String childid= it.next();
//		  System.out.println("parent window:"+Parentid);
//		  System.out.println("child window:"+childid);
		 
	
	//2 list method using arraylist
		List<String> windowlis=new ArrayList(multi);//converting set to list and list had duplicate and set don't have duplicate
		
//	String parent=	windowlis.get(0);//parent id
//	String child=	windowlis.get(1);//child id
//		
//	System.out.println("parent id is:"+parent);
//	System.out.println("child id is:"+child);
//	
//	//How to use window id's for switching
//	driver.switchTo().window(child);
//	System.out.println("title if child:"+driver.getTitle());
//	
//	driver.switchTo().window(parent);
//	System.out.println("title if parent:"+driver.getTitle());
	
	//instead of writing whole code above we can use foreacah loop
//	for (String winid : windowlis) {
//		
//		String title=driver.switchTo().window(winid).getTitle();//getting parent window and child window titles
//		System.out.println(title);
//	}
//	
//	driver.close();	//close single browser window where driver is pointing
//	driver.quit();//close all browser windows
	
	
	//if we hace multiple windows and to close  those windows specifically we can write the lofinc
	
	
		for (String winid : windowlis) {
			
			String title=driver.switchTo().window(winid).getTitle();//getting parent window and child window titles
			if(title.equals("OrangeHRM")) {//using title of windiow we can close the particular window for that 1st we need to get the title pf page
				driver.close();
			}
		}
		
	
	
	
	
	
		

	}

}
