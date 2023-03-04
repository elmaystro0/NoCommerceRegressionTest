package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
//	WebElement RegisterLink = driver.findElement(By.cssSelector("a.ico-register"));
//	WebElement LoginLink = driver.findElement(By.className("a.ico-login"));
	By RegisterLink = By.cssSelector("a.ico-register");
	By LoginLink = By.cssSelector("a.ico-login");
	By SearchField = By.id("small-searchterms");
	By SearchBTN = By.cssSelector("button.button-1.search-box-button");
	By ResultofProducts = By.linkText("Apple MacBook Pro 13-inch");
 
	public void openregisterationpage()
	{
		driver.findElement(RegisterLink).click();
	}
	public void openloginpage()
	{
		driver.findElement(LoginLink).click();
	}
	public void SearchforProduct(String Searchword) throws InterruptedException
	{
		driver.findElement(SearchField).sendKeys(Searchword);
	
		driver.findElement(SearchBTN).click();
	
		driver.findElement(ResultofProducts).click();

	}

}
