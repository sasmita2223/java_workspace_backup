package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor_scrolling_browser {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		
		scroll(driver);
				
	}
	
	public static void scroll(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
	}
	
}
