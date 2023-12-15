package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffbuttontext {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	    driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 
	}
	@Test
	public void test()
	{
	    String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	    System.out.println(buttontext);
		if(buttontext.equals("Create my account >>"))
	    {
	        System.out.println("Test Pass");
	        //return true;
	    }
	    else{
	       System.out.println("Test Failed");
	        //return false;
	    } 
	}

}
