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



public class Templates extends EMS_Execution {

	public static Actions act;
	   
	public static WebElement Drag;
	   
	 public static WebElement Drop;
	   
	 public static JavascriptExecutor jse;
	 
	 public static String TemplateName;
	 
	public static String parentWindow;
	
	public static String OldAllTemplatesCount;
	
	public static String NewAllTemplatesCount;
	
	static Reuse_Functions Reuse_func=new Reuse_Functions();
	 
	static EMS_Locators Templates = PageFactory.initElements(getDriver(), EMS_Locators.class);
	
	
	public static void BlankTemplateCreation_From_TemplatePage() throws IOException, InterruptedException, AWTException{
		try{
	 
	     Templates.TemplatesTab.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
         Reuse_func.waitForElementToBeClickable_Xpath(120, getDriver(),Templates.TemplatesDisplay_Wait);
    	 
    	 Thread.sleep(2000);
    	
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	 
    	 //Press the Blank template button
    	 Templates.ChooseTemplate_BlankTemplateButton.click();
		 
		 //Enter the Template Name
    	 Templates.TemplateName_InsertionField.sendKeys(EMS_TestData.TemplateNameFromTemplates);
		 
		 //Press the Create Template Button
    	 Templates.Template_CreateButton.click();
		 
		 
         Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
    	
		 //Validating that the editor step occurs successfully and template created successfully
         Assert.assertTrue(Templates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"));
    /*	 if(Templates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"))
    	 {
    		System.out.println("New Blank Template Created from Template Page Successfully");
    		
    		Reuse_func.resultPass("BlankTemplateCreation_From_TemplatePage", "New Blank Template Created from Template Page Successfully");
    	 }
    	 else{
    		 System.out.println("New Blank Template Created from Template Page UnSuccessfully"); 
    	  
    		 Reuse_func.resultFail("BlankTemplateCreation_From_TemplatePage", "New Blank Template Created from Template Page Successfully");
    	 
    	 }*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
	public static void ButtonText_Updation_Verification_TemplatesPage() throws InterruptedException, AWTException, IOException{
		try{
    	 //Replace the image from the existing one
    	 Templates.Editor_UploadImage_HtmlLink.click();
    	 
    	 //Press the replace Image Button
    	 Templates.Editor_ReplaceImage_Button.click();
    	 
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
    	CampaignEditor.Projectpath=System.getProperty("user.dir");
  		System.out.println(CampaignEditor.Projectpath);
     	 
        Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/logo.exe");
    		
    	Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
            
            Thread.sleep(1000);
    		//Press the done editing button
    		Templates.EditorPage_DoneEditingImage_Button.click();
    		
    		Thread.sleep(2000);
    		
    		// Create object of actions class
    	    act=new Actions(getDriver());
    		 
    		// find element which we need to drag
    		Drag=Templates.LinkToUrlButton_ContentBlock;
    		 
    		// find element which we need to drop
    		Drop=Templates.Editor_Product_DropArea;
    		 
    		// this will drag element to destination
    		act.dragAndDrop(Drag, Drop).build().perform();
    		 
    	    Thread.sleep(4000);
    		
    	   Templates.LinkToUrlButton_ButtonTextField.clear();
    	    
    	    Templates.LinkToUrlButton_ButtonTextField.sendKeys("Click Here Text");
    	    
    	    Thread.sleep(1000);
    	    Assert.assertTrue(Templates.Templates_ButtonText_Verification.getText().contains("Click Here Text"));
    	 /*   if(Templates.Templates_ButtonText_Verification.getText().contains("Click Here Text"))
    	    {
    	    	System.out.println("Button Text Updated Successfully");
    	    	Reuse_func.resultPass("ButtonText_Updation_Verification_TemplatesPage","Button Text Updated Successfully");
    	    }
    	    else{
    	    	System.out.println("Button Text Updated UnSuccessfully");
    	    	Reuse_func.resultFail("ButtonText_Updation_Verification_TemplatesPage","Button Text Updated UnSuccessfully");
    	    }*/
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void Template_Preview() throws InterruptedException{
		try{
            Templates.EditorPage_DoneEditing_URLButton.click();
    		
    		Thread.sleep(2000);
    	    
    		
    		
    		// Create object of actions class
    	    act=new Actions(getDriver());
    		 
    		// find element which we need to drag
    		Drag=Templates.Editor_ContentBlock_1Product;
    		 
    		// find element which we need to drop
    		Drop=Templates.Editor_Product_DropArea;
    		 
    		// this will drag element to destination
    		act.dragAndDrop(Drag, Drop).build().perform();
    		 
    	    Thread.sleep(4000);
    	    
            Reuse_func.waitForElementToBeClickable_Xpath(120, getDriver(),Templates.CampaignEditor_ProductSearchTab_Wait);
    	    
    	    Thread.sleep(2000);
    	    
    	    Templates.CampaignEditor_ProductSearchTab.click();
    	   
    	    //Search the Product 
    	    Templates.CampaignEditor_ProductSearchTab_SearchProductField.sendKeys(EMS_TestData.OrderProduct);
    	    
    	    //Press the Search Buton
    	    Templates.CampaignEditor_ProductSearchTab_SearchProductButton.click();
		
            Reuse_func.waitForElementToBeClickable_CSS(120, getDriver(),Templates.CampaignEditor_ProductSearchTab_SearchProductSelection_Wait);
    	    
    	    Thread.sleep(2000);
		
    	    Templates.CampaignEditor_ProductSearchTab_SearchProductSelection.click();
    	    
    	    Thread.sleep(1000);
    	    
    	    //Press the Product Add Button
    	    Templates.ProductSearchTab_AddProduct_Button.click();
    	    
            Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
            
            Thread.sleep(1000);
    	    
    	    //Press the done Editing Button
    	    Templates.EditorPage_DoneEditing_Button.click();
    	    
    	    Thread.sleep(2000);
    	   
    	    jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(0,-250)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-250,-500)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-500,-750)", "");
    	    
    	    Thread.sleep(2000);
    	    //Press the save Button
    	    Templates.TemplateEditingPage_SaveButton.click();
    	    
            Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
            
            Thread.sleep(1000);
       	 
       	//Press the Preview Button for campaign view
       	Templates.TemplateEditingPage_PreviewButton.click();
       	 
       	Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
        
        Thread.sleep(1000);
       	 
       	  //Validating campaign Preview Displayed Successfully or not
        Assert.assertTrue(Templates.TemplateCreate_PreviewVerification.isDisplayed());
       	  	/*if(Templates.TemplateCreate_PreviewVerification.isDisplayed())
       	  	{
       	  		System.out.println("Template Preview Displayed Successfully");
       	  		
       	  		Reuse_func.resultPass("Template Preview", "Template Preview Displayed Successfully");
       	  		
       	  	}
       	  	else{
       	  		
                   System.out.println("Template Preview Displayed UnSuccessfully");
       	  		
       	  		Reuse_func.resultFail("Template Preview", "Template Preview Displayed UnSuccessfully");
       	  	
       	  	}*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
     public static void NewTemplate_WithConfiguration_Creation() throws InterruptedException{
    	 try{
	
	       //getDriver().close();
       	  	Templates.ClosePreviewWindow.click();
       		  
       		 //Switch back to parent window 
       	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
       		  
       		  //Storing the template name and verify it on templates listing screen
       		TemplateName=Templates.TemplateCreation_FromTemplatePage_Verification.getText();
       		System.out.println(TemplateName);
       		  
       		Templates.TemplatesTab.click();
       	 
            Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
            
            Thread.sleep(1000);
   		    Assert.assertTrue(getDriver().getPageSource().contains(TemplateName));
   		  /*  if(getDriver().getPageSource().contains(TemplateName))
   		    {
   		    	System.out.println("New Template with configuration Created Successfully");
   		    	
   		    	Reuse_func.resultPass("NewTemplate_WithConfiguration_Creation", "New Template with configuration Created Successfully");
   		    }
   		    else{
                System.out.println("New Template with configuration Created UnSuccessfully");
   		    	
   		    	Reuse_func.resultFail("NewTemplate_WithConfiguration_Creation", "New Template with configuration Created UnSuccessfully");
   		    }*/
    	 }
    	 catch(NoSuchElementException e){
    		 e.getMessage();
    	 }
     }	 
   	   public static void TemplatePreview_FromTemplateListing() throws InterruptedException{
   		   try{
            //Search the New Created Tempate
   		    Templates.SearchTemplate_Field.sendKeys(TemplateName);
   		    
   		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
  		   
  		  Templates.test.click();
    	 
    	 Thread.sleep(4000);
   		    
   		    //Hover the Template preview,Edit,Delete,Publish or Unpublish it
   		   Reuse_func.Hover(Templates.TemplateListHover, getDriver());
  	      
  	     
    	 
    	   Thread.sleep(2000);
		    
		    //First Preview the Template from listing screen
		  //First store parent window to switch back
	       	 // parentWindow = getDriver().getWindowHandle();
	       	 
	       	//Press the Preview Button for campaign view
	       	Templates.ExistingTemplate_PreviewLink.click();
	       	 
            Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
            
            Thread.sleep(1000);
	       	 
	       	  //Validating campaign Preview Displayed Successfully or not
            Assert.assertTrue(Templates.TemplateCreate_PreviewVerification.isDisplayed());
	       	  /*	if(Templates.TemplateCreate_PreviewVerification.isDisplayed())
	       	  	{
	       	  		System.out.println("Template Preview Displayed From Template Listing Successfully");
	       	  		
	       	  		Reuse_func.resultPass("TemplatePreview_FromTemplateListing", "Template Preview Displayed From Template Listing Successfully");
	       	  		
	       	  	}
	       	  	else{
	       	  		
	                   System.out.println("Template Preview Displayed From Template Listing UnSuccessfully");
	       	  		
	       	  		Reuse_func.resultFail("TemplatePreview_FromTemplateListing", "Template Preview Displayed From Template Listing UnSuccessfully");
	       	  	
	       	  	}*/
   		   }catch(NoSuchElementException e)
   		   {
   			   e.getMessage();
   		   }
   	   }	   
	   public static void Templates_Publish() throws InterruptedException{
		   try{
	       		  
	       		 //Switch back to parent window 
	       	 Templates.ClosePreviewWindow.click();
      		  
       		 //Switch back to parent window 
              Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
            
              Thread.sleep(1000);
	       		  
	       		  //Now publish the template and verify it
	       		OldAllTemplatesCount=Templates.AllTemplatesFilter_Count.getText();
	       		System.out.println(OldAllTemplatesCount);
	       		  
	       		  //Hover the Template preview,Edit,Delete,Publish or Unpublish it
	      		   Reuse_func.Hover(Templates.TemplateListHover, getDriver());
	      		   
	      		   Thread.sleep(2000);
	      		   
	      		   //Press the Publish Button
	      		   Templates.ExistingTemplate_PublishUnpublish.click();
	      		   
	      		   //Press the confirm Button
	      		   Templates.DeleteContact_ConfirmButton.click();
	      		   
	      		    Reuse_func.isElementDisplayed(Templates.Spinner2,getDriver());
	       		 
	        	    Reuse_func.waitForElementToBeGone(Templates.Spinner2, 120,getDriver());
	    		
	    		    Thread.sleep(2000);
	    		    
	    	//Validate if the template publish or not
	    		    NewAllTemplatesCount=Templates.AllTemplatesFilter_Count.getText();
		       		System.out.println(NewAllTemplatesCount);
	      		Assert.assertTrue(!NewAllTemplatesCount.equals(OldAllTemplatesCount));
		       	/*	if(!NewAllTemplatesCount.equals(OldAllTemplatesCount))
		       		{
		       			System.out.println("Templates Publish Successfully");
		       			
		       			Reuse_func.resultPass("Templates Publish", "Templates Publish Successfully");
		       			
		       		}
		       		else{
		       			System.out.println("Templates Publish UnSuccessfully");
		       		
		       			Reuse_func.resultFail("Templates Publish", "Templates Publish UnSuccessfully");
		       		
		       		}*/
		       		
		   }catch(NoSuchElementException e){
			   e.getMessage();
		   }
	   }  
	public static void Templates_UnPublish() throws InterruptedException{
		try{
		//NOw Unpublish the templates
		       		OldAllTemplatesCount=Templates.AllTemplatesFilter_Count.getText();
		       		System.out.println(OldAllTemplatesCount);
		       		  
		       		  //Hover the Template preview,Edit,Delete,Publish or Unpublish it
		      		   Reuse_func.Hover(Templates.TemplateListHover, getDriver());
		      		   
		      		   Thread.sleep(2000);
		      		   
		      		   //Press the Publish Button
		      		   Templates.ExistingTemplate_PublishUnpublish.click();
		      		   
		      		   //Press the confirm Button
		      		   Templates.DeleteContact_ConfirmButton.click();
		      		   
		      		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
		             
		             Thread.sleep(1000);
		    		    
		    	//Validate if the template publish or not
		    		    NewAllTemplatesCount=Templates.AllTemplatesFilter_Count.getText();
			       		System.out.println(NewAllTemplatesCount);
		      		Assert.assertTrue(!NewAllTemplatesCount.equals(OldAllTemplatesCount));
			       		/*if(!NewAllTemplatesCount.equals(OldAllTemplatesCount))
			       		{
			       			System.out.println("Templates UnPublish Successfully");
			       			
			       			Reuse_func.resultPass("Templates UnPublish", "Templates UnPublish Successfully");
			       			
			       		}
			       		else{
			       			System.out.println("Templates UnPublish UnSuccessfully");
			       		
			       			Reuse_func.resultFail("Templates UnPublish", "Templates UnPublish UnSuccessfully");
			       		
			       		}	*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	
	public static void DeleteTemplate() throws InterruptedException{
		try{
		//Now Delete the Templates
			       	//Hover the Template preview,Edit,Delete,Publish or Unpublish it
			      		   Reuse_func.Hover(Templates.TemplateListHover, getDriver());
			      		   
			      		   Thread.sleep(2000);
			      		   
			      		   //Press the delete Button
			      		   Templates.ExistingTemplateDeleteButton.click();
			      		   
			      		   //Press the Confirm Delete Template Button
			      		   
			      		//Press the confirm Button
			      		   Templates.DeleteContact_ConfirmButton.click();
			      		   Assert.assertTrue(Templates.DeleteTemplate_Veriifcation.getText().contains("Success"));
			      	/*	 if(Templates.DeleteTemplate_Veriifcation.getText().contains("Success"))
			    		 {
			    			 System.out.println("Template Deleted Successfully");
			    		     
			    			 Reuse_func.resultPass("DeleteTemplate", "Template Deleted Successfully");
			    		 }
			    		 else{
			    			 
			                System.out.println("Template Deleted unsuccessfully");
			    		     
			    			 Reuse_func.resultFail("DeleteTemplate", "Template Deleted unsuccessfully");
			    		 } */
			      		   
			      		
		
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	 finally {
		 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
 		    
 		   jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(0,-250)", "");
            
            jse= (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(-250,-500)", "");
            
            Thread.sleep(2000);
	}
	
	}

}
