package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;

public class HomePageTest extends BaseClass
{
	@Test
	public void verifyHomePageTitle()
	{
		HomePage homePage = new HomePage(driver);

		String title = homePage.getPageTitle();
		Assert.assertTrue(title.contains("Automationki Exercise"),
		"Home page title is incorrect");
	}

}
