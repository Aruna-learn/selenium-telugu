package com.seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelect1 {
//for multiple dropdown
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(3000);
		
		
		//Approach 1 -ceated 2 select classes
		
//		Select country = new Select(driver.findElement(By.id("Form_getForm_Country")));
//	    country.selectByValue("Afghanistan");
//		country.selectByIndex(5);
//		country.selectByVisibleText("Bulgaria");
//		
//		Thread.sleep(3000);
//				
//		Select Emp = new Select(driver.findElement(By.id("Form_getForm_NoOfEmployees")));
//		Emp.selectByValue("16 - 20");
//		Emp.selectByIndex(5);
//		Emp.selectByVisibleText("21 - 25");
		
		//Apporoach2 instead of creating multiple select object we just create one method and pass the value in the element
		WebElement country =  driver.findElement(By.id("Form_getForm_Country"));
		dropdownwithoutselect(country,"Afghanistan");
		
		Thread.sleep(3000);
		
	    WebElement Emp =driver.findElement(By.id("Form_getForm_NoOfEmployees"));
	    dropdownwithoutselect(Emp,"16 - 20");
	
	}

	
	public static  void dropdownwithoutselect(WebElement ele, String value) {
		
		Select sel=new Select(ele);
		List<WebElement> courseDropdownoptions = sel.getOptions();
		for (WebElement option : courseDropdownoptions) {
			System.out.println(option.getText());
			if(option.getText().equals(value))
			{
			option.click();
			break;
		}
		
		
	}
	
	}
}
