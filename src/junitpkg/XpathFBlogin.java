package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFBlogin {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	 
	}
	@Test
	public void Fblogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("1235467890");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("a123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
