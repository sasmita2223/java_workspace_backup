import org.testng.annotations.Test;

public class tc2 {
  @Test
  public void f() throws InterruptedException {
	  int j;
	  for(j=0;j<10;j++) 
	  {
		  System.out.println("j is " + j);
		  Thread.sleep(2000);
	  }
	  
	  //System.out.println("testcase2 is running");
  }
}
