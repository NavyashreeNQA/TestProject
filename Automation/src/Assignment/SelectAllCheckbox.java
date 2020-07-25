package Assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of a website");
		String url=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> a = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<a.size();i++)
		{
			WebElement al = a.get(i);
			al.click();
		}
}
}
