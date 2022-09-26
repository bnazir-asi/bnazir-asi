package EMS_Corporate_CampaignList_TestCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class AuthorizationInvoke extends EMS_Corporate_CampaignList_Execution {
   
	static EMS_Locators InvokeAuthor=PageFactory.initElements(getDriver(), EMS_Locators.class);
	
  public static void InvokeAuthorization() throws InterruptedException{
	  InvokeAuthor.UserInfo_Gravter.click();
		
		Thread.sleep(1000);
			
		//Press the Logout Button
		InvokeAuthor.UserInfo_Logout.click();
			
		Thread.sleep(3000);
	  	 
		if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
		{
			InvokeAuthor.EspASINo.sendKeys(EMS_TestData.ASINo_Adminchild);
			
			
			//Enter Username 
			InvokeAuthor.EspUserName.sendKeys(EMS_TestData.Username_Adminchild);
	   	 
	   	 //Enter Password
			InvokeAuthor.EspPassword.sendKeys(EMS_TestData.Password_NonAdminchild);
	   	
	   	 //Now Press the Login Button
	   	 
			InvokeAuthor.EspLoginButton.click();
		}
		
		Thread.sleep(8000);
	  	
		InvokeAuthor.UserInfo_Gravter.click();
	      
	      Thread.sleep(1000);
	      
	      InvokeAuthor.CRM_SettingsOption.click();
	      
	      Thread.sleep(2000);
	      
	      //Press The CRM Data Access Option
	      InvokeAuthor.CRM_Settings_DataAccessOption.click();
	      
	      Thread.sleep(3000);
	     
	      List <WebElement> elementcount = InvokeAuthor.AIA_Switch_ON_ToggleVerification;
	      
	      int count=elementcount.size();
	      
	      System.out.println(count);
	      
	      if(count>0)
	      {
	    	  InvokeAuthor.Allow_AIA_AccessSwitch.click();
	    	  
	    	  Thread.sleep(1000);
	    	  
             InvokeAuthor.Allow_AIA_AccessSwitch.click();
	    	  
	    	  Thread.sleep(1000);
	    	 
	      }
	      else{
	    	  
	    	 InvokeAuthor.Allow_AIA_AccessSwitch.click();
	    	  
	    	  Thread.sleep(1000);
	    	  
	    	}
	      
	      InvokeAuthor.UserInfo_Gravter.click();
			
			 Thread.sleep(1000);
				
			//Press the Logout Button
			 InvokeAuthor.UserInfo_Logout.click();
				
			 Thread.sleep(3000);
			 
			 if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
				{	
				//Now login with non admin child user
				InvokeAuthor.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
				
				
				//Enter Username 
				InvokeAuthor.EspUserName.sendKeys(EMS_TestData.Username_Corp);
		   	 
		   	 //Enter Password
				InvokeAuthor.EspPassword.sendKeys(EMS_TestData.Password_Corp);
		   	
		   	 //Now Press the Login Button
		   	 
			    InvokeAuthor.EspLoginButton.click();
				
				}
				else{
					//Now login with non admin child user
					 InvokeAuthor.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
					
					
					//Enter Username 
					 InvokeAuthor.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
			   	 
			   	 //Enter Password
					 InvokeAuthor.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
			   	
			   	 //Now Press the Login Button
			   	 
					InvokeAuthor.EspLoginButton.click();
				}
	            Thread.sleep(12000);
				
				InvokeAuthor.EmailMarketingTab.click();
				
				Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			     
				Thread.sleep(4000);
				
  }

}
