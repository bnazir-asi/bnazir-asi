package EMS_Corporate_TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import EMSTestCases.CampaignEditor;
import FunctionsLibrary.Reuse_Functions_Corp;
import Master.EMS_Corporate_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class My_Templates extends EMS_Corporate_Execution{

	public static Actions act;
	
	public static WebElement SwitchTenent;
	
	public static Select dropdownValue;
	
	public static WebElement Drag;
	   
	 public static WebElement Drop;
	   
	 public static JavascriptExecutor jse;
	 
	 public static String TemplateName;
	 
	public static String parentWindow;
	
	
	public static String MyTemplateFilterOldCount;
	public static String MyTemplateFilterNewCount;
	
	static EMS_Locators CorpTemplates = PageFactory.initElements(getDriver(), EMS_Locators.class);
	
	public static void BlankMyTemplateCreation_From_TemplatePage_Corporate() throws IOException, InterruptedException, AWTException{
		try{
	 
         CorpTemplates.TemplatesTab.click();
    	 
    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
    	 
         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
    	 
    	 Thread.sleep(2000);
    	 
    	 CorpTemplates.UserInfo_Gravter.click();
			
		 Thread.sleep(1000);
			
		//Press the Logout Button
		 CorpTemplates.UserInfo_Logout.click();
			
		 Thread.sleep(3000);
    	 
    	 //Now Goto Child User and logged into it for CRM Data Access status change to ON
    	 if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
    	 {
    		//Now login with admin child user
    		 CorpTemplates.EspASINo.sendKeys(EMS_TestData.ASINo_Adminchild);
					
					
				//Enter Username 
    		 CorpTemplates.EspUserName.sendKeys(EMS_TestData.Username_Adminchild);
			   	 
			   	 //Enter Password
    		 CorpTemplates.EspPassword.sendKeys(EMS_TestData.Password_NonAdminchild);
			   	
			   	 //Now Press the Login Button
			   	 
    		 CorpTemplates.EspLoginButton.click();
    	 }
    	 else{
    		 
    		//Now login with admin child user
    		 CorpTemplates.EspASINo.sendKeys(EMS_TestData.ASINo_ProdAdmin);
					
					
				//Enter Username 
    		 CorpTemplates.EspUserName.sendKeys(EMS_TestData.Username_ProdAdmin);
			   	 
			   	 //Enter Password
    		 CorpTemplates.EspPassword.sendKeys(EMS_TestData.Password_ProdAdmin);
			   	
			   	 //Now Press the Login Button
			   	 
    		 CorpTemplates.EspLoginButton.click(); 
    	 }
    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
	   	    
	   	 Robot robot2 = new Robot(); 


	   	 robot2.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     robot2.keyRelease(KeyEvent.VK_ENTER);
	    
	     Thread.sleep(10000);
			 
	      if(getDriver().getPageSource().contains("Web Home Page"))
	      {	  
	   //Select the ESPWeb Home page link
	    	  CorpTemplates.ESPWebHomePageLinkText.click();
	      
	      }
	      if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
	      {	  
	      
	      CorpTemplates.UserInfo_Gravter.click();
	      
	      Thread.sleep(1000);
	      
	      CorpTemplates.CRM_SettingsOption.click();
	      
	      Thread.sleep(2000);
	      
	      //Press The CRM Data Access Option
	      CorpTemplates.CRM_Settings_DataAccessOption.click();
	      
	      Thread.sleep(3000);
	     
	      List <WebElement> elementcount = CorpTemplates.AIA_Switch_ON_ToggleVerification;
	      
	      int count=elementcount.size();
	      
	      System.out.println(count);
	      
	      if(count>0)
	      {
              CorpTemplates.Allow_AIA_AccessSwitch.click();
	    	  
	    	  Thread.sleep(1000);
	    	  
              CorpTemplates.Allow_AIA_AccessSwitch.click();
	    	  
	    	  Thread.sleep(1000);
	      }
	      else{
	    	  
	    	  CorpTemplates.Allow_AIA_AccessSwitch.click();
	    	  
	    	}
	      
	      CorpTemplates.UserInfo_Gravter.click();
			
			 Thread.sleep(1000);
				
			//Press the Logout Button
			 CorpTemplates.UserInfo_Logout.click();
				
			 Thread.sleep(3000);
	      }
	      else{
	    	  CorpTemplates.UserInfo_Gravter.click();
				
				 Thread.sleep(1000);
					
				//Press the Logout Button
				 CorpTemplates.UserInfo_Logout.click();
					
				 Thread.sleep(3000);
	      }
			
			if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
			{	
			//Now login with non corporate child user
				CorpTemplates.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
			
			
			//Enter Username 
				CorpTemplates.EspUserName.sendKeys(EMS_TestData.Username_Corp);
	   	 
	   	 //Enter Password
				CorpTemplates.EspPassword.sendKeys(EMS_TestData.Password_Corp);
	   	
	   	 //Now Press the Login Button
	   	 
				CorpTemplates.EspLoginButton.click();
			}
			else{
				//Now login with non admin child user
				CorpTemplates.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
				
				
				//Enter Username 
				CorpTemplates.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
		   	 
		   	 //Enter Password
				CorpTemplates.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
		   	
		   	 //Now Press the Login Button
		   	 
				CorpTemplates.EspLoginButton.click();
			}
	   	 
	   	 
			Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 

			Thread.sleep(1000);
	   	    
	   	 Robot robot3 = new Robot(); 

	   	 
	     robot3.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	     robot3.keyRelease(KeyEvent.VK_ENTER);
	    
	     Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
			 
	      if(getDriver().getPageSource().contains("Web Home Page"))
	      {	  
	   //Select the ESPWeb Home page link
	    	  CorpTemplates.ESPWebHomePageLinkText.click();
	      
	      }
	      
	      
	      
	      CorpTemplates.EmailMarketingTab.click();
	         
	      Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	         
	         CorpTemplates.TemplatesTab.click();
	    	 
	         
	         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	    	 
	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
	    	 
	    	 Thread.sleep(2000);
	      
    	 MyTemplateFilterOldCount=CorpTemplates.MyTemplateFilterCount.getText();
    	 System.out.println(MyTemplateFilterOldCount);
    	 
    	 
    	 //Press the Blank template button
    	 CorpTemplates.ChooseTemplate_BlankTemplateButton.click();
    	 
    	 Thread.sleep(4000);
    	 
    	 //Select the My Templates radio button
    	 CorpTemplates.MyTemplates_TemplatesRadioButton.click();
		 
		 //Enter the Template Name
    	 CorpTemplates.TemplateName_InsertionField.sendKeys(EMS_TestData.MyTemplateName);
		 
		 //Press the Create Template Button
    	 CorpTemplates.Template_CreateButton.click();
		 
		 
    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	 
    	 Thread.sleep(1000);
		  Assert.assertTrue(CorpTemplates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"));
		/*  if(CorpTemplates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"))
	    	 {
	    		System.out.println("New Blank My Template Created from Template Page for Corporate Successfully");
	    		
	    		Reuse_Functions_Corp.resultPass("BlankMyTemplateCreation_From_TemplatePage_Corporate", "New Blank My Template Created from Template Page for Corporate Successfully");
	    	 }
	    	 else{
	    		 System.out.println("New Blank My Template Created from Template Page for Corporate UnSuccessfully"); 
	    	  
	    		 Reuse_Functions_Corp.resultFail("BlankMyTemplateCreation_From_TemplatePage_Corporate", "New Blank My Template Created from Template Page for Corporate Successfully");
	    	 
	    	 }*/
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
	
	public static void My_Template_Preview() throws InterruptedException, AWTException, IOException{
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
	    		
	    		Thread.sleep(2000);
	    		
	    		 
	    		
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
	    	    
	    		Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),"//uib-tab-heading[contains(@translate,'ORDERS.TABS.PRODUCT_SEARCH')]");
	    	    
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
			
	    	  //First store parent window to switch back
	       	 // parentWindow = getDriver().getWindowHandle();
	       	 
	       	//Press the Preview Button for campaign view
	       	CorpTemplates.TemplateEditingPage_PreviewButton.click();
	       	 
	       	Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	Thread.sleep(1000);
	       	
    	    
	       	 
	       	  //Validating campaign Preview Displayed Successfully or not
	    	Assert.assertTrue(CorpTemplates.TemplateCreate_PreviewVerification.isDisplayed());
	       	/*  	if(CorpTemplates.TemplateCreate_PreviewVerification.isDisplayed())
	       	  	{
	       	  		System.out.println("My Template Preview Displayed Successfully");
	       	  		
	       	  		Reuse_Functions_Corp.resultPass("My_Template Preview", "My Template Preview Displayed Successfully");
	       	  		
	       	  	}
	       	  	else{
	       	  		
	                   System.out.println("My Template Preview Displayed UnSuccessfully");
	       	  		
	       	  		Reuse_Functions_Corp.resultFail("My_Template Preview", "My Template Preview Displayed UnSuccessfully");
	       	  	
	       	  	}*/
	       	  	
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
	   public static void NewTemplate_WithConfiguration_Creation() throws IOException, InterruptedException{
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
   	    	    
   	    	    CorpTemplates.MyTemplateFilterCount.click();
   	    	    
   	    	    Thread.sleep(3000);
   	    	    
	   		    Assert.assertTrue(getDriver().getPageSource().contains(TemplateName));
	   		/*    if(getDriver().getPageSource().contains(TemplateName))
	   		    {
	   		    	System.out.println("New Template with configuration Created Successfully");
	   		    	
	   		    	Reuse_Functions_Corp.resultPass("NewTemplate_WithConfiguration_Creation", "New Template with configuration Created Successfully");
	   		    }
	   		    else{
	                System.out.println("New Template with configuration Created UnSuccessfully");
	   		    	
	   		    	Reuse_Functions_Corp.resultFail("NewTemplate_WithConfiguration_Creation", "New Template with configuration Created UnSuccessfully");
	   		    }*/
	       
		   }catch(NoSuchElementException e){
			   e.getMessage();
		   }
	   } 
	   	public static void MyTemplate_FilterCount_Verification() throws IOException, InterruptedException{
	   		try{
	   		    //Validating the corporate count filter
	   		 MyTemplateFilterNewCount=CorpTemplates.CorporateTemplateFilterCount.getText();
	   		 System.out.println(MyTemplateFilterNewCount);
	   		 Assert.assertTrue(!MyTemplateFilterNewCount.equals(MyTemplateFilterOldCount));
	   	/*	 if(!MyTemplateFilterNewCount.equals(MyTemplateFilterOldCount))
	   		 {
	   			 System.out.println("My Templates Filter Count updates after creating a new Corporate Template Successfully");
	   		 
	   			 Reuse_Functions_Corp.resultPass("MyTemplate_FilterCount_Verification", "My Templates Filter Count updates after creating a new Corporate Template Successfully");
	   		 }
	   		 else{
	   			System.out.println("My Templates Count updates after creating a new Corporate Template UnSuccessfully");
		   		 
	   			 Reuse_Functions_Corp.resultFail("MyTemplate_FilterCount_Verification", "My Templates Count updates after creating a new Corporate Template UnSuccessfully");
	   		 }*/
	   		}
	   		catch(NoSuchElementException e){
	   			e.getMessage();
	   		}
	   	}
	   	
	   	public static void ChildUser_MyTemplatePublish_Verification_From_CorporateTenent() throws InterruptedException, IOException{
	   		try{
		     //Goto My Templates filter
	   		 CorpTemplates.MyTemplateFilterCount.click();
	   		 
	   		 Thread.sleep(3000);
	   		 
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
   	    	 
   	    	    Thread.sleep(6000);
    		    
    		     CorpTemplates.TemplatesTab.click();
    	    	 
                 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
    	    	 
    	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),CorpTemplates.TemplatesDisplay_Wait);
    	    	 
    	    	 Thread.sleep(2000);
    	    	 
    	    	//Goto My Templates filter
    	   		 CorpTemplates.MyTemplateFilterCountChild.click();
    	   		 
    	   		 Thread.sleep(3000);
    	    	 Assert.assertTrue(!getDriver().getPageSource().contains(TemplateName));
    	    	/* if(!getDriver().getPageSource().contains(TemplateName))
    	    	 {
    	    		 System.out.println("My Template doesn't  Displayed to the Child user after publishing from Corporate User Successfully ");
    	    	     
    	    		 Reuse_Functions_Corp.resultPass("ChildUser_MyTemplatePublish_Verification_From_CorporateTenent", "My Template doesn't  Displayed to the Child user after publishing from Corporate User Successfully");
    	    	 
    	    	 }
    	    	 else{
                      System.out.println("My Template doesn't  Displayed to the Child user after publishing from Corporate User UnSuccessfully ");
    	    	     
    	    		 Reuse_Functions_Corp.resultFail("ChildUser_MyTemplatePublish_Verification_From_CorporateTenent", "My Template doesn't  Displayed to the Child user after publishing from Corporate User UnSuccessfully");
    	    	 }*/
	   		}catch(NoSuchElementException e){
	   			e.getMessage();
	   		}
	   	}
	   	public static void BlankMyTemplateCreation_FromChildUser_TemplatePage_Corporate() throws IOException, InterruptedException{
	   		try{
    	    	//Press the Blank template button
    	    	 CorpTemplates.ChooseTemplate_BlankTemplateButton.click();
    	    	 
    	    	 Thread.sleep(1000);
    	    	 
    	    	
    			 //Enter the Template Name
    	    	 CorpTemplates.TemplateName_InsertionField.sendKeys(EMS_TestData.MyTemplateNameChild);
    			 
    			 //Press the Create Template Button
    	    	 CorpTemplates.Template_CreateButton.click();
    			 
    			 
                 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
    			  Assert.assertTrue(CorpTemplates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"));
    			/*  if(CorpTemplates.TemplateCreation_FromTemplatePage_Verification.getText().contains("EMS"))
    		    	 {
    		    		System.out.println("New Blank My Template From Child User Created from Template Page for Corporate Successfully");
    		    		
    		    		Reuse_Functions_Corp.resultPass("BlankMyTemplateCreation_FromChildUser_TemplatePage_Corporate", "New Blank My Template From Child User Created from Template Page for Corporate Successfully");
    		    	 }
    		    	 else{
    		    		 System.out.println("New Blank My Template Created from Template Page for Corporate UnSuccessfully"); 
    		    	  
    		    		 Reuse_Functions_Corp.resultFail("BlankMyTemplateCreation_FromChildUser_TemplatePage_Corporate", "New Blank My Template From Child User Created from Template Page for Corporate Successfully");
    		    	 
    		    	 }*/
	   		}catch(NoSuchElementException e){
	   			e.getMessage();
	   		}
	   	}	
    	public static void ChildUser_MyTemplate_Verification_InCorporate_MyTemplatesFilter() throws InterruptedException, IOException{
    		try{
    	    	 CorpTemplates.CancelButton_EditTemplate.click();
    	    	 
                 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
    	    	 
    	    	 //Scroll Up
    		       		jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(0,-250)", "");
    		            
    		            jse= (JavascriptExecutor)getDriver();
    		            jse.executeScript("window.scrollBy(-250,-500)", "");
    		            
    		            Thread.sleep(1000);
    		            
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
    			    	 
    			    	//Goto My Templates filter
    	    	   		 CorpTemplates.MyTemplateFilterCount.click();
    	    	   		 
    	    	   		 Thread.sleep(3000);
    			    	 
    			    	 
    			    	 //Search the Created and publish template again and unpublish it
    			    	 CorpTemplates.ListSearchField.sendKeys(EMS_TestData.MyTemplateNameChild);
    			    	 
    			    	 Thread.sleep(1000);
    			    	 Assert.assertTrue(getDriver().getPageSource().contains(EMS_TestData.MyTemplateNameChild));
    			    	/* if(getDriver().getPageSource().contains(EMS_TestData.MyTemplateNameChild))
    			    	 {
    			    		 System.out.println("Template Displayed In corporate user My Templates Filter Successfully");
    			    		 
    			    		 Reuse_Functions_Corp.resultPass("ChildUser_MyTemplate_Verification_InCorporate_MyTemplatesFilter", "Template Displayed In corporate user My Templates Filter Successfully");
    			    	 }
    			    	 else{
                             System.out.println("Template Displayed In corporate user My Templates Filter UnSuccessfully");
    			    		 
    			    		 Reuse_Functions_Corp.resultPass("ChildUser_MyTemplate_Verification_InCorporate_MyTemplatesFilter", "Template Displayed In corporate user My Templates Filter UnSuccessfully"); 
    			    	 }*/
    		}catch(NoSuchElementException e){
    			e.getMessage();
    		}
    	}	
    			    	 
  		public static void MyTemplate_Delete() throws IOException, InterruptedException{
  			try{
    			    	 Reuse_Functions_Corp.Hover(CorpTemplates.TemplateListHover, getDriver());
    		    		   
    		    		   Thread.sleep(2000); 
    			    	 
    			    	 //Press the delete Button
  		      		CorpTemplates.ExistingTemplateDeleteButton.click();
			      		   
			      		   //Press the Confirm Delete Template Button
			      		   
			      		//Press the confirm Button
  		      	   CorpTemplates.DeleteContact_ConfirmButton.click();
  		      	   Thread.sleep(2000); 
			      		   Assert.assertTrue(CorpTemplates.DeleteTemplate_Veriifcation.getText().contains("Success"));
			      	/*	 if(CorpTemplates.DeleteTemplate_Veriifcation.getText().contains("Success"))
			    		 {
			    			 System.out.println("My Template Deleted Successfully");
			    		     
			    			 Reuse_Functions_Corp.resultPass("MyTemplate_Delete", "My Template Deleted Successfully");
			    		 }
			    		 else{
			    			 
			                System.out.println("My Template Deleted unsuccessfully");
			    		     
			    			 Reuse_Functions_Corp.resultFail("MyTemplate_Delete", "My Template Deleted unsuccessfully");
			    		 }*/
			      		   
			      		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}

  	finally {
  		Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
   	 
   	    Thread.sleep(1000);
		    
		   jse= (JavascriptExecutor)getDriver();
          jse.executeScript("window.scrollBy(0,-250)", "");
          
          jse= (JavascriptExecutor)getDriver();
          jse.executeScript("window.scrollBy(-250,-500)", "");
          
          Thread.sleep(2000);

	}		

}
}
