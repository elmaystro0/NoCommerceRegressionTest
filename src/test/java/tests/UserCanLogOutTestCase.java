package tests;

import org.testng.annotations.Test;

import pages.LogOutPage;

public class UserCanLogOutTestCase extends TestBase{
	
	LogOutPage logoutobject;
	
	@Test
	public void UserCanLogOut()
	{
		logoutobject = new LogOutPage(driver);
		logoutobject.UserCanLogout();
	}

}
