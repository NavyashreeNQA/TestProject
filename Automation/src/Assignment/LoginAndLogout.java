package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.elf.generics.FileLib;

public class LoginAndLogout {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileLib file=new FileLib();
		String Url = file.getPropertyData("url");
		String username = file.getPropertyData("username");
		String password = file.getPropertyData("password");
		//System.out.println(Url);
		driver.get(Url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("logoutLink")).click();
		boolean result = driver.findElement(By.id("whiteBoxWithLogo")).isDisplayed();
		if(result==true)
		{
			file.setExcelData("CreateCustomer", 2, 5, "PASSED");
		}
		else
		{
			file.setExcelData("CreateCustomer", 2, 5, "Failed"); 
		}
		driver.close();
	}

}

