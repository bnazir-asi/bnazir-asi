package EMS_Corporate_CampaignList_TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class CompanySettings_Companyname extends EMS_Corporate_CampaignList_Execution {
	static EMS_Locators companysetting = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void companyname() throws IOException, InterruptedException, AWTException
	{ 
		companysetting.SettingsTab.click();
    	 
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
    	 
	     //Goto Corporate Settings option
	     companysetting.Settings_CompanySettings.click();
	     String companyname=companysetting.Companyname.getAttribute("value");
	     System.out.println("Company name:"+ companyname);
	     companysetting.CampaignsTab.click();
    	 
    	 //Wait for the Page to be loaded completely
    	 
    	// block-ui-message ng-binding
    	  
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
         
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
          
    	 //Press the Create Campaign Button
         companysetting.CreateCampaignButton.click();

    	 //Enter the campaign name
         companysetting.CampaignName_Field.sendKeys(EMS_TestData.CampaignNameCompanySettings);
    	 
    	 //Enter the Subject line
         companysetting.SubjectLine_Field.sendKeys("Automation Campaign");
    	 
    	 //Enter the from Field data
         companysetting.FromName_Field.sendKeys("Test Automation Campaign");
    	
    	 //Press the Next Button
         companysetting.CampaignNextStep_Button.click();
    	 
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	
    	 
    	 //Press the Blank template button
    	 companysetting.ChooseTemplate_BlankTemplateButton.click();
		 
		 //Enter the Template Name
    	 companysetting.TemplateName_InsertionField.sendKeys(EMS_TestData.TemplateName);
		 
		 //Press the Create Template Button
    	 companysetting.Template_CreateButton.click();
		 
		 
    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	
		 //Validating that the editor step occurs successfully and template created successfully
    	 if(companysetting.EditorStep_Verification.getText().contains("EMS"))
    	 {
    		System.out.println("New Blank Template Created Successfully");
    		
    		//Reuse_func.resultPass("Blank Template Creation", "New Blank Template Created Successfully");
    	 }
    	 else{
    		 System.out.println("New Blank Template Created UnSuccessfully"); 
    	  
    		// Reuse_func.resultFail("Blank Template Creation", "New Blank Template Created Successfully");
    	 
    	 }
    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 companysetting.previewtemplate.click();
    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 Assert.assertTrue(companysetting.unsubscribetext.getText().contains(companyname));
    /*	 if (companysetting.unsubscribetext.getText().contains(companyname))
    	 {
    		 System.out.println("Companyname provided in settings page is matched with company name in unsubscribe module on preview window.");
    		 Reuse_Functions_Corp_CampaignsList.resultPass("Editable Company name", "Companyname provided in settings page is matched with company name in unsubscribe module on preview window.");
    	 }
    	 else
    	 {
    		 System.out.println("Companyname is not being matched");
    		 Reuse_Functions_Corp_CampaignsList.resultFail("Editable Company name", "Companyname provided in settings page is not being matched with company name in unsubscribe module on preview window.");
    	 }*/
    	//String unsubscribetext= companysetting.unsubscribetext.getAttribute("value");
    	// System.out.println("Company name:"+ unsubscribetext);
	}
	

}
