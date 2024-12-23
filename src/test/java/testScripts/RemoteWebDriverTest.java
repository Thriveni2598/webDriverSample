package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoteWebDriverTest {
	WebDriver driver;
  @Test
  public void test() throws MalformedURLException {
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  
	  
	  String strHub = "http://10.0.12.7:4444 ";
	  
	  driver = new RemoteWebDriver(new URL(strHub),options);
	  
	  driver.get("https://www.google.com/");
	  WebElement searchbox= driver.findElement(By.id("APjFqb"));
	  searchbox.sendKeys("Java tutorials");
	  searchbox.submit();
	  System.out.println("Page title..."+ driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Java tutorials - Google Search");
	  
  }
}