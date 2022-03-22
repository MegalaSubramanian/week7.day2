package testScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;

public class CreateLeadPage extends BasePage{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Type the companyName in the CreateLeadPage screen
	 * @param companyname
	 * @return 
	 */
	public CreateLeadPage typeCompanyName(String companyname) {	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	return this;
	}	
	/**
	 * Type the firstName in the CreateLeadPage screen
	 * @param firstName
	 * @return 
	 */	
	public CreateLeadPage typeFirstName(String firstName) {		
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	return this;
	}
	/**
	 * Type the lastName in the CreateLeadPage screen
	 * @param lastName
	 * @return 
	 */	
	public CreateLeadPage typeLastName(String lastName) {		
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	return this;
	}
	/**
	 * Click the Create lead
	 * @return  ViewLeadsPage
	 */
	public ViewLeadsPage clickCreateLead() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadsPage(driver);
	}

}
