package com.ms.workday.Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;



public class BaseClass {
	public WebDriver driver;
	public ConfigDataProvider config;
	
	//**************Fetching data from config file and excel**********************************
	@BeforeSuite
	public void SetUpSuite()
	{
			config=new ConfigDataProvider();
		
	}
	
	//***************************************APP STATE ONSTART***************************************
	@BeforeClass
	public void AppOnStart() 
	{
        driver=BrowserFactory.OnStart(driver, config.GetBrowser(), config.GetURL());
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	//***************************************APP STATE ONFINISH***************************************
	@AfterTest
	public void AppOnFinish()
	{
		BrowserFactory.OnFinish(driver);
	}
	
	//*******************Capture Snapshot if testcase is Failed***********************************
//	@AfterMethod
//	public void CaptureSnapshot(ITestResult result) throws IOException
//	{
//					
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			Reporter.log("Testcase failed", true);
//			CaptureScreenshots.Screenshot(driver);//Capture Snapshot 
//			
//		}
//
//	}

}
