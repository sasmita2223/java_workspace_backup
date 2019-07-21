package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_loginPage {
	
	WebDriver driver;
	WebElement username, password, submit;
	
	POM_loginPage(WebDriver driver)
	{
		this.driver = driver;
		}
	void enterUsername(String s)
	{
		username = driver.findElement(By.name("Email"));
		username.sendKeys(s);
	}
	void enterPassword(String s)
	{
		password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.sendKeys(s);
	}
	void clickSubmit()
	{
		submit = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		submit.click();
	}
	
	
		
	

}
