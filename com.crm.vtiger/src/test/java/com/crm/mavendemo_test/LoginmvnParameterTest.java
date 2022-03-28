package com.crm.mavendemo_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginmvnParameterTest {

	@Test
	public void a() {
		
		
//	public void login() {
//		WebDriver driver=null;
//		String url=System.getProperty("url");
//		String username=System.getProperty("username");
//		String password=System.getProperty("password");
//		String browser=System.getProperty("browser");
//		
//		
//		
//		if(browser.contains("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		}
//		else if (browser.contains("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else {
//			System.out.println("use valid browser");
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get(url);
//		
//		driver.findElement(By.name("user_name")).sendKeys(username);
//		driver.findElement(By.name("user_password")).sendKeys(password);
//		driver.findElement(By.id("submitButton")).click();
//		
//		WebElement lookup = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//		Actions a=new Actions(driver);
//		a.moveToElement(lookup).perform();
//		driver.findElement(By.linkText("Sign Out")).click();
//		driver.close();
	}
}
