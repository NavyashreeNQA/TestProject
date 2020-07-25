package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class UserSpecifiedLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of a website");
		String url=sc.next();
		WebDriver driver=new ChromeDriver();
		//String link = driver.getCurrentUrl();
		driver.get(url);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement Links = allLinks.get(i);
			String Text=Links.getText();
			System.out.println(Text);
		}
		driver.close();
}
}
