package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) {
		// Test case 2: verify url
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Zokir\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http:\\www.cybertekschool.com");
		
		String expected = "cybertekschool";
		String actual = driver.getCurrentUrl();
		if (actual.contains(expected)) {

			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			System.out.println("Expected:\t"+ expected);
			System.out.println("Actual:\t"+ actual);
		}
		
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	}
}
