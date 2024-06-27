package com.seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownwithoutselect {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Thread.sleep(3000);
        //for single drop down
		Select courseDropdown = new Select(courseElement);
		List<WebElement> courseDropdownoptions = courseDropdown.getOptions();// print all elements in dropdown using get options

		for (WebElement option : courseDropdownoptions) {
			String optiontext=option.getText();//for anchor tag we use get text method
			System.out.println(optiontext);
			
			if(option.getText().equals("Java"))
			{
			option.click();
			break;
		}

	}

}
	
}
