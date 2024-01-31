package com.rokomari.Rokomari;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.*;

public class checkoutProcess {
	

	public static void main(String[] args) throws InterruptedException {
		
		  	      
	      WebDriver driver = new EdgeDriver();
	      
		  driver.get("https://www.rokomari.com/book#_=_");
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		  //login with Gmail account
		  
		  WebElement SignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		  SignIn.click();
		  Thread.sleep(2000);
		  
		  WebElement ClickGoogle = driver.findElement(By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));
		  ClickGoogle.click();
		  Thread.sleep(2000);	
		  
		  WebElement EmailIn = driver.findElement(By.xpath("//input[@id='identifierId']"));
	      EmailIn.sendKeys("autoemon101@gmail.com");
	      Thread.sleep(2000);	
	      
	      WebElement ClickNext = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		  ClickNext.click();
		  Thread.sleep(2000);
		  
		  WebElement PassIn = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	      PassIn.sendKeys("123qwe!@#QWE");
	      Thread.sleep(2000);
	      
	      WebElement ClickNext2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		  ClickNext2.click();
		  Thread.sleep(2000);
	      
	      //hover "lekhok"
		  Actions action = new Actions(driver);
		  WebElement HoverLekhok = driver.findElement(By.xpath("//a[@id='js--authors']"));
		  action.moveToElement(HoverLekhok).perform();
		  Thread.sleep(2000);
		  
		  //select "Humayun ahmed"
		  WebElement ClickHumayun = driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
		  ClickHumayun.click();
		  Thread.sleep(2000);
		  
		  //scroll down
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement ClickShomokalin = driver.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]"));
		  js.executeScript("arguments[0].scrollIntoView()", ClickShomokalin);
		  //js.executeScript("window.scrollBy(0,2)" );		  
		  //Thread.sleep(2000);
		  
		  //select "somokalin uponnash"
		  //WebElement ClickShomokalin = driver.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]"));
		  ClickShomokalin.click();
		  Thread.sleep(2000);
		  
		  
	      
		
	      
	      
		  
		  
		  
		  
		  

       }
}