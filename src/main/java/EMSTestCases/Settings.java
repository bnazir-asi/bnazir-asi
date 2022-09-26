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
import PageFactoryandTestData.EMS_TestData;


public class Settings extends EMS_Execution {
	static WebElement ClearField;
	public static JavascriptExecutor jse;
	public static String CampaignName;
	
	static Reuse_Functions Reuse_func=new Reuse_Functions();
	
	static EMS_Locators Settings = PageFactory.initElements(getDriver(), EMS_Locators.class);

	public static void Settings_AlertMessageVerification_ChangesUnsaved() throws IOException, InterruptedException, AWTException{
		try{
	 
		 //Press the settings tab
			 Settings.SettingsTab.click();
			 
			 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	          Thread.sleep(1000);

	  //Press the Company Address
			 Settings.Settings_CompanySettings.click();
			 
			 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	          Thread.sleep(1000);
			 
	   	     ClearField = Settings.CompanySettings_PhoneField;
			 ClearField.sendKeys(Keys.CONTROL + "a");
			 ClearField.sendKeys(Keys.DELETE);	 
		
			 Thread.sleep(1000);
			 
			 //Enter the New Phone number
			 Settings.CompanySettings_PhoneField.sendKeys("03444080725");
			 
			 
			 
			 //Remove the Address
			 ClearField = Settings.CompanySettings_Address1;
			 ClearField.sendKeys(Keys.CONTROL + "a");
			 ClearField.sendKeys(Keys.DELETE);	 
		
			 Thread.sleep(1000);
		   
			 Settings.CompanySettings_Address1.sendKeys("New York");
			 
			 Thread.sleep(10000);
			 
			 Settings.CompanySettings_Address1.sendKeys(Keys.ENTER);
			 
			 Thread.sleep(2000);
			 
			 //Enter the Postal Code
			 ClearField = Settings.CompanySettings_PostalCode;
			 ClearField.sendKeys(Keys.CONTROL + "a");
			 ClearField.sendKeys(Keys.DELETE);	
			 
			 Settings.CompanySettings_PostalCode.sendKeys("234567");
			 
			 //Clear the From Name Field and enter data
			 Settings.Settings_FromName_Field.clear();
			 
			 Settings.Settings_FromName_Field.sendKeys("Automation Regular User");

			 //Press the campaign tab For Setting Alert Verification
			 Settings.CampaignsTab.click();
			 
			 Thread.sleep(1000);
			 Assert.assertTrue(Settings.WithoutSavingSettings_WhileMovingToOtherTab_AlertVerification.isDisplayed() & Settings.AlertCancelButton.isDisplayed() & Settings.AlertOkButton.isDisplayed());
			/* if(Settings.WithoutSavingSettings_WhileMovingToOtherTab_AlertVerification.isDisplayed() & Settings.AlertCancelButton.isDisplayed() & Settings.AlertOkButton.isDisplayed())
			 {
				 System.out.println("Settings Screen if screen has unsaved changes, display message to user Successfully");
			     Reuse_func.resultPass("Settings_AlertMessageVerification_ChangesUnsaved","Settings Screen if screen has unsaved changes, display message to user Successfully" );
			 
			 }
			 else{
				 System.out.println("Settings Screen if screen has unsaved changes, display message to user Unsuccessfully");
			     Reuse_func.resultFail("Settings_AlertMessageVerification_ChangesUnsaved","Settings Screen if screen has unsaved changes, display message to user Unsuccessfully" ); 
				 
			 }*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void FromNameField_SettingsUpdated_Campaign_Verification() throws InterruptedException{
		try{
			 //Press the Cancel Button
			 Settings.AlertCancelButton.click();
			 
			 Thread.sleep(1000);
			 
			 //Press the Save Button
			 Settings.CompanySettings_SaveButton.click();
			 
			 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	         Thread.sleep(1000);
			 
			 jse= (JavascriptExecutor)getDriver();
		     jse.executeScript("window.scrollBy(0,-250)", "");
		        
		     jse= (JavascriptExecutor)getDriver();
		     jse.executeScript("window.scrollBy(-250,-500)", "");
		     
		     jse= (JavascriptExecutor)getDriver();
		     jse.executeScript("window.scrollBy(-500,-750)", "");
			 
			 Thread.sleep(1000);
			 
			 //Press the campaigns Tab
			  //Press the campaign tab
			 Settings.CampaignsTab.click();
	    	 
	    	 //Wait for the Page to be loaded completely
	    	 
	    	// block-ui-message ng-binding
	    	  
			 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	         Thread.sleep(1000);
	    	 //Press the Create Campaign Button
			 Settings.CreateCampaignButton.click();
	    	 
	    	//Wait for the Page to be loaded completely 
	    	
			 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	         Thread.sleep(1000);
	    	 
	    	
	    	 //Enter the campaign name
			 Settings.CampaignName_Field.sendKeys(EMS_TestData.CampaignNames);
	    	 
	    	 //Enter the Subject line
	    	 Settings.SubjectLine_Field.sendKeys("Automation Campaign");
	    	 
	    	 //Enter the from Field data
	    	 
	    	 WebElement FromNameFieldValueVerification=Settings.FromName_Field;
	   	     String FromName=FromNameFieldValueVerification.getAttribute("value");
	   	  
	   	     System.out.println(FromName);
	    	Assert.assertTrue(FromName.contains("Automation Regular User"));
	   /*	  if(FromName.contains("Automation Regular User"))
	    	 {
	    		 System.out.println("From Name Field From Settings Updated in Campaign Flow Successfully");
	    		 
	    		 Reuse_func.resultPass("FromNameField_SettingsUpdated_Campaign_Verification", "From Name Field From Settings Updated in Campaign Flow Successfully");
	    	 }
	    	 else{
	    		 System.out.println("From Name Field From Settings Updated in Campaign Flow  UnSuccessfully");
	    		
	    		 Reuse_func.resultFail("FromNameField_SettingsUpdated_Campaign_Verification", "From Name Field From Settings Updated in Campaign Flow  UnSuccessfully");
	    	 
	    	 }*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void Campaign_Info_Creation() throws InterruptedException{
		try{
	    	 //Press the Next Button
	    	 Settings.CampaignNextStep_Button.click();
	    	 
	    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	            Thread.sleep(1000);
	    	 Assert.assertTrue(Settings.TemplatesStep_Verification.getText().contains("All Templates"));
	   /* 	 if(Settings.TemplatesStep_Verification.getText().contains("All Templates"))
	    	 {
	    		 System.out.println("Campaign Info Added and saved Successfully");
	    		 Reuse_func.resultPass("CampaignInfo_Creation", "Campaign Info Added and saved Successfully");
	    	 }
	    	 else{
	    		 System.out.println("Campaign Info Added and saved UnSuccessfully");
	    		 Reuse_func.resultFail("CampaignInfo_Creation", "Campaign Info Added and saved UnSuccessfully");
	    	 }*/

		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
	    
	public static void Blank_Template_Creation() throws InterruptedException{
		try{
	       //Press the Blank template button
	    	 Settings.ChooseTemplate_BlankTemplateButton.click();
			 
			 //Enter the Template Name
	    	 Settings.TemplateName_InsertionField.sendKeys(EMS_TestData.TemplateNames);
			 
			 //Press the Create Template Button
	    	 Settings.Template_CreateButton.click();
			 
			 
	    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	            Thread.sleep(1000);
	    	
			 //Validating that the editor step occurs successfully and template created successfully
	            Assert.assertTrue(Settings.EditorStep_Verification.getText().contains("EMS"));
	    /*	 if(Settings.EditorStep_Verification.getText().contains("EMS"))
	    	 {
	    		System.out.println("New Blank Template Created Successfully");
	    		
	    		Reuse_func.resultPass("Blank Template Creation", "New Blank Template Created Successfully");
	    	 }
	    	 else{
	    		 System.out.println("New Blank Template Created UnSuccessfully"); 
	    	  
	    		 Reuse_func.resultFail("Blank Template Creation", "New Blank Template Created Successfully");
	    	 
	    	 }*/
	    	 
		}catch(NoSuchElementException e){
			e.getMessage();
		}
		
	}	
	 public static void Settings_CompanyAddress_Verification() throws InterruptedException{
		 try{
	    	 
	    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	            
	            Thread.sleep(1000);
			
			 Assert.assertTrue(Settings.CompanyAddressVerification_Campaign.getText().contains("New York, New York, NY") & Settings.CompanyAddressVerification_Campaign.getText().contains("03444080725"));
		/*	 if(Settings.CompanyAddressVerification_Campaign.getText().contains("New York, New York, NY") & Settings.CompanyAddressVerification_Campaign.getText().contains("03444080725"))
			 {
				 System.out.println("Settings Company Address Updated Successfully");
				 
				 Reuse_func.resultPass("Settings_CompanyAddress_Verification", "Settings Company Address Updated Successfully");
			 }
			 else{
				 
                 System.out.println("Settings Company Address Updated UnSuccessfully");
				 
				 Reuse_func.resultFail("Settings_CompanyAddress_Verification", "Settings Company Address Updated UnSuccessfully");
			 }*/
		 }catch(NoSuchElementException e){
			 e.getMessage();
			 
		 }
	 } 
			 
	public static void ScheduledCampaign_Cancel() throws InterruptedException, IOException, AWTException{
		try{
	 CampaignEditor.LinkTOURLButton_PopUpMessage_Verification();
	 
	 CampaignEditor.ButtonText_Updation_Verification_DuringCampaign();
	 
	 CampaignEditor.ProductAlignement_Below();	
	 
	 CampaignEditor.ProductAlignement_Right();
	 
	 CampaignEditor.ProductAlignement_Left();
	 
	 CampaignEditor.ProductAlignement_Above();
	 
	 CampaignEditor.Campaign_Editor_Creation();
	 
	 CampaignEditor.RecipientList_SelectionTextVerification();
	 
	 //Press the CreateList Button
		Settings.Campaign_CreateListButton.click();
   	 
   	 //Enter the List Name and Press Create Button
		Settings.ListName_Field.sendKeys(EMS_TestData.ListNameSettings);
   	 
		Settings.List_CreateButton.click();
   	 
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
 	     
 	   WebElement ListNameVerification=Settings.ListCreationVerification;
	   String ListName=ListNameVerification.getAttribute("value");
	  
	   System.out.println(ListName);
   	 
   	 //Thread.sleep(8000);
   	 
   	 //Validating List Created Successfully or not
	   Assert.assertTrue(ListName.contains("EMS List"));
   	/* if(ListName.contains("EMS List"))
   	 {
   		 System.out.println("List Created Successfully");
   		 
    }
   	 else{
   		 System.out.println("List Created UnSuccessfully");
   		}*/
   	 //Add Contacts into list
   	Settings.AddContactsToList_Field.sendKeys("b");
   	 
   	 Thread.sleep(4000);
   	 
   	Settings.AddContactsToList_Field.sendKeys("nazir@asicentral.com");
   	 
   	 Thread.sleep(4000);
   	 
   	 
   	Settings.AddContactsToList_Field.sendKeys(Keys.ENTER);
   	 
   	Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
    
    Thread.sleep(1000);
 	    
		
 	 //Press the Back To Campaign Screen
 	   Settings.BackToCampaignLink_AddListPage.click();
   	 
 	  Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
      
      Thread.sleep(1000);
		
		
   	 //Press the Next Button to move to send Campaign Step
   	Settings.CampaignNextStep_Button.click();
	 
   	Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
    
    Thread.sleep(1000);
	 
	//Storing Campaign Name to validate it on Campaign Sent Listing in campaigns	
  	  CampaignName=Settings.CampaignName.getText();
  	  System.out.println(CampaignName);
	 
	 Settings.ScheduleEmail_SendStep_RadioButton.click();
	 
	 Thread.sleep(2000);
	 
	 //Click the agreement for send schedule campaign
	 Settings.SendStep_TermsandCondition_Checkbox.click();
	 
	 Thread.sleep(1000);
	 
	 //Press the Schedule Button
	 Settings.SendScheduleCampaignButton.click();
	// Assert.assertTrue(Settings.SendEmailTest_Veriifcation.getText().contains("Your email has been saved"));
	 if(Settings.SendEmailTest_Veriifcation.getText().contains("Your email has been saved"))
	  	{
	  		System.out.println("Schedule Campaign Email has been Saved Successfully");
	  		
	  		
	  	}
	  	else{
	  		System.out.println("Schedule Campaign Email has been Saved UnSuccessfully");
	  	}
	  	
	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	  	 
	Reuse_func.Hover(Settings.ScheduledCampaign_Verification, getDriver());
	
	Thread.sleep(3000);
	  	 
	//Press the Cancel Button to go back to the send step
	  	 Settings.CancelScheduledCampaignSend.click();
	  	 
	  	 Thread.sleep(1000);
	  	 
	  	 Reuse_func.waitForElementNotVisible_Xpath(40, getDriver(),Settings.DeliverySendPage_TextDisplay_Wait);
	  	 
	  	 Thread.sleep(2000);
	  	 
	  	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
	 	 Assert.assertTrue(getDriver().getPageSource().contains(CampaignName));
	 	/* if(getDriver().getPageSource().contains(CampaignName))
	 	 {
	 		 System.out.println("Scheduled Campaign Canceled Successfully");
	 		 
	 		 Reuse_func.resultPass("ScheduledCampaign_Cancel", "Scheduled Campaign Canceled Successfully");
	 	 }
	 	 else{
	 		System.out.println("Scheduled Campaign Canceled UnSuccessfully");
	 		 
	 		 Reuse_func.resultFail("ScheduledCampaign_Cancel", "Scheduled Campaign Canceled UnSuccessfully");
	 	 }*/
	 	
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
	 public static void Scheduled_Campaign() throws InterruptedException{
		 try{
	 	 
	 	 Settings.ScheduleEmail_SendStep_RadioButton.click();
		 
		 Thread.sleep(2000);
		 
		 //Click the agreement for send schedule campaign
		 Settings.SendStep_TermsandCondition_Checkbox.click();
		 
		 Thread.sleep(1000);
		 
		 //Press the Schedule Button
		 Settings.SendScheduleCampaignButton.click();
		 
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		// Assert.assertTrue(Settings.ScheduledCampaign_Verification.isDisplayed());
	 if(Settings.ScheduledCampaign_Verification.isDisplayed())
		 {
			 System.out.println("Campaign Has been Scheduled Successfully");
			 
			 Reuse_func.resultPass("Scheduled_Campaign", "Campaign Has been Scheduled Successfully");
		 }
		 else{
             System.out.println("Campaign Has been Scheduled UnSuccessfully");
			 
			 Reuse_func.resultFail("Scheduled_Campaign", "Campaign Has been Scheduled Successfully");
		 }
		
	  	 
   	  
   	  
			
		
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}



}
