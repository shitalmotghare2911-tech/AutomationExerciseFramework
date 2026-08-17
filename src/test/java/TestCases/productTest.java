package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Pages.ProductPage;

public class productTest extends BaseClass
{
	@Test
	public void verifyproductpage()
	{
		HomePage homepage = new HomePage(driver);
		ProductPage productpage = homepage.clickProducts();
		Assert.assertTrue(productpage.isProductpagedisplayed());	
	}
	@Test
	public void searchProductTest()
	{
		HomePage homepage = new HomePage(driver);
		ProductPage productpage = homepage.clickProducts();
		productpage.SearchProduct("Blue top");
		Assert.assertTrue(productpage.isSearchedProductsDisplayed());
	}
	
	
	
}
