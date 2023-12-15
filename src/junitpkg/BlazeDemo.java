package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void register()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vikram");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Abctech");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vikram11@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vikram11");
		driver.findElement(By.xpath("//input[@id='password-confirm']")).sendKeys("Vikram11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
