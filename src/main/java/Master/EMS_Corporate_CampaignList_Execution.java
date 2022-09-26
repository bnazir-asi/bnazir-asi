

package Master;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.base.Predicate;

import EMS_Corporate_CampaignList_TestCases.AdManagement_Feature;
import EMS_Corporate_CampaignList_TestCases.AuthorizationInvoke;
import EMS_Corporate_CampaignList_TestCases.BrowserInitiation;
import EMS_Corporate_CampaignList_TestCases.CompanySettings_Companyname;
import EMS_Corporate_CampaignList_TestCases.Corporate_MergeCampaign_Scenarios;
import EMS_Corporate_CampaignList_TestCases.CreateListButton_OnlyDisplayCampaignOwner;
import EMS_Corporate_CampaignList_TestCases.Login;
import EMS_Corporate_CampaignList_TestCases.MergeList_Authorization_ChildParent;
import EMS_Corporate_CampaignList_TestCases.Settings_CorporateParentChild_ValuesStore;
import EMS_Corporate_CampaignList_TestCases.TenentConfiguration;



public class EMS_Corporate_CampaignList_Execution  {

	public static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extent;
	private static ExtentTest test;
	public static WebDriverWait wait;
	protected static Predicate<WebDriver> pageLoaded;
	static WebDriver input;
	static String suite="Email_Marketing_Corporate_CampaignList_Execution.html";
	@BeforeTest
	 public void Startup() throws InterruptedException, AWTException, IOException{

		 BrowserInitiation.StartBrowser(suite);
		 
		 }

	@Test(priority=0)
	  public void LoginApp() throws IOException, InterruptedException, AWTException{
		 
		 Login.login();
		 
	}

		 
	@Test(priority=1)
	  public void TenentConfig() throws IOException, InterruptedException, AWTException{
		 
		 TenentConfiguration.TenentSwitch();
		 
	}
	
	 @Test(priority=2)
	  public void InvokeAuthorizations() throws IOException, InterruptedException, AWTException{
		 
		 AuthorizationInvoke.InvokeAuthorization();
	 }
	 
	 
	 @Test(priority=3)
	  public void SettingsCorpChildValueStoring() throws IOException, InterruptedException, AWTException{
		 
		 Settings_CorporateParentChild_ValuesStore.SettingsCorpChildValues_Store();
	 }
	 
	 
	 @Test(priority=4)
	  public void CreateListVisibility_ToCampaignOwner() throws IOException, InterruptedException, AWTException{
		 
	   CreateListButton_OnlyDisplayCampaignOwner.CreateListButton_VisibilityToCampaignOwnerOnly();
		 
	}
	 
	 @Test(priority=5)
	  public void ListContacts_Verification_With_Authorization_CampaignLevelCorporate() throws IOException, InterruptedException, AWTException{
		 
		 MergeList_Authorization_ChildParent.ListContacts_Verification_With_Authorization_CampaignLevel_Corporate();
		 
	}
	 
	 @Test(priority=6)
	  public void ListsContactsRemoval_AfterRevokingAuthorizationMergeCampaign() throws IOException, InterruptedException, AWTException{
		 
		 MergeList_Authorization_ChildParent.ListsContactsRemoval_AfterRevokingAuthorization_MergeCampaign();
		 
	}
   
