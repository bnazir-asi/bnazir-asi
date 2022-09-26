package EMS_Corporate_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions_Corp;
import Master.EMS_Corporate_Execution;
import PageFactoryandTestData.EMS_Locators;



public class Settings_Corporate extends EMS_Corporate_Execution {

	public static WebElement DefaultTemplate;
	   public static Select dropdownValue;
	   public static JavascriptExecutor jse;
	   public static String SupplierName;
	   static WebElement ClearField;
	   public static WebElement element;
	public static void CorporateSettings() throws IOException, InterruptedException, AWTException{
		try{
	 //Now Insert the login credentials
    	// This is to Instantiate LogIn Page class  
    	 EMS_Locators SettingsCorp = PageFactory.initElements(getDriver(), EMS_Locators.class);
    	
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
           
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
           
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-500,-750)", "");  
           
         Thread.sleep(2000);
    	 
    	 
    	 
    	 //Go to Settings Tab
    	 SettingsCorp.SettingsTab.click();
    	 
    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
    	 
    //Goto Corporate Settings option
    	 SettingsCorp.CorporateSettings_SettingsTab.click();
	
    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
		 
		 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
           
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
           
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-500,-750)", "");  
           
         Thread.sleep(1000);
		 
		 
    	 if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
    	 {	 
		 ClearField = SettingsCorp.UnsubscribeBlockText_Field;
		 ClearField.sendKeys(Keys.CONTROL + "a");
		 ClearField.sendKeys(Keys.DELETE);	 
	
		 Thread.sleep(1000);
		 
		 SettingsCorp.UnsubscribeBlockText_Field.sendKeys("NON AIA COMPANY");
		 
		 Thread.sleep(2000);
    	 }
		 
   //Firstly Change the default Template settings and validate on templates screen with templates which is selected
    	 DefaultTemplate= SettingsCorp.DefaultTemplateDropdown_Settings;
			dropdownValue= new Select(DefaultTemplate);
			dropdownValue.selectByVisibleText("My Templates");
			
			Thread.sleep(2000);
			
	//Press the save button
			SettingsCorp.CorporateSaveButton_SettingsCorporate.click();
			
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			
			 jse= (JavascriptExecutor)getDriver();
	         jse.executeScript("window.scrollBy(0,-250)", "");
	           
	         jse= (JavascriptExecutor)getDriver();
	         jse.executeScript("window.scrollBy(-250,-500)", "");
	           
	         jse= (JavascriptExecutor)getDriver();
	         jse.executeScript("window.scrollBy(-500,-750)", "");  
	           
	         Thread.sleep(2000);
			   
			
			//Go to Templates
	         SettingsCorp.TemplatesTab.click();
	         
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			 Assert.assertTrue(SettingsCorp.DefaultTemplateChangeVerification_OnTemplatesScreen.getText().contains("My Templates"));
			/* if(SettingsCorp.DefaultTemplateChangeVerification_OnTemplatesScreen.getText().contains("My Templates"))
			 {
				 System.out.println("DefaultTemplates Changes from corporate settings Successfully");
				 
				 Reuse_Functions_Corp.resultPass("DefaultTemplate_CorporateSettings_Changes_Verification", "DefaultTemplates Changes from corporate settings Successfully");
			 }
			 else{
				 
                 System.out.println("DefaultTemplates Changes from corporate settings Successfully");
				 
				 Reuse_Functions_Corp.resultFail("DefaultTemplate_CorporateSettings_Changes_Verification", "DefaultTemplates Changes from corporate settings Successfully");
			 } */
			 if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
			 {	 
			
			 SettingsCorp.CorporateTemplatesFilter.click();
			
			Thread.sleep(2000);
			
			Reuse_Functions_Corp.Hover(SettingsCorp.TemplateListHover, getDriver());
	 		   
		    Thread.sleep(2000);
		    
		    element = SettingsCorp.ExistingTemplate_EditButton;  
			   jse.executeScript("arguments[0].scrollIntoView(true);", element);
			   jse.executeScript("arguments[0].click();", element);
		    
			   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  	    	 
  	    	   Thread.sleep(1000);
		    Assert.assertTrue(SettingsCorp.UnsubscribeBlockText_Verification.getText().contains("NON AIA COMPANY"));
		/*    if(SettingsCorp.UnsubscribeBlockText_Verification.getText().contains("NON AIA COMPANY"))
		    {
		    	System.out.println("Unsubscribe block settings text updated on templates Successfully");
		    	
		    	Reuse_Functions_Corp.resultPass("UnsubscribeBlockText_Verification_Templates", "Unsubscribe block settings text updated on templates Successfully");
		    }
		    else{
		    	
                System.out.println("Unsubscribe block settings text updated on templates UnSuccessfully");
		    	
		    	Reuse_Functions_Corp.resultFail("UnsubscribeBlockText_Verification_Templates", "Unsubscribe block settings text updated on templates UnSuccessfully");
		    }*/
		    
		    //Press the Cancel Button
		    SettingsCorp.CancelButton_EditTemplate.click();
			  
		    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			 }
			 
