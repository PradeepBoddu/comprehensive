package com.comprehen.testCases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.comprehen.pageObjects.Study;

public class Signin  extends Base{
	Actions action;
	@Test
	public void sign() throws InterruptedException, IOException
	{
		Study s=new Study(driver);
		s.log1().click();
		Thread.sleep(5000);
		s.sign1().click();
		Thread.sleep(5000);
		s.email1().sendKeys("pradeepboddu969@gmail.com");
		Thread.sleep(3000);
		s.pwd1().click();
		s.pwd1().sendKeys("Zxcv1357@");
		Thread.sleep(2000);
		s.signup1().click();
		Thread.sleep(3000);
		getScreenshot(driver,"sign");
		test=extent.createTest("sign");
		log.info(" sign in test is passed");
		
	}

}
