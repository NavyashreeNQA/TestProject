package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean selected=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if(selected==true)
		{
			System.out.println("Checkbox is selected so testcase is failed");
		}
		else
		{
			System.out.println("Checkbox is not selected so testcase is pass");
		}
		driver.quit();
}
}
