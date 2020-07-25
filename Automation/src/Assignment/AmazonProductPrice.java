package Assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductPrice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement type = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		type.sendKeys("iphone x");
		type.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> product = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		int count = product.size();
		int count1=price.size();
		System.out.println(count);
		for(int i=0,j=0;i<count;i++,j++)
		{
			if(j<count1)
			{
				WebElement t = product.get(i);
				WebElement p = price.get(j);
				String proname = t.getText();
				String pr = p.getText();
				System.out.println(proname+ " = > " + pr);
			}
		}
		driver.close();
	}
}

