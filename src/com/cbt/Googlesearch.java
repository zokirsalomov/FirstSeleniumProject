
package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) {
		
		WebDriver web = new ChromeDriver();
		
		web.get("https://Cyberteckschool.com");
	}
}
