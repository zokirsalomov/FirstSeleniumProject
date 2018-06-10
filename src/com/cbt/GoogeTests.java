package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogeTests {

	public static void main(String[] args) {
		
		// 1. open chrome
		// C:\Users\Zokir\Documents\selenium dependencies\drivers/chromedriver
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Zokir\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//2. go to www.google.com
		
		driver.get("http://www.cybertekschool.com");
		
		// 3. verify title
		
		String expected = "Google";
		String actual = driver.getTitle();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t"+ expected);
			System.out.println("Actual:\t"+ actual);
		}
	}
}
