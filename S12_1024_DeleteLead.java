package testTests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testHooks.BasePage;
import testScreens.LoginPage;


public class S12_1024_DeleteLead extends BasePage{
	
	@BeforeClass
	public void setData() throws IOException {
		sheetName = "Delete Lead";
	}

	@Test(dataProvider ="Lead")
	public void DeleteTest(String phoneNo) throws InterruptedException {
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
	.getLeadID()
	.clickLeadIdLinkFromResult()
	.clickDeleteButton()
	.clickFindLead()
	.typeLeadID()
	.clickFindLeadsButton()
	.validateNoRecord();
	
}
}
