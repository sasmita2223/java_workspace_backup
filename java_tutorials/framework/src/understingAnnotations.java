import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class understingAnnotations {
  @Test
  public void test1() 
  {
	  System.out.println("test1 is running"); //3rd prints
  }
  @Test
  public void test2() 
  {
	  System.out.println("test2 is running"); // 5th
  }

  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println(" Before method is working"); //2nd print -- 4th
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println(" after method is working"); //4th prints -- 7th
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before test is working"); //1st print
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test is working");  //8th
  }

}
