package com.ms.workday.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.ms.workday.Common.*;
import com.ms.workday.Utilities.*;


public class Samplelogin extends BaseClass{
	
	
	@Test()		
	public void login() throws InterruptedException
		{
		
		Workday_Login SignInElements= new Workday_Login(driver);
		Workday_StartProxy Proxy=new Workday_StartProxy(driver);
		

		
		SignInElements.SignIn("lkumar", "Matryx1@2020");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Proxy.StartProxy("Start proxy", "Albert Wong");
//		
//		SignInElements.SignIn();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Proxy.StartProxy();
		
		}

}
