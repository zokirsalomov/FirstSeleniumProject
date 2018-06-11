package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Zokir\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testing-ground.scraping.pro/login");
		// finding element 
		// By.name() --> how to find it 
		Thread.sleep(2000);
		driver.findElement(By.name("usr")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("12345");
		// click() -->  clicks 
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		String expected = "Welcome";
		String actual = driver.getTitle();
		
		if (actual.contains(expected)) {

			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			System.out.println("Expected:\t"+ expected);
			System.out.println("Actual:\t"+ actual);
		}
		
		
		
		
		
		
		
		
	}
}
