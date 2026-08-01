package TestCases;

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
	

}
