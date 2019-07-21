package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_logoutPage {
	
	WebDriver driver;
	WebElement logout;
	
	POM_logoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void clickLogout()
	{
		logout = driver.findElement(By.linkText("Log out"));
		logout.click();
		
	}

}
