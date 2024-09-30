package noontestcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Saucedemo_login {
	WebDriver driver;
	
@BeforeClass
	
    void testlogin() {
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
}
 @Test(priority=1)
  public void testvalidlogin() {
	 
    driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	WebElement logo	=driver.findElement(By.xpath("//div[@class='app_logo']"));
	logo.isDisplayed();
 
 }
 @Test(priority=2)

 public void testinvalidlogin() {
	 
	 	driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user11");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    WebElement actualmessageElement=driver.findElement(By.xpath("//h3[@data-test='error']"));
	    String  actualmessageElement=ErrormessageElement.getText();
	    
	    
	
		
 }
 
 @Test(priority=3)
 
 public void testemptyfields() {
	    driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
 }
		
   @Test(priority=4)
   public void testlockedoutusers() {
	    driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	   
   }
   
   
	
	
	
}
