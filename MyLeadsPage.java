package testScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;


public class MyLeadsPage extends BasePage{
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	/**
	 * Click the Create lead in MyLeads screen
	 * @return CreateLeadPage
	 */
	public CreateLeadPage clickCreateLead() {
		//driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.linkText(prop1.getProperty("linkcreatelead"))).click();
		return new CreateLeadPage(driver);
	}
	
	/**
	 * Click the Find lead
	 * @return FindLeadsPag
	 */
	public FindLeadsPage clickFindLead() {
		driver.findElement(By.linkText(prop1.getProperty("linkfindlead"))).click();
		return new FindLeadsPage(driver);
	}
	
	/**
	 * Click the Merge leads in MyLeads screen
	 * @return 
	 */
	public MergeLeadsPage clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}

}
