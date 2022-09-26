package EMS_Corporate_CampaignList_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class CreateListButton_OnlyDisplayCampaignOwner extends EMS_Corporate_CampaignList_Execution {
	 public static WebElement SwitchTenent;
		
		public static Select dropdownValue;
		
		static EMS_Locators CreateListButton_ForCampaignOwner = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void CreateListButton_VisibilityToCampaignOwnerOnly() throws IOException, InterruptedException, AWTException{
		try{
    	 Thread.sleep(15000);
    	 
    	 CreateListButton_ForCampaignOwner.UserInfo_Gravter.click();
    	 
    	 Thread.sleep(1000);
    	 
    	 //Thread.sleep(2000);
		    if(getDriver().getCurrentUrl().contains("stage"))
		    {	
		    SwitchTenent=CreateListButton_ForCampaignOwner.UserInfo_SwitchTenent_Dropdown;
			dropdownValue= new Select(SwitchTenent);
			dropdownValue.selectByVisibleText("AIA/My Corporate Expressions (04B2)");
		    }
		    else if(getDriver().getCurrentUrl().contains("uat"))
		    {
		    	SwitchTenent=CreateListButton_ForCampaignOwner.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
			   //dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");	
			    dropdownValue.selectByVisibleText("Promodonnas (asi/444514) (10AA)");	
			  
		    }
		    else{
		    	
		    	SwitchTenent=CreateListButton_ForCampaignOwner.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
				dropdownValue.selectByVisibleText("AIA OWNER A Production Testing Company (12SP)");
		    	
		    
		    }
		
		     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		    
		    CreateListButton_ForCampaignOwner.EmailMarketingTab.click();
		    
		    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		    Thread.sleep(2000);
		    
		    //Press the campaign tab
		    CreateListButton_ForCampaignOwner.CampaignsTab.click();
		
		
		    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	 
	    	 //Press the Create Campaign Button
			 CreateListButton_ForCampaignOwner.CreateCampaignButton.click();
	    	 
	    	//Wait for the Page to be loaded completely 
	    	 
			 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	 
	    	
	    	 //Enter the campaign name
			 CreateListButton_ForCampaignOwner.CampaignName_Field.sendKeys(EMS_TestData.CampaignName);
	    	 
	    	 //Enter the Subject line
			 CreateListButton_ForCampaignOwner.SubjectLine_Field.sendKeys("Automation Campaign");
	    	 
	    	 //Enter the from Field data
			 CreateListButton_ForCampaignOwner.FromName_Field.sendKeys("Test Automation Campaign");
	    	
	    	 //Press the Next Button
			 CreateListButton_ForCampaignOwner.CampaignNextStep_Button.click();
	    	 
			 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	 
	    	 
		   
	    	 Reuse_Functions_Corp_CampaignsList.waitForElementToBeClickable_Xpath(120, getDriver(),CreateListButton_ForCampaignOwner.TemplatesDisplay_Wait);
	    	 
	    	 Thread.sleep(2000);
	    	 //Press the Blank template button
	    	 CreateListButton_ForCampaignOwner.ChooseTemplate_BlankTemplateButton.click();
			 
			 //Enter the Template Name
	    	 CreateListButton_ForCampaignOwner.TemplateName_InsertionField.sendKeys(EMS_TestData.TemplateName);
			 
			 //Press the Create Template Button
	    	 CreateListButton_ForCampaignOwner.Template_CreateButton.click();
			 
			 
	    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	
			 //Validating that the editor step occurs successfully and template created successfully
	    	 if(CreateListButton_ForCampaignOwner.EditorStep_Verification.getText().contains("EMS"))
	    	 {
	    		System.out.println("New Blank Template Created Successfully");
	    		
	    		
	    	 }
	    	 else{
	    		 System.out.println("New Blank Template Created UnSuccessfully"); 
	    	  
	    		 
	    	 
	    	 }
	    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	 
	    	 //Press the Next Button
	    	 CreateListButton_ForCampaignOwner.EditorStep_NextButton.click();
	    	    
	    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	    
	    	    if(CreateListButton_ForCampaignOwner.EditorStepSuccessfull_Verification.getText().contains("Recipients"))
	    	    {
	    	    	System.out.println(" Campaign Editor Step Done Successfully");
	        		
	        	}
	    	    else{
	    	    	
	    	    	 System.out.println("Campaign Editor Step Done UnSuccessfully"); 
	    	     }
	    	    
	    	 
	    	 
	    	 
	       CreateListButton_ForCampaignOwner.Button_Cancel_TemplateWhileCampaign.click();
		   
	       Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		   
		   CreateListButton_ForCampaignOwner.UserInfo_Gravter.click();
		    
		    //Thread.sleep(2000);
		    if(getDriver().getCurrentUrl().contains("stage"))
		    {	
		    SwitchTenent=CreateListButton_ForCampaignOwner.UserInfo_SwitchTenent_Dropdown;
			dropdownValue= new Select(SwitchTenent);
			dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
		    }
		    else if(getDriver().getCurrentUrl().contains("uat"))
		    {
		    	SwitchTenent=CreateListButton_ForCampaignOwner.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
			    dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");	
		    }
		    else{
		    	
		    	SwitchTenent=CreateListButton_ForCampaignOwner.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
				dropdownValue.selectByVisibleText("AIA Corporate Production Testing Company (12SO)");
		    	
		    }
		
		    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		    
		    CreateListButton_ForCampaignOwner.EmailMarketingTab.click();
		    
		    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		     
              Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		    
		    //Press the campaign tab
		    CreateListButton_ForCampaignOwner.CampaignsTab.click();
		
		
		    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
			  
			CreateListButton_ForCampaignOwner.SearchCampaign_CampaignTab.sendKeys(EMS_TestData.CampaignName);
			 
			 Thread.sleep(5000);
			 
			 //Go to Campaign Details
			 CreateListButton_ForCampaignOwner.CampaignDetails.click();
			 
			 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
			 
			//Press the Next Button
	    	 CreateListButton_ForCampaignOwner.EditorStep_NextButton.click();
	    	    
	    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	 
	    	 
	    	 List <WebElement> elementcount = CreateListButton_ForCampaignOwner.ListButton_Verification_CampaignFlow;
		      
		      int count=elementcount.size();
		      
		      System.out.println(count);
		      
		      if(count==0)
		      {
		    	 System.out.println("Create List Button is not displayed to Parent user in campaign details Recipient screen");
		    	 Reuse_Functions_Corp_CampaignsList.resultPass("Create List button in Campaign workflow - only display to Campaign owner.", "Create List Button is not displayed Successfully to Parent user in campaign details Recipient screen");
		      }
		      else{
		    	  
		    	  System.out.println("Create List Button is not displayed to Parent user in campaign details Recipient screen");
			      Reuse_Functions_Corp_CampaignsList.resultFail("Create List button in Campaign workflow - only display to Campaign owner.", "Create List Button is not displayed UnSuccessfully to Parent user in campaign details Recipient screen");
		    	  
		    	}
		      
		      CreateListButton_ForCampaignOwner.Button_Cancel_TemplateWhileCampaign.click();
			   
		      Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			     
			  Thread.sleep(1000);
		
			   
		
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	
	/*  finally {
		  CreateListButton_ForCampaignOwner.Button_Cancel_TemplateWhileCampaign.click();
		   
	      Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		  Thread.sleep(1000);
	}*/
	
	
	}
}
