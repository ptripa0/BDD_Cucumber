package com.pelican.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pelican.pages.LandingPage;
import com.pelican.util.Constants;
import com.pelican.util.TestBase;



public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver dr){
		driver=dr;
	}
	
	
	
	public LandingPage doLogin(String uname, String pword, String testSiteName) throws IOException, InterruptedException{
	
				
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);	
	
	
//	driver.get(TestBase.getConfig().getProperty("testSiteName"));	
	
	driver.get(testSiteName);
	Thread.sleep(10000L);
	TestBase.setLoggedIn(true);
	driver.manage().window().maximize();
	Thread.sleep(15000L);
	driver.findElement(By.xpath(Constants.username)).sendKeys(uname);
    driver.findElement(By.xpath(Constants.password)).sendKeys(pword);
    driver.findElement(By.xpath(Constants.login_button)).click();
    Thread.sleep(5000L);
	LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
	return landingPage;
	
	}
	
	/*
	public LandingPage doLoginUpgrade(String uname, String pword, String testSiteName) throws IOException, InterruptedException{
				
		
		driver.get(testSiteName);	
		
		TestBase.setLoggedInUpgrade(true);
		driver.manage().window().maximize();
		Thread.sleep(15000L);
		driver.findElement(By.xpath(Constants.username)).sendKeys(uname);
	    driver.findElement(By.xpath(Constants.password)).sendKeys(pword);
	    driver.findElement(By.xpath(Constants.login_button)).click();
	    Thread.sleep(3000L);
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		return landingPage;
		
		}
	*/
	
}


