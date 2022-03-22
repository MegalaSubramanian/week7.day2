package testScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;


public class MyHomePage extends BasePage{
	


	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	/**
	 * Click the LeadTab in the MyHomePage screen
	 * @return MyLeadsPage
	 */		
	public MyLeadsPage clickLeadsTab() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText(prop1.getProperty("linkleads"))).click();
		return new MyLeadsPage(driver);
	}
}
