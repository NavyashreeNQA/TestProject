package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginbtnEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean enabled = driver.findElement(By.xpath("//div[text()='Login ']")).isEnabled();
		if(enabled==true)
		{
			System.out.println("Login button is enabled and testcase is pass");
		}
		else
		{
			System.out.println("Login button is disabled and testcase is fail");
		}
		driver.close();

}
}
