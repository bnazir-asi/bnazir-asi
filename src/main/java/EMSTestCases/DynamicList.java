package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;


public class DynamicList extends EMS_Execution {

	public static WebElement RuleFilterSelection;
	public static Select dropdownValue;
	public static JavascriptExecutor jse;
	static Reuse_Functions Reuse_func=new Reuse_Functions();
	
   static EMS_Locators DynamicList = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void DynamicListContacts_Preview_Verification() throws IOException, InterruptedException, AWTException{
		try{	
    	 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
         
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
         
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-500,-750)", "");
 	    
 	    Thread.sleep(2000);
 	    
 	    //Press the List Tab
 	   DynamicList.ListTab.click();
 	    
 	  Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
      
      Thread.sleep(1000);
    	 
    	 //Press the Create List Button
 	   DynamicList.CreateListButton_ListPage.click();
    	 
    	 //Enter the List Name and Press Create Button
 	  DynamicList.ListName_Field.sendKeys(EMS_TestData.ListNameFromListPage);
    	 
 	 DynamicList.List_CreateButton.click();
    	 
 	Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
    
    Thread.sleep(1000);
		 
		 WebElement ListNameVerification=DynamicList.ListCreationVerification;
	 	 String ListName=ListNameVerification.getAttribute("value");
	 	  
	 	 System.out.println(ListName);
    	 
    	 //Validating List Created Successfully or not
	 	 Assert.assertTrue(ListName.contains("EMS List"));
    	/* if(ListName.contains("EMS List"))
    	 {
    		 System.out.println("List Created Successfully");
    		 
    	 } 
    	 else{
    		 System.out.println("List Created UnSuccessfully");
    		
    		  }*/
    	//Press the dynamic checkbox to add contacts and make the List Dynamic
    	 
		DynamicList.DynamicList_CheckBox.click();
		
		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
		
		//Press the Add a rule link
		DynamicList.AddNewRule_Link.click();
		
		Thread.sleep(1000);
		
		RuleFilterSelection= DynamicList.RuleFilter_Dropdown;
		  dropdownValue= new Select(RuleFilterSelection);
		  dropdownValue.selectByVisibleText("Record Owners");
			
		  Thread.sleep(2000);
		  
		//Find the Record owner Indivisual
		  DynamicList.RuleFilterRecordOwner_IndivisualNameField.sendKeys("Automation");
		  
		  Thread.sleep(3000);
		
		  DynamicList.RuleFilterRecordOwner_IndivisualNameField.sendKeys(Keys.ENTER);
		  
		  Thread.sleep(1000);
		  
		  //Press the Preview Button
		  DynamicList.PreviewList_Dynamic.click();
		  
		  Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(1000);
		  Assert.assertTrue(DynamicList.PreviewDetails_Verification.isDisplayed());
		 /* if(DynamicList.PreviewDetails_Verification.isDisplayed())
		  {
			  System.out.println("Dynamic List Contacts Preview Details Displayed Successfully");
			  
			  Reuse_func.resultPass("DynamicListContacts_Preview_Verification","Dynamic List Contacts Preview Details Displayed Successfully");
		  }
		  else{
			  
              System.out.println("Dynamic List Contacts Preview Details Displayed UnSuccessfully");
			  
			  Reuse_func.resultFail("DynamicListContacts_Preview_Verification","Dynamic List Contacts Preview Details Displayed UnSuccessfully");
		  }*/
		  
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void DynamicList_Creation_WithVerification() throws InterruptedException{
		try{
		  
		  //Press the Save Button to complete the dynamic List Process
		  DynamicList.DynamicList_SaveButton.click();
		  
		  Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	       Thread.sleep(1000);
		  Assert.assertTrue(DynamicList.DynamicListName_DynamicText_Verification_AfterSaving.getText().contains("Dynamic") & DynamicList.DynamicList_RecipientText_Verification_AfterSaving.getText().contains("Recipients") & DynamicList.DynamicList_RecipientText_Verification_AfterSaving.getText().contains("As of"));
		 /* if(DynamicList.DynamicListName_DynamicText_Verification_AfterSaving.getText().contains("Dynamic") & DynamicList.DynamicList_RecipientText_Verification_AfterSaving.getText().contains("Recipients") & DynamicList.DynamicList_RecipientText_Verification_AfterSaving.getText().contains("As of"))
		  {
			  System.out.println("Dynamic List Created Successfully");
			  
			  Reuse_func.resultPass("DynamicList_Creation_WithVerification", "Dynamic List Created Successfully");
		  }
		  else{
			  
              System.out.println("Dynamic List Created UnSuccessfully");
			  
			  Reuse_func.resultFail("DynamicList_Creation_WithVerification", "Dynamic List Created UnSuccessfully"); 
		  }*/
		  
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}
}
