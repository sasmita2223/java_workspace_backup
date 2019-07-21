package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor_scroll_into_Perticular_Element {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
        driver.findElement(By.linkText("REGISTER")).click();         
        WebElement email =  driver.findElement(By.name("email"));         
        scroll(email, driver); 
        
	}
	public static void scroll(WebElement element, WebDriver driver)     
	{         
		JavascriptExecutor js = (JavascriptExecutor) driver;         
		js.executeScript("arguments[0].scrollIntoView(true)", element);           
		
	}
	
}
