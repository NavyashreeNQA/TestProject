package Assignment;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobUrl {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("wipro jobs");
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	List<WebElement> allLinks = driver.findElements(By.tagName("h3"));
	int count=allLinks.size();
	//System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement Links = allLinks.get(i);
		String Url=Links.getAttribute("href");
		System.out.println(Url);
	}
	
	}
}

