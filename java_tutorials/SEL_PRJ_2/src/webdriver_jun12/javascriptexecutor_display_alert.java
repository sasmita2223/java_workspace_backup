package webdriver_jun12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor_display_alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Javascript message box')");
		
			
	}

}
