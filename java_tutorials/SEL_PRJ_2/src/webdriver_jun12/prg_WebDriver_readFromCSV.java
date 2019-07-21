package webdriver_jun12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg_WebDriver_readFromCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver75.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		String datafile = "c:/output/data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(datafile));
        while ((line = br.readLine()) != null) 
        {
                    String[] data = line.split(cvsSplitBy);
                    driver.findElement(By.linkText("REGISTER")).click();
                    driver.findElement(By.name("firstName")).sendKeys(data[0]);
                    driver.findElement(By.name("lastName")).sendKeys(data[1]);
                    driver.findElement(By.name("userName")).sendKeys(data[2]);
                    driver.findElement(By.linkText("Home")).click();
}
	}

}
