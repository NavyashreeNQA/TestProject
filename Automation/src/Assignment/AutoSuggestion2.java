package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@title='Any worldwide city or airport']")).sendKeys("Ban");
		Thread.sleep(3000);
		List<WebElement> allautosug = driver.findElements(By.xpath("//a[contains(text(),'Ban')]"));
		int count=allautosug.size();
		System.out.println(count);
		for(WebElement Autosugg:allautosug)
		{
			String text = Autosugg.getText();
			System.out.println(text);
		}
		driver.close();
}
}
