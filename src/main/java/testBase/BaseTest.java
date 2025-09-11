package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;

	public Properties Config;




	//@Parameters("browser")
	@BeforeClass
	
	// this is data provider call
	@Parameters({"baseUrl"})
	
	public void setUp(@Optional("https://devops.evolutionco.in/nextgen/login") String baseUrl) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
//  this is config. property file with cross browser testing.
//	public void setup(String browser) throws IOException
//	{
//
//
//		//Property file	
//		Config = new Properties();
//
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config.properties");
//		
//
//		Config.load(fis);
//		// Browser setup
//
//		 // ✅ Switch–case for browser setup
//		
//		switch(browser.toLowerCase()) {
//		
//		case "chrome":
//			
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		case "firefox":
//			
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//			
//		case "edge":
//			
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//			
//		default:
//			
//			throw new IllegalArgumentException("Browser not supported: " + browser);
//			
//		}
//		// Ensure screenshots folder exists at test start
//		File folder = new File(System.getProperty("user.dir") + "/test-output/screenshots/");
//		if (!folder.exists()) {
//			folder.mkdirs();
//		}
//
//
//	driver.manage().window().maximize();
//
//		driver.get(Config.getProperty("baseUrl"));
//	}


	@AfterClass

	public void tearDown() {

		if(driver != null)
			driver.quit();
	}

	//	 Getter method

	public WebDriver getDriver() {
		return driver;
	}

}
