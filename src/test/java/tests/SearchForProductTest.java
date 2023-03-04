package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.RegisterationPage;

public class SearchForProductTest extends TestBase {
	HomePage HomeObject;
	RegisterationPage RegisterObject;
	LoginPage LoginObject;
	ProductPage ProductObject;
	
	Faker data = new Faker();
	String FirstNameTXT = data.name().firstName();
	String LastNameTXT = data.name().lastName();
	String EmailTXT = data.internet().emailAddress();
	String PasswordTXT = data.number().digits(8).toString();
	String SearchWordTXT = "mac";
	
	
	@Test(priority =  1, enabled = false)
	public void UserCanRegisterandLoginSuccessfully()
	{
		HomeObject = new HomePage(driver);
		HomeObject.openregisterationpage();
		RegisterObject = new RegisterationPage(driver);
		RegisterObject.UserCanRegisterSuccessfully(FirstNameTXT, LastNameTXT, EmailTXT, PasswordTXT);
		System.out.println
		("First Name : " + FirstNameTXT + "\n" + "Last Name : " + LastNameTXT + "\n" + "Email Address : "+ EmailTXT + "\n" + "Password : "+ PasswordTXT);
		HomeObject.openloginpage();
		LoginObject = new LoginPage(driver);
		LoginObject.RegisteredUserCanLogin(EmailTXT, PasswordTXT);
	}
	
	@Test(priority = 2)
	public void SearchForProduct() throws InterruptedException
	{
		HomeObject = new HomePage(driver);
		ProductObject = new ProductPage(driver);
		HomeObject.SearchforProduct(SearchWordTXT);
		System.out.println(ProductObject.SearChitemName);
	}
}
