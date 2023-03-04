package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage extends PageBase {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	By ProductName = By.cssSelector("strong.current-item");
	By AddtoWhiteListBTN = By.id("add-to-wishlist-button-4");
	By WhiteListLink = By.linkText("wishlist");
	By ProductNameinwhitelist = By.cssSelector("a.product-name");
	By UpdateQuantity = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input");
	By UpdateWishListBTN = By.id("updatecart");
	By unitPrice = By.cssSelector("span.product-unit-price");
	By TotalPrice = By.cssSelector("span.product-subtotal");
	By RemoveBTN = By.name("updatecart");
	By EmptywishList = By.cssSelector("div.no-data");
	public String ProductTitle;
	public String SearChitemName;
	public String TotalItemsPrice;
	public String OneItemPrice;
	public String EmptyWishListConfirm;
	
	public void addtowhitelist(String QuantityNumber) throws InterruptedException
	{
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		SearChitemName = driver.findElement(ProductName).getText();
		driver.findElement(AddtoWhiteListBTN).click();
		driver.findElement(WhiteListLink).click();
		ProductTitle = driver.findElement(ProductNameinwhitelist).getText();
		 driver.findElement(UpdateQuantity).clear();
		 driver.findElement(UpdateQuantity).sendKeys(QuantityNumber);
		driver.findElement(UpdateWishListBTN).click();
		OneItemPrice = driver.findElement(unitPrice).getText();
		TotalItemsPrice = driver.findElement(TotalPrice).getText();		
	}
	public void removefromthewishlist()
	{
		driver.findElement(RemoveBTN).click();
		EmptyWishListConfirm = driver.findElement(EmptywishList).getText();
	}
	
	
	
}
