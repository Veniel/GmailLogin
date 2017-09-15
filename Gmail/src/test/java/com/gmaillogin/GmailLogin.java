package com.gmaillogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class GmailLogin {

	public void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.gmail.com");
		d.findElement(By.id("identifierId")).sendKeys("veniels");
		d.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(4000);
		WebElement pass=d.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][@name='password']"));

		pass.sendKeys("moto");
		d.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		d.close();
		
	}
}
