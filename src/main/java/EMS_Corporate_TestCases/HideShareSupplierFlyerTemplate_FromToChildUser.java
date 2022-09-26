package EMS_Corporate_TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions_Corp;
import Master.EMS_Corporate_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;


public class HideShareSupplierFlyerTemplate_FromToChildUser extends EMS_Corporate_Execution {

   public static String CategoriesTemplateName;
   public static WebElement SwitchTenent;
   public static Select dropdownValue;
   public static JavascriptExecutor jse;
   public static WebElement element;
	
   public static void HideShareTemplate_SupplierFlyer() throws IOException, InterruptedException, AWTException{
		try{
	  
    	 EMS_Locators HideShareTemplate = PageFactory.initElements(getDriver(), EMS_Locators.class);
		
    	 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,-250)", "");
           
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-250,-500)", "");
           
         jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(-500,-750)", "");  
           
         Thread.sleep(2000);
    	 
    	 
    	 
    	 //Press the Categories filter
    	 HideShareTemplate.SupplierFlyerFilter.click();
    	 
    	 Thread.sleep(2000);
    	 
    	 Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
    	 
    	 Thread.sleep(2000);
    	 
    	//Store the first template Name
    	 CategoriesTemplateName=HideShareTemplate.TemplateNameGet.getText();
    	
    	 System.out.println(CategoriesTemplateName);
    	 
    	
    	 
    	 
    	 Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
		   
		   Thread.sleep(2000);
		    
		   if(HideShareTemplate.ShareWithUser_TemplateLink_Corporate.getText().contains("Share with Users"))
		   {
               
			   element = HideShareTemplate.ShareWithUser_TemplateLink_Corporate;  
			   jse.executeScript("arguments[0].scrollIntoView(true);", element);
			   jse.executeScript("arguments[0].click();", element);
			   
			   
			   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  	    	 
  	    	   Thread.sleep(1000);
           }
		   else if(HideShareTemplate.HideFromUser_TemplateLink_Corporate.getText().contains("Hide from Users")){
               
                
			   element = HideShareTemplate.HideFromUser_TemplateLink_Corporate;  
			   jse.executeScript("arguments[0].scrollIntoView(true);", element);
			   jse.executeScript("arguments[0].click();", element);
			   
			   
			   
			   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  	    	 
  	    	   Thread.sleep(1000);
			   
    		  Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
    	 		   
   		        Thread.sleep(2000);
   		        
   		     element = HideShareTemplate.ShareWithUser_TemplateLink_Corporate;  
			   jse.executeScript("arguments[0].scrollIntoView(true);", element);
			   jse.executeScript("arguments[0].click();", element);
   		        
			   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  	    	 
  	    	   Thread.sleep(1000);
			   
		   }
		
		   jse= (JavascriptExecutor)getDriver();
           jse.executeScript("window.scrollBy(0,-250)", "");
           
           jse= (JavascriptExecutor)getDriver();
           jse.executeScript("window.scrollBy(-250,-500)", "");
           
           Thread.sleep(8000);
		   
		   //Go to child Admin
           HideShareTemplate.UserInfo_Gravter.click();
           
           Thread.sleep(1000);
           
           
           if(getDriver().getCurrentUrl().contains("stage"))
		    { 	
		    SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
		     dropdownValue= new Select(SwitchTenent);
		    
		    dropdownValue.selectByVisibleText("AIA/My Corporate Expressions (04B2)");
		    }
		    else if(getDriver().getCurrentUrl().contains("uat"))
		    {
		    	 SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
   		     dropdownValue= new Select(SwitchTenent);
   		    
   		  //  dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");
   		  dropdownValue.selectByVisibleText("MPromodonnas (asi/444514) (10AA)");
   		     
		    }
		    else{
  		    	
  		    	SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
     		        dropdownValue= new Select(SwitchTenent);
     		       dropdownValue.selectByVisibleText("ASIQA Corporate Child l Tenant (0PAP)");
  		    }

           Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
		   
		   HideShareTemplate.EmailMarketingTab.click();
		    
		   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
		    
		    HideShareTemplate.TemplatesTab.click();
	    	 
		    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	 
	    	 Thread.sleep(1000);
	    	 
	         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
	    	 
	    	 Thread.sleep(2000);
	    	 
		   
		   //Press the Categories filter
	    	 HideShareTemplate.SupplierFlyerFilter.click();
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	 Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
	    	 
	    	 Thread.sleep(2000);
	    	 
