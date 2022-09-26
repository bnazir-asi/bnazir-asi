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

import EMSTestCases.BrowserInitiation;
import EMSTestCases.CampaignEditor;
import EMSTestCases.ChooseTemplate;
import EMSTestCases.CopyAndMoveContacts_FromList;
import EMSTestCases.CopyRecentSentCampaign;
import EMSTestCases.CreateCampaignInfo;
import EMSTestCases.CreateListAndContactsFromListPage;
import EMSTestCases.CreateListWithReceipientAndContacts;
import EMSTestCases.DynamicList;
import EMSTestCases.ExportReports;
import EMSTestCases.ListManagementPage_Features;
import EMSTestCases.Login;
import EMSTestCases.RecentDrafts_Copy_Delete;
import EMSTestCases.SendCampaigns;
import EMSTestCases.Settings;
import EMSTestCases.Templates;


public class EMS_Execution{

	protected static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extent;
	private static ExtentTest test;
	public static WebDriverWait wait;
	protected static Predicate<WebDriver> pageLoaded;
	//static String Projectpath=System.getProperty("user.name");
	//public static String ImagePath ="C:\\Users\\"+Projectpath+"\\Img";
	static WebDriver input;
	static String suite="Email_Marketing_RegularUser.html";
	//@Parameters("browser")
	@BeforeTest
	 	public void Startup() throws InterruptedException, AWTException, IOException
		{

			BrowserInitiation.StartBrowser(suite);
		 
		}
	

	 @Test(priority=0)
	  public void EmailMarketingLists_VerificationInCRMContacts() throws IOException, InterruptedException, AWTException{
		 
		 Login.EmailMarketingLists_Verification_InCRMContacts();
		 
	}
	 @Test(priority=1)
	  public void LoginApp() throws IOException, InterruptedException, AWTException{
		 
		 Login.login();
		 
	}
	
	 
	
  @Test(priority=2)
	  public void CampaignInfo_Creation() throws IOException, InterruptedException, AWTException{
		 
		 CreateCampaignInfo.CampaignInfoCreation();
		 
	}

	 @Test(priority=3)
	  public void ChooseandCreateTemplate() throws IOException, InterruptedException, AWTException{
		 
		 ChooseTemplate.ChooseTemplate_WithBlankTemplateCreation();
		
		 }

