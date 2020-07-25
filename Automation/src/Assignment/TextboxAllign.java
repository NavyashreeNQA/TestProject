package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxAllign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point mobileno = driver.findElement(By.xpath("//input[@name='reg_email__']")).getLocation();
		int mobilenotb=mobileno.getX();
		Point pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']")).getLocation();
		int pwdtb=mobileno.getX();
		if(mobilenotb==pwdtb)
		{
			System.out.println("Alligned properly");
		}
		else
		{
			System.out.println("Not alligned properly");
		}
		driver.quit();
}
}

