package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddStudentFormPage {
	
	
	private WebDriver driver;
	
	// Student Info Locators
	
	private By admissionDate = By.xpath("");
	private By rollNumber = By.xpath("");
	private By firstName = By.xpath("");
	private By lastName = By.xpath("");
	private By stdPhonenumber =By.xpath("");
	private By stdEmailAddres = By.xpath("");
	
	private By parentAndGuardianInfoTab = By.xpath("");
	
	// Father details
	
	private By fatherName = By.xpath("");
	private By fatherEmail = By.xpath("");
	private By fatherPhoneNumber = By.xpath("");
	
	
	// Mother detail
	
	private By motherName = By.xpath("");
	private By motherEmail = By.xpath("");
	private By motherPhoneNumber = By.xpath("");
	
	//Relation With guardian Info tab
	
	private By relationWithGuardian = By.xpath("");
	
	// guardian details
	
	private By guardianName = By.xpath("");
	private By guardianEmail = By.xpath("");
	
	// current education info
	
	private By currentAcademicyear = By.xpath("");
	private By selectBranch = By.xpath("");
	private By selectDepartment = By.xpath("");
	private By selectPrograme = By.xpath("");
	private By selectSemester = By.xpath("");
	private By selectSemesterlabel = By.xpath("");
	private By selectSection = By.xpath("");
	
	// Constructor
	
	public AddStudentFormPage(WebDriver driver) {this.driver = driver;};

	

}
