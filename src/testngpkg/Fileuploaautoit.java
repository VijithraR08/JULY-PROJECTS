package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploaautoit {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void fileUpload() throws IOException,Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");	
	    driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	    Thread.sleep(3000);
	    Runtime.getRuntime().exec("E:\\chinnu\\T1.exe");
	    Thread.sleep(3000);
	}

}
