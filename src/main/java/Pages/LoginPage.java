package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	By signup = By.xpath("//a[@href=\"/login\"]");
	By Email = By.xpath("//input[@data-qa=\"login-email\"]");
	By password = By.xpath("//input[@data-qa=\"login-password\"]");
	
	By Login = By.xpath("//button[@data-qa=\"login-button\"]");
	By loginError = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");
	
	//Methods
	
	public void ClickSignUp()
	{
		driver.findElement(signup).click();
	}
	
	public void EnterEmail(String userName)
	{
		driver.findElement(Email).sendKeys(userName);
	}
	
	public void EnterPassword(String userPass)
	{
		driver.findElement(password).sendKeys(userPass);
	}
	public void ClickLoginBtn()
	{
		driver.findElement(Login).click();
	}

	public String getErrorMessage() {
		return driver.findElement(loginError).getText();
		// TODO Auto-generated method stub
		
	}

	
	
	

	

}
