package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage 
{
	private WebDriver driver ;
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By productTitle = By.xpath("//h2[contains(text(), \"All Products\")]");
	private By searchbox = By.id("search_product");
	private By searchbutton = By.id("submit_search");

    private By searchedProducts =
            By.xpath("//h2[contains(text(),'Searched Products')]");
    
    private By FirstAddToCart = By.xpath("//div[@class=\"col-sm-9 padding-right\"]//div[1]//div[2]//div[2]//div[1]//a");
    
    private By FirstViewProduct = By.xpath("//div[@class=\"col-sm-4\"][1]//div[1]//div[2]//ul[1]//li[1]//a[1]");
  
    public boolean isProductpagedisplayed()
    {
    	return driver.findElement(productTitle).isDisplayed();
    }
   
    	public void SearchProduct(String productName) {

    	    WebDriverWait wait =
    	            new WebDriverWait(driver, Duration.ofSeconds(15));

    	    wait.until(
    	        ExpectedConditions.visibilityOfElementLocated(searchbox)
    	    ).sendKeys(productName);

    	    wait.until(
    	        ExpectedConditions.elementToBeClickable(searchbutton)
    	    ).click();
    	}
    
    public boolean isSearchedProductsDisplayed()
    {
    	    WebDriverWait wait =
    	            new WebDriverWait(driver, Duration.ofSeconds(15));

    	    return wait.until(
    	        ExpectedConditions.visibilityOfElementLocated(searchedProducts)
    	    ).isDisplayed();
    	}
    
    public void addToCart()
    {
    	driver.findElement(FirstAddToCart).click();
    }
    public ProductPage viewProduct()
    {
    	driver.findElement(FirstViewProduct).click();
    	return new ProductPage(driver);
    	
    }
	
		
}
