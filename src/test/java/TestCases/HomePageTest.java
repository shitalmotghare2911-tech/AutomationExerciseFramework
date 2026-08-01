package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

public class HomePageTest extends BaseClass
{
	@Test
	public void verifyHomePageTitle()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Automation Exercise";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("\"Home Page Verified Successfully\"");
	}

}
