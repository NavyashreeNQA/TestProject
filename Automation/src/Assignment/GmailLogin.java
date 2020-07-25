package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		driver.findElement(By.xpath("//div[@class='aXBtI Wic03c']")).click();
		j.executeScript("document.getElementsByClassName('aXBtI Wic03c').value='nnavyashreeammu12@gmail.com'");
		
		//driver.findElement(By.xpath("//div[@class='aXBtI Wic03c']")).sendKeys("nnavyashreeammu12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.close();

	}
}
