package PKG_1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Day 2 Exercise:1");
		
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver dr = new ChromeDriver();
		
		//open the url
		dr.get("http://demowebshop.tricentis.com");
		//String title = dr.getTitle();
		//System.out.println(dr.getTitle());
		//System.out.println(dr.findElement(By.tagName("title")).getText());
		
		/*
		//verify the title
		String title_actual = dr.getTitle();
		String title_expected = "Demo Web Shop";
		if(title_actual.equals(title_expected))
		{
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		
		 //Click on the register link & verify the title
		dr.findElement(By.className("ico-register")).click();
		
		String title_actual1 = dr.getTitle();
		String title_expected1 = "Demo Web Shop. Register";
		if(title_actual1.equals(title_expected1))
		{
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
			}
		
		
		//Entering the inputs
		//List rb = dr.findElements(By.name("sex"));
		//((WebElement)rb.get(1)).click();
		
		List rb = dr.findElements(By.name("Gender"));
		((WebElement)rb.get(0)).click(); 
		dr.findElement(By.name("FirstName")).sendKeys("Sasmita");
		dr.findElement(By.name("LastName")).sendKeys("sahoo");
		dr.findElement(By.id("Email")).sendKeys("wel2come2ib7yjcd@gmail.com");
		dr.findElement(By.name("Password")).sendKeys("welcome2ibm");
		dr.findElement(By.name("ConfirmPassword")).sendKeys("welcome2ibm");
		
		//click on submit
		dr.findElement(By.id("register-button")).click();
		
		//click on logout
		dr.findElement(By.className("ico-logout")).click();
		
		//close the browser
		dr.close();
		
		*/
		
		
		
		
		
		
		
	}

}
