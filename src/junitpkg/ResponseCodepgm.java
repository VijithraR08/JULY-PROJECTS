package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCodepgm {
	String baseurl="https://www.flipkart.com";
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
    @Test
    public void test() throws Exception
    {
    	URL u=new URL(baseurl);
    	HttpURLConnection con=(HttpURLConnection)u.openConnection();
    	con.connect();
    	System.out.println(con.getResponseCode());
    	if(con.getResponseCode()==200)
    	{
    		System.out.println("valid");
    	}
    	else
    	{
    		System.out.println("invalid");
    	}
    }
}