			 //Go to Settings Tab
	    	 SettingsCorp.SettingsTab.click();
	    	 
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	    //Goto Corporate Settings option
	    	 SettingsCorp.CorporateSettings_SettingsTab.click();
		
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
			 if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
			 {	 
	  
			 ClearField = SettingsCorp.UnsubscribeBlockText_Field;
			 ClearField.sendKeys(Keys.CONTROL + "a");
			 ClearField.sendKeys(Keys.DELETE);	 
		
			 Thread.sleep(1000);
			 
			 SettingsCorp.UnsubscribeBlockText_Field.sendKeys("AIA COMPANY");
			 
			 Thread.sleep(2000);
			 }
			 
			 //Firstly Change the default Template settings and validate on templates screen with templates which is selected
	    	  DefaultTemplate= SettingsCorp.DefaultTemplateDropdown_Settings;
			  dropdownValue= new Select(DefaultTemplate);
			  dropdownValue.selectByVisibleText("Corporate Templates");
				
			  Thread.sleep(2000);
			  
			//Press the save button
				SettingsCorp.CorporateSaveButton_SettingsCorporate.click();
				
				Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
   	    	 
   	    	    Thread.sleep(1000);
				
				 jse= (JavascriptExecutor)getDriver();
		         jse.executeScript("window.scrollBy(0,-250)", "");
		           
		         jse= (JavascriptExecutor)getDriver();
		         jse.executeScript("window.scrollBy(-250,-500)", "");
		           
		         jse= (JavascriptExecutor)getDriver();
		         jse.executeScript("window.scrollBy(-500,-750)", "");  
		           
		         Thread.sleep(2000);
		       //For Supplier Flyer Validation  
		        /*if(getDriver().getPageSource().contains("ON"))
		        {
                     SettingsCorp.SupplierFlyerToggleClick.click();
		        	
		        	Thread.sleep(3000);
		        	
		        	 SettingsCorp.SupplierFlyerToggleClick.click();
			        	
			         Thread.sleep(3000);
		        	
		       }
		        else if(getDriver().getPageSource().contains("OFF")){
		        	
                    SettingsCorp.SupplierFlyerToggleClick.click();
		        	
		        	Thread.sleep(3000);  
		        }*/
		
		        //For Supplier Ranking Validation  
		        if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
		        {	
		         
		         if(getDriver().getPageSource().contains("ON"))
		        {
		        	 SettingsCorp.RankingToggleClick.click();
			        	
			         Thread.sleep(3000);
			        	
			         SettingsCorp.RankingToggleClick.click();
				        	
				     Thread.sleep(3000);
		        	}
		        else if(getDriver().getPageSource().contains("OFF")){
                    SettingsCorp.RankingToggleClick.click();
		        	
		        	Thread.sleep(3000);
                   }
		        }
		        
		        else{
		        	SettingsCorp.RankingToggleClick_Prod.click();
		        	
			         Thread.sleep(3000);
			        	
			         SettingsCorp.RankingToggleClick_Prod.click();
				        	
				     Thread.sleep(3000);
		        	
		        }
		      //Press the save button
				SettingsCorp.CorporateSaveButton_SettingsCorporate.click();
				
				 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
		    	 
		    	 Thread.sleep(1000);
				
				 jse= (JavascriptExecutor)getDriver();
		         jse.executeScript("window.scrollBy(0,-250)", "");
		           
		         jse= (JavascriptExecutor)getDriver();
		         jse.executeScript("window.scrollBy(-250,-500)", "");
		           
		         jse= (JavascriptExecutor)getDriver();
		         jse.executeScript("window.scrollBy(-500,-750)", "");  
		           
		         Thread.sleep(2000);
				   
				
				//Go to Templates
		         SettingsCorp.TemplatesTab.click();
		         
		         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
		    	 
		    	 Thread.sleep(1000);
			//Goto Supplier Flyer
				 SettingsCorp.SupplierFlyerFilter.click();
		    	 
		    	 Thread.sleep(2000);
		   Assert.assertTrue(getDriver().getPageSource().contains("Ranking")); 	 
		 /*   if(getDriver().getPageSource().contains("Ranking"))
		    {
		    	System.out.println("Ranking Displayed in Supplier Flyer Filter Successfully ");
		    	
		    	Reuse_Functions_Corp.resultPass("RankingDropdownValue_Verification_AtSupplierFlyerFilter", "Ranking Displayed in Supplier Flyer Filter Successfully");
		    }
		    else{
		    	
                System.out.println("Ranking Displayed in Supplier Flyer Filter UnSuccessfully ");
		    	
		    	Reuse_Functions_Corp.resultFail("RankingDropdownValue_Verification_AtSupplierFlyerFilter", "Ranking Displayed in Supplier Flyer Filter UnSuccessfully");
		    }*/
		
