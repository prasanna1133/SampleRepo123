package com.maven.sample.MavenProjectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class RameshSoftTest {
	public void RSTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srihitha\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rameshsoft.com");
		System.out.println("Rameshsoft Page");
		Thread.sleep(4000);
		driver.close();
	}
}
