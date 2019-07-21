package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Day 2 Exercise:4");
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
		sel.selectByIndex(2);

		//click on search button
		dr.findElement(By.name("DoSearch")).click();
		
		//click on Web Database Development link
		//driver.findElement(By.linkText("View Profile")).click() -- for href for <a
		
		dr.findElement(By.linkText("Web Database Development")).click();
		
		//storing the default value 1 from the field 'qty' in a variable
		//driver.findElement(By.id("Text1")).sendKeys(curName = "My Curriculum" + genData.generateRandomAlphaNumeric(10));
		
		//store the default values & display it
		
		WebElement we1 = dr.findElement(By.xpath("//input[@name='quantity']"));
		String s = we1.getAttribute("value");
		System.out.println("value :" + s);
		
		dr.findElement(By.name("Insert1")).click();
		
		//verify the delete Check Box is on or off
		
		boolean cs = dr.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		boolean fs = true;
		
		if (cs==true)
		{
			System.out.println("Delete checkbox is ON");
		}
		else
			System.out.println("Delete checkbox is OFF");
		
		
				
				//close the browser
		//		dr.close();

	}

}
