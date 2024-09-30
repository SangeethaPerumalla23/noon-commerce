package noontestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Worldpopulation {
	
WebDriver driver;

@Test

void wroldpopulatio() {
	driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/world-population/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
     for(int i=0;i<=20;i++) {
    	 	
    	 String population = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();
    	 System.out.println("World population --> "+population);
    	 String today_data=driver.findElement(By.xpath("//div[@class='col1in']")).getText();
    	 System.out.println("Today data"+today_data);
    	 String thisyear_data=driver.findElement(By.xpath("//div[@class='col2in']")).getText();
    	 System.out.println("Thisyeardata"+thisyear_data);
    	 System.out.println("###############################################");
     }
	
	
	
	
}
}
