package tests;

import org.testng.annotations.Test;

import pages.ShopCartPage;
import pages.WishListPage;

public class AddToShopCartTestCase extends TestBase{
	WishListPage wishobject;
	ShopCartPage shopobject;

	@Test(priority = 1)
	public void UserCanAdditemtotheshopcart()
	{
		wishobject = new WishListPage(driver);
		wishobject.additemtoshopcart();
	}
	@Test(priority = 2, enabled = false)
	public void removefromshopcart() throws InterruptedException
	{
		shopobject = new ShopCartPage(driver);
		shopobject.removefromshopcart();
		System.out.println(shopobject.ConfirmEmptyShopCart);
	}
}
