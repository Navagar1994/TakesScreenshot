package org.shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshotss1 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\TakesScreenshot\\Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.snapdeal.com/");
		
		WebElement txtuser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtuser.sendKeys("hp laptop");
		
		WebElement searchbtn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		searchbtn.click();
		
		TakesScreenshot tk =(TakesScreenshot) driver;
		
		File s= tk.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\TakesScreenshot\\snapdeal.png");
		
		FileUtils.copyFile(s, f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
