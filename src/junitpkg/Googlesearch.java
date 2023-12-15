package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	@Before
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
    @Test
    public void googlesearch()
    {
    	driver.findElement(By.name("q")).sendKeys("sky",Keys.ENTER);
    	//driver.findElement(By.id("btnK")).click();
    }
}
