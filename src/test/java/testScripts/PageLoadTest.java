package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageLoadTest {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	  
  }
}
