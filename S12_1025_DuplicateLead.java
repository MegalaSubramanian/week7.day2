package testTests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testHooks.BasePage;
import testScreens.LoginPage;


public class S12_1025_DuplicateLead extends BasePage {
	
	@BeforeClass
	public void setData() throws IOException {
		sheetName = "Duplicate Lead";
	}
	
	@Test(dataProvider ="Lead")
	public void DuplicateTest(String phoneNo) throws InterruptedException {
		new LoginPage(driver)
		.typeUserName(prop1.getProperty("username"))
		.typePassword(prop1.getProperty("password"))
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.clickPhoneTab()
		.clickPhoneNumber()
		.typePhoneNumber(phoneNo)
		.clickFindLeadsButton()
		.clickLeadIdLinkFromResult()
		.clickDuplicateButton()
		.clickCreateLeadButton();
		
	}
	}
