import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testngdemoTest {
  @Test
  public void f() 
  {
	  	
	  System.out.println("test case is under execution"); //prints 2nd
  }	
  @BeforeTest
  public void beforeTest() 
  {
	System.out.println("Browser opened");   //prints 1st
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Browser closed"); //prints last
  }

}
