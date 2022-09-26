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



public class HideShareCategoriesTemplate_FromToChildUser extends EMS_Corporate_Execution {

   public static String CategoriesTemplateName;
   public static WebElement SwitchTenent;
   public static Select dropdownValue;
   public static JavascriptExecutor jse;
   public static String parentWindow;
   public static WebElement element;
	
   public static void HideShareTemplate_Categories() throws IOException, InterruptedException, AWTException{
		try{
	  
    	 EMS_Locators HideShareTemplate = PageFactory.initElements(getDriver(), EMS_Locators.class);
		
    	 //Press the Categories filter
    	 HideShareTemplate.CategoriesFilter.click();
    	 
    	 Thread.sleep(2000);
    	 
    	 jse= (JavascriptExecutor)getDriver();
         jse.executeScript("window.scrollBy(0,250)", "");
         
         Thread.sleep(1000);
    	 
    	 //Store the first template Name
    	 CategoriesTemplateName=HideShareTemplate.TemplateNameGet.getText();
    	 System.out.println(CategoriesTemplateName);
    	 
    	 
        Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
		   
		   Thread.sleep(3000);
		   
		   
		   
		   if(HideShareTemplate.ShareWithUser_TemplateLink_Corporate.getText().contains("Share with Users"))
		   {
			  
			   element = HideShareTemplate.ShareWithUser_TemplateLink_Corporate;  
			   jse.executeScript("arguments[0].scrollIntoView(true);", element);
			   jse.executeScript("arguments[0].click();", element);
			   
			   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  	    	 
  	    	   Thread.sleep(1000);
		   }
		   else if(HideShareTemplate.HideFromUser_TemplateLink_Corporate.getText().contains("Hide from Users")) {
			   			   
			   element = HideShareTemplate.HideFromUser_TemplateLink_Corporate;  
			   jse.executeScript("arguments[0].scrollIntoView(true);", element);
			   jse.executeScript("arguments[0].click();", element);
			   
			   
			   
			   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
  	    	 
  	    	    Thread.sleep(1000);
   		       
   		         	 
   		    Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
   		   
   		    Thread.sleep(3000);
			   
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
	    	 HideShareTemplate.CategoriesFilter.click();
	    	 
	    	 Thread.sleep(2000);
	    	 Assert.assertTrue(getDriver().getPageSource().contains(CategoriesTemplateName));
	    	/* if(getDriver().getPageSource().contains(CategoriesTemplateName))
	    	 {
	    		 System.out.println("Category Template shared and Displayed Successfully on Child Admin user.");
	    	
	    		 Reuse_Functions_Corp.resultPass("CategoryTemplateShareFromCorporate_Verification_InChildAdmin", "Category Template shared and Displayed Successfully on Child Admin user.");
	    	 }
	    	 else{
	    		 
	    		 System.out.println("Category Template shared and Displayed UnSuccessfully on Child Admin user.");
	 	    	
	    		 Reuse_Functions_Corp.resultFail("CategoryTemplateShareFromCorporate_Verification_InChildAdmin", "Category Template shared and Displayed UnSuccessfully on Child Admin user.");
	    	 
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
			    	 HideShareTemplate.CategoriesFilter.click();
			    	 
			    	 Thread.sleep(2000);
			    	 
			    	 if(getDriver().getPageSource().contains(CategoriesTemplateName))
			    	 {
			    		 System.out.println("Category Template shared and Displayed Successfully on Child Non Admin user.");
			    	
			    		 Reuse_Functions_Corp.resultPass("CategoryTemplateShareFromCorporate_Verification_InChildNonAdmin", "Category Template shared and Displayed Successfully on Child Non Admin user.");
			    	 }
			    	 else{
			    		 
			    		 System.out.println("Category Template shared and Displayed UnSuccessfully on Child Non Admin user.");
			 	    	
			    		 Reuse_Functions_Corp.resultFail("CategoryTemplateShareFromCorporate_Verification_InChildNonAdmin", "Category Template shared and Displayed UnSuccessfully on Child Non Admin user.");
			    	 
			    	 }
			    	 
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
		    	    	 
		    	    	 Thread.sleep(10000);
				         
				         HideShareTemplate.TemplatesTab.click();
				    	 
				         Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
		    	    	 
		    	    	 Thread.sleep(1000);
				    	 
				         Reuse_Functions_Corp.waitForElementToBeClickable_Xpath(120, getDriver(),HideShareTemplate.TemplatesDisplay_Wait);
				    	 
				    	 Thread.sleep(2000);
				    	 
				    	 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
				    	 
				    	 Thread.sleep(1000);
				    	 
				    	 //Press the Categories filter
				    	 HideShareTemplate.CategoriesFilter.click();
				    	 
				    	 Thread.sleep(2000);
				   
				         Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
						   
						   Thread.sleep(3000);
                        
						   element = HideShareTemplate.HideFromUser_TemplateLink_Corporate;  
						   jse.executeScript("arguments[0].scrollIntoView(true);", element);
						   jse.executeScript("arguments[0].click();", element);
						   
						   
						   Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
			    	    	 
			    	    	 Thread.sleep(1000);
						 
						   jse= (JavascriptExecutor)getDriver();
				           jse.executeScript("window.scrollBy(0,-250)", "");
				           
				           jse= (JavascriptExecutor)getDriver();
				           jse.executeScript("window.scrollBy(-250,-500)", "");
				           
				           jse= (JavascriptExecutor)getDriver();
				           jse.executeScript("window.scrollBy(-500,-750)", "");
				           
				           jse= (JavascriptExecutor)getDriver();
				           jse.executeScript("window.scrollBy(-750,-1000)", "");
				           
				           Thread.sleep(9000);
						   
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
			        		    
			        		    //dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");
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
					    	 HideShareTemplate.CategoriesFilter.click();
					    	 
					    	 Thread.sleep(2000);
					    	 Assert.assertTrue(!getDriver().getPageSource().contains(CategoriesTemplateName));
					    /*	 if(!getDriver().getPageSource().contains(CategoriesTemplateName))
					    	 {
					    		 System.out.println("Category Template Hide and Not Displayed Successfully on Child Admin user.");
					    	
					    		 Reuse_Functions_Corp.resultPass("CategoryTemplateHideFromCorporate_Verification_InChildAdmin", "Category Template Hide and Not Displayed Successfully on Child Admin user.");
					    	 }
					    	 else{
					    		 
					    		 System.out.println("Category Template Hide and Not Displayed UnSuccessfully on Child Admin user.");
					 	    	
					    		 Reuse_Functions_Corp.resultFail("CategoryTemplateHideFromCorporate_Verification_InChildAdmin", "Category Template Hide and Not Displayed UnSuccessfully on Child Admin user.");
					    	 
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
							    	 HideShareTemplate.CategoriesFilter.click();
							    	 
							    	 Thread.sleep(2000);
							    	 Assert.assertTrue(!getDriver().getPageSource().contains(CategoriesTemplateName));
							    /*	 if(!getDriver().getPageSource().contains(CategoriesTemplateName))
							    	 {
							    		 System.out.println("Category Template Hide and Not Displayed Successfully on Child Non Admin user.");
							    	
							    		 Reuse_Functions_Corp.resultPass("CategoryTemplateHideFromCorporate_Verification_InChildNonAdmin", "Category Template shared and Displayed Successfully on Child Non Admin user.");
							    	 }
							    	 else{
							    		 
							    		 System.out.println("Category Template Hide and Displayed UnSuccessfully on Child Non Admin user.");
							 	    	
							    		 Reuse_Functions_Corp.resultFail("CategoryTemplateHideFromCorporate_Verification_InChildNonAdmin", "Category Template Hide and Displayed UnSuccessfully on Child Non Admin user.");
							    	 
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
								    	 HideShareTemplate.CategoriesFilter.click();
								    	 
								    	 Thread.sleep(3000);
								    	 
								    	
								    	 Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
										   
										 Thread.sleep(3000);
										    
										    
										 
										 //First store parent window to switch back
								       	 // parentWindow = getDriver().getWindowHandle();
										 //Press the Preview option and validate if preview of template is displayed or not
								       	element = HideShareTemplate.PreviewTemplate_TemplateListing;  
									    jse.executeScript("arguments[0].scrollIntoView(true);", element);
										jse.executeScript("arguments[0].click();", element);
								       	  
								       	 
										Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
						    	    	 
						    	    	 Thread.sleep(1000);
								       	 
								       	  //Validating campaign Preview Displayed Successfully or not
						    	    	 Assert.assertTrue(HideShareTemplate.TemplateCreate_PreviewVerification.isDisplayed());
								       	  /*	if(HideShareTemplate.TemplateCreate_PreviewVerification.isDisplayed())
								       	  	{
								       	  		System.out.println("Categories Filter Template Preview Displayed Successfully");
								       	  		
								       	  		Reuse_Functions_Corp.resultPass("CategoriesFilter_Template Preview", "Categories Filter Template Preview Displayed Successfully");
								       	  		
								       	  	}
								       	  	else{
								       	  		
								                   System.out.println("Categories Filter Template Preview Displayed UnSuccessfully");
								       	  		
								       	  		Reuse_Functions_Corp.resultFail("CategoriesFilter_Template Preview", "Categories Filter Template Preview Displayed UnSuccessfully");
								       	  	
								       	  	}*/
								       	  	
								       	  	 // getDriver().close();
								       		  
								       	 HideShareTemplate.ClosePreviewWindow.click();
							      		  
							       		
							       		  Thread.sleep(3000);  
								       		  
								       		jse= (JavascriptExecutor)getDriver();
								            jse.executeScript("window.scrollBy(0,-250)", "");
								            
								            jse= (JavascriptExecutor)getDriver();
								            jse.executeScript("window.scrollBy(-250,-500)", "");
								            
								            Thread.sleep(2000);
								            
								            HideShareTemplate.CategoriesFilter.click();
								       	 
								       	    Thread.sleep(2000);
								       //Now click the Get Started Button and create corporate template 		  
								       		
								      	 
								       		Reuse_Functions_Corp.Hover(HideShareTemplate.HoverPreview, getDriver());
								  		   
								  		   Thread.sleep(3000); 
								  		   
								  		 element = HideShareTemplate.TemplateListing_GetStarted;  
										    jse.executeScript("arguments[0].scrollIntoView(true);", element);
											jse.executeScript("arguments[0].click();", element);
								  		   
								  		   
											Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
							    	    	 
							    	    	 Thread.sleep(1000);
											 
											 //Enter the Template Name
											 HideShareTemplate.TemplateName_InsertionField.sendKeys(EMS_TestData.GetStartedCorporateTemplate);
											 
											 //Press the Create Template Button
											 HideShareTemplate.Template_CreateButton.click();
											 
											 
											 Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
							    	    	 
							    	    	 Thread.sleep(1000);
											  Assert.assertTrue(HideShareTemplate.TemplateCreation_FromTemplatePage_Verification.getText().contains("Get Started"));
											/*  if(HideShareTemplate.TemplateCreation_FromTemplatePage_Verification.getText().contains("Get Started"))
										    	 {
										    		System.out.println("Get Started Corporate Template Created from Category Page for Corporate Successfully");
										    		
										    		Reuse_Functions_Corp.resultPass("GetStartedCorporateTemplateCreation_From_TemplatePage_Corporate", "Get Started Corporate Template Created from Category Page for Corporate Successfully");
										    	 }
										    	 else{
										    		 System.out.println("Get Started Corporate Template Created from Category Page for Corporate UnSuccessfully"); 
										    	  
										    		 Reuse_Functions_Corp.resultFail("GetStartedCorporateTemplateCreation_From_TemplatePage_Corporate", "Get Started Corporate Template Created from Category Page for Corporate UnSuccessfully");
										    	 
										    	 }*/
											  HideShareTemplate.CancelButton_EditTemplate.click();
											  
											  Reuse_Functions_Corp.waitForPageLoad(getDriver(), wait, pageLoaded);
								    	    	 
								    	      Thread.sleep(1000);
											  
		
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			   e.getStackTrace();
			}
		
	}
	
}	