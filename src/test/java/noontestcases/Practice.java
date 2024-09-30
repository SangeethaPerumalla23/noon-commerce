package noontestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;import org.apache.commons.compress.harmony.pack200.NewAttribute.PassAttribute;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	WebDriver driver;
	
	
	@Test
	void test() throws IOException, InterruptedException {
		
		 String name = getcelldata("C:\\Users\\Sangeetha\\Desktop\\Example1.xlsx","sheet1",0,0);
		 String id = getcelldata("C:\\Users\\Sangeetha\\Desktop\\Example1.xlsx","sheet1", 0,1);
		  
		System.out.println(name);
		System.out.println(id);
		driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://practice.expandtesting.com/login");
    	Thread.sleep(2000);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, 500);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(id);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	 String getcelldata(String path, String sheet, int row,  int col) throws IOException {
    	 FileInputStream fis= new FileInputStream(new File(path));
    	 Workbook wb= new XSSFWorkbook(fis);
    	 Sheet st= wb.getSheet(sheet);
    	 Row r = st.getRow(row);
    	 Cell c=r.getCell(col);
    	 String cellvalue=c.toString();
    	 wb.close();
    	 return cellvalue;
    	 
     }

}
