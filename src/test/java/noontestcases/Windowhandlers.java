package noontestcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlers {
	// String second_window_id;  
	public static void main(String[] args) {
		//Windowhandlers  obj= new Windowhandlers ();
		WebDriver driver= new ChromeDriver();
		driver.manage(). window().maximize();
		driver.get("https://phptravels.com/");
		driver.findElement(By.xpath("//strong[text()='Sign Up']")).click();
		
		String first_window_id = driver.getWindowHandle();
		Set<String>  windowhandles =  driver.getWindowHandles();
		String second_window_id="";
		System.out.println("Seetha");
		
		for (String handle : windowhandles) {
			if(!handle.equals(first_window_id)) {
				second_window_id = handle;
			}
		}
		
		System.out.println( first_window_id);
		System.out.println(second_window_id);
		driver.switchTo().window(second_window_id);
		
		driver.findElement(By.id("first_name")).sendKeys("sangeetha");
		driver.findElement(By.id("last_name")).sendKeys("perumalla");
		
		
		
		
		
		
	}
	
	
	
	
	
}
