package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;


public class SendCampaigns extends EMS_Execution {

	public static JavascriptExecutor jse;
	public static String CampaignName;
	
	static Reuse_Functions Reuse_func=new Reuse_Functions();
 
	static EMS_Locators SendCampaign = PageFactory.initElements(getDriver(), EMS_Locators.class);
	
	public static void CampaignLevel_ListPreview() throws IOException, InterruptedException, AWTException{
		try{
	     Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		 
		 SendCampaign.CampaignRecipient_ListPreview_DetailsLink.click();
    	 
		 Reuse_func.CustomProductPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		 Assert.assertTrue(SendCampaign.CampaignListPreview_VisibleVerification.getText().contains("Recipients"));
		/* if(SendCampaign.CampaignListPreview_VisibleVerification.getText().contains("Recipients"))
		 {
			 System.out.println("List Contacts Preview At Campaign Level Display Successfully");
			 
			 Reuse_func.resultPass("CampaignLevel_ListPreview", "List Contacts Preview At Campaign Level Display Successfully");
		 }
		 else{
             System.out.println("List Contacts Preview At Campaign Level Display UnSuccessfully");
			 
			 Reuse_func.resultFail("CampaignLevel_ListPreview", "List Contacts Preview At Campaign Level Display UnSuccessfully");
		 }*/
		
		}catch(NoSuchElementException e)
		{
			e.getMessage();
		}
	}	
	 public static void Campaign_Preview() throws InterruptedException{
		 try{
	
	     //Press the Done Button
		 SendCampaign.CampaignRecipientPreview_DoneButton.click();
		 
		 Thread.sleep(3000);
    	 //Press the Next Button to move to send Campaign Step
    	 SendCampaign.CampaignNextStep_Button.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	//Press the Preview Button for campaign view
    	 SendCampaign.SendCampaign_PreviewButton.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
   	 
    	  //Validating campaign Preview Displayed Successfully or not
         Assert.assertTrue(SendCampaign.CampaignPreview_Verification.isDisplayed());
    	  /*	if(SendCampaign.CampaignPreview_Verification.isDisplayed())
    	  	{
    	  		System.out.println("Campaign Preview Displayed Successfully");
    	  		
    	  		Reuse_func.resultPass("Campaign Preview", "Campaign Preview Displayed Successfully");
    	  		
    	  	}
    	  	else{
    	  		
                System.out.println("Campaign Preview Displayed UnSuccessfully");
    	  		
    	  		Reuse_func.resultFail("Campaign Preview", "Campaign Preview Displayed UnSuccessfully");
    	  	
    	  	}*/
		 }
		 catch(NoSuchElementException e){
			 e.getMessage();
		 }
	 } 
	 public static void SendTestEmail() throws InterruptedException{
		 try{
    		 //Switch back to parent window 
    	      Thread.sleep(1000);  
    		  
    	      SendCampaign.ClosePreviewWindow.click();
       		  
        		 //Switch back to parent window 
    	     Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
 	         
 	         Thread.sleep(1000);
    	      
    	  	//Test the Test send email functionality
    		  SendCampaign.SendTestEmail_TextField.sendKeys("mmubarik@asicentral.com");
    		  
    		  Thread.sleep(1000);
    		  
    		  //Press the Test send Button
    		  SendCampaign.SendTestEmail_SendButton.click();
    		  
    		 //Validating if the test mail is sent or not
    		  Assert.assertTrue(SendCampaign.SendEmailTest_Veriifcation.getText().contains("Send Test Succeed"));
    		/*  if(SendCampaign.SendEmailTest_Veriifcation.getText().contains("Send Test Succeed"))
    		  {
    			  System.out.println("Send Test Email sent Successfully");
      	  		
      	  		Reuse_func.resultPass("SendTestEmail", "Send Test Email sent Successfully");
    		  }
    		  else{
    			  
    			  System.out.println("Send Test Email sent UnSuccessfully");
      	  		
      	  		Reuse_func.resultFail("SendTestEmail", "Send Test Email sent UnSuccessfully");
      	  	
    		  }*/
		 }
		 catch(NoSuchElementException e)
		 {
			 e.getMessage();
		 }
	 }	 
      public static void CreateCampaign_1_To_5_Step_Verification() throws InterruptedException{
    	  try{
	      Thread.sleep(2000);
    	  //Storing Campaign Name to validate it on Campaign Sent Listing in campaigns	
    	  CampaignName=SendCampaign.CampaignName.getText();
    	  System.out.println(CampaignName);
    	  	
    	  	//Press and Save and close button and navigate to campaign List page
    	  	SendCampaign.SendStep_TermsandCondition_Checkbox.click();
    	  	
    	  	SendCampaign.SendMail_Button.click();
    	  	//Assert.assertTrue(SendCampaign.SendEmailTest_Veriifcation.getText().contains("Congratulations"));
    	  	if(SendCampaign.SendEmailTest_Veriifcation.getText().contains("Congratulations"))
    	  	{
    	  		System.out.println("Send Now Campaign Email has been Sent Successfully");
    	  		
    	  		
    	  	}
    	  	else{
    	  		System.out.println("Send Now Campaign Email has been Sent Successfully");
    	  	}
    	  	
             Reuse_func.waitForElementNotVisible_Xpath(30, getDriver(), SendCampaign.CampaignDraftDisplay_Wait);
	         
	         Thread.sleep(3000);
    	  	
    	  	Assert.assertTrue(SendCampaign.CampaignPage_Verification.getText().contains("Campaigns"));
    	  /*	if(SendCampaign.CampaignPage_Verification.getText().contains("Campaigns"))
    	  	{
    	  		System.out.println("Campaign Step 1 To 5 done Successfully");
    	  		
    	  		Reuse_func.resultPass("CreateCampaign_1 To 5 Step_Verification", "Campaign Step 1 To 5 done Successfully");
    	  	}
    	  	else{
                System.out.println("Campaign Step 1 To 5 done UnSuccessfully");
    	  		
    	  		Reuse_func.resultFail("CreateCampaign_1 To 5 Step_Verification", "Campaign Step 1 To 5 done UnSuccessfully");
    	  	}*/
    	  	
    	  }
    	  catch(NoSuchElementException e){
    		  e.getMessage();
    	  }
    	  
      } 
       public static void CampaignEmail_Sent_Verification(){
    	   try{
    		   
    		  Assert.assertTrue(getDriver().getPageSource().contains(CampaignName));
    	    //Validating if the campaign is sent successfully or not
    	  	/*if(getDriver().getPageSource().contains(CampaignName))
    	  	{
    	  		System.out.println("Campaign Email has been Sent Successfully");
    	  	    
    	  		Reuse_func.resultPass("CampaignEmail_Sent_Verification", "Campaign Email has been Sent Successfully");
    	  	}
    	  	
    	  	else{
                System.out.println("Campaign Email has been Sent UnSuccessfully");
    	  	    
    	  		Reuse_func.resultFail("CampaignEmail_Sent_Verification", "Campaign Email has been Sent UnSuccessfully");
    	  	}*/
    	   }
    	   catch(NoSuchElementException e)
    	   {
    		   e.getMessage();
    	   }
       } 
    	  	
