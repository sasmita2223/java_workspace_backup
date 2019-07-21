package webdriver_jun12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program9_handling_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\webdriver_screen\\popup.html");
		WebElement button1 = driver.findElement(By.id("b1"));
		button1.click();
		Thread.sleep(5000);
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.close();
		
	}

}
