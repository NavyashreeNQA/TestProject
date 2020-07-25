package com.elf.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.elf.generics.BaseClass;

public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='New']")).click();
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
	}

}

