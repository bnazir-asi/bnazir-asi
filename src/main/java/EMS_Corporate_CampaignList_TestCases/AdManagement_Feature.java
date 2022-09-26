package EMS_Corporate_CampaignList_TestCases;



import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import EMSTestCases.CampaignEditor;
import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;


public class AdManagement_Feature extends EMS_Corporate_CampaignList_Execution {
	
	static EMS_Locators Ads = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static String[] dateval;
	public static DateFormat formatdate;
	public static Calendar cal;
	 public static String newDate;
	 public static void CreateAd_ImageUpload() throws IOException, InterruptedException, AWTException{
		try{
			Ads.EmailMarketingTab.click();
			Thread.sleep(1000);
			//Goto Settings Page
			Ads.SettingsTab.click();
			Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		    Thread.sleep(1000);
		    //Go to Ad Management Page
		    Ads.Settings_AdmanagementLink.click();
            Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		    Thread.sleep(1000);
		    //Press the Create Ad Button
		     Ads.Admanagement_CreateAd_Button.click();
             Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     Thread.sleep(1000);
		     //Enter all the Manadatory fields to Create the Ad
		     Ads.CreateAd_NameField.sendKeys(EMS_TestData.AdManagementName);
		     Ads.CreateAd_UploadFile_Button.click();
		     Thread.sleep(3000);
		     CampaignEditor.Projectpath=System.getProperty("user.dir");
		   	 System.out.println(CampaignEditor.Projectpath);
		     Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/Ad.exe");
		     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		   	 Thread.sleep(3000);
		   	 //Validating if the image is uploaded successfully or not
		   	 Assert.assertTrue(Ads.AdImageUpload_Verification.getText().contains("Ad"));
		   	 
		}
		catch (NoSuchElementException e)
		{
			// TODO: handle exception
		   e.getStackTrace();
		}
	finally
	{
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     Thread.sleep(1000);
	}
	
	
	}

public static void AdRemoveImage_Verification() throws InterruptedException, IOException{
	try
	{
		
		//Press the Remove Button
		Ads.RemoveImage_Button.click();
		Thread.sleep(2000);
		//Validating if the Image is removed Successfully or not
		Assert.assertTrue(Ads.AdImageRemove_Verification.isDisplayed());
	
	}
	catch(NoSuchElementException e)
	{
		e.getMessage();
	}
	}

