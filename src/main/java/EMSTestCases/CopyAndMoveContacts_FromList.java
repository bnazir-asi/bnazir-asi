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


public class CopyAndMoveContacts_FromList extends EMS_Execution{

	public static String MoveToList_ListName;
	public static String EmailAddress_Contacts;
	public static String CopyEmailAddress_Contacts;
	public static JavascriptExecutor jse;
	public static WebElement MoveToList;
	public static WebElement CopyToList;
	
	public static void ListSelectedByDefault_AfterBackToCampaign() throws IOException, InterruptedException, AWTException{
		try{
	 
			Reuse_Functions Reuse_func=new Reuse_Functions();
    	// This is to Instantiate CopyMoveContactsFrom List Page class  
    	 EMS_Locators CopyAndMoveContacts = PageFactory.initElements(getDriver(), EMS_Locators.class);
    		jse= (JavascriptExecutor)getDriver();
            jse.executeScript("arguments[0].scrollIntoView();", CopyAndMoveContacts.ListContact_CheckboxSelection);
    	 //Select the contact which needs to be move
    	 CopyAndMoveContacts.ListContact_CheckboxSelection.click();
    	 
    	 //Storing the Email Address
    	 EmailAddress_Contacts=CopyAndMoveContacts.ListContactEmail.getText();
    	 System.out.println(EmailAddress_Contacts);
    	 
    	 //Press the Action button
    	 CopyAndMoveContacts.List_ActionButton.click();
    	 
    	 Thread.sleep(3000);
    	 
        Reuse_func.Hover(CopyAndMoveContacts.MoveToList_ActionOption, getDriver());
 		 
 		 Thread.sleep(3000);
    	 
 	 	 //Storing the list name in which the the contacs is being moved
 	 	MoveToList_ListName=CopyAndMoveContacts.MoveToList_Name_ActionDropdown.getText();
 	 	System.out.println(MoveToList_ListName);
 	 	
 	    CopyAndMoveContacts.MoveToList_Name_ActionDropdown.click();
 	 	
 	 	Thread.sleep(2000);
 	 	
 	 	
 		jse= (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(0,-250)", "");
        
        jse= (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(-250,-500)", "");
        
        jse= (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(-500,-750)", "");
	    
	    Thread.sleep(7000);
 	 	
 	 	
 	 	//Select the contact which needs to be move
   	 CopyAndMoveContacts.ListContact_CheckboxSelection.click();
   	 
   	 //Storing the Email Address
   	CopyEmailAddress_Contacts=CopyAndMoveContacts.ListContactEmail.getText();
   	 System.out.println(CopyEmailAddress_Contacts);
   	 
   	 //Press the Action button
   	 CopyAndMoveContacts.List_ActionButton.click();
   	 
   	 Thread.sleep(1000);
   	 
   	 Reuse_func.Hover(CopyAndMoveContacts.CopyToList_ActionOption, getDriver());
	 
	 Thread.sleep(3000);
	 	 
	 //Storing the list name in which the the contacs is being moved
	 	MoveToList_ListName=CopyAndMoveContacts.ContactsUnderlist_CopyToContactName.getText();
	 	System.out.println(MoveToList_ListName);
	 	
	 	CopyAndMoveContacts.ContactsUnderlist_CopyToContactName.click();
	 	
	 	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
	 	
	 	 //Add Contacts into list
	 	CopyAndMoveContacts.AddContactsToList_Field.sendKeys("b");
   	 
   	    Thread.sleep(4000);
   	 
   	    CopyAndMoveContacts.AddContactsToList_Field.sendKeys("nazir@asicentral.com");
   	 
   	   Thread.sleep(4000);
   	 
   	 
   	    CopyAndMoveContacts.AddContactsToList_Field.sendKeys(Keys.ENTER);
   	 
   	    Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
     
        Thread.sleep(1000);
 	 	
	 	//Press the Back To Campaign Screen
	 	CopyAndMoveContacts.BackToCampaignLink_AddListPage.click();
   	 
	 	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
   	 
   	 //Validating List Created is selected By default after going back to Campaign Page
         Assert.assertTrue(CopyAndMoveContacts.ListSelectedByDefault_BackToCampaign.isSelected());
      //   Assert.assertTrue(CopyAndMoveContacts.ListSelectedByDefault_BackToCampaign.isSelected());
   	/* if(CopyAndMoveContacts.ListSelectedByDefault_BackToCampaign.isSelected())
   	 {
   		 System.out.println("List Created Selected By default after going back to Campaign Successfully"); 
    		
    		Reuse_func.resultPass("ListSelectedByDefault_AfterBackToCampaign", "List Created Selected By default after going back to Campaign Successfully"); 
   	 }
   	 else{
   		 System.out.println("List Created Selected By default after going back to Campaign UnSuccessfully"); 
     		
     		Reuse_func.resultFail("ListSelectedByDefault_AfterBackToCampaign", "List Created Selected By default after going back to Campaign UnSuccessfully");
   	 }*/
		
			
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}

	

	
}
