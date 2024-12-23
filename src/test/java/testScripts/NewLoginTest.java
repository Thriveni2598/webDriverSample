package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewLoginTest {
	WebDriver driver;
	Properties prop;
	
	
  @BeforeTest
  public void setup() throws IOException {
	  prop = new  Properties();
	  String path = System.getProperty("user.dir") +
			  "//src//test//resources//Config.Properties";
	  FileInputStream fin = new FileInputStream(path);
	  prop.load(fin);
	  String strBrowser = prop.getProperty("browser");
	  if(strBrowser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (strBrowser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
		@Test
		  public void ValidLogin() {
			  
			  driver.get(prop.getProperty("url"));
			  driver.findElement(By.id("username")).sendKeys("tomsmith");
			  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
			  driver.findElement(By.className("radius")).click();
			  driver.findElement(By.partialLinkText("Elemental")).click();
			  
	}
	  
			  
	  
  }

