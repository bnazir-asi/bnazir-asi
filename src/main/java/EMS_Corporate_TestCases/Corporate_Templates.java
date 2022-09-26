package EMS_Corporate_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import EMSTestCases.CampaignEditor;
import FunctionsLibrary.Reuse_Functions_Corp;
import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class Corporate_Templates extends EMS_Corporate_Execution{

	public static Actions act;
	
	public static WebElement SwitchTenent;
	
	public static Select dropdownValue;
	
	public static WebElement Drag;
	
	public static String OldReceipientCount;
	public static String NewReceipientCount;
	  
	public static String EmailAddress_Contacts;
	
	public static String MoveToList_ListName;
	
	public static WebElement Drop;
	   
	 public static JavascriptExecutor jse;
	 
	 public static String TemplateName;
	 
	 public static String CRMContactName;
	 
	 public static String parentWindow;
	
	public static String CorporateFilterOldCount;
	
	public static String CorporateFilterNewCount;
	
	static EMS_Locators CorpTemplates = PageFactory.initElements(getDriver(), EMS_Locators.class);
	
	public static void BlankCorporateTemplateCreation_From_TemplatePage_Corporate() throws IOException, InterruptedException, AWTException{
		try{
		Thread.sleep(5000);
         CorpTemplates.TemplatesTab.click();
    	 
         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
		 
		 Thread.sleep(1000);
    	 
    	 Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
    	 
    	 Thread.sleep(5000);
    	 
    	 CorporateFilterOldCount=CorpTemplates.CorporateTemplateFilterCount.getText();
    	 System.out.println(CorporateFilterOldCount);
    	 
    	 CorpTemplates.CorporateTemplatesFilter.click();
    	 
    	 Thread.sleep(1000);
    	 //Press the Blank template button
    	 CorpTemplates.ChooseTemplate_BlankTemplateButton.click();
		 
		 //Enter the Template Name
    	 CorpTemplates.TemplateName_InsertionField.sendKeys(EMS_TestData.TemplateNameFromTemplates);
		 
		 //Press the Create Template Button
    	 CorpTemplates.Template_CreateButton.click();
		 
		 
    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
		  Assert.assertTrue(CorpTemplates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"));
		/*  if(CorpTemplates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"))
	    	 {
	    		System.out.println("New Blank Corporate Template Created from Template Page for Corporate Successfully");
	    		
	    		Reuse_Functions_Corp.resultPass("BlankCorporateTemplateCreation_From_TemplatePage_Corporate", "New Blank Template Created from Template Page for Corporate Successfully");
	    	 }
	    	 else{
	    		 System.out.println("New Blank Corporate Template Created from Template Page for Corporate UnSuccessfully"); 
	    	  
	    		 Reuse_Functions_Corp.resultFail("BlankCorporateTemplateCreation_From_TemplatePage_Corporate", "New Blank Template Created from Template Page for Corporate Successfully");
	    	 
	    	 }*/
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void Corporate_Template_Preview() throws InterruptedException, AWTException, IOException{
		try{
		  //Replace the image from the existing one
		  CorpTemplates.Editor_UploadImage_HtmlLink.click();
	    	 
	    	 //Press the replace Image Button
		  CorpTemplates.Editor_ReplaceImage_Button.click();
	    	 
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
	    		
	    		
	    		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	       	 
	       	    Thread.sleep(1000);
	    		
	    		//Press the done editing button
	    		CorpTemplates.EditorPage_DoneEditingImage_Button.click();
	    		
	    		Thread.sleep(2000);
	    		
	    		// Create object of actions class
	    	    act=new Actions(getDriver());
	    		 
	    		// find element which we need to drag
	    		Drag=CorpTemplates.Editor_ContentBlock_1Product;
	    		 
	    		// find element which we need to drop
	    		Drop=CorpTemplates.Editor_Product_DropArea;
	    		 
	    		// this will drag element to destination
	    		act.dragAndDrop(Drag, Drop).build().perform();
	    		 
	    	    Thread.sleep(4000);
	    	    
	    		Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.CampaignEditor_ProductSearchTab_Wait);
	    	    
	    	    Thread.sleep(2000);
	    	    
	    	    CorpTemplates.CampaignEditor_ProductSearchTab.click();
	    	   
	    	    //Search the Product 
	    	    CorpTemplates.CampaignEditor_ProductSearchTab_SearchProductField.sendKeys(EMS_TestData.OrderProduct);
	    	    
	    	    //Press the Search Buton
	    	    CorpTemplates.CampaignEditor_ProductSearchTab_SearchProductButton.click();
			
			    Reuse_Functions_Corp.waitForElementToBeClickable_CSS(120, getDriver(),"body > div.modal.modal-wide.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div > div > div.tab-pane.ng-scope.active > div.grid.grid-5.row.ng-scope > div > div > div:nth-child(1) > div > div.media-left.prod-img > div > a > img");
	    	    
	    	    Thread.sleep(2000);
			
	    	    CorpTemplates.CampaignEditor_ProductSearchTab_SearchProductSelection.click();
	    	    
	    	    Thread.sleep(1000);
	    	    
	    	    //Press the Product Add Button
	    	    CorpTemplates.ProductSearchTab_AddProduct_Button.click();
	    	    
	    	    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	       	 
	       	    Thread.sleep(1000);
	    	     
	    	    //Press the done Editing Button
	    	    CorpTemplates.EditorPage_DoneEditing_Button.click();
	    	    
	    	    Thread.sleep(2000);
	    	   
	    	    jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(0,-250)", "");
	            
	            jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(-250,-500)", "");
	            
	            jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(-500,-750)", "");
	    	    
	    	    Thread.sleep(2000);
	    	    //Press the save Button
	    	    CorpTemplates.TemplateEditingPage_SaveButton.click();
	    	    
	    	    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	       	 
	       	    Thread.sleep(1000);
			
	    	 
	       	//Press the Preview Button for campaign view
	       	CorpTemplates.TemplateEditingPage_PreviewButton.click();
	       	 
	       	Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	Thread.sleep(1000);
	       	 	 
	       	  //Validating campaign Preview Displayed Successfully or not
	    	Assert.assertTrue(CorpTemplates.TemplateCreate_PreviewVerification.isDisplayed());
	       	  /*	if(CorpTemplates.TemplateCreate_PreviewVerification.isDisplayed())
	       	  	{
	       	  		System.out.println("Corporate Template Preview Displayed Successfully");
	       	  		
	       	  		Reuse_Functions_Corp.resultPass("Corporate_Template Preview", "Corporate Template Preview Displayed Successfully");
	       	  		
	       	  	}
	       	  	else{
	       	  		
	                   System.out.println("Corporate Template Preview Displayed UnSuccessfully");
	       	  		
	       	  		Reuse_Functions_Corp.resultFail("Corporate_Template Preview", "Corporate Template Preview Displayed UnSuccessfully");
	       	  	
	       	  	}*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void NewCorporateTemplate_WithConfiguration_Creation() throws InterruptedException, IOException{
		try{
	       	 //Switch back to parent window 
	       	 CorpTemplates.ClosePreviewWindow.click();
      		  
       		
       		  Thread.sleep(3000);  
	       		  
	      //Storing the template name and verify it on templates listing screen
	       		TemplateName=CorpTemplates.TemplateCreation_FromTemplatePage_Verification.getText();
	       		System.out.println(TemplateName);
	       		  
	       		CorpTemplates.TemplatesTab.click();
	       	 
	       		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	       	 
	       	    Thread.sleep(1000);
	       	    
	       	   CorpTemplates.CorporateTemplatesFilter.click();
	    	 
	    	   Thread.sleep(1000);
	   		    Assert.assertTrue(getDriver().getPageSource().contains(TemplateName));
	   		 /*   if(getDriver().getPageSource().contains(TemplateName))
	   		    {
	   		    	System.out.println("New Corporate Template with configuration Created Successfully");
	   		    	
	   		    	Reuse_Functions_Corp.resultPass("NewCorporateTemplate_WithConfiguration_Creation", "New Corporate Template with configuration Created Successfully");
	   		    }
	   		    else{
	                System.out.println("New Corporate Template with configuration Created UnSuccessfully");
	   		    	
	   		    	Reuse_Functions_Corp.resultFail("NewCorporateTemplate_WithConfiguration_Creation", "New Corporate Template with configuration Created UnSuccessfully");
	   		    }*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
	   		    
	public static void CorporateTemplate_FilterCount_Verification() throws IOException, InterruptedException{
		try{
	   		    //Validating the corporate count filter
	   		 CorporateFilterNewCount=CorpTemplates.CorporateTemplateFilterCount.getText();
	   		 System.out.println(CorporateFilterNewCount);
	   		 Assert.assertTrue(!CorporateFilterNewCount.equals(CorporateFilterOldCount));
	   		/* if(!CorporateFilterNewCount.equals(CorporateFilterOldCount))
	   		 {
	   			 System.out.println("Corporate Filter Count updates after creating a new Corporate Template Successfully");
	   		 
	   			 Reuse_Functions_Corp.resultPass("CorporateTemplate_FilterCount_Verification", "Corporate Filter Count updates after creating a new Corporate Template Successfully");
	   		 }
	   		 else{
	   			System.out.println("Corporate Count updates after creating a new Corporate Template UnSuccessfully");
		   		 
	   			 Reuse_Functions_Corp.resultFail("CorporateTemplate_FilterCount_Verification", "Corporate Count updates after creating a new Corporate Template UnSuccessfully");
	   		 }*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void ChildUser_CorporateTemplatePublish_Verification_From_CorporateTenent() throws InterruptedException, IOException{
		try{
		//Search the Templates
	   		 CorpTemplates.ListSearchField.sendKeys(TemplateName);
	   		 
	   		 Thread.sleep(2000);
	   		 
	   		 //Hover the Template preview,Edit,Delete,Publish or Unpublish it
    		   Reuse_Functions_Corp.Hover(CorpTemplates.TemplateListHover, getDriver());
    		   
    		   Thread.sleep(2000);
    		   
    		 //Press the Publish Button
    		   CorpTemplates.ExistingTemplate_PublishUnpublish.click();
      		   
      		   //Press the confirm Button
    		   CorpTemplates.DeleteContact_ConfirmButton.click();
      		   
    		   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	       Thread.sleep(1000);
    		   
    		    jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(0,-250)", "");
	            
	            jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(-250,-500)", "");
	            
	            jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(-500,-750)", "");
    		    
    		    Thread.sleep(7000);
    		    
    		    //Now switch Tenent and Validate as if the Template which is created and publish is shown to child user or not
    		    CorpTemplates.UserInfo_Gravter.click();
    		    
    		    Thread.sleep(2000);
    		    
    		    if(getDriver().getCurrentUrl().contains("stage"))
    		    { 	
    		    SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
    		     dropdownValue= new Select(SwitchTenent);
    		    
    		    dropdownValue.selectByVisibleText("AIA/My Corporate Expressions (04B2)");
    		    }
    		    else if(getDriver().getCurrentUrl().contains("uat"))
    		    {
    		    	 SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
        		     dropdownValue= new Select(SwitchTenent);
        		    
        		    //dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");
        		     
        		     dropdownValue.selectByVisibleText("Promodonnas (asi/444514) (10AA)");
    		    }
    		    else{
    		    	
    		    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
       		        dropdownValue= new Select(SwitchTenent);
       		       dropdownValue.selectByVisibleText("ASIQA Corporate Child l Tenant (0PAP)");
    		    }
    		    
    		    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
    			  
    		    
    		    CorpTemplates.EmailMarketingTab.click();
    		    
    		    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
    			  
    		    
    		    CorpTemplates.TemplatesTab.click();
    	    	 
    		     Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
    	    	 
    	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),"//img[contains(@class,'img-responsive ems-width-full ng-isolate-scope')]");
    	    	 
    	    	 Thread.sleep(2000);
    	    	 
    	    	 CorpTemplates.CorporateTemplatesFilter.click();
    	    	 
    	    	 Thread.sleep(1000);
    	    	 Assert.assertTrue(getDriver().getPageSource().contains(TemplateName));
    	    	/* if(getDriver().getPageSource().contains(TemplateName))
    	    	 {
    	    		 System.out.println("Corporate Template Displayed to the Child user after publishing from Corporate User Successfully ");
    	    	     
    	    		 Reuse_Functions_Corp.resultPass("ChildUser_CorporateTemplatePublish_Verification_From_CorporateTenent", "Corporate Template Displayed  to the Child user after publishing from Corporate User Successfully");
    	    	 
    	    	 }
    	    	 else{
                      System.out.println("Corporate Template Displayed  to the Child user after publishing from Corporate User UnSuccessfully ");
    	    	     
    	    		 Reuse_Functions_Corp.resultFail("ChildUser_CorporateTemplatePublish_Verification_From_CorporateTenent", "Corporate Template Displayed  to the Child user after publishing from Corporate User UnSuccessfully");
    	    	 }*/
    	    	 
		}catch(NoSuchElementException e){
			e.getMessage();
		}
		
	}	
		
	public static void AIA_ListContactMoved_Verification() throws InterruptedException, IOException{
		try{
		//Scroll Up
    		       		jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(0,-250)", "");
    		            
    		            jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(-250,-500)", "");
    		            
    		            Thread.sleep(1000);
    		            
    	//Goto To List and Create List From Child user and validate child parent all Scenarios
    		            //Press the List Tab
    		            CorpTemplates.ListTab.click();
    		      	    
    		            Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		       	 
    		       	    Thread.sleep(1000);
    		         	 
    		         	 //Press the Create List Button
    		      	  CorpTemplates.CreateListButton_ListPage.click();
    		         	 
    		         	 //Enter the List Name and Press Create Button
    		      	CorpTemplates.ListName_Field.sendKeys(EMS_TestData.OwnerList);
    		         	 
    		      	CorpTemplates.List_CreateButton.click();
    		         	 
    		      	Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		    	 
    		    	 Thread.sleep(1000);
    		     		 
    		     		 WebElement ListNameVerification=CorpTemplates.ListCreationVerification;
    		     	 	 String ListName=ListNameVerification.getAttribute("value");
    		     	 	  
    		     	 	 System.out.println(ListName);
    		         	 
    		         	 //Validating List Created Successfully or not
    		         	 if(ListName.contains("EMS List"))
    		         	 {
    		         		 System.out.println("List Created Successfully");
    		         		 
    		         	 } 
    		         	 else{
    		         		 System.out.println("List Created UnSuccessfully");
    		         		
    		         		 }
    		         	 
    		         	//Add Contacts into list
    		         	CorpTemplates.AddContactsToList_Field.sendKeys("b");
    		        	 
    		        	 Thread.sleep(4000);
    		        	 
    		        	 CorpTemplates.AddContactsToList_Field.sendKeys("nazir@asicentral.com");
    		        	 
    		        	 Thread.sleep(4000);
    		        	 
    		        	 CorpTemplates.AddContactsToList_Field.sendKeys(Keys.ENTER);
    		        	 
    		        	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		        	 
    		        	 Thread.sleep(1000);
    		      	     
    		      	 //Select the contact which needs to be move
    		      	   CorpTemplates.ListContact_CheckboxSelection.click();
    		        	 
    		        	 //Storing the Email Address
    		        	 EmailAddress_Contacts=CorpTemplates.ListContactEmail.getText();
    		        	 System.out.println(EmailAddress_Contacts);
    		        	 
    		        	 //Press the Action button
    		        	 CorpTemplates.List_ActionButton.click();
    		        	 
    		        	 Thread.sleep(3000);
    		        	 
    		            Reuse_Functions_Corp_CampaignsList.Hover(CorpTemplates.MoveToList_ActionOption, getDriver());
    		     		 
    		     		 Thread.sleep(3000);
    		        	 
    		     	 	 //Storing the list name in which the the contacs is being moved
    		     	 	MoveToList_ListName=CorpTemplates.MoveToList_Name_ActionDropdown.getText();
    		     	 	System.out.println(MoveToList_ListName);
    		     	 	
    		     	 	CorpTemplates.MoveToList_Name_ActionDropdown.click();
    		     	 	
    		     	 	Thread.sleep(2000);
    		     	 	
    		     	 	
    		     		jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(0,-250)", "");
    		            
    		            jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(-250,-500)", "");
    		            
    		            jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(-500,-750)", "");
    		    	    
    		            Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		       	 
    		       	    Thread.sleep(1000);
    		   		  
    		    	    
    		    	    //Go Back to Previous Listing Screen
    		    	    CorpTemplates.List_BackLink.click();
    		    	    
    		    	    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		       	 
    		       	    Thread.sleep(1000);
    		   		  
    		    	    
    		    	  //Store the New Receipient Count
    		       	 NewReceipientCount=CorpTemplates.ReceipientCountColumn_ListManagementPage.getText();
    		       	 
    		       	 System.out.println(NewReceipientCount);
    		       	 Assert.assertTrue(NewReceipientCount.contains("0"));
    		     /*  	 if(NewReceipientCount.contains("0"))
    		       	 {
    		       		System.out.println("Contact Moved Successfully"); 
    		       		
    		       		Reuse_Functions_Corp.resultPass("AIA_ListContactMoved_Verification", "Contact Moved Successfully");
    		       	 }
    		       	 else{
    		       		 
    		       		 System.out.println("Contact Moved UnSuccessfully"); 
    		        		
    		        		Reuse_Functions_Corp.resultFail("AIA_ListContactMoved_Verification", "Contact Moved UnSuccessfully");
    		        	 }*/
    		     	 	
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
    public static void ChildList_Veriifcation_CorporateParent() throws InterruptedException, IOException{
    	try{
    		//Switch again to Corporate User again            
    		            
    		            CorpTemplates.UserInfo_Gravter.click();
    		            
    		            Thread.sleep(1000);
    		            if(getDriver().getCurrentUrl().contains("stage"))
    		            { 	
    		            SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
    					dropdownValue= new Select(SwitchTenent);
    					dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
    		            }
    		            else if(getDriver().getCurrentUrl().contains("uat"))
    		            {
    		            	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
        					dropdownValue= new Select(SwitchTenent);
        					dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");	
    		            }
    		            else{
    				    	
    				    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
    						dropdownValue= new Select(SwitchTenent);
    						dropdownValue.selectByVisibleText("ASIQA Corporate Parent l Tenant (08N3)");
    				    }
    		            
    		            
    		            
    		            Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		       	 
    		       	    Thread.sleep(1000);
    		   		  
    		//Goto Email Marketing tab again
    					CorpTemplates.EmailMarketingTab.click();
    					
    					Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    			    	 
    			    	 Thread.sleep(1000);
    					  
    					
    					
    					CorpTemplates.TemplatesTab.click();
    			    	 
    					Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    			    	 
    			    	Thread.sleep(1000);
    					  
    		Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
    			    	 
    			    	 Thread.sleep(2000);
    			    	 
    			    	 CorpTemplates.CorporateTemplatesFilter.click();
    			    	 
    			    	 Thread.sleep(1000);
    			    	 
    		//Search the Created and publish template again and unpublish it
    			    	 CorpTemplates.ListSearchField.sendKeys(TemplateName);
    			    	 
    			    	 Thread.sleep(1000);
    			    	 
    			    	Reuse_Functions_Corp.Hover(CorpTemplates.TemplateListHover, getDriver());
  		      		   
  		      		    Thread.sleep(2000);
  		      		   
  		      		   //Press the Publish Button
  		      		  CorpTemplates.ExistingTemplate_PublishUnpublish.click();
  		      		   
  		      		   //Press the confirm Button
  		      		  CorpTemplates.DeleteContact_ConfirmButton.click();
  		      		   
  		      		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		     	 
  		     	    Thread.sleep(1000);
  		 		  
  		    		 
  		    		//Scroll Up
    		       		jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(0,-250)", "");
    		            
    		            jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(-250,-500)", "");
    		            
    		            Thread.sleep(1000);
  		    		    
    		            //Press the List Tab
    		            CorpTemplates.ListTab.click();
    		      	    
    		            Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		       	 
    		       	    Thread.sleep(1000);
    		   		  
    		      	    
    		      	    //Search the List
    		      	  CorpTemplates.ListSearchField.sendKeys(EMS_TestData.OwnerList);
    		     	 
    		     	  Thread.sleep(3000);
    		     	  Assert.assertTrue(getDriver().getPageSource().contains(EMS_TestData.OwnerList));
    		     	/*  if(getDriver().getPageSource().contains(EMS_TestData.OwnerList))
    		     	  {
    		     		  System.out.println("Child List Display in Parent Successfully");
    		     		  
    		     		  Reuse_Functions_Corp.resultPass("ChildList_Veriifcation_CorporateParent", "Child List Display in Parent Successfully");
    		     	  }
    		     	  else{
    		     		  
    		     		 System.out.println("Child List Display in Parent UnSuccessfully");
   		     		  
   		     		    Reuse_Functions_Corp.resultFail("ChildList_Veriifcation_CorporateParent", "Child List Display in Parent UnSuccessfully");  
    		     	  }*/
    		     	  
    	}catch(NoSuchElementException e){
    		e.getMessage();
    	}
    }	
   
        public static void List_Owner_ActionButton_FromListPage_Verification() throws IOException, InterruptedException{
        	try{
                     Thread.sleep(12000);
        		
        		     CorpTemplates.ListDetails_Listing.click();
    		     	  
    		     	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    		    	 
    		    	 Thread.sleep(1000);
    				  
    		     	  
    		     	 List <WebElement> elementcount = CorpTemplates.ActionButton;
    			      
    			      int count=elementcount.size();
    			      
    			      System.out.println(count);
    			      
    			      if(count==0)
    			      {
    		             System.out.println("Action Button Doesn't display for List Copy and Move contacts other then list owner Successfully");

    		             Reuse_Functions_Corp.resultPass("List_Owner_ActionButton_FromListPage_Verification", "Action Button Doesn't display for List Copy and Move contacts other then list owner Successfully");
    		             
    			      }
    			      else{
    			    	  
    			    	  System.out.println("Action Button Doesn't display for List Copy and Move contacts other then list owner UnSuccessfully");

     		              Reuse_Functions_Corp.resultFail("List_Owner_CopyMoveActionButton_FromListPage_Verification", "Action Button Doesn't display for List Copy and Move contacts other then list owner UnSuccessfully");
    			    	  
    			    	}
    		     	 
        	}catch(NoSuchElementException e){
        		e.getMessage();
        	}
        }	
    			      
    	public static void ContactUnderList_TextUpdationVerification_AccordingToFunctionality_Avaialable() throws IOException, InterruptedException{
    		try{
    				Assert.assertTrue(CorpTemplates.ListContactMessage_WithoutImportButton.getText().contains("Add contacts to your list by entering Individual Contacts or adding from CRM"));
    			   /*   if(CorpTemplates.ListContactMessage_WithoutImportButton.getText().contains("Add contacts to your list by entering Individual Contacts or adding from CRM"))
    		     	  {
    		     		 System.out.println("MultiTenent List Update text shown on screen to match available functionality Successfully"); 
    		     	  
    		     		 Reuse_Functions_Corp.resultPass("ContactUnderList_TextUpdationVerification_AccordingToFunctionality_Avaialable", "MultiTenent List Update text shown on screen to match available functionality Successfully");
    		     	  
    		     	  }
    		     	  else{
    		     		  
    		     		 System.out.println("MultiTenent List Update text shown on screen to match available functionality UnSuccessfully"); 
       		     	  
    		     		 Reuse_Functions_Corp.resultFail("ContactUnderList_TextUpdationVerification_AccordingToFunctionality_Avaialable", "MultiTenent List Update text shown on screen to match available functionality UnSuccessfully");
    		     	  }*/
    		}catch(NoSuchElementException e){
    			e.getMessage();
    		}
    	}	
    		
    	public static void ChildUser_CorporateTemplateUnPublish_Verification_FromCorporateTenent() throws IOException, InterruptedException{
    		try{
    		     	 if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
    		     	 {	 
    		         //Now Add Contacts from CRM and validate in child
    			      CorpTemplates.AddFromCRM_Contacts_Button.click();
    			      
    			      Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    			    	 
    			      Thread.sleep(1000);
    					  
    			      
    			      CRMContactName=CorpTemplates.CRMContactEmailAddress.getText();
    			      System.out.println(CRMContactName);
    			      
    			      CorpTemplates.CRMCompanyName_SelectionCheckbox.click();
    			      
    			      Thread.sleep(2000);
    			      
    			      //Press the Add Button
    			     CorpTemplates.CRMToEMS_ContactAddButton.click();
    			    	 
    			     Thread.sleep(8000);   
  		    		    //Now switch Tenent and Validate as if the Template which is unpublish in parent/corporate should not be shown to the child user.
  		    		    CorpTemplates.UserInfo_Gravter.click();
  		    		    
  		    		    Thread.sleep(2000);
  		    		    if(getDriver().getCurrentUrl().contains("stage"))
  		    		    {	
  		    		    SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
  		    		     dropdownValue= new Select(SwitchTenent);
  		    		    
  		    		    dropdownValue.selectByVisibleText("AIA/My Corporate Expressions (04B2)");
  		    		    }
  		    		    else if(getDriver().getCurrentUrl().contains("uat"))
  		    		    {
  		    		    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
  	  		    		     dropdownValue= new Select(SwitchTenent);
  	  		    		    
  	  		    		  //  dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");	
  	  		    		    
  	  		    		 dropdownValue.selectByVisibleText("Promodonnas (asi/444514) (10AA)");
  		    		    }
  		    		  else{
  	    		    	
  	    		    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
  	       		        dropdownValue= new Select(SwitchTenent);
  	       		       dropdownValue.selectByVisibleText("ASIQA Corporate Child l Tenant (0PAP)");
  	    		    }
  		    		    
  		    		    
  		    		    
  		    		  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		       	 
  		       	      Thread.sleep(1000);
  		   		  
  		    		    
  		    		   CorpTemplates.EmailMarketingTab.click();
  		    		    
  		    		  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		       	 
  		       	      Thread.sleep(1000);
  		   		  
  		    		    
  		    		    //Scroll Up
  		    		  jse= (JavascriptExecutor)getDriver();
  		              jse.executeScript("window.scrollBy(0,-250)", "");
  		            
  		              jse= (JavascriptExecutor)getDriver();
  		              jse.executeScript("window.scrollBy(-250,-500)", "");
  		    		     
  		    		    CorpTemplates.TemplatesTab.click();
  		    	    	 
  		    		  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		       	 
  		       	      Thread.sleep(1000);
  		   		  
  		             Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
  		    	    	 
  		    	    	 Thread.sleep(2000);
  		    	    	 
  		    	    	CorpTemplates.CorporateTemplatesFilter.click();
  		    	    	 
  		    	    	 Thread.sleep(1000);
  		    	    	 Assert.assertTrue(!getDriver().getPageSource().contains(TemplateName));
  		    	    	/* if(!getDriver().getPageSource().contains(TemplateName))
  		    	    	 {
  		    	    		 System.out.println("Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User Successfully ");
  		    	    	     
  		    	    		 Reuse_Functions_Corp.resultPass("ChildUser_CorporateTemplateUnPublish_Verification_From_CorporateTenent", "Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User Successfully");
  		    	    	 
  		    	    	 }
  		    	    	 else{
  		                      System.out.println("Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User UnSuccessfully ");
  		    	    	     
  		    	    		 Reuse_Functions_Corp.resultFail("ChildUser_CorporateTemplateUnPublish_Verification_From_CorporateTenent", "Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User UnSuccessfully");
  		    	    	 }*/
    		     	 }
    		}
    		     	 catch(NoSuchElementException e){
    		     		 e.getMessage();
    		     	 }
    		} 
  		  public static void ADDContactsFromCRM_Parent_ChildVerification() throws InterruptedException, IOException{
  			  try{
    		
    		//Press the List Tab
     		            CorpTemplates.ListTab.click();
     		      	    
     		           Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
     		     	 
     		     	   Thread.sleep(1000);
     		 		  
     		      	   //Search the List
     		      	  CorpTemplates.ListSearchField.sendKeys(EMS_TestData.OwnerList);
     		     	 
     		     	  Thread.sleep(3000); 
     		     	  
     		     	CorpTemplates.ListDetails_Listing.click();
  		     	  
     		     	Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
     		    	 
     		        Thread.sleep(1000);
     				  
  		     	    Assert.assertTrue(getDriver().getPageSource().contains(CRMContactName));
  		     	  /*  if(getDriver().getPageSource().contains(CRMContactName))
  		     	    {
  		     	    	System.out.println("Contact Added from CRM From Parent to child Successfully");
  		     	    	
  		     	    	Reuse_Functions_Corp.resultPass("ADDContactsFromCRM_Parent_ChildVerification", "Contact Added from CRM From Parent to child Successfully");
  		     	    }
  		     	    else{
                        System.out.println("Contact Added from CRM From Parent to child UnSuccessfully");
  		     	    	
  		     	    	Reuse_Functions_Corp.resultFail("ADDContactsFromCRM_Parent_ChildVerification", "Contact Added from CRM From Parent to child UnSuccessfully");
  		     	    }*/
  			  }catch(NoSuchElementException e){
  				  e.getMessage();
  			  }
  		  }  
  		public static void Corporate_Template_Delete() throws InterruptedException, IOException{
  			try{
  		    	    	CorpTemplates.UserInfo_Gravter.click();
  		    	    	
  		    	    	Thread.sleep(1000);
  		    	    	
  		    	    	if(getDriver().getCurrentUrl().contains("stage"))
  		    	    	{	
  		    	    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
    					dropdownValue= new Select(SwitchTenent);
    					dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
  		    	    	}
  		    	    	else if(getDriver().getCurrentUrl().contains("uat"))
  		    	    	{	
  		    	
  		    	    		SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
  	    					dropdownValue= new Select(SwitchTenent);
  	    					dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");
  		    	    	}
  		    	    	
                       else{
    				    	
    				    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
    						dropdownValue= new Select(SwitchTenent);
    						dropdownValue.selectByVisibleText("ASIQA Corporate Parent l Tenant (08N3)");
    				    }
  		    	    	Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		    	    	 
  		    	    	 Thread.sleep(1000);
  		    			  
    		//Goto Email Marketing tab again
    					CorpTemplates.EmailMarketingTab.click();
    					
    					Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    			    	 
    			    	 Thread.sleep(1000);
    					  
    					
   					 jse= (JavascriptExecutor)getDriver();
		               jse.executeScript("window.scrollBy(0,-250)", "");
		               
		               jse= (JavascriptExecutor)getDriver();
		               jse.executeScript("window.scrollBy(-250,-500)", "");
		               
		               Thread.sleep(2000);
    					
    					CorpTemplates.TemplatesTab.click();
    			    	 
    					Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    			    	 
    			    	 Thread.sleep(1000);
    					  
    			    	 
    			         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
    			    	 
    			    	 Thread.sleep(5000);
    			    	 
    			    	 CorpTemplates.CorporateTemplatesFilter.click();
    			    	 
    			    	 Thread.sleep(1000);
    			    	 
    		//Search the Created and publish template again and unpublish it
    			    	 CorpTemplates.ListSearchField.sendKeys(TemplateName);
    			    	 
    			    	 Thread.sleep(1000);
    			    	 
    			    	Reuse_Functions_Corp.Hover(CorpTemplates.TemplateListHover, getDriver());
  		      		   
  		      		    Thread.sleep(2000);
  		      		    
  		      		//Press the delete Button
  		      		CorpTemplates.ExistingTemplateDeleteButton.click();
			      		   
			      		   //Press the Confirm Delete Template Button
			      		   
			      		//Press the confirm Button
  		      	   CorpTemplates.DeleteContact_ConfirmButton.click();
			      		 Assert.assertTrue(CorpTemplates.DeleteTemplate_Veriifcation.getText().contains("Success") & !CorporateFilterNewCount.equals(CorporateFilterOldCount));  
			      		/* if(CorpTemplates.DeleteTemplate_Veriifcation.getText().contains("Success") & !CorporateFilterNewCount.equals(CorporateFilterOldCount))
			    		 {
			    			 System.out.println("Corporate Template Deleted Successfully");
			    		     
			    			 Reuse_Functions_Corp.resultPass("CorporateTemplate_Delete", "Corporate Template Deleted Successfully");
			    		 }
			    		 else{
			    			 
			                System.out.println("Corporate Template Deleted unsuccessfully");
			    		     
			    			 Reuse_Functions_Corp.resultFail("CorporateTemplate_Delete", "Corporate Template Deleted unsuccessfully");
			    		 }*/
  			}catch(NoSuchElementException e){
  				e.getMessage();
  			}
  		}	
  		public static void ChildUser_CorporateTemplateUnPublish_Verification_From_CorporateTenent() throws InterruptedException, IOException{
  			try{
			      		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			       	 
			       	    Thread.sleep(1000);
			   		  
			    		  jse= (JavascriptExecutor)getDriver();
			               jse.executeScript("window.scrollBy(0,-250)", "");
			               
			               jse= (JavascriptExecutor)getDriver();
			               jse.executeScript("window.scrollBy(-250,-500)", "");
			               
			               Thread.sleep(7000);
		
		        
    		     		 
                        CorpTemplates.UserInfo_Gravter.click();
  		    		    
  		    		    Thread.sleep(2000);
  		    		    if(getDriver().getCurrentUrl().contains("stage"))
  		    		    {	
  		    		    SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
  		    		     dropdownValue= new Select(SwitchTenent);
  		    		    
  		    		    dropdownValue.selectByVisibleText("AIA/My Corporate Expressions (04B2)");
  		    		    }
  		    		    else if(getDriver().getCurrentUrl().contains("uat"))
  		    		    {
  		    		    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
  	  		    		     dropdownValue= new Select(SwitchTenent);
  	  		    		    
  	  		    		 //   dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");	
  	  		    		 dropdownValue.selectByVisibleText("Promodonnas (asi/444514) (10AA)");
  	  		    		
  		    		    }
  		    		  else{
  	    		    	
  	    		    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
  	       		        dropdownValue= new Select(SwitchTenent);
  	       		       dropdownValue.selectByVisibleText("ASIQA Corporate Child l Tenant (0PAP)");
  	    		    }
  		    		    
  		    		    
  		    		    
  		    		  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		       	 
  		       	      Thread.sleep(1000);
  		   		  
  		    		    
  		    		    CorpTemplates.EmailMarketingTab.click();
  		    		    
  		    		  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		       	 
  		       	      Thread.sleep(1000);
  		   		  
  		    		    
  		    		    //Scroll Up
  		    		  jse= (JavascriptExecutor)getDriver();
  		              jse.executeScript("window.scrollBy(0,-250)", "");
  		            
  		              jse= (JavascriptExecutor)getDriver();
  		              jse.executeScript("window.scrollBy(-250,-500)", "");
  		    		     
  		    		    CorpTemplates.TemplatesTab.click();
  		    	    	 
  		    		  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  		       	 
  		       	       Thread.sleep(1000);
  		   		  
  		Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
  		    	    	 
  		    	    	 Thread.sleep(2000);
  		    	    	 
  		    	    	CorpTemplates.CorporateTemplatesFilter.click();
  		    	    	 
  		    	    	 Thread.sleep(1000);
  		    	    	 Assert.assertTrue(!getDriver().getPageSource().contains(TemplateName));
  		    	    	/* if(!getDriver().getPageSource().contains(TemplateName))
  		    	    	 {
  		    	    		 System.out.println("Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User Successfully ");
  		    	    	     
  		    	    		 Reuse_Functions_Corp.resultPass("ChildUser_CorporateTemplateUnPublish_Verification_From_CorporateTenent", "Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User Successfully");
  		    	    	 
  		    	    	 }
  		    	    	 else{
  		                      System.out.println("Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User UnSuccessfully ");
  		    	    	     
  		    	    		 Reuse_Functions_Corp.resultFail("ChildUser_CorporateTemplateUnPublish_Verification_From_CorporateTenent", "Corporate Template doesn't Displayed to the Child user after unpublishing from Corporate User UnSuccessfully");
  		    	    	 }*/
  		    	    	Thread.sleep(3000);
    		     	 }
  		
    		     	 catch(NoSuchElementException e){
    		     		 e.getMessage();
    		     	 }
  		
  		finally {
  			
  			Thread.sleep(3000);
  			
  			CorpTemplates.UserInfo_Gravter.click();
  			
  			Thread.sleep(1000);
  			
  			if(getDriver().getCurrentUrl().contains("stage"))
 		    {	
 		    SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
 			dropdownValue= new Select(SwitchTenent);
 			dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
 		    }
 		    else if(getDriver().getCurrentUrl().contains("uat"))
 		    {
 		    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
 				dropdownValue= new Select(SwitchTenent);
 				dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");	
 		    }
 		    else{
 		    	
 		    	SwitchTenent=CorpTemplates.UserInfo_SwitchTenent_Dropdown;
 				dropdownValue= new Select(SwitchTenent);
 				dropdownValue.selectByVisibleText("ASIQA Corporate Parent l Tenant (08N3)");
 		    }
 		   
 		    
 		    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
 	    	 
 	    	 Thread.sleep(2000);
 	    	 
 	    	CorpTemplates.EmailMarketingTab.click();
			
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(2000);
		}
  		
  		}
  		  
  		
}




