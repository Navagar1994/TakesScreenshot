package org.shot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshotss2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\TakesScreenshot\\Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(kids).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
