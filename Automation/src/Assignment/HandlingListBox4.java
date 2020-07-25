package Assignment;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/Home.html");
		WebElement MtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(MtrListBox);
		HashSet<String> alltext=new HashSet<>();
		List<WebElement> alloption = s.getOptions();
		for(WebElement option:alloption) {
			String text = option.getText();
			if(alltext.add(text)==false) {
			System.out.println(text);
			}
		}
		driver.close();
		

}
}
