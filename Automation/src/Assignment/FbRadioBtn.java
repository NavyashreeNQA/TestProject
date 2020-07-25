package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRadioBtn {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean selected=driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']")).isSelected();
		if(selected==true)
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
		driver.quit();
}

}
