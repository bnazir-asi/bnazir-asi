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


public class CreateListAndContactsFromListPage extends EMS_Execution {

	public static JavascriptExecutor jse;
	static String ListName;
	
	static Reuse_Functions Reuse_func=new Reuse_Functions();
	
	static EMS_Locators CreateListAndContacts = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void List_Creation_FromListPage() throws IOException, InterruptedException, AWTException{
		try{
	
    	 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
         
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
         
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-500,-750)", "");
 	    
 	    Thread.sleep(2000);
 	    
 	    //Press the List Tab
 	   CreateListAndContacts.ListTab.click();
 	    
 	  Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
      
      Thread.sleep(1000);
    	 
    	 //Press the Create List Button
    	 CreateListAndContacts.CreateListButton_ListPage.click();
    	 
    	 //Enter the List Name and Press Create Button
    	 CreateListAndContacts.ListName_Field.sendKeys(EMS_TestData.ListNameFromListPage);
    	 
    	 CreateListAndContacts.List_CreateButton.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
		 
		 WebElement ListNameVerification=CreateListAndContacts.ListCreationVerification;
	 	 ListName=ListNameVerification.getAttribute("value");
	 	  
	 	 System.out.println(ListName);
    	 
    	 //Validating List Created Successfully or not
	 	Assert.assertTrue(ListName.contains("EMS Dynamic"));
    	/* if(ListName.contains("EMS Dynamic"))
    	 {
    		 System.out.println("List Created Successfully");
    		 
    		 Reuse_func.resultPass("List_Creation_FromListPage", "List Created Successfully");
    	 }
    	 else{
    		 System.out.println("List Created UnSuccessfully");
    		
    		 Reuse_func.resultFail("List_Creation_FromListPage", "List Created UnSuccessfully");
    	 
    	 }*/
    	 
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void Indivisual_ContactsUnderList_Add_FromListPage() throws InterruptedException{
		try{
    	 //Add Contacts into list
    	 CreateListAndContacts.AddContactsToList_Field.sendKeys("b");
    	 
    	 Thread.sleep(4000);
    	 
         CreateListAndContacts.AddContactsToList_Field.sendKeys("nazir@asicentral.com");
    	 
    	 Thread.sleep(4000);
    	 
    	 
    	 CreateListAndContacts.AddContactsToList_Field.sendKeys(Keys.ENTER);
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 Assert.assertTrue(CreateListAndContacts.ListContactsVerification.getText().contains("bnazir@asicentral.com") & CreateListAndContacts.ListContactsVerification.isDisplayed());
    	/* if(CreateListAndContacts.ListContactsVerification.getText().contains("bnazir@asicentral.com") & CreateListAndContacts.ListContactsVerification.isDisplayed())
    	 {
    		System.out.println("Indivisual Contacts Added Under List Successfully"); 
    		
    		Reuse_func.resultPass("Indivisual_ContactsUnderList_Add_FromListPage", "Indivisual Contacts Added Under List Successfully");
    	 }
    	 else{
    		 System.out.println("Indivisual Contacts Added Under List UnSuccessfully"); 
     		
     		Reuse_func.resultFail("Indivisual_ContactsUnderList_Add_FromListPage", "Indivisual Contacts Added Under List UnSuccessfully");
    	 }*/
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void CRMContacts_ContactsUnderList_Add_FromListPage() throws InterruptedException{
		try{
    	 //Now Add A contact from CRM by Pressing Add From CRM Button
    	 CreateListAndContacts.AddFromCRM_Contacts_Button.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
         CreateListAndContacts.CRMSearchTerm.sendKeys("testack@gmail.com");
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 //Select the Contact and Press Add Button
    	 CreateListAndContacts.CRMCompanyName_SelectionCheckbox.click();
    	 
    	 Thread.sleep(3000);
    	 
    	 CreateListAndContacts.CRMToEMS_ContactAddButton.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 Assert.assertTrue(CreateListAndContacts.AddContactsFromCRM_UnderList_Verification_Row1.isDisplayed() & CreateListAndContacts.AddContactsFromCRM_UnderList_Verification_Row2.isDisplayed());
    	/* if(CreateListAndContacts.AddContactsFromCRM_UnderList_Verification_Row1.isDisplayed() & CreateListAndContacts.AddContactsFromCRM_UnderList_Verification_Row2.isDisplayed())
    	 {
    		 System.out.println(" Contacts Added From CRM Under List Successfully"); 
     		
     		 Reuse_func.resultPass("CRMContacts_ContactsUnderList_Add_FromListPage", "Contacts Added From CRM Under List  Successfully");
    	 }
    	 else{
    		 
    		 System.out.println("Contacts Added From CRM Under List  UnSuccessfully"); 
      		
      		 Reuse_func.resultFail("CRMContacts_ContactsUnderList_Add_FromListPage", "Contacts Added From CRM Under List  UnSuccessfully");
    	 }*/
    	 
    	 
		}
		
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getMessage();
		}
	}
		public static void CopyList() throws InterruptedException{
		try{
			String CopyListName=ListName+" Copy ";
			CreateListAndContacts.ListTab.click();
			CreateListAndContacts.ListSearch.sendKeys(ListName);
			CreateListAndContacts.Copybutton.click();
			CreateListAndContacts.ClearText.click();
			CreateListAndContacts.ListSearch.sendKeys(CopyListName);
			Assert.assertTrue(CreateListAndContacts.CopiedList.getText().contains(CopyListName));
			
			
				
			}
		catch (NoSuchElementException e) {
				// TODO: handle exception
			   e.getMessage();
			}
	}

	

}
