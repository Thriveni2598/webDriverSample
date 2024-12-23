package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayTest {
  @Test
  public void displayEleTest() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationbookstore.dev/");
	  driver.findElement(By.id("searchBar")).sendKeys("Text");
	  WebElement but = driver.findElement(By.cssSelector("a[title='Clear text']"));
	  System.out.println(but.isDisplayed());
	  if(but.isDisplayed())
	  {
		  but.click();
	  }
	  
	  
  }
}
