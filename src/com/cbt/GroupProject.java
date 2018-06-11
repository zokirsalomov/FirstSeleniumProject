package com.cbt;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupProject {


	public static void main(String[] args) {
		Random rand = new Random();
		Random rand1 = new Random();
		int n2 = rand1.nextInt(50000) + 1;
		String zip = "" + n2;

		int n = rand.nextInt(100) + 1;
		String str = "" + n;

		String rndmstr = generateRandomChars("sjdhasjshdjas", 5);

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Zokir\\\\Documents\\\\selenium dependencies\\\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(str);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + rndmstr + " Smith");

		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys(zip);

		int opt = rand.nextInt(3) + 1;
		if (opt == 1) {

			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 15; i++) {
				int visaNum = rand.nextInt(9);
				sb.append("" + visaNum);
			}

			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("4" + sb.toString());

		} else if (opt == 2) {

			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < 15; i++) {
				int masterNum = rand.nextInt(9);
				sb.append("" + masterNum);
			}

			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("5" + sb.toString());

		} else {
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < 14; i++) {
				int AmericanNum = rand.nextInt(9);
				sb.append("" + AmericanNum);
			}
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("3" + sb.toString());

		}

		String month;

		int i = rand.nextInt(12) + 1;
		if (i < 10) {
			month = "0" + i;
		} else {
			month = Integer.toString(i);
		}

		int year = rand.nextInt(99 - 18) + 18;

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("" + month + "/" + year);

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		
		String expected = "New order has been successfully added.";
		String actual = driver.getPageSource();
		
		if(actual.contains(expected)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			System.out.println("Expected: "+ expected);
			System.out.println("Actual: " + actual);
		}

	}

	public static String generateRandomChars(String candidateChars, int length) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
		}

		return sb.toString();
	}


	
		
		
		
	}