	    	 String SupplierFlyer_ChildUserText=HideShareTemplate.childSuppliertemplateText.getText();
	    	 System.out.println(SupplierFlyer_ChildUserText);
	    	 Assert.assertTrue(SupplierFlyer_ChildUserText.contains(CategoriesTemplateName));
	    /*	 if(SupplierFlyer_ChildUserText.contains(CategoriesTemplateName))
	    	 {
	    		 System.out.println("Supplier Flyer Template shared and Displayed Successfully on Child Admin user.");
	    	
	    		 Reuse_Functions_Corp.resultPass("SupplierFlyerTemplateShareFromCorporate_Verification_InChildAdmin", "Supplier Flyer Template shared and Displayed Successfully on Child Admin user.");
	    	 }
	    	 else{
	    		 
	    		 System.out.println("Supplier Flyer Template shared and Displayed UnSuccessfully on Child Admin user.");
	 	    	
	    		 Reuse_Functions_Corp.resultFail("SupplierFlyerTemplateShareFromCorporate_Verification_InChildAdmin", "Supplier Flyer Template shared and Displayed UnSuccessfully on Child Admin user.");
	    	 
	    	 }*/
	    	//Scroll Up
	       		jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(0,-250)", "");
	            
	            jse= (JavascriptExecutor)getDriver();
	            jse.executeScript("window.scrollBy(-250,-500)", "");
	            
	            Thread.sleep(8000);
		
	          //Switch again to Corporate User again            
	            
	            HideShareTemplate.UserInfo_Gravter.click();
	            
	            Thread.sleep(1000);
	            
	            if(getDriver().getCurrentUrl().contains("stage"))
			    {	
			    SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
				dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
			    }
			    else if(getDriver().getCurrentUrl().contains("uat"))
			    {
			    	SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
					dropdownValue= new Select(SwitchTenent);
					dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");	
			    }
			    else{
			    	
			    	SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
					dropdownValue= new Select(SwitchTenent);
					dropdownValue.selectByVisibleText("ASIQA Corporate Parent l Tenant (08N3)");
			    }

				
	            Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
   	    	 
   	    	    Thread.sleep(1000);
	//Goto Email Marketing tab again
				 HideShareTemplate.EmailMarketingTab.click();
				
                 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
				
				 HideShareTemplate.TemplatesTab.click();
		    	 
                 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
		    	 
		         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
		    	 
		    	 Thread.sleep(2000);
		    	 
		    	 HideShareTemplate.UserInfo_Gravter.click();
					
				 Thread.sleep(1000);
					
				//Press the Logout Button
				HideShareTemplate.UserInfo_Logout.click();
					
				Thread.sleep(3000);
					
