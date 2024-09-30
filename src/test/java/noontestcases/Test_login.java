package noontestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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


public class Test_login {
	
	
	WebDriver driver;
	

  @Test
 void test_login() throws InterruptedException, IOException {
	  String username=getcelldata("C:\\Users\\Sangeetha\\Desktop\\Example1.xlsx","sheet1",1,0);
	  String username1=getcelldata("C:\\Users\\Sangeetha\\Desktop\\Example1.xlsx","sheet1", 1,1);
	  
	 driver=new ChromeDriver();
	 driver.get("https://practice.expandtesting.com/login");
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollTo(0, 500);");
		Thread.sleep(500);
		
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
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
  
  