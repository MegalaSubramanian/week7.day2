package testTests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testHooks.BasePage;
import testScreens.LoginPage;


public class S12_1026_MergeLead extends BasePage{
	
	@BeforeClass
	public void setData() throws IOException {
		sheetName = "Merge Lead";
	}
	@Test(dataProvider ="Lead")
	public void MergeTest(String fName1, String fName2) throws InterruptedException{
		
	new LoginPage(driver)
	.typeUserName(prop1.getProperty("username"))
	.typePassword(prop1.getProperty("password"))
	.clickLogin()
	.clickCRMSFA()
	.clickLeadsTab()
	.clickMergeLeads()
	.clickFromLeadlookup()
	.getWindows()
	.switchToWindow1()
	.typefirstName(fName1)
	.clickFindLeadsButton()
	.getLeadID()
	.clickLeadIdLinkFromMergeResult()
	.getWindows()
	.switchToHomeWindow()
	.clickToLeadlookup()
	.getWindows()
	.switchToWindow1()
	.typefirstName(fName2)
	.clickFindLeadsButton()
	.clickLeadIdLinkFromMergeResult()
	.getWindows()
	.switchToHomeWindow()
	.clickMergeButton()
	.acceptMergeAlert()
	.clickFindLead()
	.typeLeadID()
	.clickFindLeadsButton()
	.validateNoRecord();

	}
}
