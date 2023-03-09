package org.shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshotss {
	
	public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\TakesScreenshot\\Driver\\msedgedriver.exe");
		
		WebDriver driver =  new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.greenstechnologys.com/");
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File a = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(a);
		
		File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\TakesScreenshot\\greens.svg");
		
		FileUtils.copyFile(a, f);


	}
}
