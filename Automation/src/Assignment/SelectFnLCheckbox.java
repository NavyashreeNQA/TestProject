package Assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFnLCheckbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of a website");
		String url=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement a = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement a1 =  driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]"));
		a.click();
		a1.click();
		driver.close();

}
}
