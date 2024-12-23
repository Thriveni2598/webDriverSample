package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AssignmentWebstore {
  public void Webstore()  {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://danube-web.shop/");
	  driver.findElement(By.name("searchbar")).sendKeys("1498");
	  driver.findElement(By.id("button-search")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  WebElement details= driver.findElement(By.className("preview"));
	  System.out.println(details.isDisplayed());
	  if(details.isDisplayed())
	  {
	  details.click();
	  }
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	  driver.navigate().back();
	  driver.findElement(By.linkText("Sci-Fi")).click();
	  driver.findElement(By.xpath("//li[@class='preview']//div[contains(text(),'Celsius 233')]")).click();
	  driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	  
	  driver.findElement(By.xpath("//button[contains(text( ),'Checkout')]")).click();
	  
	  driver.findElement(By.id("s-name")).sendKeys("Thriveni");
	  driver.findElement(By.id("s-surname")).sendKeys("Maha");
	  driver.findElement(By.id("s-address")).sendKeys("Bangalore");
	  driver.findElement(By.id("s-zipcode")).sendKeys("12345");
	  driver.findElement(By.id("s-city")).sendKeys("Bangalore");
	  driver.findElement(By.xpath("//button[text()='Buy']")).click();
	  
	  
	  
  }
}