 public static void FutureDate_BannerAdCreation_WithSearchVerification() throws InterruptedException, AWTException, IOException{
	 try{
		 
		 //Upload the Image again
		 Ads.CreateAd_UploadFile_Button.click();
	     Thread.sleep(3000);
	     CampaignEditor.Projectpath=System.getProperty("user.dir");
	   	 System.out.println(CampaignEditor.Projectpath);
	     Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/Ad.exe");
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	 Thread.sleep(3000);
	   	 //Enter the Advertiser Name
	   	  Ads.CreateAd_AdvertiserField.sendKeys("Corporate Ad");    
	   	  //Enter the Descriptyion For Ad
	   	  Ads.CreateAd_DescriptionTextArea.sendKeys("This is a Test Ad");
	   	  //Enter the Valid URL for Banner ad
	   	  Ads.CreateAd_BannerURLField.sendKeys("https://www.google.com/"); 
	   	   //Insert the Future Start date
	   	  formatdate=new SimpleDateFormat("MM/dd/yyyy");
	   	  cal = Calendar.getInstance();
	   	  cal.setTime(new Date());
	   	  cal.add(Calendar.DATE, 2);
	   	  newDate = formatdate.format(cal.getTime());
	   	  System.out.println(newDate);
		  dateval= newDate.split("/");
		  System.out.println(dateval[0]);
		  System.out.println(dateval[1]);
		  System.out.println(dateval[2]);
		  Ads.CreateAdStartDate_DatePickerIcon.click();
		  Thread.sleep(2000);
		  System.out.println("//span[contains(text(), '"+dateval[1]+"')][contains(@class,'ng-binding')]");
		  List<WebElement> date=driver.findElements(By.xpath("//span[contains(text(),'"+dateval[1]+"')][contains(@class,'ng-binding')]//ancestor::button"));
			if(date.size()==0)
			{
			date.get(0).click();
			}
			else
			{
				date.get(1).click();
			}
			 
			//Press the Save Button To Complete the Ad Creation with Future Date
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", Ads.CorporateSaveButton_SettingsCorporate);
		   // Ads.CorporateSaveButton_SettingsCorporate.click();
			Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			Thread.sleep(4000);
   	      //Search the which is created with Future Date
   	        Ads.SearchAddField.sendKeys(EMS_TestData.AdManagementName);
   	        Thread.sleep(3000);
   	        Assert.assertTrue(Ads.AdPage_AddedRecordDetails_Link.getText().contains(EMS_TestData.AdManagementName));
   	   
	 }catch(NoSuchElementException e)
	 {
		 e.getMessage();
	 }
 
 
 }
 public static void EditBannerAd_Details() throws InterruptedException, IOException{
	 try
	 {
		 //Press the Created Ad and goto details screen
		 Ads.AdPage_AddedRecordDetails_Link.click();
	 
		 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
   	     
	     Thread.sleep(1000);
	     
	     Ads.CreateAd_NameField.clear();
	     
	     Ads.CreateAd_NameField.sendKeys(EMS_TestData.AdManagementUpdated);
	     
	     Ads.CreateAd_AdvertiserField.clear();
	     
	     Ads.CreateAd_AdvertiserField.sendKeys("Updated Corporate Ad");
	     
	     //Press the Save Button
	     Thread.sleep(3000);
	     JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Ads.CorporateSaveButton_SettingsCorporate);
			
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	     
	     Thread.sleep(4000);
	        
	     Ads.SearchAddField.clear();
	     
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(2000);
	      //Search the which is created with Future Date
	     Ads.SearchAddField.sendKeys(EMS_TestData.AdManagementUpdated);
	        
	     Thread.sleep(3000);
	     Assert.assertTrue(Ads.AdPage_AddedRecordDetails_Link.getText().contains(EMS_TestData.AdManagementUpdated) & Ads.AdvertiserDetails_AdList_Verification.getText().contains("Updated Corporate Ad"));
	 
	 }catch(NoSuchElementException e){
		 e.getMessage();
	 }
 
 
 }

 public static void DeleteAd() throws InterruptedException, IOException{
	 try{
		 
		 //Select the checkbox for ad
		 Ads.NewAdCreated_Verification_AdmanagementPage.click();
		 
		 Thread.sleep(2000);
		 
		 //Press the Delete button and confirm it and validate as if the Ad Deleted Successfully or not
		 Ads.AdManagementPage_DeleteButton.click();
		 
		 Thread.sleep(1000);
		 
		 Ads.Ad_DeleteConfirm.click();
		 
		 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
   	     
	     Thread.sleep(2000);
	     
	     //Validate as if the Ad deleted or not
	     Assert.assertTrue(Ads.DeleteAdd_SuccessfullVerification.getText().contains("No results found"));
		 
	 }
	 catch(NoSuchElementException e)
	 {
		 e.getStackTrace();
	 }
 }
 public static void CurrentDate_BannerAdCreation_WithAdCheckboxDisable_WithSearchVerification_ActiveAd() throws InterruptedException, AWTException, IOException{
	 try{

		//Press the Create Ad Button
	     Ads.Admanagement_CreateAd_Button.click();
	     
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
	     
	     //Enter all the Manadatory fields to Create the Ad
	     Ads.CreateAd_NameField.sendKeys(EMS_TestData.AdManagementName);
		 
	     //Upload the Image again
		 Ads.CreateAd_UploadFile_Button.click();
	     
	     Thread.sleep(3000);
	     CampaignEditor.Projectpath=System.getProperty("user.dir");
	   	 System.out.println(CampaignEditor.Projectpath);
	     Runtime.getRuntime().exec(CampaignEditor.Projectpath+"/Img/Ad.exe");
	     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	   	 Thread.sleep(3000);   
	   	 //Enter the Advertiser Name
	   	 Ads.CreateAd_AdvertiserField.sendKeys("Corporate Ad");
	   	 //Enter the Descriptyion For Ad
	   	 Ads.CreateAd_DescriptionTextArea.sendKeys("This is a Test Ad");
	   	 //Enter the Valid URL for Banner ad
	   	 Ads.CreateAd_BannerURLField.sendKeys("https://www.google.com/");
	   	 //Insert the Future Start date
	   	 DateFormat formatdate=new SimpleDateFormat("MM/dd/yyyy");
	   	 Date systemDate=new Date();
	   	 String dateval=formatdate.format(systemDate);
	   	 System.out.println(dateval);
		 String[] datevalue= dateval.split("/");
		 System.out.println(datevalue[0]);
		 System.out.println(datevalue[1]);
		 System.out.println(datevalue[2]);
		 Ads.CreateAdStartDate_DatePickerIcon.click();
		 Thread.sleep(2000);
		 System.out.println("//span[contains(text(), '"+datevalue[1]+"')][contains(@class,'ng-binding')]");
		 List<WebElement> date=getDriver().findElements(By.xpath("//span[contains(text(), '"+datevalue[1]+"')][contains(@class,'ng-binding')]//ancestor::button"));
		    if(date.size()==0)
			{
			date.get(0).click();
			}
			else
			{
				date.get(1).click();
			}
			 
			//Press the Save Button To Complete the Ad Creation with Future Date
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", Ads.CorporateSaveButton_SettingsCorporate);
			Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
			Thread.sleep(4000);
			Ads.SearchAddField.clear();
		    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		    Thread.sleep(2000);
		    //Search the which is created with Future Date
		     Ads.SearchAddField.sendKeys(EMS_TestData.AdManagementName);
		     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     Thread.sleep(3000);
		     Assert.assertTrue(Ads.AdPage_AddedRecordDetails_Link.getText().contains(EMS_TestData.AdManagementName) & !Ads.NewAdCreated_Verification_AdmanagementPage.isEnabled() & Ads.ActiveAd_Verification.isDisplayed());

	 }
	 catch(NoSuchElementException e)
	 {
		 e.getMessage();
	 }
 

 }

public static void InactiveAd() throws InterruptedException, IOException{
	try
	{
		 Ads.AdPage_AddedRecordDetails_Link.click();
		 
		 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
		     
	    Thread.sleep(1000);
	    
	    //Click the status bootstrap dropdown and select the Inactive option
	    Ads.Ad_Status_ChangeDropdown.click();
	    
	    Ads.CreateAd_StatusSelection.click();
	    
	    Thread.sleep(3000);
	    
	    //Press the Save Button
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Ads.CorporateSaveButton_SettingsCorporate);
	    
			
	    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	  	     
	    Thread.sleep(4000);
	    
	    //Validate if the Inactive icon occur or not
	    Assert.assertTrue(Ads.InactiveAd_Verification.isDisplayed());
 
    
	}catch(NoSuchElementException e){
		e.getMessage();
	}


}



}