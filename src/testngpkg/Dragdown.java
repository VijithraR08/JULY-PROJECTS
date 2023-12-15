package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdown {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement destination1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destination2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement source3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement destination3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement source4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destination4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source1, destination1);
		act.dragAndDrop(source2, destination2);
		act.dragAndDrop(source3, destination3);
		act.dragAndDrop(source4, destination4);
		act.perform();
		
	}
	

}
