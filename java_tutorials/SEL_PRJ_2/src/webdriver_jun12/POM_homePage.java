package webdriver_jun12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_homePage {

	WebDriver driver;
	WebElement login;
	
	POM_homePage (WebDriver driver)
	{
		this.driver = driver;
		}
	
	void clickLoginLink()
	{
		login = driver.findElement(By.linkText("Log in"));
		login.click();
}
}

