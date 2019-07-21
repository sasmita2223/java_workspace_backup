package webdriver_jun12;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Program8_Taking_ScreenShots {
	static WebDriver driver;
	static int i = 1;

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Program8_Taking_ScreenShots");
		
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement username = driver.findElement(By.cssSelector("input[class*='mai']"));
		username.sendKeys("sasmita");
		Thread.sleep(5000);
		driver.close();
		
	}	
		public static void getScreenshot() throws IOException
		{
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\Users\\IBM_ADMIN\\Desktop\\steps" + i + ".png"));
		i++;
		}
}

