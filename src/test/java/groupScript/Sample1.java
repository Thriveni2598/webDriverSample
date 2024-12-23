package groupScript;

import org.testng.annotations.Test;

public class Sample1 {
  @Test(groups="featureOne")
  public void testone() {
	  System.out.println("Test1 in Sample one");
  }
  @Test(groups="featureTwo")
  public void testtwo() {
	  System.out.println("Test2 in Sample one");
  }
  @Test(groups="featureThree")
  public void testthree() {
	  System.out.println("Test3 in Sample one");
  }
  @Test(groups="featureFour")
  
  public void testfour() {
	  System.out.println("Test4 in Sample one");
  }
}
