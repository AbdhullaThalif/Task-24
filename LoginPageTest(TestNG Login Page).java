package pomTest_Task_24;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pom_Task_24.LoginPage;

public class LoginPageTest extends Base{
	
	 @Test
     public void LoginupTest() {
     LoginPage ln= new LoginPage(driver);
     // Calling the Login() Method
     ln.Login();
     // Calling the EnterData1() Method
     ln.EnterData1("PaulRaj", "Paul1234");
     // Calling the Sumbit1 Method
     ln.Sumbit1();
     // Verified the login page has been successfully to using assertions
     String ActualTitle ="STORE";
     String ExpectedTitle=driver.getTitle();
     System.out.println(ExpectedTitle);
     Assert.assertEquals(ExpectedTitle, ActualTitle);
     }

}
