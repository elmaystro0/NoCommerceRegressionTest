package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase 
{
	public WebDriver driver;
	public JavascriptExecutor Jse;
	public WebDriverWait wait;
	public Alert alert;
	public Select select;
	
	public PageBase(WebDriver driver)
	{
		this.driver = driver;
	}

}
