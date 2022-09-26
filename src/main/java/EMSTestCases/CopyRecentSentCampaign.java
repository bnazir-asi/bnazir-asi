package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;


public class CopyRecentSentCampaign extends EMS_Execution {

	static WebElement ClearField;
	static Reuse_Functions Reuse_func=new Reuse_Functions();
	
	static EMS_Locators CopySentCampaign = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void RecentSentCampaign_Copy() throws IOException, InterruptedException, AWTException{
		try{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].scrollIntoView();", CopySentCampaign.Recentlysentcampaigns);
		//Press the Copy Button
		 CopySentCampaign.CopyButton_RecentCampaignSent.click();
		 
		 Reuse_func.CustomProductPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(2000);
		 
		 //Press the Ok Button to create the sent campaign copy
       
		 CopySentCampaign.CreateCopyCampaign_Button.click();
		 
		 Thread.sleep(1000);
		 
		 Assert.assertTrue(CopySentCampaign.SendEmailTest_Veriifcation.getText().contains("Successfully Copied"));
		/* if(CopySentCampaign.SendEmailTest_Veriifcation.getText().contains("Successfully Copied"))
		 {
			 System.out.println("Recent Sent Campaign copied successfully");
		     
			 Reuse_func.resultPass("RecentSentCampaign_Copy", "Recent Sent Campaign copied successfully");
		 }
		 else{
			 
             System.out.println("Recent Sent Campaign copied unsuccessfully");
		     
			 Reuse_func.resultFail("RecentSentCampaign_Copy", "Recent Sent Campaign copied unsuccessfully");
		 }*/
		
		}catch(NoSuchElementException e){
			e.getMessage();
			
		}
	}	
	
	public static void UpdateSubjectName_SendStep() throws InterruptedException{
		try{
		 
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		
		//Press the Next Button
		CopySentCampaign.CampaignNextStep_Button.click();
		
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(2000);
		//Press the Next Button
		CopySentCampaign.CampaignNextStep_Button.click();
		
        Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(2000);
		 //Press the Next Button
		CopySentCampaign.EditorStep_NextButton.click();
		
        Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(2000);
		 //Press the Next Button to move to send Campaign Step
		CopySentCampaign.CampaignNextStep_Button.click();
 
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(2000);
		
		//Now Update the fields on send step and validate those
		//Updating subject Name
		CopySentCampaign.EditSubjectButton_SendStep.click();
		
		 ClearField = CopySentCampaign.SubjectNameField_Sendstep;
		 ClearField.sendKeys(Keys.CONTROL + "a");
		 ClearField.sendKeys(Keys.DELETE);
		 
		 CopySentCampaign.SubjectNameField_Sendstep.sendKeys("Updated Subject Name");
		 
		 //Press the Save Button
		 CopySentCampaign.SubjectSaveButton_SendStep.click();
		 
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		 Assert.assertTrue(getDriver().getPageSource().contains("Updated Subject Name"));
		/* if(getDriver().getPageSource().contains("Updated Subject Name"))
		 {
			 System.out.println("Subject Name for campaign Updated Successfully");
			 Reuse_func.resultPass("UpdateSubjectName_SendStep", "Subject Name for campaign Updated Successfully");
		 }
		 else{
			 System.out.println("Subject Name for campaign Updated UnSuccessfully");
			 Reuse_func.resultFail("UpdateSubjectName_SendStep", "Subject Name for campaign Updated UnSuccessfully"); 
		 }*/
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
		public static void UpdateFromName_SendStep() throws InterruptedException{
			try{
	
	    //Press the List Update Field Edit Button
		 CopySentCampaign.EditListButton_SendStep.click();
		 
		 Thread.sleep(2000);
		 
		 
		 //CopySentCampaign.ListSelection_WhileEditing.click();
		 
		 CopySentCampaign.MoveToSendStep_NextButton.click();
		 
		 
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		
		 //Update the from Name
		 CopySentCampaign.EditFromNameButton_SendStep.click();
		 
		 ClearField = CopySentCampaign.FromNameField_Sendstep;
		 ClearField.sendKeys(Keys.CONTROL + "a");
		 ClearField.sendKeys(Keys.DELETE);
		 
		 Thread.sleep(1000);
		 
		 //Update the FromName
		 CopySentCampaign.FromNameField_Sendstep.sendKeys("Updated From Name");
		 
		 CopySentCampaign.FromNameSaveButton.click();
		 
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		 Assert.assertTrue(getDriver().getPageSource().contains("Updated From Name"));
		/* if(getDriver().getPageSource().contains("Updated From Name"))
		 {
			 System.out.println("From Name for campaign Updated Successfully");
			 Reuse_func.resultPass("UpdateFromName_SendStep", "From Name for campaign Updated Successfully");
		 }
		 else{
			 System.out.println("From Name for campaign Updated UnSuccessfully");
			 Reuse_func.resultFail("UpdateFromName_SendStep", "From Name for campaign Updated UnSuccessfully"); 
		 }*/
	}catch(NoSuchElementException e){
		e.getMessage();
	}
		}
		
		public static void UpdateReplyToEmail_SendStep() throws InterruptedException{
			try{
		 //Now update the reply to field
		 CopySentCampaign.EditReplyToButton_SendStep.click();
		 
		 ClearField = CopySentCampaign.FromEmailField_Sendstep;
		 ClearField.sendKeys(Keys.CONTROL + "a");
		 ClearField.sendKeys(Keys.DELETE);
		 
		 Thread.sleep(1000);
		
		 CopySentCampaign.FromEmailField_Sendstep.sendKeys("bakhtawarmallick66@gmail.com");
		 
		 CopySentCampaign.ReplyToButton_SendStep.click();
		 
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		 Assert.assertTrue(getDriver().getPageSource().contains("bakhtawarmallick66@gmail.com"));
	/*	 if(getDriver().getPageSource().contains("bakhtawarmallick66@gmail.com"))
		 {
			 System.out.println("Reply To Email for campaign Updated Successfully");
			 Reuse_func.resultPass("UpdateReplyToEmail_SendStep", "Reply To Email for campaign Updated Successfully");
		 }
		 else{
			 System.out.println("Reply To Email for campaign Updated UnSuccessfully");
			 Reuse_func.resultFail("UpdateReplyToEmail_SendStep", "Reply To Email for campaign Updated UnSuccessfully"); 
		 }*/
		 
	}catch(NoSuchElementException e){
	  e.getMessage();
	}
		}
	public static void Campaign_Saved_To_RecentDrafts() throws InterruptedException{
		try{
			
		SendCampaigns.CampaignName=CopySentCampaign.CampaignName.getText();
  	    System.out.println(SendCampaigns.CampaignName);
		
		//Press the Save and Close Button
		CopySentCampaign.SaveandCloseCampaign_Button.click();
		
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
		Assert.assertTrue(getDriver().getPageSource().contains(SendCampaigns.CampaignName));
	/*	if(getDriver().getPageSource().contains(SendCampaigns.CampaignName))
		{
			System.out.println("Campaign Saved To Drafts Successfully");
			
			Reuse_func.resultPass("Campaign_Saved_To_RecentDrafts", "Campaign Saved To Drafts Successfully");
		}
		else{
           System.out.println("Campaign Saved To Drafts UnSuccessfully");
			
			Reuse_func.resultFail("Campaign_Saved_To_RecentDrafts", "Campaign Saved To Drafts UnSuccessfully");
		}*/
		
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}

	

}
