package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentForm {

	public void setUp() {

	}




	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://stg-dbit.nxgnconnect.com/login");

		driver.findElement(By.xpath("/html/body/section/div/div[1]/div/div/div[3]/form/div[1]/div/input")).sendKeys("dixit.shah@evolutionco.com");
		driver.findElement(By.xpath("/html/body/section/div/div[1]/div/div/div[3]/form/div[2]/div/input")).sendKeys("123456789" + Keys.ENTER);// press enter keyboard key

		//	driver.findElement(By.xpath("/html/body/section/div/div[1]/div/div/div[3]/form/div[4]/input")).click();		

		System.out.println(driver.getCurrentUrl());

		// Wait for page load

		Thread.sleep(3000);

		// scrolldown & Scroll Up using javascript executor

		//	JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHight);" );

		//	js.executeScript("window.scrollBy(0, 1000);");

		//	System.out.println("*********************************");

		//	js.executeScript("window.scrollBy(0,-1000);");

		//driver.quit();


		//handle popup

		driver.findElement(By.xpath("//*[@id=\"sidebar_menu\"]/li[12]/a")).click();

		WebElement branchField=	driver.findElement(By.xpath("//*[@id=\"sidebar_menu\"]/li[12]/ul/li[3]/a"));

		//Using Action class ctrl + click on link

		//	Actions act = new Actions(driver);
		//	
		//	act.keyDown(Keys.CONTROL).click(branchField).keyUp(Keys.CONTROL ).build().perform();


		// Using Keyboard keys Shift + enter

		//	branchField.sendKeys(Keys.SHIFT,Keys.ENTER);

		// Using javascript Executor 

		String url= branchField.getAttribute("href");

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.open('" + url+" ','_blank');");

		// Get all window handles

		Set<String>	handles = driver.getWindowHandles();

		List<String> windowList = new ArrayList(handles);

		// Switch to the new window (last one in the list)

		driver.switchTo().window(windowList.get(windowList.size()-1));

		System.out.println("Switched to a new window: " + driver.getTitle());

		//verify page title is correct or not

		String expectedTitle = "Don Bosco Institute of Technology | Branch";

		String actualTitle = driver.getTitle();

		if(actualTitle.equals(expectedTitle))
		{
			System.out.println(" Title is Matcehed: " +actualTitle );
		}else
		{
			//System.out.println( " Title is missmatched: " + actualTitle );
			System.err.println("Title is missmatched: " + actualTitle);
		}
		driver.findElement(By.xpath("//*[@id=\"addRowsBtn\"]")).click();

		String curruntWindowUrl = driver.getCurrentUrl();

		System.out.println(curruntWindowUrl);

		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();

		// Try waiting for an alert (JS popup)
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

			Alert alt = wait.until(ExpectedConditions.alertIsPresent());

			String alertText = alt.getText();

			System.out.println("alert text is : " + alertText);
			
			alt.accept();

		} catch(TimeoutException e)

		{
			e.printStackTrace();
		}
		
		try {
			// Example: look for a modal popup element
			
			WebElement htmlpopupModal = driver.findElement(By.cssSelector(""));
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	
	

	}

}
