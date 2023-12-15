package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxpgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/alertbox.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("def");
		
		//a.dismiss();to cancel
		
	}
}

