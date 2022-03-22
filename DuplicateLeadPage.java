package testScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;


public class DuplicateLeadPage extends BasePage{
	
	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	
	/**
	 * Click the CreateLead Button in the DuplicateLeadsPage screen
	 * @return 
	 */	
	
	public DuplicateLeadPage clickCreateLeadButton() {		
		driver.findElement(By.name("submitButton")).click();
	return this;
	}
}
