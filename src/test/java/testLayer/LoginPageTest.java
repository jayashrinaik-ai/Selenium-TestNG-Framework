package testLayer;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pagelayer.LoginPage;
import testBase.BaseTest;

  @Listeners(listerners.TestListener.class)

public class LoginPageTest extends BaseTest {

	
	
	
	@Test
	
	
	
	public void verifyLoginpageTest() throws InterruptedException
	{
		
		   // Fetching from property file instead of hardcoding
		LoginPage loginpage = new LoginPage(driver);
		
		
		
		String email= Config.getProperty("email");
		
		String password = Config.getProperty("password");
		
		loginpage.login(email, password);
		
		System.out.println(driver.getTitle());
		
	}
}
