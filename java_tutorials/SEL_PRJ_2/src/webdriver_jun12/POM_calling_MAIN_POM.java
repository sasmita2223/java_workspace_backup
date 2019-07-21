package webdriver_jun12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_calling_MAIN_POM {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		//home_page
		POM_homePage home = new POM_homePage(driver);
		home.clickLoginLink();
		
		//login_page
		POM_loginPage login = new POM_loginPage(driver);
		login.enterUsername("cvenkata_raman@rediffmail.com");
		login.enterPassword("satyam123$");
		login.clickSubmit();
		
		//logout_page
		POM_logoutPage logout = new POM_logoutPage(driver);
		logout.clickLogout();
		
		driver.close();
		
		
		
	}

}
