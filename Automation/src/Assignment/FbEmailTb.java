package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbEmailTb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String Text = driver.findElement(By.xpath("//input[@type='email']")).getAttribute("value");
		if(Text.isEmpty())
		{
			System.out.println("Email textbox is empty");
		}
		else {
			System.out.println("Email textbox is not empty");
		}
		driver.close();
}
}
