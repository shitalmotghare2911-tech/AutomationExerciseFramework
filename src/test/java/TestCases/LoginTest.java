package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass
{
	@Test
	public void verifyValidLogin()
	{
		LoginPage login = new LoginPage(driver);
	    login.ClickSignUp();
	    login.EnterEmail("shital@gmail.com");
	    login.EnterPassword("password@123");
	    login.ClickLoginBtn();
	}
	@Test
	public void verifyInvalidLogin()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickSignUp();
		login.EnterEmail("1234");
		login.EnterPassword("....");
		login.ClickLoginBtn();
		

	}
	

}
