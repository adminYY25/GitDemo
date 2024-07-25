package com.assignment.GENCautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
		
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="email")
	private WebElement email;

	@FindBy(name="password")
	private WebElement password;

	@FindBy(xpath="//*[@id='fadein']/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	private WebElement submit;
	
	public void enterEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
		enterEmail("demotest8989");
		
	}
	public void enterPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	
		// TODO Auto-generated constructor stub
	}


