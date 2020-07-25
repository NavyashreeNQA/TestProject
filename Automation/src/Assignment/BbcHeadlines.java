package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcHeadlines {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> news = driver.findElements(By.className("media__link"));
		int size=5;
		for(int i=0;i<size;i++)
		{
			WebElement display = news.get(i);
			String text = display.getText();
			System.out.println(text);
		}
		driver.close();
	}
	

}
