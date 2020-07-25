package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("origin")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Depart date']")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(3000);
		List<WebElement> flightName = driver.findElements(By.xpath("//img[contains(@src,'images/logos/air-logos/')]"));
		List<WebElement> departTime = driver.findElements(By.xpath("//th[@class='depart']"));
		for(int i=0,j=0;i<flightName.size();i++,j++)
		{
			if(j<departTime.size())
			{
				WebElement Name = flightName.get(i);
				WebElement Time = departTime.get(j);
				Thread.sleep(2000);
				String name = Name.getText();
				String time = Time.getText();
				System.out.println("Flight_name: "+name+" DepartureTime: "+time);
			}

		}
		driver.close();
	}


}
