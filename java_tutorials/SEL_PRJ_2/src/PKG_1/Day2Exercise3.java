package PKG_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Day 2 Exercise:3");
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
		//count the total values from the Search Products combo box
		
		
	}

}
