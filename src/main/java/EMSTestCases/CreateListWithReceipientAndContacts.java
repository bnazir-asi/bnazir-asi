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
import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;



public class CreateListWithReceipientAndContacts extends EMS_Execution {
	public static String importexpectedressult="Email Address";

	static Reuse_Functions Reuse_func=new Reuse_Functions();  
	 
	static EMS_Locators ListWithContacts = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void List_Creation_FromCampaign() throws IOException, InterruptedException, AWTException{
		try{
	 
	    //Press the CreateList Button
    	 ListWithContacts.Campaign_CreateListButton.click();
    	 
    	 //Enter the List Name and Press Create Button
    	 ListWithContacts.ListName_Field.sendKeys(EMS_TestData.ListName);
    	 
    	 ListWithContacts.List_CreateButton.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
  	     
  	   WebElement ListNameVerification=ListWithContacts.ListCreationVerification;
 	   String ListName=ListNameVerification.getAttribute("value");
 	  
 	   System.out.println(ListName);
    	 
    	 //Thread.sleep(8000);
    	 
    	 //Validating List Created Successfully or not
 	   Assert.assertTrue(ListName.contains("EMS List"));
    	/* if(ListName.contains("EMS List"))
    	 {
    		 System.out.println("List Created Successfully");
    		 
    		 Reuse_func.resultPass("List_Creation_FromCampaign", "List Created Successfully");
    	 }
    	 else{
    		 System.out.println("List Created UnSuccessfully");
    		
    		 Reuse_func.resultFail("List_Creation_FromCampaign", "List Created UnSuccessfully");
    	 
    	 }*/
    	 
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void Indivisual_ContactsUnderList_Add_FromCampaign() throws InterruptedException{
		try{
    	 //Add Contacts into list
    	 ListWithContacts.AddContactsToList_Field.sendKeys("b");
    	 
    	 Thread.sleep(4000);
    	 
         ListWithContacts.AddContactsToList_Field.sendKeys("nazir@asicentral.com");
    	 
    	 Thread.sleep(4000);
    	 
    	 
    	 ListWithContacts.AddContactsToList_Field.sendKeys(Keys.ENTER);
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 Assert.assertTrue(ListWithContacts.ListContactsVerification.getText().contains("bnazir@asicentral.com") & ListWithContacts.ListContactsVerification.isDisplayed());
    	/* {
    		System.out.println("Indivisual Contacts Added Under List Successfully"); 
    		
    		Reuse_func.resultPass("Indivisual_ContactsUnderList_Add_FromCampaign", "Indivisual Contacts Added Under List Successfully");
    	 }
    	 else{
    		 System.out.println("Indivisual Contacts Added Under List UnSuccessfully"); 
    		 
    		 Reuse_func.resultFail("Indivisual_ContactsUnderList_Add_FromCampaign", "Indivisual Contacts Added Under List Successfully");
     		
    	 }*/
		
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
    	 
    public static void CRMContacts_ContactsUnderList_Add_FromCampaign() throws InterruptedException{
    	try{
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 //Now Add A contact from CRM by Pressing Add From CRM Button
    	 ListWithContacts.AddFromCRM_Contacts_Button.click();
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 ListWithContacts.CRMSearchTerm.sendKeys("testack@gmail.com");
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	 //Select the Contact and Press Add Button
    	 ListWithContacts.CRMCompanyName_SelectionCheckbox.click();
    	 
    	 Thread.sleep(3000);
    	 
    	 ListWithContacts.CRMToEMS_ContactAddButton.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 Assert.assertTrue(ListWithContacts.AddContactsFromCRM_UnderList_Verification_Row1.isDisplayed() & ListWithContacts.AddContactsFromCRM_UnderList_Verification_Row2.isDisplayed());
    	/* if(ListWithContacts.AddContactsFromCRM_UnderList_Verification_Row1.isDisplayed() & ListWithContacts.AddContactsFromCRM_UnderList_Verification_Row2.isDisplayed())
    	 {
    		 System.out.println(" Contacts Added From CRM Under List Successfully"); 
     		
     		 Reuse_func.resultPass("CRMContacts_ContactsUnderList_Add_FromCampaign", "Contacts Added From CRM Under List  Successfully");
    	 }
    	 else{
    		 
    		 System.out.println("Contacts Added From CRM Under List  UnSuccessfully"); 
      		
      		 Reuse_func.resultFail("CRMContacts_ContactsUnderList_Add_FromCampaign", "Contacts Added From CRM Under List  UnSuccessfully");
    	 }*/
    	 
    	}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getMessage();
		}
	}
    public static void ImportContacts() throws InterruptedException, IOException
    {
    	try
    	{
    		JavascriptExecutor js = (JavascriptExecutor) driver;

    	ListWithContacts.ListTab.click();
    	Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
    	//Thread.sleep(50000);
    	//Press the CreateList Button
   	 	ListWithContacts.Campaign_CreateListButton.click();
   	 	//Enter the List Name and Press Create Button
   	 	ListWithContacts.ListName_Field.sendKeys(EMS_TestData.ImportListName);
   	 	ListWithContacts.List_CreateButton.click();
   	 	Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
   	 	Thread.sleep(1000);
   	 	ListWithContacts.ImportFile.click();
   	 	Thread.sleep(1000);
   	 	ListWithContacts.ImportFileCSV.click();
   	 	if(ListWithContacts.importcheckbox.isSelected())
	 	{
	 		ListWithContacts.importcheckbox.click();
	 	}
   	 	ListWithContacts.SelectfileCSV.click();
   	 	Thread.sleep(2000);
   	    CampaignEditor.Projectpath=System.getProperty("user.dir");
	   	System.out.println(CampaignEditor.Projectpath);	 
	    Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/Importcontacts.exe");
	    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	    Thread.sleep(3000);
	    ListWithContacts.Uploadfile.click();
	    Thread.sleep(1000);
	    ListWithContacts.mapcontacts.click();
	    js.executeScript("arguments[0].scrollIntoView();", ListWithContacts.ImportComplete);
	   // Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	    Thread.sleep(1000);
	    ListWithContacts.ImportComplete.click();
	   // Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	    Thread.sleep(40000);
	    driver.navigate().refresh();
	    Thread.sleep(30000);
	    
	    Assert.assertEquals(ListWithContacts.EmailAddress.getText(),importexpectedressult);
	 
	    
    	}
    	
    

    catch (NoSuchElementException e) {
		// TODO: handle exception
	   e.getMessage();
	}


    }
}
