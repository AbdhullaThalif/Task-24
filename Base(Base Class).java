package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public WebDriver driver;

	@BeforeMethod
	public void LanchBrowser() {
		// Launch the ChromeDriver browser
		  driver = new ChromeDriver();
		  // Maximize the window
		  driver.manage().window().maximize();
		  // Navigate to the URL
	      driver.get("https://www.demoblaze.com/");
	}
	
	@AfterMethod
	public void CloseBrowser() {
		// Close the window
		driver.close();
	}

}
