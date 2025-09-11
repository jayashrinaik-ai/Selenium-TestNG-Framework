package pagelayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver driver;
	
	// Locators

		private By emailField = By.name("email");

		private By passwordField = By.name("password");

		private By signInBtn = By.className("input-control-input");



	

	// Constructor
	public LoginPage(WebDriver driver) {this.driver = driver;}

	
// Actions

	public LoginPage enterEmailINField (String email) {

		//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//				
		//		WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
		//		
		//		emailElement.sendKeys(email);
		//		

		driver.findElement(emailField).clear();

		driver.findElement(emailField).sendKeys(email);

		return this;


	}

	public LoginPage enterPasswordField( String password) {

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//
//		WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
//
//		passwordElement.sendKeys(password);

		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
		
		return this;

	}

	public void clickOnLoginbtn() {
		driver.findElement(signInBtn).click();
	}

	public void login(String email, String password) {

		enterEmailINField(email);
		enterEmailINField(password);
		clickOnLoginbtn();


	}
}
