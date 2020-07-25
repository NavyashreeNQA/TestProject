package com.elf.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
public class LoginPage {

	@FindBy(id="username")	
	private  WebElement untbx;                             //declaration
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {                   //business logic method
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);                                          //utilisation
		lgbtn.click();
	}
}



