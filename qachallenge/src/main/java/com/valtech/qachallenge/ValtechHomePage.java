package com.valtech.qachallenge;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.valtech.utilities.DriverInstance;

public class ValtechHomePage extends DriverInstance {

	public void openValtechHomePage() throws IOException {
		getDriver().navigate().to("https://www.valtech.com/");
	}

	public String getLatestNewsText() throws IOException {
		String latestNewsHeader = getDriver()
				.findElement(By.xpath("//*[@id='container']/div[2]/div[3]/div[1]/header/h2")).getText();
		return latestNewsHeader;
	}

	public String clickOnMenuItem(String menuName) throws IOException, InterruptedException {
		getDriver()
				.findElement(By.xpath(
						"//*[@id='navigationMenuWrapper']//div//ul//li//a//span[contains(text(),'" + menuName + "')]"))
				.click();

		return getDriver().findElement(By.xpath("//*[@id='container']//h1")).getText();

	}
	
	public void navigateToContactPage() throws IOException
	{
		getDriver().navigate().to("https://www.valtech.com/about/contact-us/");
		List<WebElement> numberOfOffices = getDriver().findElements(By.xpath("//h2[@class='office__heading']"));
		System.out.println("Number of Valtech Office : " + numberOfOffices.size());
	}
	
	public void closeWebPage() throws IOException
	{
		getDriver().quit();
	}

}
