package webdriver_jun12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class javascriptexecutor_draw_border {

	static int i = 1; 
	static WebDriver driver; 
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");        
		WebElement login;         
		login = driver.findElement(By.linkText("Log in"));  
		
		getscreenshot(login, driver);         
		login.click();         
		WebElement email = driver.findElement(By.id("Email"));         
		email.sendKeys("sampleemail@gmail.com");         
		getscreenshot(email, driver);         
		Thread.sleep(5000);        
		driver.close(); 
				
	}
	public static void getscreenshot(WebElement element, WebDriver driver) throws IOException     
	{         
		JavascriptExecutor js = (JavascriptExecutor) driver;         
		js.executeScript("arguments[0].style.border='3px solid red'", element);         
		
		File scrFile;         
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);         
		Files.copy(scrFile, new File("C:\\output\\step" + i + ".png"));         
		i++;     
		}

}
