package testTests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testHooks.BasePage;
import testScreens.LoginPage;



public class S12_1022_CreateLead extends BasePage{
	
	@BeforeClass
	public void setData() throws IOException {
		sheetName = "Create Lead";
	}

	@Test(dataProvider ="Lead")
	public void CreateTest(String company, String fName, String lName) {
		
		new LoginPage(driver)
		.typeUserName(prop1.getProperty("username"))
		.typePassword(prop1.getProperty("password"))
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead()
		.typeCompanyName(company)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLead()
		.getTitle();
	
	}
	
}