				if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
				{	
				//Now login with non admin child user
				HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_NonAdmin);
					
					
				//Enter Username 
				HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_NonAdmin);
			   	 
			   	 //Enter Password
				HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_NonAdmin);
			   	
			   	 //Now Press the Login Button
			   	 
				HideShareTemplate.EspLoginButton.click();
				}
				else{
					//Now login with non admin child user
					HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdNonAdmin);
					
					
					//Enter Username 
					HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdNonAdmin);
			   	 
			   	 //Enter Password
					HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdNonAdmin);
			   	
			   	 //Now Press the Login Button
			   	 
					HideShareTemplate.EspLoginButton.click();
				}
			   	 
				Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
   	    	 
   	    	    Thread.sleep(1000);
			   	    
			   	 Robot robot2 = new Robot(); 

			     robot2.keyPress(KeyEvent.VK_ENTER);
			     Thread.sleep(5000);
			     robot2.keyRelease(KeyEvent.VK_ENTER);
			    
                 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
    	    	 
    	    	 Thread.sleep(1000);
					 
			      if(getDriver().getPageSource().contains("Web Home Page"))
			      {	  
			   //Select the ESPWeb Home page link
			    	  HideShareTemplate.ESPWebHomePageLinkText.click();
			      
			      }
			      HideShareTemplate.EmailMarketingTab.click();
			         
			      Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	    	 
	    	    	 Thread.sleep(1000);
			         
			         HideShareTemplate.TemplatesTab.click();
			    	 
			         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
	    	    	 
	    	    	 Thread.sleep(1000);
			    	 
			         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
			    	 
			    	 Thread.sleep(2000);
			    	 
			    	//Press the Categories filter
			    	 HideShareTemplate.SupplierFlyerFilter.click();
			    	 
			    	 Thread.sleep(2000);
			    	 
			    	 Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
			    	 
			    	 Thread.sleep(2000);
			    	 Assert.assertTrue(SupplierFlyer_ChildUserText.contains(CategoriesTemplateName));
			    	/* if(SupplierFlyer_ChildUserText.contains(CategoriesTemplateName))
			    	 {
			    		 System.out.println("Supplier Flyer Template shared and Displayed Successfully on Child Non Admin user.");
			    	
			    		 Reuse_Functions_Corp.resultPass("SupplierFlyerTemplateShareFromCorporate_Verification_InChildNonAdmin", "Supplier Flyer Template shared and Displayed Successfully on Child Non Admin user.");
			    	 }
			    	 else{
			    		 
			    		 System.out.println("Supplier Flyer Template shared and Displayed UnSuccessfully on Child Non Admin user.");
			 	    	
			    		 Reuse_Functions_Corp.resultFail("SupplierFlyerTemplateShareFromCorporate_Verification_InChildNonAdmin", "Category Template shared and Displayed UnSuccessfully on Child Non Admin user.");
			    	 
			    	 }*/
			    	 
			    	    HideShareTemplate.UserInfo_Gravter.click();
						
						Thread.sleep(1000);
						
						//Press the Logout Button
						HideShareTemplate.UserInfo_Logout.click();
						
						Thread.sleep(3000);
						
						if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
						{	
						//Now login with non admin child user
						HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
						
						
						//Enter Username 
						HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_Corp);
				   	 
				   	 //Enter Password
						HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_Corp);
				   	
				   	 //Now Press the Login Button
				   	 
						HideShareTemplate.EspLoginButton.click();
						}
						else{
							//Now login with non admin child user
							HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
							
							
							//Enter Username 
							HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
					   	 
					   	 //Enter Password
							HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
					   	
					   	 //Now Press the Login Button
					   	 
							HideShareTemplate.EspLoginButton.click();
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
				    	  HideShareTemplate.ESPWebHomePageLinkText.click();
				      
				      }
				        HideShareTemplate.EmailMarketingTab.click();
				         
				        Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
		    	    	 
		    	    	 Thread.sleep(1000);
				         
				       //Scroll Up
				       		jse= (JavascriptExecutor)getDriver();
				            jse.executeScript("window.scrollBy(0,-250)", "");
				            
				            jse= (JavascriptExecutor)getDriver();
				            jse.executeScript("window.scrollBy(-250,-500)", "");
				            
				            Thread.sleep(2000);
				         
				         
				         
				         HideShareTemplate.TemplatesTab.click();
				    	 
				         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
		    	    	 
		    	    	 Thread.sleep(1000);
				    	 
				         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
				    	 
				    	 Thread.sleep(2000);
				    	 
				    	 //Press the Categories filter
				    	 HideShareTemplate.SupplierFlyerFilter.click();
				    	 
				    	 Thread.sleep(2000);
				    	 
				    	 Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
						   
						 Thread.sleep(2000);
						 
						 element = HideShareTemplate.HideFromUser_TemplateLink_Corporate;  
						   jse.executeScript("arguments[0].scrollIntoView(true);", element);
						   jse.executeScript("arguments[0].click();", element);
						 
						 
						   
			    	    	 
			    	    	 Thread.sleep(8000);
						 
												   
						   //Go to child Admin
				           HideShareTemplate.UserInfo_Gravter.click();
				           
				           Thread.sleep(1000);
				           
				           
				           if(getDriver().getCurrentUrl().contains("stage"))
						    { 	
						    SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
						     dropdownValue= new Select(SwitchTenent);
						    
						    dropdownValue.selectByVisibleText("AIA/My Corporate Expressions (04B2)");
						    }
						    else if(getDriver().getCurrentUrl().contains("uat"))
						    {
						    	 SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
				   		     dropdownValue= new Select(SwitchTenent);
				   		    
				   		  //  dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");
				   		  dropdownValue.selectByVisibleText("Promodonnas (asi/444514) (10AA)");
				   		  
                          
						    }
						    else{
		  	    		    	
		  	    		    	SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
		  	       		        dropdownValue= new Select(SwitchTenent);
		  	       		       dropdownValue.selectByVisibleText("ASIQA Corporate Child l Tenant (0PAP)");
		  	    		    }

						   
				           
				           Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			    	    	 
			    	    	 Thread.sleep(1000);
						   
						   HideShareTemplate.EmailMarketingTab.click();
						    
						   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			    	    	 
			    	    	 Thread.sleep(1000);
						    
						    HideShareTemplate.TemplatesTab.click();
					    	 
						    Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			    	    	 
			    	    	 Thread.sleep(1000);
					    	 
					         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
					    	 
					    	 Thread.sleep(2000);
					    	 
						   
						   //Press the Categories filter
					    	 HideShareTemplate.SupplierFlyerFilter.click();
					    	 
					    	 Thread.sleep(2000);
					    	 Assert.assertTrue(!getDriver().getPageSource().contains(CategoriesTemplateName));
					    	/* if(!getDriver().getPageSource().contains(CategoriesTemplateName))
					    	 {
					    		 System.out.println("Supplier Flyer Template Hide and Not Displayed Successfully on Child Admin user.");
					    	
					    		 Reuse_Functions_Corp.resultPass("SupplierFlyerTemplateHideFromCorporate_Verification_InChildAdmin", "Supplier Flyer Template Hide and Not Displayed Successfully on Child Admin user.");
					    	 }
					    	 else{
					    		 
					    		 System.out.println("Supplier Flyer Template Hide and Not Displayed UnSuccessfully on Child Admin user.");
					 	    	
					    		 Reuse_Functions_Corp.resultFail("SupplierFlyerTemplateHideFromCorporate_Verification_InChildAdmin", "Supplier Flyer Template Hide and Not Displayed UnSuccessfully on Child Admin user.");
					    	 
					    	 }*/
					    	//Scroll Up
					       		jse= (JavascriptExecutor)getDriver();
					            jse.executeScript("window.scrollBy(0,-250)", "");
					            
					            jse= (JavascriptExecutor)getDriver();
					            jse.executeScript("window.scrollBy(-250,-500)", "");
					            
					            Thread.sleep(1000);
						
					          //Switch again to Corporate User again            
					            
					            HideShareTemplate.UserInfo_Gravter.click();
					            
					            Thread.sleep(1000);
					            
					            if(getDriver().getCurrentUrl().contains("stage"))
							    {	
							    SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
								dropdownValue= new Select(SwitchTenent);
								dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
							    }
							    else if(getDriver().getCurrentUrl().contains("uat"))
							    {
							    	SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
									dropdownValue= new Select(SwitchTenent);
									dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");	
							    }
							    else{
		    				    	
		    				    	SwitchTenent=HideShareTemplate.UserInfo_SwitchTenent_Dropdown;
		    						dropdownValue= new Select(SwitchTenent);
		    						dropdownValue.selectByVisibleText("ASIQA Corporate Parent l Tenant (08N3)");
		    				    }

					            Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
				    	    	 
				    	    	 Thread.sleep(1000);
					//Goto Email Marketing tab again
								 HideShareTemplate.EmailMarketingTab.click();
								
								 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
				    	    	 
				    	    	 Thread.sleep(1000);
								
                                 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
				    	    	 
				    	    	 Thread.sleep(1000);
								
								 HideShareTemplate.TemplatesTab.click();
						    	 
								 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
				    	    	 
				    	    	 Thread.sleep(1000);
						    	 
						         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
						    	 
						    	 Thread.sleep(2000);
						    	 
						    	 HideShareTemplate.UserInfo_Gravter.click();
									
								 Thread.sleep(1000);
									
								//Press the Logout Button
								HideShareTemplate.UserInfo_Logout.click();
									
								Thread.sleep(3000);
									
								if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
								{	
								//Now login with non admin child user
								HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_NonAdmin);
									
									
								//Enter Username 
								HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_NonAdmin);
							   	 
							   	 //Enter Password
								HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_NonAdmin);
							   	
							   	 //Now Press the Login Button
							   	 
								HideShareTemplate.EspLoginButton.click();
								}
								else{
									//Now login with non admin child user
									HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdNonAdmin);
									
									
									//Enter Username 
									HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdNonAdmin);
							   	 
							   	 //Enter Password
									HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdNonAdmin);
							   	
							   	 //Now Press the Login Button
							   	 
									HideShareTemplate.EspLoginButton.click();
								}
							   	 
								Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
				    	    	 
				    	    	 Thread.sleep(1000);
							   	    
							   	 Robot robot5 = new Robot(); 

							     robot5.keyPress(KeyEvent.VK_ENTER);
							     Thread.sleep(5000);
							     robot5.keyRelease(KeyEvent.VK_ENTER);
							    
							     Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
				    	    	 
				    	    	 Thread.sleep(1000);
									 
							      if(getDriver().getPageSource().contains("Web Home Page"))
							      {	  
							   //Select the ESPWeb Home page link
							    	  HideShareTemplate.ESPWebHomePageLinkText.click();
							      
							      }
							      HideShareTemplate.EmailMarketingTab.click();
							         
							      Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
					    	    	 
					    	    	 Thread.sleep(1000);
							         
							         HideShareTemplate.TemplatesTab.click();
							    	 
							         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
					    	    	 
					    	    	 Thread.sleep(1000);
							    	 
							         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
							    	 
							    	 Thread.sleep(2000);
							    	 
							    	//Press the Categories filter
							    	 HideShareTemplate.SupplierFlyerFilter.click();
							    	 
							    	 Thread.sleep(2000);
							    	 Assert.assertTrue(!getDriver().getPageSource().contains(CategoriesTemplateName));
							    	/* if(!getDriver().getPageSource().contains(CategoriesTemplateName))
							    	 {
							    		 System.out.println("Supplier Flyer Template Hide and Not Displayed Successfully on Child Non Admin user.");
							    	
							    		 Reuse_Functions_Corp.resultPass("SupplierFlyerTemplateHideFromCorporate_Verification_InChildNonAdmin", "Supplier Flyer Template shared and Displayed Successfully on Child Non Admin user.");
							    	 }
							    	 else{
							    		 
							    		 System.out.println("Supplier Flyer Template Hide and Displayed UnSuccessfully on Child Non Admin user.");
							 	    	
							    		 Reuse_Functions_Corp.resultFail("SupplierFlyerTemplateHideFromCorporate_Verification_InChildNonAdmin", "Supplier Flyer Template Hide and Displayed UnSuccessfully on Child Non Admin user.");
							    	 
							    	 }*/
							    	 
							    	    HideShareTemplate.UserInfo_Gravter.click();
										
										Thread.sleep(1000);
										
										//Press the Logout Button
										HideShareTemplate.UserInfo_Logout.click();
										
										Thread.sleep(3000);
										
										if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
										{	
										//Now login with non admin child user
										HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_Corp);
										
										
										//Enter Username 
										HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_Corp);
								   	 
								   	 //Enter Password
										HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_Corp);
								   	
								   	 //Now Press the Login Button
								   	 
										HideShareTemplate.EspLoginButton.click();
										}
										else{
											//Now login with non admin child user
											HideShareTemplate.EspASINo.sendKeys(EMS_TestData.ASINo_ProdCorp);
											
											
											//Enter Username 
											HideShareTemplate.EspUserName.sendKeys(EMS_TestData.Username_ProdCorp);
									   	 
									   	 //Enter Password
											HideShareTemplate.EspPassword.sendKeys(EMS_TestData.Password_ProdCorp);
									   	
									   	 //Now Press the Login Button
									   	 
											HideShareTemplate.EspLoginButton.click();
										}
								   	 
										Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
						    	    	 
						    	    	 Thread.sleep(1000);
								   	    
								   	 Robot robot4 = new Robot(); 

								     robot4.keyPress(KeyEvent.VK_ENTER);
								     Thread.sleep(5000);
								     robot4.keyRelease(KeyEvent.VK_ENTER);
								    
								     Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
					    	    	 
					    	    	 Thread.sleep(1000);
										 
								      if(getDriver().getPageSource().contains("Web Home Page"))
								      {	  
								   //Select the ESPWeb Home page link
								    	  HideShareTemplate.ESPWebHomePageLinkText.click();
								      
								      }
								        HideShareTemplate.EmailMarketingTab.click();
								         
								        Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
						    	    	 
						    	    	 Thread.sleep(1000);
								         
								         HideShareTemplate.TemplatesTab.click();
								    	 
								         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
						    	    	 
						    	    	 Thread.sleep(1000);
								    	 
								         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
								    	 
								    	 Thread.sleep(2000);
								    	 
								    	 //Press the Categories filter
								    	 HideShareTemplate.SupplierFlyerFilter.click();
								    	 
								    	 Thread.sleep(2000);
								    	 
								    	//Scroll Down
								  		jse= (JavascriptExecutor)getDriver();
								         jse.executeScript("window.scrollBy(0,250)", "");
								       
								          Thread.sleep(2000);
								    	 
								          Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
										   
										  Thread.sleep(2000);
		
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			   e.getStackTrace();
			}
		
	}
	
}	