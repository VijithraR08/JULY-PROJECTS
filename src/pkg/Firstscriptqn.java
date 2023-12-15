package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscriptqn {

	public static void main(String[] args) {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   String actualtitle=driver.getTitle();
	   String exp="Facebook";
	   if(actualtitle.contains(exp))
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
       String src=driver.getPageSource();
       if(src.contains("Log in"))
       {
    	   System.out.println("Log in is present");
       }
       else
       {
    	   System.out.println("Log in is not present");
       }
	}

}
