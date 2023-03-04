package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;

public class RegisterationTest extends TestBase{
	HomePage HomeObject;
	RegisterationPage RegisterObject;
	LoginPage LoginObject;
	Faker data = new Faker();
	String FirstNameTXT = data.name().firstName();
	String LastNameTXT = data.name().lastName();
	String EmailTXT = data.internet().emailAddress();
	String PasswordTXT = data.number().digits(8).toString();
	
	@Test(priority = 1)
	public void UserCanRegisterSuccessfully()
	{
		HomeObject = new HomePage(driver);
		HomeObject.openregisterationpage();
		RegisterObject = new RegisterationPage(driver);
		RegisterObject.UserCanRegisterSuccessfully(FirstNameTXT, LastNameTXT, EmailTXT, PasswordTXT);
		System.out.println
		("First Name : " + FirstNameTXT + "\n" + "Last Name : " + LastNameTXT + "\n" + "Email Address : "+ EmailTXT + "\n" + "Password : "+ PasswordTXT);
		System.out.println(RegisterObject.RegisterationSuccessfulMessage.getText());
		Assert.assertTrue(RegisterObject.RegisterationSuccessfulMessage.getText().contains("completed"));
	}
	@Test(priority = 2)
	public void UserCanLogin() throws InterruptedException
	{
		HomeObject.openloginpage();
		LoginObject = new LoginPage(driver);
		LoginObject.RegisteredUserCanLogin(EmailTXT, PasswordTXT);
		System.out.println(LoginObject.LogOutBTN.getText());
		Assert.assertTrue(LoginObject.LogOutBTN.getText().contains("out"));
	}
	@Test(dependsOnMethods = "UserCanLogin", enabled = false)
	public void UserCanLogout()
	{
		LoginObject.UserCanLogOut();
	}

}
