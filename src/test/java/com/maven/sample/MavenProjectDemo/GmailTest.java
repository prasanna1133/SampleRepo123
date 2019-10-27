package com.maven.sample.MavenProjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class GmailTest {
	public void GTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srihitha\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		System.out.println("Gmail Page");
		Thread.sleep(4000);
		driver.findElement(By.id("identifierId")).sendKeys("Ramakrishna");
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
