package tests;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.ShopCartPage;

public class CheckOutTestCase extends TestBase{

	ShopCartPage shopobject;
	CheckOutPage checkoutobject;
	
	@Test
	public void UserCanCheckOuthissearcheditem()
	{
		shopobject = new ShopCartPage(driver);
		checkoutobject = new CheckOutPage(driver);
		shopobject.UserCanCheckOut();
		checkoutobject.UserCanenterhisdetailsforshipping();
		System.out.println(checkoutobject.SuccessMessageText);
	}
}
