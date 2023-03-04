package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.ProductPage;

public class AddToWishListTest extends TestBase {
	ProductPage ProductObject;
	Faker data = new Faker();
	String QuantityofItems = data.number().digits(1);
	
	@Test(priority = 1)
	public void AddtoWishListTestCase() throws InterruptedException
	{
		ProductObject = new ProductPage(driver);
		ProductObject.addtowhitelist(QuantityofItems);
		Assert.assertTrue(ProductObject.ProductTitle.contains("MacBook"));
		System.out.println("Number of Items is : " + QuantityofItems + " Items");
		System.out.println("The price of One item is : " + ProductObject.OneItemPrice);
		System.out.println("The Total Amount of the Items inside the Wish List is : " + ProductObject.TotalItemsPrice );
		System.out.println(ProductObject.ProductTitle);
	}
	@Test(priority = 2, enabled = false)
	public void RemovefromWishListtestCase()
	{
		ProductObject.removefromthewishlist();
		System.out.println(ProductObject.EmptyWishListConfirm);
	}

}
