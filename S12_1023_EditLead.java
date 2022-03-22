package testTests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testHooks.BasePage;
import testScreens.LoginPage;



public class S12_1023_EditLead extends BasePage {
	
	@BeforeClass
	public void setData() throws IOException {
		sheetName = "Edit Lead";
	}
	
	@Test(dataProvider ="Lead")
	public void EditTest(String phoneNo, String company) throws InterruptedException {
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
		.clickEditButton()
		.updateCompanyName(company)
		.clickUpdateButton()
		.getTitle();
		
	}
	

}
