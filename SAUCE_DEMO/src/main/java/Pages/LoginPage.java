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
	By signup = By.xpath(" //a[@href=\"/login\"]");
	By Email = By.xpath("//input[@data-qa=\"login-email\"]");
	By password = By.xpath("//input[@data-qa=\"login-password\"]");
	
	By Login = By.xpath("//input[@data-qa=\"login-button\"]");
	
	//Methods
	
	public void ClickSignUp()
	{
		driver.findElement(signup).click();
	}
	
	public void EnterEmail()
	{
		driver.findElement(Email).sendKeys("shital@gmail.com");
	}
	
	public void EnterPassword()
	{
		driver.findElement(password).sendKeys("Pass@123");
	}
	public void ClickLoginBtn()
	{
		driver.findElement(Login).click();
	}
	

	

}
