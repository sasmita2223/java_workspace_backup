package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Day 2 Exercise:2");
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver dr = new ChromeDriver();
		
		//open the url
		dr.get("http://examples.codecharge.com/store/Default.php");
		
		//verify the title
		String title_actual = dr.getTitle();
		String title_expected = "Online Bookstore";
		if(title_actual.equals(title_expected))
		{
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
			}
		//select the database
		WebElement we = dr.findElement(By.name("category_id"));
		Select sel = new Select(we);
		//sel.selectByIndex(1); //working fine
		sel.selectByValue("HTML & Web design");   //not working
		//sel.selectByVisibleText("Programming"); //working
		
		//click on search button
		//dr.findElement(By.name("DoSearch")).click();
		
		//close the browser
		//dr.close();
		
		
		
		
		

}
}
