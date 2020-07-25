package TyssClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private  WebElement untbx;                             //declaration

	public LoginPage(WebDriver driver) {
		untbx = driver.findElement(By.id("username"));    //initialisatiton
	}
	public void setUser() {
		untbx.sendKeys("admin");                           //utilisation
	}

}
