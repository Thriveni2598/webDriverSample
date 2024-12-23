package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTipExecution {
	WebDriver driver;
  @Test
  public void Tooltip() {
	  driver= new ChromeDriver();
	  driver.get("https://www.jquery.com");
	  
  }
}
