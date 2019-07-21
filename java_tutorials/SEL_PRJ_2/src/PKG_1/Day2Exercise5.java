package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Day 2 Exercise:5");
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver dr = new ChromeDriver();
		
		//open the url
		dr.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
		//Fill the form
		
		dr.findElement(By.name("user_login")).sendKeys("selenium practice");
		dr.findElement(By.name("user_password")).sendKeys("welcome2ibm");
		dr.findElement(By.name("first_name")).sendKeys("sasmita");
		dr.findElement(By.name("last_name")).sendKeys("sahoo");
		dr.findElement(By.name("email")).sendKeys("sasmitasahoo1@gmail.com");
		
		WebElement we = dr.findElement(By.name("state_id"));
		Select sel = new Select(we);
		sel.selectByIndex(2);
		
		WebElement we1 = dr.findElement(By.name("country_id"));
		Select sel1 = new Select(we1);
		sel1.selectByIndex(1);
		//sel1.selectByValue("Albania");
		
		WebElement we2 = dr.findElement(By.name("gender_id"));
		Select sel2 = new Select(we2);
		sel2.selectByIndex(1);
		
		//submitting the form -- click on register
		//dr.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
		
		dr.findElement(By.name("Insert")).click();
		
		//closing the browser
		dr.close();
		
	}

}
