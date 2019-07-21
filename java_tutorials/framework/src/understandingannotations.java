import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class understandingannotations {
  @Test
  public void test1()
  {
	  System.out.println("test1 is running");
  }
  @Test
  public void test2()
  {
	  System.out.println("test2 is running");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("before method is running");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("after method is runnning");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("before class is running");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("after class is runnig");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before test is running");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test is running");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("before suite is running");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("after suite is running");
  }

}
