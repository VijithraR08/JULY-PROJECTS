package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();//to get pagesource code
		if(src.contains("Gmail"))
		{
			System.out.println("Gmail text is present");
		}
		else
		{
			System.out.println("Gmail text is not present");
		}

	}

}
