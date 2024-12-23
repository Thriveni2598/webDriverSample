package groupScript;

import org.testng.annotations.Test;

public class Sampletwo {
  @Test(groups="featureTwo")
 
	  public void testOne() {
		  System.out.println("Test21 in Sample one");
	  }
  @Test
	  public void testTwo() {
		  System.out.println("Test22 in Sample one");
	  }
  @Test
	  public void testThree() {
		  System.out.println("Test23 in Sample one");
	  }
  @Test
	  
	  public void testFour() {
		  System.out.println("Test24 in Sample one");
	  }
  }

