package Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> allautosug = driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
		int count=allautosug.size();
		System.out.println(count);
		for(WebElement Autosugg:allautosug)
		{
			String text = Autosugg.getText();
			System.out.println(text);
		}
		//allautosug.get(count-1).click();
		driver.close();
	
	}

}
