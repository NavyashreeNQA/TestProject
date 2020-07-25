package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPresenceOfText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		String value="demo@orgopensourcebilling.";
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		String actualvalue = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		//System.out.println(actualvalue);
		if(actualvalue.equals(value))
		{
			System.out.println("Both text are matching so testcase is pass");
		}
		else {
			System.out.println("Text are not matching so testcase fails");
			
			
		}
		driver.close();
	}

}
