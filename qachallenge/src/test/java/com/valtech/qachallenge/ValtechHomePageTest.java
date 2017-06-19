package com.valtech.qachallenge;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ValtechHomePageTest 
   
{
  
	ValtechHomePage valtechHomePage = new ValtechHomePage();
	
	@BeforeSuite
	public void openValtechHomePage() throws IOException
	{
		valtechHomePage.openValtechHomePage();
	}
	
	@Test(priority=1)
	public void checkLatestNewsSection() throws IOException
	{
		assertEquals(valtechHomePage.getLatestNewsText(),"LATEST NEWS");
		
	}
	
	@Test(priority=2)
	public void clickAboutAndVerify() throws IOException, InterruptedException
	{
		assertEquals(valtechHomePage.clickOnMenuItem("About"),"About");
	}
	
	@Test(priority=3)
	public void clickWorkAndVerify() throws IOException, InterruptedException
	{
		assertEquals(valtechHomePage.clickOnMenuItem("Work"),"Work");
	}
	
	@Test(priority=4)
	public void clickServicesAndVerify() throws IOException, InterruptedException
	{
		assertEquals(valtechHomePage.clickOnMenuItem("Services"),"Services");
	}
	
	
	@Test(priority=5)
	public void countValtechOffices() throws IOException, InterruptedException
	{
		valtechHomePage.navigateToContactPage();
	}
	
	@AfterSuite
	public void closeWebPage() throws IOException
	{
		valtechHomePage.closeWebPage();
	}
}
