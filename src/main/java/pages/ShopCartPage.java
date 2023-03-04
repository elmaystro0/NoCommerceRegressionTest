package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopCartPage extends PageBase{

	public ShopCartPage(WebDriver driver) {
		super(driver);
	}
	By RemoveFromUpdateCart = By.cssSelector("button.remove-btn");
	By ShopCartisEmpty = By.cssSelector("div.no-data");
	By AcceptTermsAndConditions = By.id("termsofservice");
	By CheckoutBTN = By.id("checkout");
	public String ConfirmEmptyShopCart;
	
	public void removefromshopcart()
	{
		driver.findElement(RemoveFromUpdateCart).click();
		ConfirmEmptyShopCart = driver.findElement(ShopCartisEmpty).getText();
	}
	
	public void UserCanCheckOut()
	{
		driver.findElement(AcceptTermsAndConditions).click();
		driver.findElement(CheckoutBTN).click();
	}

}
