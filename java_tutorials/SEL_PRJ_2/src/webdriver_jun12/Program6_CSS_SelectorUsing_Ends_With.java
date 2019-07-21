package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6_CSS_SelectorUsing_Ends_With {



		public static void main(String[] args) throws InterruptedException {
			System.out.println("Program6_CSS_SelectorUsing_Ends_With");
			
			System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			
			WebElement username = driver.findElement(By.cssSelector("input[class$=il]"));
			username.sendKeys("sasmita");
			Thread.sleep(5000);
			driver.close();

	}

}
