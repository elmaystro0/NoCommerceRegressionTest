package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends PageBase {

	public LogOutPage(WebDriver driver) {
		super(driver);
	}
	By LogOutBTN = By.cssSelector("a.ico-logout");
	public void UserCanLogout()
	{
		driver.findElement(LogOutBTN).click();
	}

}