	 @Test(priority=4)
	  public void LinkTOURLButton_PopUpMessageVerification() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.LinkTOURLButton_PopUpMessage_Verification();	 
	}
	 @Test(priority=5)
	  public void ButtonText_Updation_VerificationDuringCampaign() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.ButtonText_Updation_Verification_DuringCampaign();	 
	}
	 @Test(priority=6)
	  public void ProductAlignementBelow() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.ProductAlignement_Below();	 
	}
	 @Test(priority=7)
	  public void ProductAlignementRight() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.ProductAlignement_Right();	 
	}
	
	 @Test(priority=8)
	  public void ProductAlignementLeft() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.ProductAlignement_Left();	 
	}
	 @Test(priority=9)
	  public void ProductAlignementAbove() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.ProductAlignement_Above();	 
	}
	 @Test(priority=10)
	  public void Campaign_EditorCreation() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.Campaign_Editor_Creation();	 
	}
	 @Test(priority=11)
	  public void RecipientListSelectionTextVerification() throws IOException, InterruptedException, AWTException{
		 
		 CampaignEditor.RecipientList_SelectionTextVerification();	 
	}
	

	 @Test(priority=12)
	  public void List_CreationFromCampaign() throws IOException, InterruptedException, AWTException{
		 
		 CreateListWithReceipientAndContacts.List_Creation_FromCampaign();
	}
	 
	 @Test(priority=13)
	  public void Indivisual_ContactsUnderList_AddFromCampaign() throws IOException, InterruptedException, AWTException{
		 
		 CreateListWithReceipientAndContacts.Indivisual_ContactsUnderList_Add_FromCampaign();
	}
	 @Test(priority=14)
	  public void CRMContacts_ContactsUnderList_AddFromCampaign() throws IOException, InterruptedException, AWTException{
		 
		 CreateListWithReceipientAndContacts.CRMContacts_ContactsUnderList_Add_FromCampaign();
	}
 
	 @Test(priority=15)
	  public void MoveAndCopyContacts_ToList() throws IOException, InterruptedException, AWTException{
		 
		 CopyAndMoveContacts_FromList.ListSelectedByDefault_AfterBackToCampaign();
	}

	 @Test(priority=16)
	  public void CampaignLevelListPreview() throws IOException, InterruptedException, AWTException{
		 
		 SendCampaigns.CampaignLevel_ListPreview();
	}
	 
	 @Test(priority=17)
	  public void CampaignPreview() throws IOException, InterruptedException, AWTException{
		 
		 SendCampaigns.Campaign_Preview();
	}
	 @Test(priority=18)
	  public void SendTest_Email() throws IOException, InterruptedException, AWTException{
		 
		 SendCampaigns.SendTestEmail();
	}
	 @Test(priority=19)
	  public void CreateCampaign_1_To_5_StepVerification() throws IOException, InterruptedException, AWTException{
		 
		 SendCampaigns.CreateCampaign_1_To_5_Step_Verification();
	}
	 @Test(priority=20)
	  public void CampaignEmail_SentVerification() throws IOException, InterruptedException, AWTException{
		 
		 SendCampaigns.CampaignEmail_Sent_Verification();
	}
	 @Test(priority=21)
	  public void CopyAndMoveContactsFromLists() throws IOException, InterruptedException, AWTException{
		 
		 SendCampaigns.CopyAndMoveContacts_FromLists();
	}
	 @Test(priority=22)
	  public void DeleteContact() throws IOException, InterruptedException, AWTException{
		 
		 SendCampaigns.Delete_Contact();
	}
		
	 @Test(priority=23)
	  public void List_CreationFromListPage() throws IOException, InterruptedException, AWTException{
		 
		 CreateListAndContactsFromListPage.List_Creation_FromListPage();
	}
	 
	 @Test(priority=24)
	  public void Indivisual_ContactsUnderList_AddFromListPage() throws IOException, InterruptedException, AWTException{
		 
		 CreateListAndContactsFromListPage.Indivisual_ContactsUnderList_Add_FromListPage();
	}
	 @Test(priority=25)
	  public void CRMContacts_ContactsUnderList_AddFromListPage() throws IOException, InterruptedException, AWTException{
		 
		 CreateListAndContactsFromListPage.CRMContacts_ContactsUnderList_Add_FromListPage();
	}

	 @Test(priority=26)
	  public void CopyListListManagementPage() throws IOException, InterruptedException, AWTException{
		 
		 ListManagementPage_Features.CopyList_ListManagementPage();
	}
	 @Test(priority=27)
	  public void AddNewIndivisualContactListManagementPage() throws IOException, InterruptedException, AWTException{
		 
		 ListManagementPage_Features.AddNewIndivisualContact_ListManagementPage();
	}
	 @Test(priority=28)
	  public void DeleteListListManagementPage() throws IOException, InterruptedException, AWTException{
		 
		 ListManagementPage_Features.DeleteList_ListManagementPage();
	}
	 @Test(priority=29)
	  public void BulkDeleteListListManagementPage() throws IOException, InterruptedException, AWTException{
		 
		 ListManagementPage_Features.BulkDeleteList_ListManagementPage();
	}

	/* @Test(priority=30)
	  public void DynamicListContacts_PreviewVerification() throws IOException, InterruptedException, AWTException{
		 
		 DynamicList.DynamicListContacts_Preview_Verification();
	}
	 @Test(priority=31)
	  public void DynamicList_CreationWithVerification() throws IOException, InterruptedException, AWTException{
		 
		 DynamicList.DynamicList_Creation_WithVerification();
	}
	 @Test(priority=32)
	 public void Import_Contacts() throws IOException, InterruptedException, AWTException{
		 
		CreateListWithReceipientAndContacts.ImportContacts();
		 
	}*/

	 @Test(priority=33)
	  public void ExportAll_Report_ForDistributor() throws IOException, InterruptedException, AWTException{
		 
		 ExportReports.ExportAll_Report_For_Distributor();
	}
	 
	 @Test(priority=34)
	  public void Campaign_Summary_ReportDownload() throws IOException, InterruptedException, AWTException{
		 
		 ExportReports.Campaign_Summary_Report_Download();
	}
	 
	 @Test(priority=35)
	  public void Campaign_Detail_ReportDownload() throws IOException, InterruptedException, AWTException{
		 
		 ExportReports.Campaign_Detail_Report_Download();
	}
	 @Test(priority=36)
	  public void Unsubscribers_Report_fileDownload() throws IOException, InterruptedException, AWTException{
		 
		 ExportReports.Unsubscribers_Report_file_Download();
	}

	 @Test(priority=37)
	  public void RecentSentCampaignCopy() throws IOException, InterruptedException, AWTException{
		 
		 CopyRecentSentCampaign.RecentSentCampaign_Copy();
	}
	 @Test(priority=38)
	  public void UpdateSubjectNameSendStep() throws IOException, InterruptedException, AWTException{
		 
		 CopyRecentSentCampaign.UpdateSubjectName_SendStep();
	}
	 @Test(priority=39)
	  public void UpdateFromNameSendStep() throws IOException, InterruptedException, AWTException{
		 
		 CopyRecentSentCampaign.UpdateFromName_SendStep();
	}
	 @Test(priority=40)
	  public void UpdateReplyToEmailSendStep() throws IOException, InterruptedException, AWTException{
		 
		 CopyRecentSentCampaign.UpdateReplyToEmail_SendStep();
	}
	 @Test(priority=41)
	  public void Campaign_Saved_ToRecentDrafts() throws IOException, InterruptedException, AWTException{
		 
		 CopyRecentSentCampaign.Campaign_Saved_To_RecentDrafts();
	}
    @Test(priority=42)
	  public void RecentDraftCampaignCopy() throws IOException, InterruptedException, AWTException{
		 
		 RecentDrafts_Copy_Delete.RecentDraftCampaign_Copy();
	}
	 @Test(priority=43)
	  public void Campaign_Saved_To_RecentDraftsFromRecentDrafts() throws IOException, InterruptedException, AWTException{
		 
		 RecentDrafts_Copy_Delete.Campaign_Saved_To_RecentDrafts_FromRecentDrafts();
	}
	 @Test(priority=44)
	  public void RecentDraftCampaignDelete() throws IOException, InterruptedException, AWTException{
		 
		 RecentDrafts_Copy_Delete.RecentDraftCampaign_Delete();
	}

	 @Test(priority=45)
	  public void BlankTemplateCreation_FromTemplatePage() throws IOException, InterruptedException, AWTException{
		 
		 Templates.BlankTemplateCreation_From_TemplatePage();
	}
	 @Test(priority=46)
	  public void ButtonText_Updation_VerificationTemplatesPage() throws IOException, InterruptedException, AWTException{
		 
		 Templates.ButtonText_Updation_Verification_TemplatesPage();
	}
	 @Test(priority=47)
	  public void TemplatePreview() throws IOException, InterruptedException, AWTException{
		 
		 Templates.Template_Preview();
	}
	 @Test(priority=48)
	  public void NewTemplate_WithConfigurationCreation() throws IOException, InterruptedException, AWTException{
		 
		 Templates.NewTemplate_WithConfiguration_Creation();
	}
	 @Test(priority=49)
	  public void TemplatePreviewFromTemplateListing() throws IOException, InterruptedException, AWTException{
		 
		 Templates.TemplatePreview_FromTemplateListing();
	}
	 @Test(priority=50)
	  public void TemplatesPublish() throws IOException, InterruptedException, AWTException{
		 
		 Templates.Templates_Publish();
	}
	 @Test(priority=51)
	  public void TemplatesUnPublish() throws IOException, InterruptedException, AWTException{
		 
		 Templates.Templates_UnPublish();
	}
	 @Test(priority=52)
	  public void Delete_Template() throws IOException, InterruptedException, AWTException{
		 
		 Templates.DeleteTemplate();
	}
	
	 @Test(priority=53)
	  public void Settings_AlertMessageVerificationChangesUnsaved() throws IOException, InterruptedException, AWTException{
		 
		 Settings.Settings_AlertMessageVerification_ChangesUnsaved();
	}

	 @Test(priority=54)
	  public void FromNameField_SettingsUpdated_CampaignVerification() throws IOException, InterruptedException, AWTException{
		 
		 Settings.FromNameField_SettingsUpdated_Campaign_Verification();
	}
	 
	 @Test(priority=55)
	  public void Campaign_InfoCreation() throws IOException, InterruptedException, AWTException{
		 
		 Settings.Campaign_Info_Creation();
	}
	 
	 @Test(priority=56)
	  public void Blank_TemplateCreation() throws IOException, InterruptedException, AWTException{
		 
		 Settings.Blank_Template_Creation();
	}
	 
	 @Test(priority=57)
	  public void Settings_CompanyAddressVerification() throws IOException, InterruptedException, AWTException{
		 
		 Settings.Settings_CompanyAddress_Verification();
	}
	 
	 @Test(priority=58)
	  public void ScheduledCampaignCancel() throws IOException, InterruptedException, AWTException{
		 
		 Settings.ScheduledCampaign_Cancel();
	}
	 
	 @Test(priority=59)
	  public void ScheduledCampaign() throws IOException, InterruptedException, AWTException{
		 
		 Settings.Scheduled_Campaign();
	}

	

	@AfterMethod
	public void getResult(ITestResult result){
		test = extent.createTest(result.getName());
	if(result.getStatus()==ITestResult.SUCCESS){
			
			
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case is Passed", ExtentColor.GREEN));
			 extent.flush();
		}
		if(result.getStatus()==ITestResult.FAILURE){
			
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
		EMS_Execution.driver = driver;
	}

	public static ExtentReports getExtent() {
		return extent;
	}


	public static void setExtent(ExtentReports extent) {
		EMS_Execution.extent = extent;
	}
	public static ExtentTest getTest() {
		return test;
	}


	public static void setTest(ExtentTest test) {
		EMS_Execution.test = test;
	}

	public static ExtentHtmlReporter getHtmlReporter() {
		return htmlReporter;
	}


	public static void setHtmlReporter(ExtentHtmlReporter htmlReporter) {
		EMS_Execution.htmlReporter = htmlReporter;
	}


}
