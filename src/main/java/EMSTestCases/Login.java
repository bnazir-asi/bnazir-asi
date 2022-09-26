package EMSTestCases;



import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.ConstantsandCredentials;
import PageFactoryandTestData.EMS_Locators;
//import PageFactoryandTestData.EMS_TestData;



public class Login extends EMS_Execution {

	 static EMS_Locators Login = PageFactory.initElements(getDriver(), EMS_Locators.class);
	 static Reuse_Functions Reuse_func=new Reuse_Functions();
	public static void EmailMarketingLists_Verification_InCRMContacts() throws IOException, InterruptedException, AWTException{
		try{
	 
			
			//Now Insert the login credentials
    	// This is to Instantiate LogIn Page class  
    	
    	
    	 ConstantsandCredentials cc=new ConstantsandCredentials();
    	 
    	 String RegularUser=cc.GetUserInfo().get("EMS_Regular_User");
    	 
    	 String []ru=RegularUser.split(",");
    	//Enter ASI No
    //	 Login.ASINo.sendKeys(ru[0]);
      	
     	//Enter Username 
     	 Login.UserName.sendKeys(ru[1]);
     	 
     	 //Enter Password
     	 Login.Password.sendKeys(ru[2]);
    	 
    	 
    	 
    	 //Now Press the Login Button
    	 
    	 Login.LoginButton.click();
    	 
    	 Reuse_func.isAlertPresent(getDriver(), wait);
         
         //Reuse_func.waitForElementNotVisible_Xpath(30, getDriver(),Login.EspWeb_Link);
    	 
         
         Thread.sleep(2000);

         if(getDriver().getPageSource().contains("Web Home Page"))
	      {	  
	   //Select the ESPWeb Home page link
        	 Login.ESPWebHomePageLinkText.click();
	      
	      }
    	 
    	 Reuse_func.waitForElementToBeClickable_Xpath(120, getDriver(),Login.Email_Marketing_Tab_Wait) ;
	     
         Thread.sleep(2000);
         
         //Go to CRM Tab
         Login.CRM_Tab.click();
         
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
	     
         //Go to contacts of CRM
         Login.CRM_ContactsTab.click();
         
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
         
         if(getDriver().getCurrentUrl().contains("uat") || getDriver().getCurrentUrl().contains("https://esp.asicentral.com"))
         {
             Login.SearchContactField_CRM.sendKeys("bakhtawar mallick");
        	 
        	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
             
             Thread.sleep(1000);
        	 
        	 
         Login.CRMCompanyName_SelectionCheckbox.click();
         
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
         }
         else{
        	 
        	 Login.SearchContactField_CRM.sendKeys("bakhtawarmallick");
        	 
        	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
             
             Thread.sleep(1000);
        	 
        	 Login.CRMCompanyName_SelectionCheckbox.click();
             
        	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
             
             Thread.sleep(1000);
         }
         
         //Validate if there Email Marketing is placed there
         //Assert.assertTrue(Login.EmailMarketing_Lists_Heading_CRM.getText().contains("Email Marketing Lists"));
         Assert.assertTrue(Login.EmailMarketing_Lists_Heading_CRM.getText().contains("Email Marketing Lists"));
         
	 /*    if(Login.EmailMarketing_Lists_Heading_CRM.getText().contains("Email Marketing Lists"))
	     {
	    	 System.out.println("Email Marketing Lists Displayed on CRM Contacts Details Successfully");
	    	 
	    	 Reuse_func.resultPass("EmailMarketingLists_Verification_InCRMContacts", "Email Marketing Lists Displayed on CRM Contacts Details Successfully");
	     }
	     else{
             System.out.println("Email Marketing Lists Displayed on CRM Contacts Details UnSuccessfully");
	    	 
	    	 Reuse_func.resultFail("EmailMarketingLists_Verification_InCRMContacts", "Email Marketing Lists Displayed on CRM Contacts Details UnSuccessfully");
	     }*/
	     
		}catch(NoSuchElementException e){
		   e.getMessage();
		}
	     
	}  
	   public static void login() throws InterruptedException{
		   try{
	     //Go to lists details from CRM Tab contacts
	     Login.ListSelection_CRM.click();
	     
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
	     //press EMS tab
	     Login.EmailMarketingTab.click();
	       Assert.assertTrue(Login.EmailMarketing_Dashboard.getText().contains("Dashboard"));
	   /*  if(Login.EmailMarketing_Dashboard.getText().contains("Dashboard"))
     {
    	 System.out.println("Loggedin To Email Marketing Successfully");
    	 Reuse_func.resultPass("Login", "Loggedin To Email Marketing Successfully");
     }
     else
     {
    	 System.out.println("Loggedin To Email Marketing UnSuccessfully");
    	 Reuse_func.resultFail("Login", "Loggedin To Email Marketing UnSuccessfully");
     }*/
     
	      
	         
	        
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getMessage();
		}
	
	   finally {
		   Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
		   Thread.sleep(1000);
	}
	   
	   
	   }


	
	
	




}