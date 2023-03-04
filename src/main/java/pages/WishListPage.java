package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends PageBase{

	public WishListPage(WebDriver driver) {
		super(driver);
	}
	By CheckBoxontheItem = By.name("addtocart");
	By addtocartBTN = By.name("addtocartbutton"); 

	
	
	public void additemtoshopcart()
	{
		driver.findElement(CheckBoxontheItem).click();
		driver.findElement(addtocartBTN).click();
	}
	

}
