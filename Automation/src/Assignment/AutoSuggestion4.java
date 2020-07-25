package Assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the URL");
		String url=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<allcheckbox.size();i++)
		{
			WebElement Checkbox = allcheckbox.get(0);
			Checkbox.click();
			WebElement Checkbox1 = allcheckbox.get(i);
			Checkbox1.click();
		}
		Thread.sleep(2000);
		driver.close();

}
}
