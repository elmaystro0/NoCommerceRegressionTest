package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utilities.util;

public class TestBase {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void openURL()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.navigate().to("https://demo.nopcommerce.com/");
	}
	
	@AfterSuite
	public void ExitWebsite()
	{
		driver.quit();
	}
	@AfterMethod
	public void TakeScreenShots(ITestResult result)
	{
		util.TakeScreenShot(driver, result.getName());
	}
}
