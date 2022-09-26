package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;


public class RecentDrafts_Copy_Delete extends EMS_Execution {

	static Reuse_Functions Reuse_func=new Reuse_Functions(); 
	
	static EMS_Locators RecentDrafts = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void RecentDraftCampaign_Copy() throws IOException, InterruptedException, AWTException{
		try{
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 //Press the Copy Button
		 RecentDrafts.RecentDraftCopyButton.click();
		 
		 Reuse_func.CustomProductPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		 //Press the Ok Button to create the sent campaign copy
		 RecentDrafts.CreateCopyCampaign_Button.click();
		 
		 Assert.assertTrue(RecentDrafts.SendEmailTest_Veriifcation.getText().contains("Successfully Copied"));
		/* if(RecentDrafts.SendEmailTest_Veriifcation.getText().contains("Successfully Copied"))
		 {
			 System.out.println("Recent Draft Campaign copied successfully");
		     
			 Reuse_func.resultPass("RecentDraftCampaign_Copy", "Recent Draft Campaign copied successfully");
		 }
		 else{
			 
             System.out.println("Recent Draft Campaign copied unsuccessfully");
		     
			 Reuse_func.resultFail("RecentDraftCampaign_Copy", "Recent Draft Campaign copied unsuccessfully");
		 }*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void Campaign_Saved_To_RecentDrafts_FromRecentDrafts() throws InterruptedException{
		try{
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
         
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		
		//Press the Next Button
		RecentDrafts.CampaignNextStep_Button.click();
		
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
		//Press the Next Button
		RecentDrafts.CampaignNextStep_Button.click();
		
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
		 //Press the Next Button
		RecentDrafts.EditorStep_NextButton.click();
		
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
		 //Press the Next Button to move to send Campaign Step
		RecentDrafts.CampaignNextStep_Button.click();
		
		
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
		
		SendCampaigns.CampaignName=RecentDrafts.CampaignName.getText();
  	    System.out.println(SendCampaigns.CampaignName);
		
		//Press the Save and Close Button
		RecentDrafts.SaveandCloseCampaign_Button.click();
		
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
		 //Thread.sleep(35000);
		Assert.assertTrue(getDriver().getPageSource().contains(SendCampaigns.CampaignName));
	/*	if(getDriver().getPageSource().contains(SendCampaigns.CampaignName))
		{
			System.out.println("Campaign Saved To Drafts Successfully");
			
			Reuse_func.resultPass("Campaign_Saved_To_RecentDrafts_FromRecentDrafts", "Campaign Saved To Recent Drafts Successfully");
		}
		else{
           System.out.println("Campaign Saved To Drafts UnSuccessfully");
			
			Reuse_func.resultFail("Campaign_Saved_To_RecentDrafts", "Campaign Saved To Drafts UnSuccessfully");
		}*/
		
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void RecentDraftCampaign_Delete() throws InterruptedException{
		try{
		//Now Delete the copied Campaign
		RecentDrafts.RecentDraft_DeleteButton.click();
		
		Thread.sleep(1000);
		
		RecentDrafts.DraftDelete_Confirm.click();
		Assert.assertTrue(RecentDrafts.SendEmailTest_Veriifcation.getText().contains("Successfully Deleted"));
	/*	if(RecentDrafts.SendEmailTest_Veriifcation.getText().contains("Successfully Deleted"))
		 {
			 System.out.println("Recent Draft Campaign deleted successfully");
		     
			 Reuse_func.resultPass("RecentDraftCampaign_Delete", "Recent Draft Campaign deleted successfully");
		 }
		 else{
			 
            System.out.println("Recent Draft Campaign deleted unsuccessfully");
		     
			 Reuse_func.resultFail("RecentDraftCampaign_Delete", "Recent Draft Campaign deleted unsuccessfully");
		 }*/
		
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	
	finally {
       Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
	}
	
	}
	


}
