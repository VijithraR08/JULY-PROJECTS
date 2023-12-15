package junitpkg;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	    driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 
	}
	@Test
	public void rediffaccount()
	{
	   driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Chikku");
	   driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Chikku11");

        boolean logo = driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
        if(logo)
        {
        	System.out.println("logo is displayed");
        }
        else
        {
        	System.out.println("logo is not displayed");
        }


	}
	
	}

