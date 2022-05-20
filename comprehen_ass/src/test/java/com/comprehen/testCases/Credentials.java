package com.comprehen.testCases;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comprehen.pageObjects.LoginDetails;
import com.comprehen.utilities.Readexcel;


public class Credentials extends Base {
	@Test()
	public void getexcel() throws InterruptedException, IOException
	{
		LoginDetails ld=new LoginDetails(driver);
		ld.hover1().click();
		Thread.sleep(8000);
		ld.login1().click();
		//Thread.sleep(1000);
		
		//ld.logbutton1().click();
		getScreenshot(driver,"getexcel");
		test=extent.createTest("credintials");
		log.info("test is pass");
		
	}
	
}
