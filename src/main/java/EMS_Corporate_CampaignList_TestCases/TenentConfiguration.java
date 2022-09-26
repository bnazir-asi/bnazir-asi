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



public class TenentConfiguration extends EMS_Corporate_CampaignList_Execution {

   public static WebElement SwitchTenent;
	
	public static Select dropdownValue;
	
	public static void TenentSwitch() throws IOException, InterruptedException, AWTException{
		try{
	 //Now Insert the login credentials
    	// This is to Instantiate LogIn Page class  
    	 EMS_Locators TenentSwitch = PageFactory.initElements(getDriver(), EMS_Locators.class);
		
    	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(2000);
         
    	 
    	 TenentSwitch.UserInfo_Gravter.click();
    	 
    	 WebElement mySelectElement10023 = TenentSwitch.UserInfo_SwitchTenent_Dropdown;
	    
    	 Select dropdown10023= new Select(mySelectElement10023);
		   
    	 WebElement option=dropdown10023.getFirstSelectedOption();
		    
		 String DropDownValueText=option.getText();
		    
		 System.out.println(DropDownValueText);
    	 
    	 if(!DropDownValueText.contains("AIA Corporation (asi/109480) (0HED)") ||!DropDownValueText.contains("AIA Corporation (03M2)") || !DropDownValueText.contains("AIA Corporate Production Testing Company (12SO)")  )
    	 {
    	 
    	
		    if(getDriver().getCurrentUrl().contains("stage"))
		    {	
		    SwitchTenent=TenentSwitch.UserInfo_SwitchTenent_Dropdown;
			dropdownValue= new Select(SwitchTenent);
			dropdownValue.selectByVisibleText("AIA Corporation (03M2)");
		    }
		    else if(getDriver().getCurrentUrl().contains("uat"))
		    {
		    	SwitchTenent=TenentSwitch.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
			    dropdownValue.selectByVisibleText("AIA Corporation (asi/109480) (0HED)");	
		    }
		    else{
		    	
		    	SwitchTenent=TenentSwitch.UserInfo_SwitchTenent_Dropdown;
				dropdownValue= new Select(SwitchTenent);
				dropdownValue.selectByVisibleText("AIA Corporate Production Testing Company (12SO)");
		    	
		    }
		   
		    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
		     Thread.sleep(1000);
		
		}
    	 
    	 if(getDriver().getCurrentUrl().contains("crm/companies"))
    	 {
    		 TenentSwitch.EmailMarketingTab.click();
    		 
    		 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
    	     
    	     Thread.sleep(1000);
    	     
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
    	     
    	     Thread.sleep(1000);
    	 }
    	 
    	 else{
    		 TenentSwitch.UserInfo_Gravter.click();
    	 }
    	 
		} 
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
}

}