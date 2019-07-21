import org.testng.annotations.Test;

public class prioritysettings1 {
  @Test(priority=2)
  public void test1() 
  {
	  System.out.println("test1 is running");
	  
  }
  @Test(priority=1)
  public void test2() 
  {
	  System.out.println("test2 is running");
	  
  }
  @Test(priority=3)
  public void abc() 
  {
	  System.out.println("abc is running");
	  
  }
}
