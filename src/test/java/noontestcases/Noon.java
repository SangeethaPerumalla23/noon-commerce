package noontestcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Noon {
	
	WebDriver driver;
	
	@Test
	void testnoon() {
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, 1000);");
		
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='sc-26c8c6bb-0 hVQgMU']"));
		System.out.println(phones.size());
		WebElement button=driver.findElement(By.xpath("(//div[contains(@class, 'swiper-button-next')])[5]"));
		 
		for (WebElement product : phones) {
			
			Boolean isVisible = (Boolean) jse.executeScript(
				    "var elem = arguments[0],                 " +
				    "  box = elem.getBoundingClientRect(),    " +
				    "  cx = box.left + box.width / 2,         " +
				    "  cy = box.top + box.height / 2,         " +
				    "  e = document.elementFromPoint(cx, cy); " +
				    "for (; e; e = e.parentElement) {         " +
				    "  if (e === elem)                        " +
				    "    return true;                         " +
				    "}                                        " +
				    "return false;", product);

			
			if(isVisible) {
				System.out.println(product.getText());
				System.out.println("*****************");
			}else {
				button.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
				
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		jse.executeScript("window.scrollTo(0, 3000);");
		List<WebElement>backpacks=driver.findElements(By.xpath("//h2[text()='Deals on branded backpacks']/following::div[@class='sc-26c8c6bb-0 hVQgMU']"));
		System.out.println(backpacks.size());
		for(WebElement product: backpacks) {
			Boolean isVisible1 = (Boolean) jse.executeScript(
				    "var elem = arguments[0],                 " +
				    "  box = elem.getBoundingClientRect(),    " +
				    "  cx = box.left + box.width / 2,         " +
				    "  cy = box.top + box.height / 2,         " +
				    "  e = document.elementFromPoint(cx, cy); " +
				    "for (; e; e = e.parentElement) {         " +
				    "  if (e === elem)                        " +
				    "    return true;                         " +
				    "}                                        " +
				    "return false;", product);
			if(isVisible1) {
				System.out.println(product.getText());
				System.err.println("*****");
			}else {
				button.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
			}
			
		}
	}
	

}