   @Test(priority=7)
	  public void RestoreDefault_FromField_CamapignInfoVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.RestoreDefault_FromField_CamapignInfo_Verification ();
		 
	}
   @Test(priority=8)
	  public void Blank_TemplateCreation() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.Blank_Template_Creation ();
		 
	}
   @Test(priority=9)
	  public void RestoreDefault_HTMLLinkWebsite_LogoStepVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.RestoreDefault_HTMLLinkWebsite_LogoStep_Verification ();
		 
	}
   @Test(priority=10)
	  public void SocialLinks_Fields_RestoreDefaults_WithHTTPTextVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.SocialLinks_Fields_RestoreDefaults_WithHTTPText_Verification ();
		 
	}
   @Test(priority=11)
	  public void LinkTOURLButton_PopUpMessage_MergeCampaignVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.LinkTOURLButton_PopUpMessage_MergeCampaign_Verification ();
		 
	}
   @Test(priority=12)
	  public void ListCreation_FromCampaign() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.List_Creation_FromCampaign ();
		 
	}
   @Test(priority=13)
	  public void SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaignVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.SendStep_SendMailDrop_WithMultipleTenentSelection_MergeCampaign_Verification ();
		 
	}
   @Test(priority=14)
	  public void MergeCampaignPreviewParentAddressVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaignPreview_ParentAddressVerification ();
		 
	}
   @Test(priority=15)
	  public void MergeCampaignPreviewChildAddressVerification() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaignPreview_ChildAddressVerification ();
		 
	}
   @Test(priority=16)
	  public void MergeCampaignSendTestEmail() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaign_SendTestEmail ();
		 
	}
   @Test(priority=17)
	  public void MergeCampaign_Sent() throws IOException, InterruptedException, AWTException{
		 
	   Corporate_MergeCampaign_Scenarios.MergeCampaignSent ();
		 
	}
   @Test(priority=18)
	  public void CreateAdImageUpload() throws IOException, InterruptedException, AWTException{
		 
	   AdManagement_Feature.CreateAd_ImageUpload ();
		 
	}
   
   @Test(priority=19)
	  public void AdRemoveImageVerification() throws IOException, InterruptedException, AWTException{
		 
	   AdManagement_Feature.AdRemoveImage_Verification ();
		 
	}
   
   @Test(priority=20)
	  public void FutureDate_BannerAdCreationWithSearchVerification() throws IOException, InterruptedException, AWTException{
		 
	   AdManagement_Feature.FutureDate_BannerAdCreation_WithSearchVerification ();
		 
	}
   
   @Test(priority=21)
	  public void EditBannerAdDetails() throws IOException, InterruptedException, AWTException{
		 
	   AdManagement_Feature.EditBannerAd_Details ();
		 
	}
   
   @Test(priority=22)
	  public void Delete_Ad() throws IOException, InterruptedException, AWTException{
		 
	   AdManagement_Feature.DeleteAd ();
		 
	}
   @Test(priority=23)
	  public void CurrentDate_BannerAdCreation_WithAdCheckboxDisable_WithSearchVerificationActiveAd() throws IOException, InterruptedException, AWTException{
		 
	   AdManagement_Feature.CurrentDate_BannerAdCreation_WithAdCheckboxDisable_WithSearchVerification_ActiveAd ();
		 
	}
   
   @Test(priority=24)
	  public void Inactive_Ad() throws IOException, InterruptedException, AWTException{
		 
	   AdManagement_Feature.InactiveAd ();
		 
	}
   	 @Test(priority=25)
	  public void Companyname() throws IOException, InterruptedException, AWTException{
		 
		 CompanySettings_Companyname.companyname();
	}
	@AfterMethod
	public void getResult(ITestResult result){
		test = extent.createTest(result.getName());
		if(result.getStatus()==ITestResult.SUCCESS)
		{
	        test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case is Passed", ExtentColor.GREEN));
			extent.flush();
		}
			if(result.getStatus()==ITestResult.FAILURE)
			{
				
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
	            test.fail(result.getThrowable());
				extent.flush();
			}
			
		}
		

	@AfterTest
	public void teardown(){
	 	
	 	driver.close();
	 	
	}


	 public static WebDriver getDriver() {
			return driver;
		}


		public static void setDriver(WebDriver driver) {
			EMS_Corporate_CampaignList_Execution.driver = driver;
		}


		public static ExtentReports getExtent() {
			return extent;
		}


		public static void setExtent(ExtentReports extent) {
			EMS_Corporate_CampaignList_Execution.extent = extent;
		}


		public static ExtentTest getTest() {
			return test;
		}


		public static void setTest(ExtentTest test) {
			EMS_Corporate_CampaignList_Execution.test = test;
		}

		 public static ExtentHtmlReporter getHtmlReporter() {
				return htmlReporter;
			}

		public static void setHtmlReporter(ExtentHtmlReporter htmlReporter) {
			EMS_Corporate_CampaignList_Execution.htmlReporter = htmlReporter;
			
		}

}
