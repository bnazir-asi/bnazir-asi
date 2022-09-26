package EMS_Corporate_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions_Corp;
import Master.EMS_Corporate_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;


public class Login extends EMS_Corporate_Execution {

	public static void login() throws IOException, InterruptedException, AWTException{
		try{
	 //Now Insert the login credentials
    	// This is to Instantiate LogIn Page class  
    	 EMS_Locators LoginCorp = PageFactory.initElements(getDriver(), EMS_Locators.class);
    	
    	 if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
    	 {	 
    	 //Enter ASI No
      //  LoginCorp.ASINo.sendKeys(EMS_TestData.ASINo_Corp);
     	
    	//Enter Username 
    	 LoginCorp.UserName.sendKeys(EMS_TestData.Username_Corp);
    	 
    	 //Enter Password
    	 LoginCorp.Password.sendKeys(EMS_TestData.Password_Corp);
    	
    	 //Now Press the Login Button
    	 
    	 LoginCorp.LoginButton.click();
    	 }
    	 else{
    		 //Enter ASI No
    	   //     LoginCorp.ASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
    	     	
    	    	//Enter Username 
    	    	 LoginCorp.UserName.sendKeys(EMS_TestData.Username_ProdCorp);
    	    	 
    	    	 //Enter Password
    	    	 LoginCorp.Password.sendKeys(EMS_TestData.Password_ProdCorp);
    	    	
    	    	 //Now Press the Login Button
    	    	 
    	    	 LoginCorp.LoginButton.click(); 
    		 
    	 }
    	 
    	  Reuse_Functions_Corp.isAlertPresent(getDriver(), wait);
    		 
	      if(getDriver().getPageSource().contains("Web Home Page"))
	      {	  
	   //Select the ESPWeb Home page link
	     LoginCorp.ESPWebHomePageLinkText.click();
	      
	      }
	     
	      
	      LoginCorp.EmailMarketingTab.click();
	     
	       Assert.assertTrue(LoginCorp.EmailMarketing_Dashboard.getText().contains("Dashboard"));
	  /*    if(LoginCorp.EmailMarketing_Dashboard.getText().contains("Dashboard"))
     {
    	 System.out.println("Loggedin To Email Marketing Corporate Successfully");
    	 Reuse_Functions_Corp.resultPass("LoginCorporate", "Loggedin To Email Marketing Corporate Successfully");
     }
     else{
    	 System.out.println("Loggedin To Email Marketing Corporate UnSuccessfully");
    	 Reuse_Functions_Corp.resultFail("LoginCorporate", "Loggedin To Email Marketing Corporate UnSuccessfully");
     }*/
     
	     
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}



	





}