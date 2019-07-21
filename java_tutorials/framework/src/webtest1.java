import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class webtest1 {
	WebDriver driver;
	WebElement register, firstname, lastname;
	
	
  @Test
  public void performLogin() 
  {
	register = driver.findElement(By.linkText("REGISTER"));
	register.click();
	firstname = driver.findElement(By.name("firstname"));
	lastname = driver.findElement(By.name("lastname"));
	firstname.sendKeys("sasmita");
	lastname.sendKeys("sahoo");
	  
  }
  @BeforeTest
  public void launchBrowser() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  System.out.println("prints first");
	  driver.get("http://www.newtours.demoaut.com");
	  System.out.println("application is launched");
	  Thread.sleep(10000);
	  
  }

  @AfterTest
  public void closeBrowser() 
  {
	  driver.close();
	  System.out.println("Browser is closed");
  }
  
  
}
