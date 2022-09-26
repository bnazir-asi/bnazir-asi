package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class ChooseTemplate extends EMS_Execution{

	static WebElement element;
	public static void ChooseTemplate_WithBlankTemplateCreation() throws IOException, InterruptedException, AWTException{
		try{
	 
		Reuse_Functions Reuse_func=new Reuse_Functions();	
			
		//Now Insert the login credentials
    	// This is to Instantiate LogIn Page class  
    	 EMS_Locators ChooseTemplate = PageFactory.initElements(getDriver(), EMS_Locators.class);
    	
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	 Reuse_func.waitForElementToBeClickable_Xpath(120, getDriver(),ChooseTemplate.TemplatesDisplay_Wait);
    	 
    	 Thread.sleep(2000);
    	 //Press the Blank template button
		 ChooseTemplate.ChooseTemplate_BlankTemplateButton.click();
		 
		 //Enter the Template Name
		 ChooseTemplate.TemplateName_InsertionField.sendKeys(EMS_TestData.TemplateName);
		 
		 //Press the Create Template Button
		 ChooseTemplate.Template_CreateButton.click();
		 
		 
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	
		 //Validating that the editor step occurs successfully and template created successfully
         Assert.assertTrue(ChooseTemplate.EditorStep_Verification.getText().contains("EMS"));
    	/* if(ChooseTemplate.EditorStep_Verification.getText().contains("EMS"))
    	 {
    		System.out.println("New Blank Template Created Successfully");
    		
    		Reuse_func.resultPass("Blank Template Creation", "New Blank Template Created Successfully");
    	 }
    	 else{
    		 System.out.println("New Blank Template Created UnSuccessfully"); 
    	  
    		 Reuse_func.resultFail("Blank Template Creation", "New Blank Template Created Successfully");
    	 
    	 }*/
    	 
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}

	

}
