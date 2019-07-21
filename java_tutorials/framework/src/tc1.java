import org.testng.annotations.Test;

public class tc1 {
  @Test
  public void f() throws InterruptedException 
  {
	  int i;
	  for(i=0;i<10;i++) 
	  {
		  System.out.println("i value is " + i);
		  Thread.sleep(2000);
	  }
	  
	//System.out.println("testcase1 is runnig");  
	  
  }
}
