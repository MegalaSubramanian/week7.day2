package testScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;


public class EditLeadPage extends BasePage{

	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Update the companyName in the EditLeadPage screen
	 * @param companyname
	 * @return 
	 */
	public EditLeadPage updateCompanyName(String companyname) {	
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
	return this;
	}	
	
	/**
	 * Click Update button in the EditLeadPage screen
	 * @return ViewLeadsPage
	 */
	public ViewLeadsPage clickUpdateButton() {	
		driver.findElement(By.name("submitButton")).click();
	return new ViewLeadsPage(driver);
	}	
}
