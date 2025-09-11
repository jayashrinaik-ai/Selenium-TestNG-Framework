package testLayer;

import org.testng.annotations.Test;

import pagelayer.LoginPage;
import testBase.BaseTest;
import utility.DataProviders;

public class LoginPageTestUsingDataProvider extends BaseTest {
	
	@Test (dataProvider = "loginData" , dataProviderClass = DataProviders.class)
	
	public void verifyLogin(String email, String password) {
		
		System.out.println("Testing with Username: " + email + " | password: " + password );
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterEmailINField(email);
		loginpage.enterPasswordField(password);
		loginpage.clickOnLoginbtn();
		
	}

}
