package PKG_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class table_data {

	public static void main(String[] args) {
		System.out.println("webtable");
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver dr = new ChromeDriver();
		
		//open the url
		dr.get("https://www.w3schools.com/html/html_tables.asp");
		
		int r = 2, c=1;
		String txt, xp = "//*[@id='customers']/tbody/tr["+ r + "]/td["+ c + "]";
		
		for(r=2;r<=7;r++)
		{
			for(c=1;c<=3;c++)
			{
				xp = "//*[@id='customers']/tbody/tr["+ r + "]/td["+ c + "]";
				txt = dr.findElement(By.xpath("xp")).getText();
				System.out.println(txt + "");
			}
			System.out.println();
		}
	}

}
