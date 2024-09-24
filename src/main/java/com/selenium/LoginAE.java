package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAE {
	
	
	public void getLogin() {
		
		
		//Browser access in java
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver =new FirefoxDriver();
	
		//Maximize the window
	driver.manage().window().maximize();
	
		//Add the URl 
	driver.navigate().to("https://automationexercise.com/");
	
		//Click on Login/singup button 
	driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
	
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
	
	
	}}

	
	
	



