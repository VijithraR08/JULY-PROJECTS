package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	@BeforeTest
	public void setUp()
	{
		System.out.println("Browser open");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url loading");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"smoke"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups= {"sanity"})
	public void test4()
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("After method");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("browser close");
	}

}
