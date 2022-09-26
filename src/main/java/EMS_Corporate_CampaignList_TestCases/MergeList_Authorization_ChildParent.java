package EMS_Corporate_CampaignList_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions_Corp;
import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;



public class MergeList_Authorization_ChildParent extends EMS_Corporate_CampaignList_Execution {
	static EMS_Locators MergeListAuth = PageFactory.initElements(getDriver(), EMS_Locators.class);
	
	public static void ListContacts_Verification_With_Authorization_CampaignLevel_Corporate() throws IOException, InterruptedException, AWTException{
		try{
	 
			MergeListAuth.UserInfo_Gravter.click();
				
			Thread.sleep(1000);
				
			//Press the Logout Button
			MergeListAuth.UserInfo_Logout.click();
				
			Thread.sleep(3000);
			
			if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
			{
				MergeListAuth.EspASINo.sendKeys(EMS_TestData.ASINo_Adminchild);
				
				
				//Enter Username 
				MergeListAuth.EspUserName.sendKeys(EMS_TestData.Username_Adminchild);
		   	 
		   	 //Enter Password
				MergeListAuth.EspPassword.sendKeys(EMS_TestData.Password_NonAdminchild);
		   	
		   	 //Now Press the Login Button
		   	 
				MergeListAuth.EspLoginButton.click();
			}
			
			else{
				//Enter Username 
				MergeListAuth.EspUserName.sendKeys(EMS_TestData.Username_Adminchild);
		   	 
		   	 //Enter Password
				MergeListAuth.EspPassword.sendKeys(EMS_TestData.Password_NonAdminchild);
		   	
		   	 //Now Press the Login Button
		   	 
				MergeListAuth.EspLoginButton.click();
			}
			
			
			Thread.sleep(8000);
			
			MergeListAuth.EmailMarketingTab.click();
			
			Thread.sleep(7000);
			
			MergeListAuth.ListTab.click();
			
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			 
			Thread.sleep(8000);
    	
			 //Press the Create List Button
			MergeListAuth.CreateListButton_ListPage.click();
		    	 
		    	 //Enter the List Name and Press Create Button
			MergeListAuth.ListName_Field.sendKeys(EMS_TestData.MergeListAuth);
		    	 
			MergeListAuth.List_CreateButton.click();
			
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			 
			Thread.sleep(2000);
			
			//Add Contacts into list
			MergeListAuth.AddContactsToList_Field.sendKeys("b");
	    	 
	    	 Thread.sleep(4000);
	    	 
	    	MergeListAuth.AddContactsToList_Field.sendKeys("nazir@asicentral.com");
	    	 
	    	 Thread.sleep(4000);
	    	 
	    	 
	    	 MergeListAuth.AddContactsToList_Field.sendKeys(Keys.ENTER);
	    	 
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			 
		     Thread.sleep(2000);
		     
		     MergeListAuth.BackLink_ListNavigation.click();
		   	 
             Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			 
		     Thread.sleep(2000);
		     
		     MergeListAuth.UserInfo_Gravter.click();
				
			Thread.sleep(1000);
					
			//Press the Logout Button
			MergeListAuth.UserInfo_Logout.click();
			 Thread.sleep(5000);
			if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
			{	
			//Now login with non admin child user
			MergeListAuth.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
			
			
			//Enter Username 
			MergeListAuth.EspUserName.sendKeys(EMS_TestData.Username_Corp);
	   	 
	   	 //Enter Password
			MergeListAuth.EspPassword.sendKeys(EMS_TestData.Password_Corp);
	   	
	   	 //Now Press the Login Button
	   	 
		    MergeListAuth.EspLoginButton.click();
			
			}
			else{
				//Now login with non admin child user
				 MergeListAuth.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
				
				
				//Enter Username 
				 MergeListAuth.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
		   	 
		   	 //Enter Password
				 MergeListAuth.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
		   	
		   	 //Now Press the Login Button
		   	 
				MergeListAuth.EspLoginButton.click();
			}
            Thread.sleep(5000);
			
			MergeListAuth.EmailMarketingTab.click();
			
			Thread.sleep(8000);
			
			MergeListAuth.CampaignsTab.click();
	    	 
	         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
	    	 
	    	 //Press the Create Campaign Button
		     MergeListAuth.CreateCampaignButton.click();
	    	 
	         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
			 
			 //First Select the Merge campaign from campaigns options
		     MergeListAuth.MergeCamapaign_RadioOption.click();
			 
	         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
			 
			//Enter the campaign name
		     MergeListAuth.CampaignName_Field.sendKeys(EMS_TestData.MergeCampaignList_Verify);
			 
			//Enter the Subject line
		     MergeListAuth.SubjectLine_Field.sendKeys("Automation Merge Campaign");
			 
			//Clear the From field to validate the Restore Default Functionality
		     MergeListAuth.FromName_Field.clear();
			 
			//Enter the from Field data
		     MergeListAuth.FromName_Field.sendKeys("Test Automation Campaign");
		     
		     MergeListAuth.CampaignNextStep_Button.click();
		 	 
		   	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		 	 
		 	 Reuse_Functions_Corp_CampaignsList.waitForElementToBeClickable_Xpath(120, getDriver(),MergeListAuth.TemplatesDisplay_Wait);
			 
			 Thread.sleep(2000);
			 
			 MergeListAuth.ExistingTemplate.click();
			 
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(4000);
			 
			MergeListAuth.EditorStep_NextButton.click();
			//WebElement ele= driver.findElement(By.xpath("//button[contains(@class,'btn btn-sm btn-primary ems-btn-narrow ems-width-three-tenth')]"));
			// exe = (JavascriptExecutor)driver;
			// exe.executeScript("arguments[0].click();",ele);
		     
		     Reuse_Functions_Corp_CampaignsList.PageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(2000);
		     
		     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(6000);
		     
		     MergeListAuth.CampaignLevel_Searchfield.sendKeys(EMS_TestData.MergeListAuth);
		     
            Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		    Thread.sleep(2000);
		    Assert.assertTrue(MergeListAuth.CampaignRecipient_ListPreview_DetailsLink.getText().contains(EMS_TestData.MergeListAuth));
		 /*   if(MergeListAuth.CampaignRecipient_ListPreview_DetailsLink.getText().contains(EMS_TestData.MergeListAuth))
		    {
		    	System.out.println("Child List Displayed to Corporate Parent User At campaign Level List with Authorization ON Successfully");
		    	
		    	Reuse_Functions_Corp_CampaignsList.resultPass("ListContacts_Verification_With_AuthorizationON_CampaignLevel_Corporate","Child List Displayed to Corporate Parent User At campaign Level List with Authorization ON Successfully");
		    }
		    else{
                System.out.println("Child List Displayed to Corporate Parent User At campaign Level List with Authorization ON UnSuccessfully");
		    	
		    	Reuse_Functions_Corp_CampaignsList.resultFail("ListContacts_Verification_With_AuthorizationON_CampaignLevel_Corporate","Child List Displayed to Corporate Parent User At campaign Level List with Authorization ON UnSuccessfully");
		    }*/
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}

public static void ListsContactsRemoval_AfterRevokingAuthorization_MergeCampaign() throws InterruptedException, IOException{
	
	try{
		MergeListAuth.ListSelection_WhileEditing.click();
		
		Thread.sleep(1000);
		
		MergeListAuth.CampaignNextStep_Button.click();
		 
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
	     
	     MergeListAuth.SendStep_TermsandCondition_Checkbox.click();
		  	
	     MergeListAuth.SendMail_Button.click();
		  	
		  Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		  Thread.sleep(15000);
		  
		  MergeListAuth.UserInfo_Gravter.click();
			
			Thread.sleep(1000);
				
			//Press the Logout Button
			MergeListAuth.UserInfo_Logout.click();
				
			Thread.sleep(3000);
		  	 
			if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
			{
				MergeListAuth.EspASINo.sendKeys(EMS_TestData.ASINo_Adminchild);
				
				
				//Enter Username 
				MergeListAuth.EspUserName.sendKeys(EMS_TestData.Username_Adminchild);
		   	 
		   	 //Enter Password
				MergeListAuth.EspPassword.sendKeys(EMS_TestData.Password_NonAdminchild);
		   	
		   	 //Now Press the Login Button
		   	 
				MergeListAuth.EspLoginButton.click();
			}
			
			Thread.sleep(8000);
		  	
			MergeListAuth.UserInfo_Gravter.click();
		      
		      Thread.sleep(1000);
		      
		      MergeListAuth.CRM_SettingsOption.click();
		      
		      Thread.sleep(2000);
		      
		      //Press The CRM Data Access Option
		      MergeListAuth.CRM_Settings_DataAccessOption.click();
		      
		      Thread.sleep(3000);
		     
		      List <WebElement> elementcount = MergeListAuth.AIA_Switch_ON_ToggleVerification;
		      
		      int count=elementcount.size();
		      
		      System.out.println(count);
		      
		      if(count==0)
		      {
		    	  MergeListAuth.Allow_AIA_AccessSwitch.click();
		    	  
		    	  Thread.sleep(1000);
		    	  
                   MergeListAuth.Allow_AIA_AccessSwitch.click();
		    	  
		    	  Thread.sleep(1000);
		    	 
		      }
		      else{
		    	  
		    	 MergeListAuth.Allow_AIA_AccessSwitch.click();
		    	  
		    	  Thread.sleep(1000);
		    	  
		    	}
		      
		      MergeListAuth.UserInfo_Gravter.click();
				
				 Thread.sleep(1000);
					
				//Press the Logout Button
				 MergeListAuth.UserInfo_Logout.click();
					
				 Thread.sleep(3000);
				 
				 if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
					{	
					//Now login with non admin child user
					MergeListAuth.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
					
					
					//Enter Username 
					MergeListAuth.EspUserName.sendKeys(EMS_TestData.Username_Corp);
			   	 
			   	 //Enter Password
					MergeListAuth.EspPassword.sendKeys(EMS_TestData.Password_Corp);
			   	
			   	 //Now Press the Login Button
			   	 
				    MergeListAuth.EspLoginButton.click();
					
					}
					else{
						//Now login with non admin child user
						 MergeListAuth.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
						
						
						//Enter Username 
						 MergeListAuth.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
				   	 
				   	 //Enter Password
						 MergeListAuth.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
				   	
				   	 //Now Press the Login Button
				   	 
						MergeListAuth.EspLoginButton.click();
					}
		            Thread.sleep(5000);
					
					MergeListAuth.EmailMarketingTab.click();
					
					Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
				     
					Thread.sleep(4000);
					
					MergeListAuth.CampaignsTab.click();
			    	 
			        Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
				     
				    Thread.sleep(2000);
				    Assert.assertTrue(MergeListAuth.RecepientCount.getText().contains("0"));
				  /*  if(MergeListAuth.RecepientCount.getText().contains("0"))
				    {
				    	System.out.println("After revoking the Authorization from child user the recepient count becomes 0 at corporate for the merge campaign Successfully");
				        
				    	Reuse_Functions_Corp_CampaignsList.resultPass("ListsContactsRemoval_AfterRevokingAuthorization_MergeCampaign", "After revoking the Authorization from child user the recepient count becomes 0 at corporate for the merge campaign Successfully");
				    
				    }
				    
				    else{
                        System.out.println("After revoking the Authorization from child user the recepient count becomes 0 at corporate for the merge campaign UnSuccessfully");
				        
				    	Reuse_Functions_Corp_CampaignsList.resultFail("ListsContactsRemoval_AfterRevokingAuthorization_MergeCampaign", "After revoking the Authorization from child user the recepient count becomes 0 at corporate for the merge campaign UnSuccessfully");
				    }*/
				 
		     
		
	}catch(NoSuchElementException e){
		e.getMessage();
	}

finally {
	AuthorizationInvoke.InvokeAuthorization();
}

}

	





}