package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	By FirstName = By.id("BillingNewAddress_FirstName");
	By LastNAme = By.id("BillingNewAddress_LastName");
	By EmailAddress = By.id("BillingNewAddress_Email");
	By SelectCountry = By.id("BillingNewAddress_CountryId");
	By EnterYourCity = By.id("BillingNewAddress_City");
	By EnterYourAddress = By.id("BillingNewAddress_Address1");
	By EnterYourZipCode = By.id("BillingNewAddress_ZipPostalCode");
	By EnterYourPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
	By continueBTN = By.name("save");
	By SelectShippingMethod = By.id("shippingoption_1");
	By continueshippingBTN = By.cssSelector("button.button-1.shipping-method-next-step-button");
	By ContinuePaymentBTN = By.cssSelector("button.button-1.payment-method-next-step-button");
	By ContinueMoneyConfirmation = By.cssSelector("button.button-1.payment-info-next-step-button");
	By ConfirmOrder = By.cssSelector("button.button-1.confirm-order-next-step-button");
	By successMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[1]/strong");
	public String SuccessMessageText;

	public void UserCanenterhisdetailsforshipping()
	{
		select = new Select(driver.findElement(SelectCountry));
		select.selectByVisibleText("Egypt");
		driver.findElement(EnterYourCity).sendKeys("Cairo");
		driver.findElement(EnterYourAddress).sendKeys("New Cairo");
		driver.findElement(EnterYourZipCode).sendKeys("12345");
		driver.findElement(EnterYourPhoneNumber).sendKeys("1234567890");
		driver.findElement(continueBTN).click();
		driver.findElement(SelectShippingMethod).click();
		driver.findElement(continueshippingBTN).click();
		driver.findElement(ContinuePaymentBTN).click();
		driver.findElement(ContinueMoneyConfirmation).click();
		driver.findElement(ConfirmOrder).click();
		SuccessMessageText = driver.findElement(successMessage).getText();
	}
}
