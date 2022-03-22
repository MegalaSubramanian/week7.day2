package testScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testHooks.BasePage;


public class HomePage extends BasePage{
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
		
	/**
	 * This method is to click on CRM/SFA link in Home Page
	 * @return MyHomePage
	 */
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
