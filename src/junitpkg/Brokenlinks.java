package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	@Test
	public void search()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no:of links="+li.size());
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			verifylink(link);
		}
	}


	private void verifylink(String link) {
		try
		{
	
		    URL u=new URL(link);
		    HttpURLConnection con=(HttpURLConnection)u.openConnection();
	        con.connect();
	        if(con.getResponseCode()==200)
	        {
	    	   System.out.println("response code is 200"+link);
	        }
	        else if(con.getResponseCode()==404)
	        {
	    	   System.out.println("response code is 404"+link);
	        }
		}
		catch(Exception e)
		{
			System.out.println("Done");
		}
   }
}