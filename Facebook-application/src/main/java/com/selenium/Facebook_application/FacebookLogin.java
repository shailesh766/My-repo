package com.selenium.Facebook_application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		System.out.println("I am going to login my Facebook Application");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("7743818974");
		driver.findElement(By.id("pass")).sendKeys("7743818974");
		driver.findElement(By.className("_6ltg")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ssrb_root_start")).click();
	
	}

}
