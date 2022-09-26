package EMS_Corporate_CampaignList_TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution;
import PageFactoryandTestData.EMS_Locators;
;

public class Settings_CorporateParentChild_ValuesStore extends EMS_Corporate_CampaignList_Execution{

	 public static WebElement SwitchTenent;
		
		public static Select dropdownValue;
	
   public static String HtmlLink_Field_Corp;
   
   public static WebElement HtmlLink_Corp;

   public static String Address1_Field_Corp;
   
   public static WebElement Address1_Corp;

   public static String City_Field_Corp;
   
   public static WebElement City_Corp;
   
   public static String PostalCode_Field_Corp;
   
   public static WebElement PostalCode_Corp;
   
public static String HtmlLink_Field_child;
   
   public static WebElement HtmlLink_child;

   public static String Address1_Field_child;
   
   public static WebElement Address1_Child;

   public static String City_Field_child;
   
   public static WebElement City_child;
   
   public static String PostalCode_Field_child;
   
   public static WebElement PostalCode_child;
   
   
	public static void SettingsCorpChildValues_Store() throws IOException, InterruptedException, AWTException{
		try{
	 //Now Insert the login credentials
    	// This is to Instantiate LogIn Page class  
    	 EMS_Locators Settings_Corp = PageFactory.initElements(getDriver(), EMS_Locators.class);
    	
    	 //Go to Settings and Press company settings
    	 //Go to Settings Tab
    	 Settings_Corp.SettingsTab.click();
    	 
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
    	 
    //Goto Corporate Settings option
    	 Settings_Corp.Settings_CompanySettings.click();
	
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
		 
		 
		 //Storing values for different fields in string to use it on campaign level preview
		 HtmlLink_Corp=Settings_Corp.HTMLLink_CompanySettings;
		 HtmlLink_Field_Corp=HtmlLink_Corp.getAttribute("value");
   	  
   	     System.out.println(HtmlLink_Field_Corp);
   	     
   	     //Address
   	  Address1_Corp=Settings_Corp.CompanySettings_Address1;
   	  Address1_Field_Corp=Address1_Corp.getAttribute("value");
	  
	   System.out.println(Address1_Field_Corp);
	     
	     //City
	     City_Corp=Settings_Corp.City_CompanySettings;
	     City_Field_Corp=City_Corp.getAttribute("value");
	 	  
	 	     System.out.println(City_Field_Corp);
	 	     
	 	//Postal Code     
	 	    PostalCode_Corp=Settings_Corp.CompanySettings_PostalCode;
	 	   PostalCode_Field_Corp=PostalCode_Corp.getAttribute("value");
		 	  
		 	 System.out.println(PostalCode_Field_Corp);
		 	 
		 	Settings_Corp.UserInfo_Gravter.click();
	    	 
	    	 Thread.sleep(1000);
	    	 
	    	 
			    
			    //Thread.sleep(2000);
			    if(getDriver().getCurrentUrl().contains("stage"))
			    {	
			    SwitchTenent=Settings_Corp.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
				dropdownValue.selectByVisibleText("AIA/My Corporate Expressions (04B2)");
			    }
			    else if(getDriver().getCurrentUrl().contains("uat"))
			    {
			    	SwitchTenent=Settings_Corp.UserInfo_SwitchTenent_Dropdown;
					dropdownValue= new Select(SwitchTenent);
				   // dropdownValue.selectByVisibleText("My Corporate Expressions, LLC (asi/444012) (0VXY)");
					   dropdownValue.selectByVisibleText("Promodonnas (asi/444514) (10AA)");
					
			    }
			    else{
			    	
			    
					SwitchTenent=Settings_Corp.UserInfo_SwitchTenent_Dropdown;
					dropdownValue= new Select(SwitchTenent);
					dropdownValue.selectByVisibleText("AIA OWNER A Production Testing Company (12SP)");
			    }
			
			    
			    
			    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			     
			     Thread.sleep(1000);
			    
			    Settings_Corp.EmailMarketingTab.click();
			    
			    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			     
			     Thread.sleep(1000);
			    
			  //Go to Settings Tab
		    	 Settings_Corp.SettingsTab.click();
		    	 
		    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			     
			     Thread.sleep(1000);
		    	 
		    //Goto Company Settings option
		    	 Settings_Corp.Settings_CompanySettings.click();
			
		    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			     
			     Thread.sleep(1000);
				 
				 HtmlLink_child=Settings_Corp.HTMLLink_CompanySettings;
				 HtmlLink_Field_child=HtmlLink_child.getAttribute("value");
		   	  
		   	     System.out.println(HtmlLink_Field_child);
		   	     
		   	     //Address
		   	  Address1_Child=Settings_Corp.CompanySettings_Address1;
		   	  Address1_Field_child= Address1_Child.getAttribute("value");
			  
			   System.out.println(Address1_Field_child);
			     
			     //City
			     City_child=Settings_Corp.City_CompanySettings;
			     City_Field_child=City_child.getAttribute("value");
			 	  
			 	     System.out.println(City_Field_child);
			 	     
			 	//Postal Code     
			 	    PostalCode_child=Settings_Corp.CompanySettings_PostalCode;
			 	   PostalCode_Field_child=PostalCode_child.getAttribute("value");
				 	  
				 	 System.out.println(PostalCode_Field_child);
				 	 
				 	 
				 	Thread.sleep(2000);
			    	 
				 	Settings_Corp.UserInfo_Gravter.click();
					    
					    //Thread.sleep(2000);
					    if(getDriver().getCurrentUrl().contains("stage"))
					    {	
					    SwitchTenent=Settings_Corp.UserInfo_SwitchTenent_Dropdown;
						dropdownValue= new Select(SwitchTenent);
						dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
					    }
					    else if(getDriver().getCurrentUrl().contains("uat"))
					    {
					    	SwitchTenent=Settings_Corp.UserInfo_SwitchTenent_Dropdown;
							dropdownValue= new Select(SwitchTenent);
						    dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");	
					    }
					    else{
					    	
					    	SwitchTenent=Settings_Corp.UserInfo_SwitchTenent_Dropdown;
							dropdownValue= new Select(SwitchTenent);
							dropdownValue.selectByVisibleText("AIA Corporate Production Testing Company (12SO)");
					    	
					    	
					    	
					    	//SwitchTenent=Settings_Corp.UserInfo_SwitchTenent_Dropdown;
							//dropdownValue= new Select(SwitchTenent);
							//dropdownValue.selectByVisibleText("ASIQA Corporate Parent l Tenant (08N3)");
					    }
					   
					    
					    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
					     
					     Thread.sleep(1000);
					    
					    Settings_Corp.EmailMarketingTab.click();
					    
					    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
					     
					     Thread.sleep(1000);
			    
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}

}
