package com.elf.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import com.actitime.generics.FileLib;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.out.println("opening the browser");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		FileLib file=new FileLib();
		String Url = file.getPropertyData("url");
		String username = file.getPropertyData("username");
		String password = file.getPropertyData("password");
		driver.get(Url);
		System.out.println("Login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
		driver.findElement(By.id("logoutLink")).click();
	}
}

