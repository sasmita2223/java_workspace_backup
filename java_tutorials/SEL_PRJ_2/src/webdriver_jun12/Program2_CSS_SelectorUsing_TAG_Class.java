package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_CSS_SelectorUsing_TAG_Class {

	public static void main(String[] args) throws InterruptedException {
		
		
System.out.println("Program2_CSS_SelectorUsing_TAG_Class");
		
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement username = driver.findElement(By.cssSelector("input.email"));
		username.sendKeys("sasmita");
		Thread.sleep(5000);
		driver.close();

	}

}
