package Assignment;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		File f=new File("./Data/Navya_Tyss_resume.docx");
		String path=f.getAbsolutePath();
		driver.findElement(By.xpath("//label[@title='Upload your CV to Register']")).sendKeys(path);
		driver.close();
	}

}
