package com.selenium.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestPageFactory {
	
	//step-3( initiate a value )
	MasterPageFactory mpf;	
	
	//step_1 create a class
public void getLogin() {
		
		
	
	//step-2 Copy all data from from LoginAE which on login elements
	
		//Browser access in java
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver =new FirefoxDriver();
	
		//Maximize the window
	driver.manage().window().maximize();
	
		//Add the URl 
	driver.navigate().to("https://automationexercise.com/");
	
	//Step-4( create obj)
	mpf =new MasterPageFactory(driver);//(driver is step-6)
	
	//step-5
	mpf.getSinging_Homepage().click();
		//Click on Login/singUp button in the homepage 
;
	
		//Enter the email in email field 
	driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("parthadebnathk@gmail.com");
		//Enter the password in password field 
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1234567");
	
		//Click login button using text method for login 
	driver.findElement(By.xpath("//*[text()='Login']")).click();
	
		// verify login successful in the console
	if (driver.findElement(By.xpath("//*[contains(text(),' Logout')]")).isDisplayed()) {
			System.out.println("Login successful");
		
	} else { System.out.println("Login Filed");}
	
	
	//close the browser
	driver.close();// Close the current tab
	//driver.quit();//close the browser
	
	
	}

}
