package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class CreateCampaignInfo extends EMS_Execution{

	public static void CampaignInfoCreation () throws IOException, InterruptedException, AWTException{
		try{
	 
			Reuse_Functions Reuse_func=new Reuse_Functions();
			
			//Now Insert the login credentials
    	// This is to Instantiate Campaign Info Page class  
    	 EMS_Locators CampaignInfo = PageFactory.initElements(getDriver(), EMS_Locators.class);
    	
         
    	  //Press the campaign tab
    	 CampaignInfo.CampaignsTab.click();
    	 
    	 //Wait for the Page to be loaded completely
    	 
    	// block-ui-message ng-binding
    	  
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
         
          Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
          
    	 //Press the Create Campaign Button
    	 CampaignInfo.CreateCampaignButton.click();
    	 
    	//Wait for the Page to be loaded completely 
    	 
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	
    	 //Enter the campaign name
    	 CampaignInfo.CampaignName_Field.sendKeys(EMS_TestData.CampaignName);
    	 
    	 //Enter the Subject line
    	 CampaignInfo.SubjectLine_Field.sendKeys("Automation Campaign");
    	 
    	 //Enter the from Field data
    	 CampaignInfo.FromName_Field.sendKeys("Test Automation Campaign");
    	
    	 //Press the Next Button
    	 
    	 CampaignInfo.CampaignNextStep_Button.click();
    	 
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 Assert.assertTrue(CampaignInfo.TemplatesStep_Verification.getText().contains("All Templates"));
    	/* if(CampaignInfo.TemplatesStep_Verification.getText().contains("All Templates"))
    	 {
    		 System.out.println("Campaign Info Added and saved Successfully");
    		 Reuse_func.resultPass("CampaignInfo_Creation", "Campaign Info Added and saved Successfully");
    	 }
    	 else{
    		 System.out.println("Campaign Info Added and saved UnSuccessfully");
    		 Reuse_func.resultFail("CampaignInfo_Creation", "Campaign Info Added and saved UnSuccessfully");
    	 }*/
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}

	
}
