package testScreens;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;


public class MergeLeadsPage extends BasePage{
	
	public MergeLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	Set<String> allWindows;
	List<String> allhandles;
	
	/**
	 * click FromLead lookup in the MergeLeadsPage screen
	 * @return 
	 */		
	
	public MergeLeadsPage clickFromLeadlookup() {		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	return this;
	}
	
	/**
	 * click ToLead lookup in the MergeLeadsPage screen
	 * @return 
	 */		
	
	public MergeLeadsPage clickToLeadlookup() {		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	return this;
	}
	
	/**
	 * get windows in the MergeLeadsPage screen
	 * @return 
	 */		
	
	public MergeLeadsPage getWindows() {		
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
	return this;
	}
	/**
	 * switch to windows1 in the MergeLeadsPage screen
	 * @return 
	 */		
	
	public FindLeadsPage switchToWindow1() {		
		driver.switchTo().window(allhandles.get(1));
	return new FindLeadsPage(driver);
	}
	
	/**
	 * switch to Home windows in the MergeLeadsPage screen
	 * @return 
	 */		
	
	public MergeLeadsPage switchToHomeWindow() {		
		driver.switchTo().window(allhandles.get(0));
	return this;
	}

	/**
	 * Click Merge button in the MergeLeadsPage screen
	 * @return 
	 */	

	public MergeLeadsPage clickMergeButton() {		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	return this;
	}
	
	/**
	 * Accept the Merge alert in MergeLeadsPage screen
	 * @return MyLeadsPage
	 */	

	public MyLeadsPage acceptMergeAlert() {		
		driver.switchTo().alert().accept();	
	return new MyLeadsPage(driver);
	}
	
	
	
}
