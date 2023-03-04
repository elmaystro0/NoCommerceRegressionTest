package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage extends PageBase{

	public RegisterationPage(WebDriver driver) {
		super(driver);
		Select select;

	}
	By MaleGender = By.id("gender-male");
	By FirstName = By.id("FirstName");
	By LastName = By.id("LastName");
	By BirthDay = By.name("DateOfBirthDay");
	By BirthMonth = By.name("DateOfBirthMonth");
	By BirthYear = By.name("DateOfBirthYear");
	By Email = By.id("Email");
	By Password = By.id("Password");
	By confirmPassword = By.id("ConfirmPassword");
	By RegisterBTN = By.id("register-button");
	public WebElement RegisterationSuccessfulMessage;

	public void UserCanRegisterSuccessfully (String FirstNameTXT, String LastNameTXT,String EmailTXT, String PasswordTXT)
	{
		driver.findElement(FirstName).sendKeys(FirstNameTXT);
		driver.findElement(LastName).sendKeys(LastNameTXT);
		select = new Select(driver.findElement(BirthDay));
		select.selectByIndex(5);
		select = new Select(driver.findElement(BirthMonth));
		select.selectByIndex(5);
		select = new Select(driver.findElement(BirthYear));
		select.selectByVisibleText("1985");
		driver.findElement(Email).sendKeys(EmailTXT);
		driver.findElement(Password).sendKeys(PasswordTXT);
		driver.findElement(confirmPassword).sendKeys(PasswordTXT);
		driver.findElement(RegisterBTN).click();
		RegisterationSuccessfulMessage = driver.findElement(By.cssSelector("div.result"));
	}


}
