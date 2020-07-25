package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFileInvalidLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		FileInputStream fis=new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int RowNum = wb.getSheet("InvalidLogin").getLastRowNum();
		Thread.sleep(3000);
		for(int i=1;i<=RowNum;i++)
		{
			String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).toString();
			String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).toString();
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}
		driver.close();

	}
}
