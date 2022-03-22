package testScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;


public class FindLeadsPage extends BasePage {
	
	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public static String leadID;
	/**
	 * Type the FirstName in the FindLeadsPage screen
	 * @param firstName
	 * @return 
	 */	
	public FindLeadsPage typefirstName(String firstName) {			
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
	return this;
	}
	
	/**
	 * Click the PhoneTab
	 * @return 
	 */
	public FindLeadsPage clickPhoneTab() {	
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
	}
	/**
	 * Click the PhoneNumber field in the FindLeadsPage screen
	 * @return 
	 */	
	public FindLeadsPage clickPhoneNumber() {		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
	}
	/**
	 * Type the PhoneNumber in the FindLeadsPage screen
	 * @param phoneNumber
	 * @return 
	 */	
	public FindLeadsPage typePhoneNumber(String phoneNumber) {		
	
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	return this;
	}
	/**
	 * Click the findLeads button in the FindLeadsPage screen
	 * @return 
	 * @throws InterruptedException 
	 */	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	return this;
	}
	/**
	 * Get the leadID from the result in FindLeadPage screen
	 * @return 
	 * @get LeadID
	 */	
	
	public FindLeadsPage getLeadID() {		
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	return this;
	}
	
	/**
	 * Type the leadID in the FindLeadsPage
	 * @param LeadID
	 * @return 
	 */	
	
	public FindLeadsPage typeLeadID() {		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	return this;
	}
	/**
	 * Validate the No record text in the FindLeadsPage
	 * Print "No record found" is matched or not
	 * @return
	 */	
	
	public FindLeadsPage validateNoRecord() {		
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("No record Text matched");
		} else {
			System.out.println("No record Text not matched");
		}
	return this;
	}
	/**
	 * Click the LeadID Link from the result in FindLeadsPage screen
	 * @return ViewLeadsPage
	 */	
	public ViewLeadsPage clickLeadIdLinkFromResult(){		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadsPage(driver);
	}
	
	/**
	 * Click the LeadID Link from the result in FindLeadsPage screen
	 * @return MergeLeadsPage
	 */	
	public MergeLeadsPage clickLeadIdLinkFromMergeResult(){		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new MergeLeadsPage(driver);
	}
	
	/**
	 * Click the LeadID Link from the result in FindLeadsPage screen
	 * @return MergeLeadsPage
	 */	
	public MergeLeadsPage clickLeadIdToMerge(){		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new MergeLeadsPage(driver);
	}
	
	
	
	
}
