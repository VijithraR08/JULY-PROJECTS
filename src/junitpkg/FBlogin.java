package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {
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
		driver.findElement(By.id("email")).sendKeys("7560809678");
		driver.findElement(By.name("pass")).sendKeys("a123");
		driver.findElement(By.name("login")).click();
	}

}
