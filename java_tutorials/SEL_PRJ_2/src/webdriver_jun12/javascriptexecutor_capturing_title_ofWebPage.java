package webdriver_jun12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor_capturing_title_ofWebPage {

		static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");         
		String x= getTitle(driver);         
		System.out.println(x);             
		driver.close(); 
			
	}
	public static String getTitle(WebDriver driver)     
	{         
		JavascriptExecutor js = (JavascriptExecutor) driver;         
		String title = js.executeScript("return document.title;").toString();         
		return title;     
	}

}
