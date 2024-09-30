package noontestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Validation_page {
  WebDriver driver;
  
@Test
void testcase() {
    driver = new ChromeDriver();
    driver.get("https://practice.expandtesting.com/form-validation");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("sangeetha");
    driver.findElement(By.xpath("//input[@name='contactnumber']")).sendKeys("8008396527");
    driver.findElement(By.xpath("//input[@class='form-control' and @name='pickupdate' ]")).sendKeys("22/08/2024");
    //driver.findElement(By.xpath("//select[@name='payment']")).click();
	 // Select dropdown = new Select(driver.findElement(By.id("validationCustom04")));
	  //dropdown.selectByVisibleText("cash on delivery ");
	  //driver.findElement(By.xpath("//button[@type='submit']")).click(); 
 
    
    
    
    
}
}



