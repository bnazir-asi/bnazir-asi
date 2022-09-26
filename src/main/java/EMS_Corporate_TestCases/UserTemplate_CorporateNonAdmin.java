package EMS_Corporate_TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions_Corp;
import Master.EMS_Corporate_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class UserTemplate_CorporateNonAdmin extends EMS_Corporate_Execution {

	public static String OldUserTemplateFilterCount;
	public static String NewUserTemplateFilterCount;
	public static String TemplateName;
	public static String OldAllTemplateFilterCount;
	public static String NewAllTemplateFilterCount;
	public static JavascriptExecutor jse;
	public static void UserTemplateCreation_With_Verification_AtCorporateUser() throws IOException, InterruptedException, AWTException{
		try{
	 
    	 EMS_Locators UserTemplate = PageFactory.initElements(getDriver(), EMS_Locators.class);
    	
    	 OldUserTemplateFilterCount=UserTemplate.UserTemplateFilter_Corporate.getText();
    	 System.out.println(OldUserTemplateFilterCount);
    	 
    	 OldAllTemplateFilterCount=UserTemplate.AllTemplatesFilter.getText();
    	 System.out.println(OldAllTemplateFilterCount);
    	 //Now Logout from corporate user and login NonAdmin Child User
    	 
    	 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
         
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
         
         Thread.sleep(8000);
		
    	 UserTemplate.UserInfo_Gravter.click();
		
		Thread.sleep(1000);
		
		//Press the Logout Button
		UserTemplate.UserInfo_Logout.click();
		
		Thread.sleep(3000);
		
		
		if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
		{	
		//Now login with non admin child user
		UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_NonAdmin);
		
		
		//Enter Username 
		UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_NonAdmin);
   	 
   	 //Enter Password
		UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_NonAdmin);
   	
   	 //Now Press the Login Button
   	 
		UserTemplate.EspLoginButton.click();
		}
		else{
			
			//Now login with non admin child user
			UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdNonAdmin);
			
			
			//Enter Username 
			UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdNonAdmin);
	   	 
	   	 //Enter Password
			UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdNonAdmin);
	   	
	   	 //Now Press the Login Button
	   	 
			UserTemplate.EspLoginButton.click();
		}
   	    
		
		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
   	 
   	    Thread.sleep(1000);
		
		if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
		{	
   	    
		UserTemplate.UserInfo_Gravter.click();
	      
	      Thread.sleep(1000);
	      
	      UserTemplate.CRM_SettingsOption.click();
	      
	      Thread.sleep(2000);
	      
	      //Press The CRM Data Access Option
	      UserTemplate.CRM_Settings_DataAccessOption.click();
	      
	      Thread.sleep(3000);
	     
	      List <WebElement> elementcount = UserTemplate.AIA_Switch_ON_ToggleVerification;
	      
	      int count=elementcount.size();
	      
	      System.out.println(count);
	      
	      if(count>0)
	      {
	    	  UserTemplate.Allow_AIA_AccessSwitch.click();
	    	  
	    	  Thread.sleep(1000);
	    	  
	    	  UserTemplate.Allow_AIA_AccessSwitch.click();
	    	  
	    	  Thread.sleep(1000);
	      }
	      else{
	    	  
	    	  UserTemplate.Allow_AIA_AccessSwitch.click();
	    	  
	    	}
		
		
			
			 Thread.sleep(1000);
			
			 
   	     UserTemplate.EmailMarketingTab.click();
         
   	  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
 	 
 	   Thread.sleep(1000);
         
         UserTemplate.TemplatesTab.click();
    	 
         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
    	 
         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),UserTemplate.TemplatesDisplay_Wait);
    	 
    	 Thread.sleep(2000);
    	 
    	 //Press the Blank template button
    	 UserTemplate.ChooseTemplate_BlankTemplateButton.click();
    	 
    	 Thread.sleep(3000);
    	 
    	 //Enter the Template Name
    	 UserTemplate.TemplateName_InsertionField.sendKeys(EMS_TestData.MyTemplateNonAdminChild);
		 
		 //Press the Create Template Button
    	 UserTemplate.Template_CreateButton.click();
		 
		 
    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
		  Assert.assertTrue(UserTemplate.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"));
		 /* if(UserTemplate.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"))
	    	 {
	    		System.out.println("New Blank My Template Created from Template Page from NonAdmin child user Successfully");
	    		
	    		Reuse_Functions_Corp.resultPass("BlankMyTemplateCreation_From_TemplatePage_NonAdminChildUser", "New Blank My Template Created from Template Page from NonAdmin child user Successfully");
	    	 }
	    	 else{
	    		 System.out.println("New Blank My Template Created from Template Page from NonAdmin child user UnSuccessfully"); 
	    	  
	    		 Reuse_Functions_Corp.resultFail("BlankMyTemplateCreation_From_TemplatePage_NonAdminChildUser", "New Blank My Template Created from Template Page from NonAdmin child user Successfully");
	    	 
	    	 }*/
	    	
		  TemplateName=UserTemplate.TemplateCreation_FromTemplatePage_Verification.getText();
     	  System.out.println(TemplateName);
		  
		  //Press the Cancel Button
		  UserTemplate.CancelButton_EditTemplate.click();
		  
		  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
		}
		else{
			 Thread.sleep(1000);
				
			 
	   	     UserTemplate.EmailMarketingTab.click();
	         
	   	  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	       Thread.sleep(1000);
	         
	    	UserTemplate.TemplatesTab.click();
	    	 
	    	Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),UserTemplate.TemplatesDisplay_Wait);
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	 //Press the Blank template button
	    	 UserTemplate.ChooseTemplate_BlankTemplateButton.click();
	    	 
	    	 Thread.sleep(3000);
	    	 
	    	 //Enter the Template Name
	    	 UserTemplate.TemplateName_InsertionField.sendKeys(EMS_TestData.MyTemplateNonAdminChild);
			 
			 //Press the Create Template Button
	    	 UserTemplate.Template_CreateButton.click();
			 
			 
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			 	Assert.assertTrue(UserTemplate.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"));	  
		/*	  if(UserTemplate.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"))
		    	 {
		    		System.out.println("New Blank My Template Created from Template Page from NonAdmin child user Successfully");
		    		
		    		Reuse_Functions_Corp.resultPass("BlankMyTemplateCreation_From_TemplatePage_NonAdminChildUser", "New Blank My Template Created from Template Page from NonAdmin child user Successfully");
		    	 }
		    	 else{
		    		 System.out.println("New Blank My Template Created from Template Page from NonAdmin child user UnSuccessfully"); 
		    	  
		    		 Reuse_Functions_Corp.resultFail("BlankMyTemplateCreation_From_TemplatePage_NonAdminChildUser", "New Blank My Template Created from Template Page from NonAdmin child user Successfully");
		    	 
		    	 }*/
		    	
			  TemplateName=UserTemplate.TemplateCreation_FromTemplatePage_Verification.getText();
	     	  System.out.println(TemplateName);
			  
			  //Press the Cancel Button
			  UserTemplate.CancelButton_EditTemplate.click();
			  
			  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
 	    	 
 	    	 Thread.sleep(5000);
			  
			  
		}
		 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
         
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
         
         Thread.sleep(2000);
		
		
		//Now logout from NonAdmin child and login again to Corporate user and validate if the template exist in user template or not
		  UserTemplate.UserInfo_Gravter.click();
			
			Thread.sleep(1000);
			
			//Press the Logout Button
			UserTemplate.UserInfo_Logout.click();
			
			Thread.sleep(3000);
			if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
			{	
			//Now login with non admin child user
			UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
			
			
			//Enter Username 
			UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_Corp);
	   	 
	   	 //Enter Password
			UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_Corp);
	   	
	   	 //Now Press the Login Button
	   	 
			UserTemplate.EspLoginButton.click();
			
			}
			else{
				//Now login with non admin child user
				UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
				
				
				//Enter Username 
				UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
		   	 
		   	 //Enter Password
				UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
		   	
		   	 //Now Press the Login Button
		   	 
				UserTemplate.EspLoginButton.click();
			}
	   	 
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	   	    
	   	 Robot robot1 = new Robot(); 

	     robot1.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     robot1.keyRelease(KeyEvent.VK_ENTER);
	    
	     Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
			 
	      if(getDriver().getPageSource().contains("Web Home Page"))
	      {	  
	   //Select the ESPWeb Home page link
	    	  UserTemplate.ESPWebHomePageLinkText.click();
	      
	      }
	         UserTemplate.EmailMarketingTab.click();
	         
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	         
	         UserTemplate.TemplatesTab.click();
	    	 
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),UserTemplate.TemplatesDisplay_Wait);
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	 //Press the user template filter Now
	    	 UserTemplate.UserTemplateFilter_Corporate.click();
	    	 
	    	 Thread.sleep(4000);
	    	 
	    	 NewUserTemplateFilterCount=UserTemplate.UserTemplateFilter_Corporate.getText();
	    	 System.out.println(NewUserTemplateFilterCount);
	    	 
	    	 //Now Validating the user template dispalyed in corporate user after creating a template from  NonAdmin Child user
	    	Assert.assertTrue(getDriver().getPageSource().contains("EMS My Template") & !NewUserTemplateFilterCount.equals(OldUserTemplateFilterCount));
	    	/* if(getDriver().getPageSource().contains("EMS My Template") & !NewUserTemplateFilterCount.equals(OldUserTemplateFilterCount))
	    	 {
	    		 System.out.println("User Template filter Count updated and New User template displayed Successfully");
	    		 
	    		 Reuse_Functions_Corp.resultPass("UserTemplateVerification_AtCorporateLevel_WithUserTemplateFilter_Count", "User Template filter Count updated and New User template displayed Successfully");
	    		 
	    	 }
	    	 else{
                 System.out.println("User Template filter Count updated and New User template displayed UnSuccessfully");
	    		 
	    		 Reuse_Functions_Corp.resultFail("UserTemplateVerification_AtCorporateLevel_WithUserTemplateFilter_Count", "User Template filter Count updated and New User template displayed UnSuccessfully");
	    	 }*/
		
	    	 OldAllTemplateFilterCount=UserTemplate.AllTemplatesFilter.getText();
	    	 System.out.println(OldAllTemplateFilterCount);
	    	 
	    	 
	    	 
	    	 //Now Search the New User Template
	    	 UserTemplate.ListSearchField.sendKeys(TemplateName);
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	//Hover the Template preview,Edit,Delete,Publish or Unpublish it
  		   Reuse_Functions_Corp.Hover(UserTemplate.TemplateListHover, getDriver());
  		   
  		   Thread.sleep(2000);
  		   
  		 //Press the Publish Button
  		 UserTemplate.ExistingTemplate_PublishUnpublish.click();
    		   
    		   //Press the confirm Button
  		UserTemplate.DeleteContact_ConfirmButton.click();
    		   
  		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
   	 
   	    Thread.sleep(1000);
 		  
 		NewAllTemplateFilterCount=UserTemplate.AllTemplatesFilter.getText();
  		System.out.println(NewAllTemplateFilterCount);
  		Assert.assertTrue(!NewAllTemplateFilterCount.equals(OldAllTemplateFilterCount));
  		/*if(!NewAllTemplateFilterCount.equals(OldAllTemplateFilterCount))
  		{
  			System.out.println("User Template in corporate user published Successfully");
  			
  			Reuse_Functions_Corp.resultPass("UserTemplate_Published_Verification_CorporateLevelUser", "User Template in corporate user published Successfully");
  		}
  		else{
            System.out.println("User Template in corporate user published UnSuccessfully");
  			
  			Reuse_Functions_Corp.resultFail("UserTemplate_Published_Verification_CorporateLevelUser", "User Template in corporate user published UnSuccessfully");
  		}*/
  		 
  		 Thread.sleep(8000);
  		 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
         
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
         
         Thread.sleep(2000);
  		
  		
  		UserTemplate.UserInfo_Gravter.click();
			
			Thread.sleep(1000);
			
			//Press the Logout Button
			UserTemplate.UserInfo_Logout.click();
			
			Thread.sleep(3000);
			if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
			{	
			//Now login with non admin child user
			UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_NonAdmin);
			
			
			//Enter Username 
			UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_NonAdmin);
	   	 
	   	 //Enter Password
			UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_NonAdmin);
	   	
	   	 //Now Press the Login Button
	   	 
			UserTemplate.EspLoginButton.click();
	   	 
			}
			else{
				//Now login with non admin child user
				UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdNonAdmin);
				
				
				//Enter Username 
				UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdNonAdmin);
		   	 
		   	 //Enter Password
				UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdNonAdmin);
		   	
		   	 //Now Press the Login Button
		   	 
				UserTemplate.EspLoginButton.click();
			}
			
			
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	   	    
	   	 Robot robot2 = new Robot(); 

	     robot2.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     robot2.keyRelease(KeyEvent.VK_ENTER);
	    
	     Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
			 
	      if(getDriver().getPageSource().contains("Web Home Page"))
	      {	  
	   //Select the ESPWeb Home page link
	    	  UserTemplate.ESPWebHomePageLinkText.click();
	      
	      }
	         UserTemplate.EmailMarketingTab.click();
	         
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	         
	         UserTemplate.TemplatesTab.click();
	    	 
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),UserTemplate.TemplatesDisplay_Wait);
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	 NewAllTemplateFilterCount=UserTemplate.AllTemplatesFilter.getText();
	   		 System.out.println(NewAllTemplateFilterCount);
	   		 Assert.assertTrue(!NewAllTemplateFilterCount.equals(OldAllTemplateFilterCount));
	   		/* if(!NewAllTemplateFilterCount.equals(OldAllTemplateFilterCount))
	   		 {
	   			 System.out.println("User Template published successfully at NonAdmin child user after publishing from corporate user");
	   		     
	   			 Reuse_Functions_Corp.resultPass("UserTemplate_Publishing_Verification_NonAdminChildUserLevel", "User Template published successfully at NonAdmin child user after publishing from corporate user");
	   		 }
	   		 else{
                 System.out.println("User Template published unsuccessfully at NonAdmin child user after publishing from corporate user");
	   		     
	   			 Reuse_Functions_Corp.resultFail("UserTemplate_Publishing_Verification_NonAdminChildUserLevel", "User Template published unsuccessfully at NonAdmin child user after publishing from corporate user"); 
	   		 }*/
		
		    UserTemplate.MyTemplateFilterCount.click();
		    
		    Thread.sleep(2000);
		    
		    Reuse_Functions_Corp.Hover(UserTemplate.TemplateListHover, getDriver());
 		   
 		   Thread.sleep(2000); 
	    	 
	    	 //Press the delete Button
 		  UserTemplate.ExistingTemplateDeleteButton.click();
   		   
   		   //Press the Confirm Delete Template Button
   		   
   		//Press the confirm Button
 		 UserTemplate.DeleteContact_ConfirmButton.click();
   		   Assert.assertTrue(UserTemplate.DeleteTemplate_Veriifcation.getText().contains("Success"));
   	/*	 if(UserTemplate.DeleteTemplate_Veriifcation.getText().contains("Success"))
 		 {
 			 System.out.println("My Template Deleted at child user non admin level Successfully");
 		     
 			 Reuse_Functions_Corp.resultPass("MyTemplate_Delete_From_ChildUser_NonAdmin", "My Template Deleted at child user non admin level Successfully");
 		 }
 		 else{
 			 
             System.out.println("My Template Deleted at child user non admin level unsuccessfully");
 		     
 			 Reuse_Functions_Corp.resultFail("MyTemplate_Delete_From_ChildUser_NonAdmin", "My Template Deleted at child user non admin level unsuccessfully");
 		 }*/
   		   
   		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
   	 
   	    Thread.sleep(1000);
 		    
 		   jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(0,-250)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-250,-500)", "");
            
            Thread.sleep(7000);
            
            UserTemplate.UserInfo_Gravter.click();
			
			Thread.sleep(1000);
			
			//Press the Logout Button
			UserTemplate.UserInfo_Logout.click();
			
			Thread.sleep(3000);
			
			if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
			{	
			//Now login with non admin child user
			UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
			
			
			//Enter Username 
			UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_Corp);
	   	 
	   	 //Enter Password
			UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_Corp);
	   	
	   	 //Now Press the Login Button
	   	 
			UserTemplate.EspLoginButton.click();
			
			}
			else{
				//Now login with non admin child user
				UserTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
				
				
				//Enter Username 
				UserTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
		   	 
		   	 //Enter Password
				UserTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
		   	
		   	 //Now Press the Login Button
		   	 
				UserTemplate.EspLoginButton.click();
			}
	   	 
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	   	    
	   	 Robot robot3 = new Robot(); 

	     robot3.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     robot3.keyRelease(KeyEvent.VK_ENTER);
	    
	     Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
			 
	      if(getDriver().getPageSource().contains("Web Home Page"))
	      {	  
	   //Select the ESPWeb Home page link
	    	  UserTemplate.ESPWebHomePageLinkText.click();
	      
	      }
	         UserTemplate.EmailMarketingTab.click();
	         
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	         
	         UserTemplate.TemplatesTab.click();
	    	 
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),UserTemplate.TemplatesDisplay_Wait);
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	 //Press the user template filter Now
	    	 UserTemplate.UserTemplateFilter_Corporate.click();
	    	 
	    	 Thread.sleep(2000);
	    	 Assert.assertTrue(!OldUserTemplateFilterCount.equals(NewUserTemplateFilterCount));
	    	/* if(!OldUserTemplateFilterCount.equals(NewUserTemplateFilterCount)) 
	    	 {
	    		 System.out.println("User Template Deleted successfully at corporate level after removing it from child non admin user Successfully");
	    		 
	    		 Reuse_Functions_Corp.resultPass("UserTemplateDeleteVerification_AtCorporateLevel_WithUserTemplateDeletedFrom_NonAdminChildUser", "User Template Deleted successfully at corporate level after removing it from child non admin user Successfully");
	    		 
	    	 }
	    	 else{
                 System.out.println("User Template Deleted successfully at corporate level after removing it from child non admin user UnSuccessfully");
	    		 
	    		 Reuse_Functions_Corp.resultFail("UserTemplateDeleteVerification_AtCorporateLevel_WithUserTemplateDeletedFrom_NonAdminChildUser", "User Template Deleted successfully at corporate level after removing it from child non admin user UnSuccessfully");
	    	 }*/


		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}
}
