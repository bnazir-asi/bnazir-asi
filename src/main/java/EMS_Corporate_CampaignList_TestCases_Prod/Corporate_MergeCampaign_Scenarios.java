package EMS_Corporate_CampaignList_TestCases_Prod;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions_Corp_CampaignsList;
import Master.EMS_Corporate_CampaignList_Execution_Mirror_Prod;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;

public class Corporate_MergeCampaign_Scenarios extends EMS_Corporate_CampaignList_Execution_Mirror_Prod {
	static WebElement ClearField;
	
	public static Actions act;
	   
	public static WebElement Drag;
	   
	public static WebElement Drop;
	
	public static WebElement TenentSelection;
	
	public static Select dropdownValue;
	
	 static EMS_Locators CorporateMergeCampaigns = PageFactory.initElements(getDriver(), EMS_Locators.class);
	
	public static void RestoreDefault_FromField_CamapignInfo_Verification () throws IOException, InterruptedException, AWTException{
		try{
	  	 
    	  //Press the campaign tab
    	 CorporateMergeCampaigns.CampaignsTab.click();
    	 
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
    	 
    	 //Press the Create Campaign Button
		 CorporateMergeCampaigns.CreateCampaignButton.click();
    	 
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
		 
		 //First Select the Merge campaign from campaigns options
		 CorporateMergeCampaigns.MergeCamapaign_RadioOption.click();
		 
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
		 
		//Enter the campaign name
		 CorporateMergeCampaigns.CampaignName_Field.sendKeys(EMS_TestData.MergeCampaignName);
		 
		//Enter the Subject line
		 CorporateMergeCampaigns.SubjectLine_Field.sendKeys("Automation Merge Campaign");
		 
		//Clear the From field to validate the Restore Default Functionality
		 CorporateMergeCampaigns.FromName_Field.clear();
		 
		//Enter the from Field data
		 CorporateMergeCampaigns.FromName_Field.sendKeys("Test Automation Campaign");
		 
		 //Now press restore Default Link to validate if the default text appear in the field or not
		 CorporateMergeCampaigns.RestoreDefaults_FromField_MergeCampaign.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement FromNameFieldValueVerification=CorporateMergeCampaigns.FromName_Field;
   	     String FromName=FromNameFieldValueVerification.getAttribute("value");
   	  
   	     System.out.println(FromName);
   	     
   Assert.assertTrue(FromName.contains("*|DEFAULT_FROM|*"));
   	/*  if(FromName.contains("*|DEFAULT_FROM|*"))
    	 {
    		 System.out.println("Restore Default on From Field on Campaign Info Changed to Default Content Successfully");
    		 
    		 Reuse_Functions_Corp_CampaignsList.resultPass("RestoreDefault_FromField_CamapignInfo_Verification", "Restore Default on From Field on Campaign Info Changed to Default Content Successfully");
    	 }
    	 else{
    		 System.out.println("Restore Default on From Field on Campaign Info Changed to Default Content  UnSuccessfully");
    		
    		 Reuse_Functions_Corp_CampaignsList.resultFail("RestoreDefault_FromField_CamapignInfo_Verification", "Restore Default on From Field on Campaign Info Changed to Default Content UnSuccessfully");
    	 
    	 }*/
		}  
   	  catch(NoSuchElementException e){
   		  e.getMessage();
   	  }
		} 
   	
