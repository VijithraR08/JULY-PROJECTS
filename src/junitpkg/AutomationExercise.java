package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExercise {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Vijithra");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("vijithraram08@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vijithra08@");
	    WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	    Select daydetails=new Select(day);
	    daydetails.selectByValue("8");
	    WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByValue("7");
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2000");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Vijithra");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("R");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Abc Tech");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("defff");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("defff");
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select countrydetails=new Select(country);
		countrydetails.selectByValue("India");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Palakkad");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("678623");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();

	
	
	
	}

}
