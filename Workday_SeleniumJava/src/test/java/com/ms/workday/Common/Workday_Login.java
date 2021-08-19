package com.ms.workday.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Workday_Login extends  Workday_BasePage{
	
	public Workday_Login(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='text' and @aria-label='Username']") WebElement Txt_Username;
	
	@FindBy(xpath="//input[@type='password']") WebElement Txt_Password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]") WebElement Btn_SignIn;
	
	@FindBy(xpath="//button[contains(text(),'Skip')]") WebElement Btn_Skip;

	
	
	
	public void SignIn(String Username, String Password)
	//public void SignIn() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Txt_Username));
		Txt_Username.sendKeys(Username);
		Txt_Password.sendKeys(Password);
		Btn_SignIn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Btn_Skip.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
	}

}
