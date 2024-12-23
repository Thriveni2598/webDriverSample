package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonutils.utility;

public class GooglePageTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;

@BeforeTest
public void setupExtent() {
	extentReports= new ExtentReports();
	spark = new ExtentSparkReporter("test-output/SparkReport.html")
			.viewConfigurer()
			.viewOrder()
			.as(new ViewName[] {
					ViewName.DASHBOARD,
					ViewName.TEST,
					ViewName.AUTHOR,
					ViewName.DEVICE,
					ViewName.LOG
			}).apply();
	
	extentReports.attachReporter(spark);
	
}

@BeforeMethod	
public void setup() {
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
}
@AfterMethod
public void teardown(ITestResult result) {
	extentTest.assignAuthor("AutomationTester1")
	.assignCategory("Regression")
	.assignDevice(System.getProperty("os.name"))
	.assignDevice(System.getProperty("os.version"));
	if(ITestResult.FAILURE == result.getStatus())
	{
		extentTest.log(Status.FAIL, result.getThrowable().getMessage());
		String strPath = utility.getScreenshotPath(driver);
		extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(strPath).build());
	}
	driver.close();
}

@AfterTest
public void finishExtent(){
	extentReports.flush();
}
  @Test
  public void seleniumSearchTest() throws InterruptedException {
	  
	 extentTest = extentReports.createTest("Selenium search Test");
	  driver.get("https://www.google.com/");
	  WebElement searchbox= driver.findElement(By.id("APjFqb"));
	  searchbox.sendKeys("Selenium tutorials");
	  searchbox.submit();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getTitle(), "Selenium Tutorials - Google Search");

	  }
  @Test
  public void JavaSearchTest() throws InterruptedException {
	  
	  extentTest = extentReports.createTest("Java search Test");
	  driver.get("https://www.google.com/");
	  WebElement searchbox= driver.findElement(By.id("APjFqb"));
	  searchbox.sendKeys("Java tutorials");
	  searchbox.submit();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getTitle(), "Java tutorials - Google Search");
	  
	  }
}