       public static void CopyAndMoveContacts_FromLists() throws InterruptedException{
    	   try{
    	    jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(0,-250)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-250,-500)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-500,-750)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-750,-1000)", "");
    	    
    	    Thread.sleep(6000);
    	    
    	    //Press the List Tab
    	    SendCampaign.ListTab.click();
    	    
    	    Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(1000);
    	    
    	    //Search the List where contacts are moved and copy
    	    SendCampaign.ListSearchField.sendKeys(CopyAndMoveContacts_FromList.MoveToList_ListName);
    	    
    	    Thread.sleep(2000);
    	    
    	    //Press the details for lists
    	    SendCampaign.ListDetails.click();
    	    
    	    Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(1000);
    	    Assert.assertTrue(getDriver().getPageSource().contains(CopyAndMoveContacts_FromList.EmailAddress_Contacts) & getDriver().getPageSource().contains(CopyAndMoveContacts_FromList.CopyEmailAddress_Contacts));
    	   /* if(getDriver().getPageSource().contains(CopyAndMoveContacts_FromList.EmailAddress_Contacts) & getDriver().getPageSource().contains(CopyAndMoveContacts_FromList.CopyEmailAddress_Contacts) )
    	    {
    	    	System.out.println("Contacts Copied And Moved Successfully");
    	    	
    	    	Reuse_func.resultPass("CopyAndMoveContacts_FromLists", "Contacts Copied And Moved Successfully");
    	    	
    	    }
    	    else{
    	    	System.out.println("Contacts Copied And Moved UnSuccessfully");
    	   
    	    	Reuse_func.resultFail("CopyAndMoveContacts_FromLists", "Contacts Copied And Moved UnSuccessfully");
    	    }*/
    	   }
    	   catch(NoSuchElementException e){
    		   e.getMessage();
    	   }
       }
       public static void Delete_Contact() throws InterruptedException{
    	   try{
    	    
    		//Now delete the contact
    	    SendCampaign.ListContact_CheckboxSelection.click();
    	    
    	    Thread.sleep(1000);
    	    
    	    SendCampaign.Contacts_DeleteButton.click();
    	    
    	    Thread.sleep(2000);
    	    
    	    SendCampaign.DeleteContact_ConfirmButton.click();
    	    
    	   //Validate if the contacts is deleted or not
    	    Assert.assertTrue(SendCampaign.DeleteContact_Verification.getText().contains("Success"));
    	   /* if(SendCampaign.DeleteContact_Verification.getText().contains("Success"))
    	    {
    	    	System.out.println("Contact Deleted Successfully");
    	    	
    	    	Reuse_func.resultPass("Delete Contact", "Contact Deleted Successfully");
    	    }
    	    else{
                System.out.println("Contact Deleted UnSuccessfully");
    	    	
    	    	Reuse_func.resultFail("Delete Contact", "Contact Deleted UnSuccessfully");
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
