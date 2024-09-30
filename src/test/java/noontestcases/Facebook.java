package noontestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;
	

  @Test
  void f()  {
	  
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	 
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9949012998");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9989952254");
	  driver.findElement(By.id("loginbutton")).click();
	  driver.findElement(By.xpath("//span[text()='Friends']")).click();
	 
	  driver.quit();
	  

}
}

