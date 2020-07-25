package com.elf.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MainMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		//PageFactory.initElements(driver, l);
		l.setLogin("admin1", "manager1");
		Thread.sleep(2000);
		l.setLogin("admin", "manager");
		driver.close();
}
}
