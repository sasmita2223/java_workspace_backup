package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7_CSS_Selector_String_Contains {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program7_CSS_Selector_String_Contains");
		
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement username = driver.findElement(By.cssSelector("input[class*='mai']"));
		username.sendKeys("sasmita");
		Thread.sleep(5000);
		driver.close();

	}

}
