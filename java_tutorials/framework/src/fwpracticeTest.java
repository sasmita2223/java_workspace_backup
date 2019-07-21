import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class fwpracticeTest {

  @Test
  public void AddNumbersTest() {

	  fwpractice obj = new fwpractice();
	  int x = 10, y = 10, expresult = 20;
	  int actualresult = obj.AddNumbers(x, y);
	  
	  assertEquals(actualresult, expresult);
	  
	  
  }
	  
  
  
  }
