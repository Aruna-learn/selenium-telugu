package com.seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathPractise456 {

	private static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//chapter4();
		//chapter5();
		chapter6();

	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green')",
				element);

	}

	// Xpath Operators
	public static void chapter4() throws Exception {

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("poori");
		// driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys("chinni");

		// driver.findElement(By.xpath("//input[@maxlength>10]")).sendKeys("chinni1");

		// driver.findElement(By.xpath("//input[@maxlength>=10]")).sendKeys("chinni2");

		// driver.findElement(By.xpath("//input[@maxlength<10]")).sendKeys("chinni3");

		// driver.findElement(By.xpath("//input[@maxlength<=10]")).sendKeys("chinni4");

		List<WebElement> elements = driver.findElements(By.xpath("//input[@maxlength>=10]"));
		for (WebElement element : elements) {
			highlight(driver, element);// highlight the >10 elements
		}

		Thread.sleep(4000);
		driver.quit();

	}

	// Xpath conditions and or not
	public static void chapter5() {

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		List<WebElement> elements = driver
				.findElements(By.xpath("//input[@maxlength>=10 and @name='name' and @type='text']"));// all condition satisfy get element
		System.out.println(elements.size());//2
		
		
		List<WebElement> elementss = driver
				.findElements(By.xpath("//input[@maxlength>=10 or @name='name' or @type='text']"));//one condition satisfy get element
		System.out.println(elementss.size());//5
		
		List<WebElement> elementsss = driver
				.findElements(By.xpath("//input[@maxlength<=1 and @name='name' and @type='text']"));//one condition satisfy get element
		System.out.println(elementsss.size());//0
		
		List<WebElement> elementssss = driver
				.findElements(By.xpath("//input[@maxlength<=1 or @name='name' or @type='text']"));//one condition satisfy get element
		System.out.println(elementssss.size());//5
		
		List<WebElement> elementsssss = driver
				.findElements(By.xpath("//input[@maxlength<=1 or @name='nam' or @type='tex']"));//one condition satisfy get element
		System.out.println(elementsssss.size());//0
		
		
		List<WebElement> elementssssss = driver
				.findElements(By.xpath("//input[not(@maxlength=10)]"));// it gives not maxlength attribute values
		System.out.println(elementssssss.size());//14
		
		
		driver.quit();
		
	}
public static void chapter6() {
	
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[3]")));//get full row
	highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[27]")));//get specific cell(cell=rows*columns)
}
	
	
}