		   //Go to Settings Tab
	    	 SettingsCorp.SettingsTab.click();
	    	 
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	    //Goto Corporate Settings option
	    	 SettingsCorp.CorporateSettings_SettingsTab.click();
		
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			 
			 
	         SettingsCorp.CorporateSaveButton_SettingsCorporate.click();
	         
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			
			 jse= (JavascriptExecutor)getDriver();
	         jse.executeScript("window.scrollBy(0,-250)", "");
	           
	         jse= (JavascriptExecutor)getDriver();
	         jse.executeScript("window.scrollBy(-250,-500)", "");
	           
	         jse= (JavascriptExecutor)getDriver();
	         jse.executeScript("window.scrollBy(-500,-750)", "");  
	           
	         Thread.sleep(2000);
			   
			
			//Go to Templates
	         SettingsCorp.TemplatesTab.click();
	         
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			 
			//Goto Supplier Flyer
			 SettingsCorp.SupplierFlyerFilter.click();
	    	 
	    	 Thread.sleep(2000);
	    	 Assert.assertTrue(getDriver().getPageSource().contains("Ranking"));
	    	/* if(getDriver().getPageSource().contains("Ranking"))
			    {
			    	System.out.println("Ranking Not Displayed in Supplier Flyer Filter Successfully ");
			    	
			    	Reuse_Functions_Corp.resultPass("RankingDropdownValueNotDisplayed_Verification_AtSupplierFlyerFilter", "Ranking Not Displayed in Supplier Flyer Filter Successfully");
			    }
			    else{
			    	
	                System.out.println("Ranking Displayed in Supplier Flyer Filter UnSuccessfully ");
			    	
			    	Reuse_Functions_Corp.resultFail("RankingDropdownValueNotDisplayed_Verification_AtSupplierFlyerFilter", "Ranking Displayed in Supplier Flyer Filter UnSuccessfully");
			    }*/
	    	 //Go to Settings Tab
	    	 SettingsCorp.SettingsTab.click();
	    	 
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	    //Goto Corporate Settings option
	    	 SettingsCorp.CorporateSettings_SettingsTab.click();
		
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			 
	  //Press the Add Supplier Button
			 SettingsCorp.AddSupplierButton_Settings.click();
			 
			 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
			 
		    //Press the supplier Add Field
			 SettingsCorp.SupplierAddField.click();
			 
			 Thread.sleep(2000);
			 
	  //Enter the Supplier Name
			 SettingsCorp.SupplierInputField_Settings.sendKeys("ab");
			 
			 Thread.sleep(2000);
			 
		//Select the Supplier from list
			 SettingsCorp.SupplierSelection.click();
			 
			 Thread.sleep(2000);
			 
		//Storing the name of the supplier selected
			 SupplierName=SettingsCorp.SupplierNameCheck_SupplierAddPopup.getText();
			 System.out.println(SupplierName);
			 
		//Press the Add Button
			 SettingsCorp.SupplierAddButton.click();
			 
			 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 
		//Search the Supplier Added
			 SettingsCorp.SearchSupplier.sendKeys(SupplierName);
			 
			 Thread.sleep(2000);
			 Assert.assertTrue(getDriver().getPageSource().contains(SupplierName));
			/* if(getDriver().getPageSource().contains(SupplierName))
			 {
				 System.out.println("New Supplier Added to Settings Successfully");
				 
				 Reuse_Functions_Corp.resultPass("SupplierAdd_Settings", "New Supplier Added to Settings Successfully");
			 }
			 else{
                 System.out.println("New Supplier Added to Settings UnSuccessfully");
				 
				 Reuse_Functions_Corp.resultFail("SupplierAdd_Settings", "New Supplier Added to Settings UnSuccessfully");
			 }*/
	  		 
			 //check the supplier Added
			 SettingsCorp.CheckedSupplierCheckbox.click();
			 
			 Thread.sleep(2000);
			 
			 //Press the delete Button
			 SettingsCorp.DeleteSupplierButton.click();
			 
			 Thread.sleep(1000);
			 
			 //Press the Delete button to delete the supplier
			 SettingsCorp.DeleteConfirmButton.click();
			 
			 Thread.sleep(3000);
			 Assert.assertTrue(!getDriver().getPageSource().contains(SupplierName));
			/* if(!getDriver().getPageSource().contains(SupplierName))
			 {
				 System.out.println("Supplier Name Doesn't display After Deletion so test case is passed");
				 
				 Reuse_Functions_Corp.resultPass("SupplierDelete_Settings", "Supplier Name Doesn't display After Deletion so test case is passed");
			 }
			 else{
                 System.out.println("Supplier Name Doesn't display After Deletion so test case is Failed");
				 
				 Reuse_Functions_Corp.resultFail("SupplierDelete_Settings", "Supplier Name Doesn't display After Deletion so test case is Failed");
			 }*/
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
}

}