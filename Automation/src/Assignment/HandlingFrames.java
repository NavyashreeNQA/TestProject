package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("d2")).sendKeys("j");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("d1")).sendKeys("q");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("d2")).sendKeys("s");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("d1")).sendKeys("s");
		WebElement framelocator = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(framelocator);
		driver.findElement(By.id("d2")).sendKeys("p");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("d1")).sendKeys("p");
		Thread.sleep(2000);
		driver.close();

}
}
