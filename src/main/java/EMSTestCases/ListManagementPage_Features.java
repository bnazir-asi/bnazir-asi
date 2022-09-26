package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class ListManagementPage_Features extends EMS_Execution {

	public static String OldReceipientCount;
	public static String NewReceipientCount;
	public static String BulkDeleteListVerification;
	static WebElement ClearField;
	static Reuse_Functions Reuse_func=new Reuse_Functions();
	
	static EMS_Locators ListManagementFeatures = PageFactory.initElements(getDriver(), EMS_Locators.class);
	
	public static void CopyList_ListManagementPage() throws IOException, InterruptedException, AWTException{
		try{
	 
		 ListManagementFeatures.ListTab.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	 ListManagementFeatures.ListSearchField.sendKeys(EMS_TestData.ListNameFromListPage);
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(3000);
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 //Press the copy list feature button
    	 ListManagementFeatures.CopyButton_ListManagementPage.click();
    	 
    	 //Validating if the list copied successfully or not
    	 Assert.assertTrue(ListManagementFeatures.DeleteContact_Verification.getText().contains("Success"));
    	/* if(ListManagementFeatures.DeleteContact_Verification.getText().contains("Success"))
 	    {
 	    	System.out.println("List Copy Successfully");
 	    	
 	    	Reuse_func.resultPass("CopyList_ListManagementPage", "List Copy Successfully");
 	    }
 	    else{
             System.out.println("List Copy UnSuccessfully");
 	    	
 	    	Reuse_func.resultFail("CopyList_ListManagementPage", "List Copy UnSuccessfully");
 	    }*/
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
		
	}	
    	 
    public static void AddNewIndivisualContact_ListManagementPage() throws InterruptedException{
    	try{
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
         
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	 
    	 //Store the old Receipient Count
    	 OldReceipientCount=ListManagementFeatures.ReceipientCountColumn_ListManagementPage.getText();
    	 
    	 System.out.println(OldReceipientCount);
    	 
    	 
    	 
    	 //Now add a new indivisual Contact contact for list fro List Management page
    	 ListManagementFeatures.AddIndivisualContactButton_ListManagementPage.click();
    	 
    	 //Add the details for indivisual Contact
    	 ListManagementFeatures.GivenFirstNameField_IndivisualContact.sendKeys("Bakhtawar");
    	 
    	 ListManagementFeatures.GivenLastNameField_IndivisualContact.sendKeys("Malik");
    	 
    	 ListManagementFeatures.GivenEmailField_IndivisualContact.sendKeys(EMS_TestData.IndivisualContactEmailAddress);
    	 
    	 //Press the Save Button
    	 ListManagementFeatures.IndivisualContactSaveButton.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	 //Store the New Receipient Count
    	 NewReceipientCount=ListManagementFeatures.ReceipientCountColumn_ListManagementPage.getText();
    	 
    	 System.out.println(NewReceipientCount);
    	 Assert.assertTrue(!NewReceipientCount.equals(OldReceipientCount));
    	 
    	/* if(!NewReceipientCount.equals(OldReceipientCount))
    	 {
    		System.out.println("New Indivisual Contact Added Successfully"); 
    		
    		Reuse_func.resultPass("AddNewIndivisualContact_ListManagementPage", "New Indivisual Contact Added  Successfully");
    	 }
    	 else{
    		 
    		 System.out.println("New Indivisual Contact Added UnSuccessfully"); 
     		
     		Reuse_func.resultFail("AddNewIndivisualContact_ListManagementPage", "New Indivisual Contact Added  UnSuccessfully");
     	 }*/
    	}
    	catch(NoSuchElementException e){
    		e.getMessage();
    	}
    }
    public static void DeleteList_ListManagementPage() throws InterruptedException{
    	try{
		//Now Delete the List From List Management Page
    	 ListManagementFeatures.DeleteListButton_ListManagementPage.click();
    	 Thread.sleep(2000);
    	 
    	// Switching to Alert        
	        //Alert alert = getDriver().switchTo().alert();		
	   
	    ListManagementFeatures.DeleteContact_ConfirmButton.click();
    	 
    	 // Accepting alert		
	        //alert.accept();
	        
	        //Validating if the list copied successfully or not
	    Assert.assertTrue(ListManagementFeatures.DeleteContact_Verification.getText().contains("Success"));
	    	/* if(ListManagementFeatures.DeleteContact_Verification.getText().contains("Success"))
	 	    {
	 	    	System.out.println("List Deleted Successfully");
	 	    	
	 	    	Reuse_func.resultPass("DeleteList_ListManagementPage", "List Deleted Successfully");
	 	    }
	 	    else{
	             System.out.println("List Deleted UnSuccessfully");
	 	    	
	 	    	Reuse_func.resultFail("DeleteList_ListManagementPage", "List Deleted UnSuccessfully");
	 	    }  */
    	}
    	catch(NoSuchElementException e){
    		e.getMessage();
    	}
    	
    }	
	    	 
	  public static void BulkDeleteList_ListManagementPage() throws InterruptedException{
		  try{
	    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(1000);
	      
	        ClearField = ListManagementFeatures.ListSearchField;
			 ClearField.sendKeys(Keys.CONTROL + "a");
			 ClearField.sendKeys(Keys.DELETE);
			 
			 Thread.sleep(1000);
	        
	        BulkDeleteListVerification=ListManagementFeatures.BulkDeleteVerification.getText();
	        System.out.println(BulkDeleteListVerification);
	        
	        //Now Bulk Deleting the Listing
	        ListManagementFeatures.BulkListSelection.click();
	        
	        Thread.sleep(1000);
	        
	        //Press the Bulk Delete Button
	        ListManagementFeatures.BulkDeleteButton_Lists.click();
	        
	        Thread.sleep(1000);
	        
	        ListManagementFeatures.DeleteContact_ConfirmButton.click();
		
	        Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(6000);
		
	        //Validating if the list Bulk Deleted successfully or not
	        Assert.assertTrue(!getDriver().getPageSource().contains(BulkDeleteListVerification));
	    	/* if(!getDriver().getPageSource().contains(BulkDeleteListVerification))
	 	    {
	 	    	System.out.println("List Bulk Deleted Successfully");
	 	    	
	 	    	Reuse_func.resultPass("BulkDeleteList_ListManagementPage", "List Bulk Deleted Successfully");
	 	    }
	 	    else{
	             System.out.println("List Bulk Deleted UnSuccessfully");
	 	    	
	 	    	Reuse_func.resultFail("BulkDeleteList_ListManagementPage", "List Bulk Deleted UnSuccessfully");
	 	    }  */
            
		}

		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	
	  finally {
		  Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(1000);
	}
	  
	  
	  
	  }

	
}
