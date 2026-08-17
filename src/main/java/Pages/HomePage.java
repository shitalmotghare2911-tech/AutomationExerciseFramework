package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    // Locators

    private By homeLink =
            By.xpath("//a[@href='/']");

    private By productsLink =
            By.xpath("//a[contains(text(),'Products')]");

    private By cartLink =
            By.xpath("//a[@href='/view_cart']");

    private By signupLoginLink =
            By.xpath("//a[contains(text(),'Signup / Login')]");

    private By testCasesLink =
            By.xpath("//a[contains(text(),'Test Cases')]");

    private By contactUsLink =
            By.xpath("//a[contains(text(),'Contact us')]");

    private By logoutLink =
            By.xpath("//a[contains(text(),'Logout')]");

    private By deleteAccountLink =
            By.xpath("//a[contains(text(),'Delete Account')]");


    // Constructor

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    // Actions

    public void clickHome() {
        driver.findElement(homeLink).click();
    }

    public ProductPage clickProducts() {
        driver.findElement(productsLink).click();
		return new ProductPage(driver);
		
    }

    public void clickCart() {
        driver.findElement(cartLink).click();
    }

    public void clickSignupLogin() {
        driver.findElement(signupLoginLink).click();
    }

    public void clickTestCases() {
        driver.findElement(testCasesLink).click();
    }

    public void clickContactUs() {
        driver.findElement(contactUsLink).click();
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }

    public void clickDeleteAccount() {
        driver.findElement(deleteAccountLink).click();
    }
    public String getPageTitle() {
        return driver.getTitle();
    }
}