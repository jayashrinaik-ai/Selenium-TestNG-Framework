package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubjectWiseAttendanceILO {
	
	public WebDriver driver;
	
	// Locators
	
	private By studentInfoSidebar = By.xpath("//*[@id=\"sidebar_menu\"]/li[4]/a");
	
	private By subjectwiseAttendance = By.xpath("//*[@id=\"sidebar_menu\"]/li[4]/ul/li[7]/a");
	
	private By addAttendanceCTA = By.xpath("//*[@id=\"addRowsBtn\"]");

}
