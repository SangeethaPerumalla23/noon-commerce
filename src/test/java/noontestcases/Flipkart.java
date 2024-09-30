package noontestcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	
   @Test
     void flipkart(){
    	 driver = new ChromeDriver();
    	 driver.get("https://www.flipkart.com/");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
    	 driver.findElement(By.xpath("//button[@type='submit']")).click();
    	 
    	List<WebElement> Mobile_phones  = driver.findElements(By.xpath("//div[@class='yKfJKb row']"));
    	
    	for (WebElement i : Mobile_phones) {
			System.out.println(i.getText());
			System.out.println("***************");
		}
     }
}

