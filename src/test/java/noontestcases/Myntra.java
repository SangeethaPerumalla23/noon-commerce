package noontestcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
 WebDriver driver;
 

  @Test
  
    void myntra() {
	  driver=new ChromeDriver();
	  driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	 
	  List<WebElement> products= driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
	  System.out.println(products.size());
	  
	  WebElement button = driver.findElement(By.xpath("//li[@class='pagination-next']"));
	 
	  for (WebElement webElement : products) {
		System.out.println(webElement.getText());
		System.out.println("**********");
	  }
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			
	  button.click();
	  
  }

}
  

