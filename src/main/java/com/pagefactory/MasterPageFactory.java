package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	//step-4
	public MasterPageFactory(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//step-2
	@FindBy(xpath="//i[@class='fa fa-lock']")
	//step-1
	private WebElement Singing_Homepage;
	
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement Email;
	
	@FindBy(xpath="//*[@name='password")
	private WebElement Password;

	
	@FindBy(xpath="//*[text()='Login']")
	private WebElement Login;
	
	//Step-3 Generate getter Method
	public WebElement getSinging_Homepage() {
		return Singing_Homepage;
	}

	
	
	
	}
	 
	
	


