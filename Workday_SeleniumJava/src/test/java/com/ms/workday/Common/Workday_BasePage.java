package com.ms.workday.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Workday_BasePage {
	//
	
	public WebDriver driver;
	public  Workday_BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
