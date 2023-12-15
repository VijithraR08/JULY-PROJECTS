package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExercise1 {
	ChromeDriver driver;
	@Before
	public void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(3);
	}	
	@Test
	public void test() throws InterruptedException  
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span/i")).click();
	    Thread.sleep(3);  
	    driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();
	    Thread.sleep(3);   
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,350)", "");
	    driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
	    Thread.sleep(3);
	    
	    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Akash");
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("akash@gmail/com");
	
	}
}
