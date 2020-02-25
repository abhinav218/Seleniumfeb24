package com.demoaut.newtours.TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

import utils.GenericMethods;


public class VerifyInvalidLoginTest {
	
	
	WebDriver driver;
	@BeforeTest
	public void openApplication () {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	}
	
	@Test
	public void VerifyInvalidLogin() throws IOException {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);
		
		GenericMethods.getData("/Users/abhinavwudali/SelJan18/Frameworks/TestData.xlsx", "Sheet1");
		for(int i = 1;i<data.length;i++); {
		lp.applicationLogin("data[i][0]", "data[i][1]");
		boolean signOnLinkPresent = so.signOnLinkVisibile();
		Assert.assertTrue(signOnLinkPresent);
		driver.navigate().back();
		
		}
	
		
		}
	
	
@AfterTest
	public void closeApplication() {
		driver.close();
	}

}
