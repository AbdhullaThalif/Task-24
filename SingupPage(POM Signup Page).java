package pom_Task_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SingupPage extends Base{
	
	// Constructor Method
	public SingupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Defined  the web element using the @FindBy
	@FindBy(id="signin2")
	WebElement Singup;
	@FindBy(xpath="//input[@id='sign-username']")
	WebElement Username;
	@FindBy(xpath="//input[@id='sign-password']")
	WebElement Password;
	@FindBy(xpath="//button[normalize-space()='Sign up']")
	WebElement Submit;
	
	public void Sinup() {
		// Click on the Signup button
		Singup.click();
		
	}
	
	public void EnterData(String uname, String pwd)
	{
		// Input the username value in the Username field
		Username.sendKeys(uname);
		// Input the Password value in the Password field
		Password.sendKeys(pwd);
	}
	
	public void Sumbit() {
		// Click on the Signup
		Submit.click();
	}
	
}
