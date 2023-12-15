package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazoncart {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
	  
	}
	@Test
	public void test()
	{
		driver.get("https://www.amazon.in");
	    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
	    String actualtitle="Amazon.in : mobilephones";
	    String title=driver.getTitle();
	    if(title.equalsIgnoreCase(actualtitle))
	    {
	    	System.out.println("Pass" +title);
	    }
	    else
	    {
	    	System.out.println("fail"+title);
	    }
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		String parentWindow=driver.getWindowHandle();
		
		
		
		Set<String> allWindowHandles=driver.getWindowHandles();
	    for(String handle:allWindowHandles)
		{
	      if(!handle.equalsIgnoreCase(parentWindow))
			{
			    driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				driver.close();
			}
	      
			
		
	}
	}
}
