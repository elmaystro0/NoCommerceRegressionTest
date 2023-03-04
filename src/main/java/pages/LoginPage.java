package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}	
	
	By Email = By.id("Email");
	By Password = By.id("Password");
	By LoginBTN = By.cssSelector("button.button-1.login-button");
	public  WebElement LogOutBTN;
	
	public void RegisteredUserCanLogin(String EmailTXT, String PasswordTXT) 
	{
		driver.findElement(Email).sendKeys(EmailTXT);
		driver.findElement(Password).sendKeys(PasswordTXT);
		driver.findElement(LoginBTN).click();;
		LogOutBTN = driver.findElement(By.cssSelector("a.ico-logout"));
		
	}
	public void UserCanLogOut()
	{
		LogOutBTN.click();
	}



}
