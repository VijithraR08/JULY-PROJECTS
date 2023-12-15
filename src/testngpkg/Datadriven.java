package testngpkg;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	ChromeDriver driver;
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws Exception
	{
		
		FileInputStream ob=new FileInputStream("C:\\Users\\admin\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);//workbook
		XSSFSheet sh=wb.getSheet("Sheet1");//sheetdetails
		int row =sh.getLastRowNum();//rowdetails
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+password);
			
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
		}
	}

}
