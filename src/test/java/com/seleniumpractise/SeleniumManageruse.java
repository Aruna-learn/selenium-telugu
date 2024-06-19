package com.seleniumpractise;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumManageruse {

	public static void main(String[] args) {
		
		// System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe" );//if browser not opened we need to use driver executable and download it and paste in resources and same for fire fox, edge, internet exploree   
		
	//if the browser version changes everytime we can't download new version and update to over come we  use 3rd party library webdrivermanager and update in pom.xml then write like this
		WebDriverManager.chromedriver().setup();
		//but insted of using 3rd party we can use the selenium manager class inside he selenium library so need to write system.setproperty and 3rd part library also
		//after selenium version 4.6.0 selenium manager class is available so it automatically download the new version of browser  whenerver we run the brwoser 
		//this pi/c drive/ users/hp/.cache/browsers drivers available with json file(json file having the browser version adn driver executable  file mapping)
		// we can delete cache and run the browser and again it install the browser 
		//no need to use 3rd party and system.setpropery after selenium version 4.6.0 came we can directly use it
		//for normal java project we have to install seleneium version 4.6.0 or above then we can use it
		

	}

}
