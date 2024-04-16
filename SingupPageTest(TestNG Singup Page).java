package pomTest_Task_24;


import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import base.Base;
import pom_Task_24.SingupPage;

public class SingupPageTest extends Base {
	
	
	@Test
	public void SignupTest() throws Exception {

		SingupPage sn = new SingupPage(driver);
		// Calling the Sinup() Method
		sn.Sinup();
		// Calling the EnterData() Method
		sn.EnterData("PaulRaj", "Paul1234");
		// Calling the Sumbit Method
		sn.Sumbit();
		Thread.sleep(1000);
		// Switch to alert
		Alert alert = driver.switchTo().alert();
		// Get the alert Message
		String alertMessage = driver.switchTo().alert().getText();
		// Print the alert message
		System.out.println(alertMessage);
		Thread.sleep(1000);
		// Accept the alert
		alert.accept();
	}
	    
	}
	
	
