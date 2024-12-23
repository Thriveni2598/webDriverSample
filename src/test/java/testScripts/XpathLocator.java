package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathLocator {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login ");
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.xpath("//button[@class='radius']")).click();
	  
  }
  
}