	public static void Blank_Template_Creation() throws InterruptedException, IOException
	{   try{
		
     //Press the Next Button
   	 CorporateMergeCampaigns.CampaignNextStep_Button.click();
 	 
   	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
 	 
 	 Reuse_Functions_Corp_CampaignsList.waitForElementToBeClickable_Xpath(120, getDriver(),CorporateMergeCampaigns.TemplatesDisplay_Wait);
	 
	 Thread.sleep(2000);
	 //Press the Blank template button
	 CorporateMergeCampaigns.ChooseTemplate_BlankTemplateButton.click();
	 
	 //Enter the Template Name
	 CorporateMergeCampaigns.TemplateName_InsertionField.sendKeys(EMS_TestData.MergeCampaignTemplateName);
	 
	 //Press the Create Template Button
	 CorporateMergeCampaigns.Template_CreateButton.click();
	 
	 
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	
	 //Validating that the editor step occurs successfully and template created successfully
     Assert.assertTrue(CorporateMergeCampaigns.EditorStep_Verification.getText().contains("EMS"));
/*	 if(CorporateMergeCampaigns.EditorStep_Verification.getText().contains("EMS"))
	 {
		System.out.println("New Blank Template Created Successfully");
		
		Reuse_Functions_Corp_CampaignsList.resultPass("Blank Template Creation", "New Blank Template Created Successfully");
	 }
	 else{
		 System.out.println("New Blank Template Created UnSuccessfully"); 
	  
		 Reuse_Functions_Corp_CampaignsList.resultFail("Blank Template Creation", "New Blank Template Created Successfully");
	 
	 }*/
	}
	 catch(NoSuchElementException e){
		 e.getMessage();
	 }
	 
	} 
	public static void RestoreDefault_HTMLLinkWebsite_LogoStep_Verification() throws InterruptedException, IOException
	{
		try{
	 
	 
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
		
	//Replace the image from the existing one
	 CorporateMergeCampaigns.Editor_UploadImage_HtmlLink.click();
	 
	 Thread.sleep(1000);
	 
	 CorporateMergeCampaigns.HtmlLinkField_Campaign_EditorStep.clear();
	 
	 Thread.sleep(1000);
	 
	 CorporateMergeCampaigns.HtmlLinkField_Campaign_EditorStep.sendKeys("Automation Website");
	 
	 Thread.sleep(1000);
	 
	 CorporateMergeCampaigns.RestoreDefault_Logo_EditorStep.click();
	 
	 WebElement LogoValueVerification=CorporateMergeCampaigns.HtmlLinkField_Campaign_EditorStep;
	     String LogoDefault=LogoValueVerification.getAttribute("value");
	  
	     System.out.println(LogoDefault);
	Assert.assertTrue(LogoDefault.contains("*|DEFAULT_WEBSITE|*") & !LogoDefault.contains("http://"));
	/*  if(LogoDefault.contains("*|DEFAULT_WEBSITE|*") & !LogoDefault.contains("http://"))
	 {
		 System.out.println("Restore Default on LogoStep HTML Link Website Field on Editor Step Changed to Default Content with no http:// text  Successfully");
		 
		 Reuse_Functions_Corp_CampaignsList.resultPass("RestoreDefault_HTMLLinkWebsite_LogoStep_Verification", "Restore Default on HTML Link Website Field on Editor Step Changed to Default Content with no http:// text Successfully");
	 }
	 else{
		 System.out.println("Restore Default on HTML Link Website Field on Editor Step Changed to Default Content with no http:// text  UnSuccessfully");
		
		 Reuse_Functions_Corp_CampaignsList.resultFail("RestoreDefault_HTMLLinkWebsite_LogoStep_Verification", "Restore Default on HTML Link Website Field on Editor Step Changed to Default Content with no http:// text UnSuccessfully");
	 
	 }*/
	 
		}
	catch(NoSuchElementException e){
		e.getMessage();
	}
	 
	}		
	public static void SocialLinks_Fields_RestoreDefaults_WithHTTPText_Verification() throws IOException, InterruptedException{
		try{
		
		//Goto Social Block
	  
	CorporateMergeCampaigns.Header_SocialTab_EditorStep.click();
	
	Thread.sleep(1000);
	
	//Clear the social field and enter data
	CorporateMergeCampaigns.FacebookLink_Field_Social_EditorStep.clear();
	
	CorporateMergeCampaigns.FacebookLink_Field_Social_EditorStep.sendKeys("FacebookLink");
	
    CorporateMergeCampaigns.Twitter_Field_Social_EditorStep.clear();
	
	CorporateMergeCampaigns.Twitter_Field_Social_EditorStep.sendKeys("TwitterLink");
	   
	  
    CorporateMergeCampaigns.Instagram_Field_Social_EditorStep.clear();
	
	CorporateMergeCampaigns.Instagram_Field_Social_EditorStep.sendKeys("InstagramLink");
	
	
    CorporateMergeCampaigns.Linkedin_Field_Social_EditorStep.clear();
	
	CorporateMergeCampaigns.Linkedin_Field_Social_EditorStep.sendKeys("LinkedInLink");
	
    CorporateMergeCampaigns.Pinterest_Field_Social_EditorStep.clear();
	
	CorporateMergeCampaigns.Pinterest_Field_Social_EditorStep.sendKeys("PinterestLink");
	
	//Press the default Link to make the fields default again and validate it
	CorporateMergeCampaigns.RestoreDefault_Social_EditorStep.click();
	
	Thread.sleep(1000);
	
	 WebElement FacebookValueVerification=CorporateMergeCampaigns.FacebookLink_Field_Social_EditorStep;
     String FacebookDefault=FacebookValueVerification.getAttribute("value");
  
     System.out.println(FacebookDefault);
     
     WebElement TwitterValueVerification=CorporateMergeCampaigns.Twitter_Field_Social_EditorStep;
     String TwitterDefault=TwitterValueVerification.getAttribute("value");
  
     System.out.println(TwitterDefault);
     
     WebElement InstagramValueVerification=CorporateMergeCampaigns.Instagram_Field_Social_EditorStep;
     String InstagramDefault=InstagramValueVerification.getAttribute("value");
  
     System.out.println(InstagramDefault);
     
     WebElement LinkedinValueVerification=CorporateMergeCampaigns.Linkedin_Field_Social_EditorStep;
     String LinkedinDefault=LinkedinValueVerification.getAttribute("value");
  
     System.out.println(LinkedinDefault);
     
     WebElement PinterestValueVerification=CorporateMergeCampaigns.Pinterest_Field_Social_EditorStep;
     String PinterestDefault=PinterestValueVerification.getAttribute("value");
  
     System.out.println(PinterestDefault);
     Assert.assertTrue(FacebookDefault.contains("*|DEFAULT_FACEBOOK|*") & !FacebookDefault.contains("http://") & TwitterDefault.contains("*|DEFAULT_TWITTER|*") &!TwitterDefault.contains("http://") & InstagramDefault.contains("*|DEFAULT_INSTAGRAM|*") & !InstagramDefault.contains("http://") & LinkedinDefault.contains("*|DEFAULT_LINKEDIN|*") & !LinkedinDefault.contains("http://") & PinterestDefault.contains("*|DEFAULT_PINTEREST|*") & !PinterestDefault.contains("http://"));
    /* if(FacebookDefault.contains("*|DEFAULT_FACEBOOK|*") & !FacebookDefault.contains("http://") & TwitterDefault.contains("*|DEFAULT_TWITTER|*") &!TwitterDefault.contains("http://") & InstagramDefault.contains("*|DEFAULT_INSTAGRAM|*") & !InstagramDefault.contains("http://") & LinkedinDefault.contains("*|DEFAULT_LINKEDIN|*") & !LinkedinDefault.contains("http://") & PinterestDefault.contains("*|DEFAULT_PINTEREST|*") & !PinterestDefault.contains("http://") )
     {
    	System.out.println("Social Links fields Restore to defaults with no http:// text  Successfully");
    	
    	Reuse_Functions_Corp_CampaignsList.resultPass("SocialLinks_Fields_RestoreDefaults_WithHTTPText_Verification", "Social Links fields Restore to defaults with no http:// text Successfully");
     }
     else{
    	 System.out.println("Social Links fields Restore to defaults with no http:// text UnSuccessfully");
     	
     	Reuse_Functions_Corp_CampaignsList.resultFail("SocialLinks_Fields_RestoreDefaults_WithHTTPText_Verification", "Social Links fields Restore to defaults with no http:// text UnSuccessfully");
     }*/
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	} 
    public static void LinkTOURLButton_PopUpMessage_MergeCampaign_Verification() throws IOException, InterruptedException{
    	try{
	
	CorporateMergeCampaigns.EditorPage_DoneEditingImage_Button.click();
     
     Thread.sleep(1000);
     
  // Create object of actions class
	    act=new Actions(getDriver());
		 
		// find element which we need to drag
		Drag=CorporateMergeCampaigns.LinkToUrlButton_ContentBlock;
		 
		// find element which we need to drop
		Drop=CorporateMergeCampaigns.Editor_Product_DropArea;
		 
		// this will drag element to destination
		act.dragAndDrop(Drag, Drop).build().perform();
		 
	    Thread.sleep(4000);
		
	    CorporateMergeCampaigns.LinkToURLButton_URLField.clear();
		
		Thread.sleep(1000);
		
		CorporateMergeCampaigns.EditorPage_DoneEditing_URLButton.click();
		
		Thread.sleep(2000);
		Assert.assertTrue(CorporateMergeCampaigns.LinkToTheUrlButton_PopUpVerification_Campaign.getText().contains("You must provide a Link to URL for the Button"));
		/*if(CorporateMergeCampaigns.LinkToTheUrlButton_PopUpVerification_Campaign.getText().contains("You must provide a Link to URL for the Button"))
		{
			System.out.println("Link To URL Button Validation Popup Message Displayed for Merge Campaign Successfully");
			
			Reuse_Functions_Corp_CampaignsList.resultPass("LinkTOURLButton_PopUpMessage_MergeCampaign_Verification", "Link To URL Button Validation Popup Message Displayed Merge Campaign Successfully");
		}
		else{
			
            System.out.println("Link To URL Button Validation Popup Message Displayed UnSuccessfully");
			
			Reuse_Functions_Corp_CampaignsList.resultFail("LinkTOURLButton_PopUpMessage_MergeCampaign_Verification", "Link To URL Button Validation Popup Message Displayed Merge Campaign UnSuccessfully");
		
		}*/
		
    	}
    	catch(NoSuchElementException e){
    		e.getMessage();
    	}
    }	
	public static void List_Creation_FromCampaign() throws InterruptedException, IOException{
		try{
		CorporateMergeCampaigns.LinkToURLButton_PopUpMessage_OKButton.click();
		
		Thread.sleep(2000);
		
		CorporateMergeCampaigns.LinkToURLButton_URLField.sendKeys("http://www.google.com");
        
		CorporateMergeCampaigns.EditorPage_DoneEditing_URLButton.click();
		
		Thread.sleep(1000);
     
   //Press the Next Button
     CorporateMergeCampaigns.EditorStep_NextButton.click();
     
     Reuse_Functions_Corp_CampaignsList.PageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(2000);
     
     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	 
	 //Press the CreateList Button
	 CorporateMergeCampaigns.Campaign_CreateListButton.click();
	 
	 //Enter the List Name and Press Create Button
	 CorporateMergeCampaigns.ListName_Field.sendKeys(EMS_TestData.ListName);
	 
	 CorporateMergeCampaigns.List_CreateButton.click();
	 
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	 
	 WebElement ListNameVerification=CorporateMergeCampaigns.ListCreationVerification;
	   String ListName=ListNameVerification.getAttribute("value");
	  
	   System.out.println(ListName);
  	 
  	 //Thread.sleep(8000);
  	 
  	 //Validating List Created Successfully or not
	   Assert.assertTrue(ListName.contains("EMS List"));
  	/* if(ListName.contains("EMS List"))
  	 {
  		 System.out.println("List Created Successfully");
  		 
  		 Reuse_Functions_Corp_CampaignsList.resultPass("List_Creation_FromCampaign", "List Created Successfully");
  	 }
  	 else{
  		 System.out.println("List Created UnSuccessfully");
  		
  		 Reuse_Functions_Corp_CampaignsList.resultFail("List_Creation_FromCampaign", "List Created UnSuccessfully");
  	 
  	 }*/
		}
	catch(NoSuchElementException e){
		e.getMessage();
	}
	}		
  	public static void SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaign_Verification() throws InterruptedException, IOException{
  		try{
	//Select Multiple Tenents on list contacts details screen
  	CorporateMergeCampaigns.ListDetails_CompanySelection_Field.click();
  	
  	Thread.sleep(1000);
  	
  	if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
  	{		
  	
  	CorporateMergeCampaigns.SelectCompany_TextField_List.sendKeys("asi/444012");
  	
  	Thread.sleep(2000);
  	
  	CorporateMergeCampaigns.CompanySelection.click();
  	
  	Thread.sleep(2000);
  	
  	CorporateMergeCampaigns.SelectCompany_TextField_List.click();
  	
  	Thread.sleep(1000);
  	
  	CorporateMergeCampaigns.SelectCompany_TextField_List.sendKeys("asi/109480");
  	
  	Thread.sleep(2000);
  	
    CorporateMergeCampaigns.CompanySelection.click();
  	
  	Thread.sleep(2000);
  	
  	CorporateMergeCampaigns.DynamicListText.click();
  	}
  	else{
  		CorporateMergeCampaigns.SelectCompany_TextField_List.sendKeys("asi/320880");
  	  	
  	  	Thread.sleep(2000);
  	  	
  	  	CorporateMergeCampaigns.CompanySelection.click();
  	  	
  	  	Thread.sleep(2000);
  	  	
  	  	CorporateMergeCampaigns.SelectCompany_TextField_List.click();
  	  	
  	  	Thread.sleep(1000);
  	  	
  	  	CorporateMergeCampaigns.SelectCompany_TextField_List.sendKeys("asi/320879");
  	  	
  	  	Thread.sleep(2000);
  	  	
  	    CorporateMergeCampaigns.CompanySelection.click();
  	  	
  	  	Thread.sleep(2000);
  	  	
  	  	CorporateMergeCampaigns.DynamicListText.click();
  	}
  	
  	Thread.sleep(1000);
  	 if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
  	 {	 
  	 //Now Add A contact from CRM by Pressing Add From CRM Button
  	CorporateMergeCampaigns.AddFromCRM_Contacts_Button.click();
	 
  	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
    
    //Search the contacts through name
    CorporateMergeCampaigns.CRMSearchContact_Field.sendKeys("mmubarik@asicentral.com");
    
    Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
    
    Thread.sleep(1000);
    
  //Select the Contact and Press Add Button
    CorporateMergeCampaigns.CRMCompanyName_SelectionCheckbox.click();
	 
	 Thread.sleep(1000);
	 
	 CorporateMergeCampaigns.CRMSearchContact_Field.clear();
	    
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	 
	 CorporateMergeCampaigns.CRMSearchContact_Field.sendKeys("bilalmub@gmail.com");
	    
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	    
	  //Select the Contact and Press Add Button
	 CorporateMergeCampaigns.CRMCompanyName_SelectionCheckbox.click();
		 
	 Thread.sleep(1000);
	 
	CorporateMergeCampaigns.CRMToEMS_ContactAddButton.click();
	 
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
     
     CorporateMergeCampaigns.BackToCampaign_Merge.click();
     
     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
     
     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
   
  	 }
  	 else{
     
  		 //Now Add A contact from CRM by Pressing Add From CRM Button
  	  	CorporateMergeCampaigns.AddFromCRM_Contacts_Button.click();
  		 
  	   Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	    Thread.sleep(1000);
  	    
  	
  	  CorporateMergeCampaigns.CRMSearchContact_Field.sendKeys("mmubarik@asicentral.com");
      
  	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
  	    
  	    
  	    //Select the Contact and Press Add Button
  	    CorporateMergeCampaigns.CRMCompanyName_SelectionCheckbox.click();
  		 
  		 Thread.sleep(2000);
  		 
  		CorporateMergeCampaigns.CRMToEMS_ContactAddButton.click();
  		 
 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
  		 
  		 
     CorporateMergeCampaigns.BackToCampaign_Merge.click();
     
     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
     
     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
     
  	 }
     
   //Press the Next Button to move to send Campaign Step
     CorporateMergeCampaigns.CampaignNextStep_Button.click();
	 
     Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	 if(getDriver().getCurrentUrl().contains("stage") || getDriver().getCurrentUrl().contains("uat"))
	 {
	 
     if(CorporateMergeCampaigns.SendStep_SendMailDrop_WithMultipleTenentSelection_Verificationuat.isDisplayed())
     {
    	 System.out.println("Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign Successfully");
    	 
    	 Reuse_Functions_Corp_CampaignsList.resultPass("SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaign_Verification", "Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign Successfully");
    	 
     }
     else{
         System.out.println("Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign UnSuccessfully");
    	 
    	 Reuse_Functions_Corp_CampaignsList.resultFail("SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaign_Verification", "Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign UnSuccessfully");
     }
	 } 
     else{
	 
	 if(CorporateMergeCampaigns.SendStep_SendMailDrop_WithMultipleTenentSelection_VerificationProd.isDisplayed())
	 {
         System.out.println("Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign Successfully");
    	 
    	 Reuse_Functions_Corp_CampaignsList.resultPass("SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaign_Verification", "Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign Successfully"); 
	 }
	 else{
         System.out.println("Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign UnSuccessfully");
    	 
    	 Reuse_Functions_Corp_CampaignsList.resultFail("SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaign_Verification", "Send Step Display Send Mail with Multiple Tenet Selection in Merge Campaign UnSuccessfully");
	 }
    
     } 
	
  		}catch(NoSuchElementException e){
  			e.getMessage();
  		}
  	}
	public static void MergeCampaignPreview_ParentAddressVerification() throws InterruptedException, IOException{
		try{
	 CorporateMergeCampaigns.SendStep_PreviewButton.click();
     
	 Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
     
     Thread.sleep(1000);
	 
	 if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
	 {	 
	 
	  TenentSelection=CorporateMergeCampaigns.TenentSelection_Preview_MergeCampaign;
		dropdownValue= new Select(TenentSelection);
		dropdownValue.selectByVisibleText("asi/109480 AIA Corporation");
	 }
	 else{
		 TenentSelection=CorporateMergeCampaigns.TenentSelection_Preview_MergeCampaign;
			dropdownValue= new Select(TenentSelection);
			dropdownValue.selectByVisibleText("asi/320879 AIA Corporate Production Testing  Mirror Company.");
	 }
	 Assert.assertTrue(getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.HtmlLink_Field_Corp) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.Address1_Field_Corp) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.City_Field_Corp) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.PostalCode_Field_Corp));
	/*	if(getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.HtmlLink_Field_Corp) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.Address1_Field_Corp) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.City_Field_Corp) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.PostalCode_Field_Corp) )
		{
			System.out.println("Parent Address details Display on Merge Campaign Preview Successfully");
			
			Reuse_Functions_Corp_CampaignsList.resultPass("MergeCampaignPreview_ParentAddressVerification", "Parent Address details Display on Merge Campaign Preview Successfully");
		}
		else{
            System.out.println("Parent Address details Display on Merge Campaign Preview UnSuccessfully");
			
			Reuse_Functions_Corp_CampaignsList.resultFail("MergeCampaignPreview_ParentAddressVerification", "Parent Address details Display on Merge Campaign Preview UnSuccessfully");
		}*/
		
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void MergeCampaignPreview_ChildAddressVerification() throws InterruptedException, IOException{
		try{
		 if(getDriver().getCurrentUrl().contains("stage") | getDriver().getCurrentUrl().contains("uat"))
		 {	
		TenentSelection=CorporateMergeCampaigns.TenentSelection_Preview_MergeCampaign;
		dropdownValue= new Select(TenentSelection);
		dropdownValue.selectByVisibleText("asi/444012 AIA/My Corporate Expressions");
		 }
		 else{
			 TenentSelection=CorporateMergeCampaigns.TenentSelection_Preview_MergeCampaign;
				dropdownValue= new Select(TenentSelection);
				dropdownValue.selectByVisibleText("asi/320880 AIA OWNER A Production Testing Company");
		 }
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
		 Assert.assertTrue(getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.HtmlLink_Field_child) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.Address1_Field_child) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.City_Field_child) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.PostalCode_Field_child) );
	/*	 if(getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.HtmlLink_Field_child) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.Address1_Field_child) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.City_Field_child) & getDriver().getPageSource().contains(Settings_CorporateParentChild_ValuesStore.PostalCode_Field_child) )
			{
				System.out.println("Child Address details Display on Merge Campaign Preview Successfully");
				
				Reuse_Functions_Corp_CampaignsList.resultPass("MergeCampaignPreview_ChildAddressVerification", "Child Address details Display on Merge Campaign Preview Successfully");
			}
			else{
	            System.out.println("Child Address details Display on Merge Campaign Preview UnSuccessfully");
				
				Reuse_Functions_Corp_CampaignsList.resultFail("MergeCampaignPreview_ChildAddressVerification", "Child Address details Display on Merge Campaign Preview UnSuccessfully");
			}*/
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}
		public static void MergeCampaign_SendTestEmail() throws IOException, InterruptedException{
		    try{	
		
		CorporateMergeCampaigns.ClosePreviewWindow.click();
  		  
   		  
         Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(1000);
   	     
   	//Test the Test send email functionality
   	  CorporateMergeCampaigns.SendTestEmail_TextField.sendKeys("mmubarik@asicentral.com");
		  
		  Thread.sleep(1000);
		  
		  //Press the Test send Button
		  CorporateMergeCampaigns.SendTestEmail_SendButton.click();
		  
		 //Validating if the test mail is sent or not
		  Assert.assertTrue(CorporateMergeCampaigns.SendEmailTest_Veriifcation.getText().contains("Send Test Succeed"));
		/*  if(CorporateMergeCampaigns.SendEmailTest_Veriifcation.getText().contains("Send Test Succeed"))
		  {
			  System.out.println("Send Test Email For Merge Campaign sent Successfully");
 	  		
 	  		Reuse_Functions_Corp_CampaignsList.resultPass("MergeCampaign_SendTestEmail", "Send Test Email For Merge Campaign sent Successfully");
		  }
		  else{
			  
			  System.out.println("Send Test Email For Merge Campaign sent UnSuccessfully");
 	  		
 	  		Reuse_Functions_Corp_CampaignsList.resultFail("MergeCampaign_SendTestEmail", "Send Test Email For Merge Campaign sent UnSuccessfully");
 	  	
		  }*/
		    }
		    catch(NoSuchElementException e)
		    {
		    	e.getMessage();
		    }
		}
		public static void MergeCampaignSent() throws InterruptedException, IOException{
			try{
		
	  	Thread.sleep(4000);
	  	
	  	CorporateMergeCampaigns.SendStep_TermsandCondition_Checkbox.click();
	  	
	  	CorporateMergeCampaigns.SendMail_Button.click();
	  	
	  	if(CorporateMergeCampaigns.SendEmailTest_Veriifcation.getText().contains("Congratulations"))
	  	{
	  		System.out.println("Send Now Campaign Email has been Sent Successfully");
	  		
	  		
	  	}
	  	else{
	  		System.out.println("Send Now Campaign Email has been Sent Successfully");
	  	}
	  	
        Reuse_Functions_Corp_CampaignsList.waitForPageLoad(getDriver(), wait, pageLoaded);
	     
	     Thread.sleep(2000);
	  	 Assert.assertTrue(CorporateMergeCampaigns.CampaignProcessing_Status.isDisplayed());
	  	/*if(CorporateMergeCampaigns.CampaignProcessing_Status.isDisplayed())
	  	{
	  		System.out.println("Merge Campaign Sent now Successfully");
	  		
	  		Reuse_Functions_Corp_CampaignsList.resultPass("MergeCampaignSent", "MergeCampaign Sent now Successfully");
	  		
	  	}
	  	else{
	  		System.out.println("Send Now Campaign Email has been Sent UnSuccessfully");
	  		
	  		Reuse_Functions_Corp_CampaignsList.resultPass("MergeCampaignSent", "MergeCampaign Sent now UnSuccessfully");
	  	}*/
	  	
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getMessage();
		} 
}
	
}
