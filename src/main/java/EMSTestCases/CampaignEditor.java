package EMSTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class CampaignEditor extends EMS_Execution {

   public static Actions act;
   
   public static WebElement Drag;
   
   public static WebElement Drop;
   
   public static JavascriptExecutor jse;
   
   public static String Projectpath;
   
   static Reuse_Functions Reuse_func=new Reuse_Functions();
	
   static EMS_Locators CampaignEditor = PageFactory.initElements(getDriver(), EMS_Locators.class);
   
	public static void LinkTOURLButton_PopUpMessage_Verification() throws IOException, InterruptedException, AWTException{
		try{
	 
		 Thread.sleep(4000);
    	 
    	 //Replace the image from the existing one
    	 CampaignEditor.Editor_UploadImage_HtmlLink.click();
    	 
    	 //Press the replace Image Button
    	 CampaignEditor.Editor_ReplaceImage_Button.click();
    	 
    	 Thread.sleep(3000);
    	 
    	 // creating instance of Robot class (A java based utility)
    		/*Robot rb =new Robot();
    		
    	// pressing keys with the help of keyPress and keyRelease events
    		
    		rb.keyPress(KeyEvent.VK_C);
    		
    		rb.keyRelease(KeyEvent.VK_C);
    		
    		Thread.sleep(1000);
    		
    		rb.keyPress(KeyEvent.VK_SHIFT);
    		
    		rb.keyPress(KeyEvent.VK_SEMICOLON);
    		
    		rb.keyRelease(KeyEvent.VK_SEMICOLON);
    		
    		rb.keyRelease(KeyEvent.VK_SHIFT);
    		
    		 
    		
    		rb.keyPress(KeyEvent.VK_BACK_SLASH);
    		
    		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
    		
    		Thread.sleep(1000);
    		
    		 
    		
    		rb.keyPress(KeyEvent.VK_L);
    		
    		rb.keyRelease(KeyEvent.VK_L);
    		
    		 
    		
    		rb.keyPress(KeyEvent.VK_O);
    		
    		rb.keyRelease(KeyEvent.VK_O);
    		
    		 
    		
    		rb.keyPress(KeyEvent.VK_G);
    		
    		rb.keyRelease(KeyEvent.VK_G);
    		
    		Thread.sleep(1000);
    		
    	   
    		rb.keyPress(KeyEvent.VK_O);
    		
    		rb.keyRelease(KeyEvent.VK_O);
    		
    		Thread.sleep(1000);
    		
    		rb.keyPress(KeyEvent.VK_ENTER);
    		
    		rb.keyRelease(KeyEvent.VK_ENTER);*/
    	 
    	Projectpath=System.getProperty("user.dir");
 		System.out.println(Projectpath);
    	 
        Runtime.getRuntime().exec(Projectpath+"/Img/logo.exe");
    		
    		Thread.sleep(5000);
    		
    		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
    		Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
    		
           Thread.sleep(1000);
	         
          //Press the done editing button
    	   CampaignEditor.EditorPage_DoneEditingImage_Button.click();
    	   
    		
    		Thread.sleep(2000);
    		
    		// Create object of actions class
    	    act=new Actions(getDriver());
    		 
    		// find element which we need to drag
    		Drag=CampaignEditor.LinkToUrlButton_ContentBlock;
    		 
    		// find element which we need to drop
    		Drop=CampaignEditor.Editor_Product_DropArea;
    		 
    		// this will drag element to destination
    		act.dragAndDrop(Drag, Drop).build().perform();
    		 
    	    Thread.sleep(4000);
    		
    		CampaignEditor.LinkToURLButton_URLField.clear();
    		
    		Thread.sleep(1000);
    		
    		CampaignEditor.EditorPage_DoneEditing_URLButton.click();
    		
    		Thread.sleep(2000);
    		Assert.assertTrue(CampaignEditor.LinkToTheUrlButton_PopUpVerification_Campaign.getText().contains("You must provide a Link to URL for the Button"));
    		/*if(CampaignEditor.LinkToTheUrlButton_PopUpVerification_Campaign.getText().contains("You must provide a Link to URL for the Button"))
    		{
    			System.out.println("Link To URL Button Validation Popup Message Displayed Successfully");
    			
    			Reuse_func.resultPass("LinkTOURLButton_PopUpMessage_Verification", "Link To URL Button Validation Popup Message Displayed Successfully");
    		}
    		else{
    			
                System.out.println("Link To URL Button Validation Popup Message Displayed UnSuccessfully");
    			
                Reuse_func.resultFail("LinkTOURLButton_PopUpMessage_Verification", "Link To URL Button Validation Popup Message Displayed UnSuccessfully");
    		
    		}*/
    		
		}
		catch(NoSuchElementException e){
		     e.getMessage();
		}
	}	
    		
	
	public static void ButtonText_Updation_Verification_DuringCampaign() throws InterruptedException
	{
		try{
	     CampaignEditor.LinkToURLButton_PopUpMessage_OKButton.click();
    		
    		Thread.sleep(2000);
    		
            CampaignEditor.LinkToURLButton_URLField.sendKeys("http://www.google.com");
            
            CampaignEditor.LinkToUrlButton_ButtonTextField.clear();
    	    
            CampaignEditor.LinkToUrlButton_ButtonTextField.sendKeys("Click Here Text");
    	    
    	    Thread.sleep(1000);
    	    Assert.assertTrue(CampaignEditor.Templates_ButtonText_Verification.getText().contains("Click Here Text"));
    	  /*  if(CampaignEditor.Templates_ButtonText_Verification.getText().contains("Click Here Text"))
    	    {
    	    	System.out.println("Button Text Updated Successfully");
    	    	Reuse_func.resultPass("ButtonText_Updation_Verification_DuringCampaign","Button Text Updated Successfully");
    	    }
    	    else{
    	    	System.out.println("Button Text Updated UnSuccessfully");
    	    	Reuse_func.resultFail("ButtonText_Updation_Verification_TemplatesPage","Button Text Updated UnSuccessfully");
    	    }*/
            
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	
	public static void ProductAlignement_Below() throws InterruptedException{
		try{
            
            CampaignEditor.EditorPage_DoneEditing_URLButton.click();
    		
    		Thread.sleep(1000);
    		
    		
    		// Create object of actions class
    	    act=new Actions(getDriver());
    		 
    		// find element which we need to drag
    		Drag=CampaignEditor.Editor_ContentBlock_1Product;
    		 
    		// find element which we need to drop
    		Drop=CampaignEditor.Editor_Product_DropArea;
    		 
    		// this will drag element to destination
    		act.dragAndDrop(Drag, Drop).build().perform();
    		 
    	    Thread.sleep(4000);
    	    
    	    Reuse_func.waitForElementToBeClickable_Xpath(120, getDriver(),CampaignEditor.CampaignEditor_ProductSearchTab_Wait);
    	    
    	    Thread.sleep(2000);
    	    
    	    CampaignEditor.CampaignEditor_ProductSearchTab.click();
    	   
    	    //Search the Product 
    	    CampaignEditor.CampaignEditor_ProductSearchTab_SearchProductField.sendKeys(EMS_TestData.OrderProduct);
    	    
    	    //Press the Search Buton
    	    CampaignEditor.CampaignEditor_ProductSearchTab_SearchProductButton.click();
		
    	    Reuse_func.CustomProductPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(1000);
    	    
    	    
	         Reuse_func.waitForElementToBeClickable_CSS(120, getDriver(),CampaignEditor.CampaignEditor_ProductSearchTab_SearchProductSelection_Wait);
    	    
    	    Thread.sleep(2000);
    	    
    	    Reuse_func.waitForElementToBeClickable_CSS(120, getDriver(),CampaignEditor.CampaignEditor_ProductSearchTab_SearchProductSelection_Wait);
    	    
    	    Thread.sleep(2000);
		
    	    CampaignEditor.CampaignEditor_ProductSearchTab_SearchProductSelection.click();
    	    
    	    Thread.sleep(1000);
    	    
    	    //Press the Product Add Button
    	    CampaignEditor.ProductSearchTab_AddProduct_Button.click();
    	    
    	    Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	        Thread.sleep(1000);
    	    
    	    //Now change the Alignment for the product Added for template
    	    CampaignEditor.ProductAlignment_BelowButton.click();
    	    
    	    Thread.sleep(2000);
    	    
    	    //Validating if focus shift to Below section for Product added
    	    Assert.assertTrue(CampaignEditor.ProductAlign_Below_Verification.isDisplayed());
    	  /*  if(CampaignEditor.ProductAlign_Below_Verification.isDisplayed())
    	    {
    	    	System.out.println("Product Alignment display on Below Section Successfully");
    	    	
    	    	Reuse_func.resultPass("ProductAlignement_Below", "Product Alignment display on Below Section Successfully");
    	    }
    	    else{
    	    	
                System.out.println("Product Alignment display on Below Section UnSuccessfully");
    	    	
                Reuse_func.resultFail("ProductAlignement_Below", "Product Alignment display on Below Section UnSuccessfully");
    	    }*/
            
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
    	    
    public static void ProductAlignement_Right() throws InterruptedException{
    	try{
    	    CampaignEditor.ProductAlignment_RightButton.click();
    	    
    	    Thread.sleep(2000);
    	    
    	    //Validating if focus shift to Below section for Product added
    	    Assert.assertTrue(CampaignEditor.ProductAlign_Right_Verification.isDisplayed());
    	   /* if(CampaignEditor.ProductAlign_Right_Verification.isDisplayed())
    	    {
    	    	System.out.println("Product Alignment display on Right Section Successfully");
    	    	
    	    	Reuse_func.resultPass("ProductAlignement_Right", "Product Alignment display on Right Section Successfully");
    	    }
    	    else{
    	    	
                System.out.println("Product Alignment display on Right Section UnSuccessfully");
    	    	
                Reuse_func.resultFail("ProductAlignement_Right", "Product Alignment display on Right Section UnSuccessfully");
    	    }*/
    	}catch(NoSuchElementException e){
    		e.getMessage();
    	}
    	
    }
    	public static void ProductAlignement_Left() throws InterruptedException{
    		try{
            CampaignEditor.ProductAlignment_LeftButton.click();
    	    
    	    Thread.sleep(2000);
    	    Assert.assertTrue(CampaignEditor.ProductAlign_Left_Verification.isDisplayed());
    	    //Validating if focus shift to Below section for Product added
    	    
    	   /* if(CampaignEditor.ProductAlign_Left_Verification.isDisplayed())
    	    {
    	    	System.out.println("Product Alignment display on Left Section Successfully");
    	    	
    	    	Reuse_func.resultPass("ProductAlignement_Left", "Product Alignment display on Left Section Successfully");
    	    }
    	    else{
    	    	
                System.out.println("Product Alignment display on Left Section UnSuccessfully");
    	    	
                Reuse_func.resultFail("ProductAlignement_Left", "Product Alignment display on Left Section UnSuccessfully");
    	    }*/
    	
    	}catch(NoSuchElementException e){
    		e.getMessage();
    	}
    }
     public static void ProductAlignement_Above() throws InterruptedException{
    	 try{
            CampaignEditor.ProductAlignment_AboveButton.click();
    	    
    	    Thread.sleep(2000);
    	    
    	    //Validating if focus shift to Below section for Product added
    	    Assert.assertTrue(CampaignEditor.ProductAlign_Above_Verification.isDisplayed());
    	  /*  if(CampaignEditor.ProductAlign_Above_Verification.isDisplayed())
    	    {
    	    	System.out.println("Product Alignment display on Above Section Successfully");
    	    	
    	    	Reuse_func.resultPass("ProductAlignement_Above", "Product Alignment display on Above Section Successfully");
    	    }
    	    else{
    	    	
                System.out.println("Product Alignment display on Above Section UnSuccessfully");
    	    	
                Reuse_func.resultFail("ProductAlignement_Above", "Product Alignment display on Above Section UnSuccessfully");
    	    }*/
    	    
    	 }catch(NoSuchElementException e){
    		 e.getMessage();
    	 }
    	 
     } 
    public static void Campaign_Editor_Creation() throws InterruptedException{
    	try{
     
           //Press the done Editing Button
    	    CampaignEditor.EditorPage_DoneEditing_Button.click();
    	    
    	    Thread.sleep(2000);
    	   
    	    jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(0,-250)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-250,-500)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-500,-750)", "");
    	    
    	    Thread.sleep(2000);
    	    //Press the Next Button
    	    CampaignEditor.EditorStep_NextButton.click();
    	    
    	    Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
	         
	         Thread.sleep(1000);
    	    Assert.assertTrue(CampaignEditor.EditorStepSuccessfull_Verification.getText().contains("Recipients"));
    	   /* if(CampaignEditor.EditorStepSuccessfull_Verification.getText().contains("Recipients"))
    	    {
    	    	System.out.println(" Campaign Editor Step Done Successfully");
        		
    	    	Reuse_func.resultPass("Campaign Editor Creation", "Campaign Editor Step Done Successfully");
    	    }
    	    else{
    	    	
    	    	 System.out.println("Campaign Editor Step Done UnSuccessfully"); 
    	    	  
    	    	 Reuse_func.resultFail("Campaign Editor Creation", "New Blank Template Created Successfully");
        	 
    	    }*/
    	   
    	}catch(NoSuchElementException e)
    	{
    		e.getMessage();
    	}
    }
    public static void RecipientList_SelectionTextVerification(){
    	try{
    	    //Validate the Text that user can select upto 100 list from lists listing
    		Assert.assertTrue(CampaignEditor.RecipientsList_CampaignStep_TextVerification.getText().contains("Select up to 100 lists you would like to use for this campaign"));
    	   /* if(CampaignEditor.RecipientsList_CampaignStep_TextVerification.getText().contains("Select up to 100 lists you would like to use for this campaign"))
    	    {
    	    	System.out.println("Number of List Selection Text is Displayed Successfully");
    	    	
    	    	Reuse_func.resultPass("RecipientList_SelectionTextVerification", "Number of List Selection Text is Displayed Successfully");
    	    }
		
    	    else{
            System.out.println("Number of List Selection Text is Displayed UnSuccessfully");
    	    	
            Reuse_func.resultFail("RecipientList_SelectionTextVerification", "Number of List Selection Text is Displayed UnSuccessfully");
    	    	
    	    }*/
		
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}

	

}

