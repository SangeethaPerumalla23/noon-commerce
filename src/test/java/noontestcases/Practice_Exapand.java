package noontestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_Exapand {
	

	WebDriver driver;
   
	@Test(priority = 1)
    void positiveTestCase() throws IOException, InterruptedException {
		
		String username = getcellData("C:\\Users\\Sangeetha\\Desktop\\Readexcel.xlsx","Sheet1",1,0);
		String password = getcellData("C:\\Users\\Sangeetha\\Desktop\\Readexcel.xlsx","Sheet1",1,1);
		
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://practice.expandtesting.com/login");
    	
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, 500);");
		Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	driver.findElement(By.xpath("//button[text()='Login']")).click();
    	
    	
    }
	
	@Test(priority = 2)
	void negativeTestCase() throws IOException, InterruptedException {
		
		String username = getcellData("C:\\Users\\Sangeetha\\Desktop\\Readexcel.xlsx","Sheet1",2,0);
		String password = getcellData("C:\\Users\\Sangeetha\\Desktop\\Readexcel.xlsx","Sheet1",2,1);
		
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://practice.expandtesting.com/login");
    	
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, 500);");
		Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	driver.findElement(By.xpath("//button[text()='Login']")).click();
    	
    	
    }
	
	String getcellData(String path,String sheetname,int row,int col) throws IOException{
		

			FileInputStream fis = new FileInputStream(new File(path));
			Workbook wb = new XSSFWorkbook(fis);
			Sheet st = wb.getSheet(sheetname);
			Row r = st.getRow(row);
			Cell c = r.getCell(col);
			String cellvalue = c.toString();
			wb.close();
			return cellvalue;

	}
}

    
    
    
