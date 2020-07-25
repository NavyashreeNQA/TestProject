package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Dimension uname = driver.findElement(By.xpath("//input[@name='username']")).getSize();
		int uheight=uname.getHeight();
		int uwidth=uname.getWidth();
		Dimension pwd = driver.findElement(By.xpath("//input[@name='pwd']")).getSize();
		int pwdheight=uname.getHeight();
		int pwdwidth=uname.getWidth();
		if(uheight==pwdheight&&uwidth==pwdwidth)
		{
			System.out.println("Same height and width hence Usabilitity testcase is pass");
		}
		else
		{
			System.out.println("Different height and width hence Usabilitity testcase is fail");
		}
		driver.close();
}
}
