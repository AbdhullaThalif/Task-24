package pom_Task_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{

	// Constructor Method
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Defined  the web element using the @FindBy
	@FindBy(id="login2")
	WebElement Login;
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement Username;
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement Password;
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement Submit;
	
	public void Login() {
		// Click on the login button
		Login.click();
		
	}
	
	public void EnterData1(String uname, String pwd)
	{
		// Input the username value in the Username field
		Username.sendKeys(uname);
		// Input the Password value in the Password field
		Password.sendKeys(pwd);
	}
	
	public void Sumbit1() {
		// Click on the login
		Submit.click();
	}
	

		
	}


