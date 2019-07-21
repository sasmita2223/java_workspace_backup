package webdriver_jun12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtest1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream("C:\\senium\\java_tutorials\\SEL_PRJ_2\\src\\webdriver_jun12\\demo.properties");
		obj.load(objfile);
		
		
		String loginlink = obj.getProperty("login");
		String username = obj.getProperty("username");
		String password = obj.getProperty("password");
		
        driver.findElement(By.linkText(loginlink)).click(); 
		driver.findElement(By.name(username)).sendKeys("sasmita");
		driver.findElement(By.name(password)).sendKeys("welcome2ibm");
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
