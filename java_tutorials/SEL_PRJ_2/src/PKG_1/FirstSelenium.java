package PKG_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("selenium");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\chromedriver_win32\\chromedriver75.exe");
		
		WebDriver dr = new ChromeDriver();  // launch chrome page
		
		dr.get("https://www.facebook.com");  // launch facebook
		
		 //textbox
		 
		 /* dr.findElement(By.id("email")).sendKeys("sasmitasahoo1@gmail.com");  // puts the email name
		
		dr.findElement(By.name("pass")).sendKeys("password#123");  // puts the password
		
		dr.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click(); */  // click on the click button
		
		
		//dropdown 
		WebElement we2 = dr.findElement(By.xpath("//*[@id=\"day\"]"));
		Select sel = new Select(we2);
		//sel.selectByVisibleText("6");
		sel.selectByValue("11");
		
		
		WebElement we3 = dr.findElement(By.xpath("//*[@id=\"month\"]"));
		Select sel3 = new Select(we3);
		//sel3.selectByIndex(9);
		sel3.selectByValue("11");
		
		/*//radio button (here array-list use since all the radio button share the same prop. of name sex & dependent of each other)
		List rb = dr.findElements(By.name("sex"));
		((WebElement)rb.get(1)).click(); */
		
		
	}

}
