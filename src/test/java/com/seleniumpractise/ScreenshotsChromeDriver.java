package com.seleniumpractise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsChromeDriver {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		RemoteWebDriver driver=new ChromeDriver();//getting chrome driver from remotewebdriver only and getscreenshot also
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		//file
//		File sourcefile=driver.getScreenshotAs(OutputType.FILE);
//		File destfile=new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourcefile, destfile);
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
		
		//byte
//		byte[] byteArr=driver.getScreenshotAs(OutputType.BYTES);// bytes in array format
//		File destfile=new File("./Screenshots/img2.jpg");
//		FileOutputStream fos=new FileOutputStream(destfile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
		//base64
		String st=driver.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr=Base64.getDecoder().decode("st");//Base64 is class, st is encoded string to decode we use the decoder, and decoding st it will give byte array
		File destfile=new File("./Screenshots/img3.jpg");
		FileOutputStream fos=new FileOutputStream(destfile);//converting string to image
		fos.write(byteArr);
		fos.close();
		System.out.println("Screenshot saved successfully");
		driver.quit();
		
		
		
		
		
	}

}
