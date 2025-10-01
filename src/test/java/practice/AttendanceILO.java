package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttendanceILO {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://devops.evolutionco.in/nextgen/login");

		driver.findElement(By.xpath("/html/body/section/div/div[1]/div/div/div[3]/form/div[1]/div/input")).sendKeys("dixit.shah@evolutionco.com");
		driver.findElement(By.xpath("/html/body/section/div/div[1]/div/div/div[3]/form/div[2]/div/input")).sendKeys("123456789" + Keys.ENTER);// press enter keyboard key

		//	driver.findElement(By.xpath("/html/body/section/div/div[1]/div/div/div[3]/form/div[4]/input")).click();		

//		System.out.println(driver.getCurrentUrl());

		// Wait for page load

//		Thread.sleep(3000);
//
//		// Student Info
//
//		driver.findElement(By.xpath("//*[@id=\"sidebar_menu\"]/li[4]/a")).click();
//
//		// Student subjectwise attendance CTA
//
//		Thread.sleep(3000);
//		WebElement subjectWiseAttendance = driver.findElement(By.xpath("//*[@id=\"sidebar_menu\"]/li[4]/ul/li[7]/a"));
//
//		Actions act = new Actions(driver);
//
//		act.moveToElement(subjectWiseAttendance).click().perform();	
//		Thread.sleep(3000);
//		
//		// Click on add attendance
//
//		driver.findElement(By.xpath("//*[@id=\"addRowsBtn\"]")).click();
//		
//		driver.navigate().refresh();
//		
//		// select category
//		
//		driver.findElement(By.xpath("//*[@id=\"subject_category_div\"]/div[1]")).click();
//		
//		Thread.sleep(3000);
//		
//		// Select ILO Category
//		driver.findElement(By.xpath("//*[@id=\"subject_category_div\"]/div[1]/ul/li[3]")).click();
//		Thread.sleep(3000);
//
//		// Select branch
//		
//		driver.findElement(By.xpath("//*[@id=\"select_faculty_div\"]/div[1]")).click();
//		Thread.sleep(3000);
//
//		// select Value
//		
//		driver.findElement(By.xpath("//*[@id=\"select_faculty_div\"]/div[1]/ul/li[4]")).click();
//		Thread.sleep(3000);
//
//		// Select subject
//		
//		driver.findElement(By.xpath("//*[@id=\"select_subject_div\"]/div[1]")).click();
//		Thread.sleep(3000);
//
//		// select subject value
//		
//		driver.findElement(By.xpath("//*[@id=\"select_subject_div\"]/div[1]/ul/li[2]")).click();
//		Thread.sleep(3000);
//
//		// select date
//		
//		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();
//		Thread.sleep(3000);
//
//		// select date value
//		
//		driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[3]/td[7]")).click();
//		Thread.sleep(3000);
//
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//
//		
//		
//		// select slot
//		
//	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
//		Thread.sleep(3000);
//
//		//open dropdown
//driver.findElement(By.xpath("//*[@id=\"select_lecture_slot_div_multi\"]/div[1]")).click();
//	
////Actions actions = new Actions(driver);
////	
////	for(int i =0; i<=5; i++) {
////		
////		actions.sendKeys(Keys.ARROW_DOWN).perform();
////	Thread.sleep(1000);
////		
////	}
//	
//	driver.findElement(By.xpath("//*[@id=\"select_lecture_slot_div_multi\"]/div[1]/div/input")).sendKeys("11:00 AM To 12:00 PM");
//	
//	driver.findElement(By.xpath("//*[@id=\"select_lecture_slot_div_multi\"]/div[1]/ul/li[2]")).click();	
	
	
	//WebElement slotValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_lecture_slot_div_multi\"]/div[1]/ul/li[2]")));
	
	//slotValue.click();
	
	
	
	
	
	
	
	

	
	
	
	
		
	



		// Click on Add Attendance CTA

		//	driver.findElement(By.xpath("//*[@id=\"addRowsBtn\"]")).click();


	



	}


}
