package com.ms.workday.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ms.workday.Utilities.BaseClass;

public class Workday_StartProxy extends  Workday_BasePage{
	
	public Workday_StartProxy(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='search']") WebElement Txt_Search;
	
	@FindBy(xpath="//div[contains(text(),'Start Proxy')]") WebElement Lnk_StartProxy;
	
	@FindBy(xpath="//input[@placeholder='Search']") WebElement Txt_ActAs;
	
	@FindBy(xpath="//button[@title='OK']") WebElement Btn_Ok;
	
	
	
	//public void StartProxy(String Proxyname, String ActAs)
	public void StartProxy()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Txt_Search));
		Txt_Search.click();
		//Txt_Search.sendKeys(Proxyname);
		Txt_Search.sendKeys("Start proxy");
		Txt_Search.sendKeys(Keys.ENTER);
		Lnk_StartProxy.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(Txt_ActAs));
		Txt_ActAs.click();
		//Txt_ActAs.sendKeys(ActAs);
		Txt_ActAs.sendKeys("Albert Wong");
		Txt_ActAs.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Btn_Ok.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
//		if(driver.findElement(By.xpath("//h1[contains(text(),'Welcome, On behalf of: "+ActAs+"')]")).isDisplayed())
//		{
//			System.out.println("Started proxy as "+ActAs+".");
//		
//		}
//		else
//		{
//			System.out.println("Failed to start proxy as "+ActAs+".");
//		}
	}

}
