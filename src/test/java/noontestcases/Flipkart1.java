package noontestcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Flipkart1 {
  
  
	WebDriver driver;
	
	@Test
	void testflipkart() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Search_field=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Search_field.sendKeys("iphones");
		Search_field.submit();
		List<WebElement> mobilenames=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

		List<WebElement> mobileprices=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	  for(int i=0; i<mobilenames.size(); i++) {
		  System.out.println("mobilenames"+mobilenames.get(i).getText());
		  System.out.println("mobileprices"+mobileprices.get(i).getText());
		  System.out.println("********");
	  }
		
	}
}