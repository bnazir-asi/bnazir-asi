



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

import EMS_Corporate_TestCases.BrowserInitiation;
import EMS_Corporate_TestCases.Corporate_Templates;
import EMS_Corporate_TestCases.HideShareCategoriesTemplate_FromToChildUser;
import EMS_Corporate_TestCases.HideShareSupplierFlyerTemplate_FromToChildUser;
import EMS_Corporate_TestCases.Login;
import EMS_Corporate_TestCases.My_Templates;
import EMS_Corporate_TestCases.Settings_Corporate;
import EMS_Corporate_TestCases.TenentConfiguration;
import EMS_Corporate_TestCases.UserTemplate_CorporateNonAdmin;


public class EMS_Corporate_Execution  {

	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extent;
	private static ExtentTest test;
	public static WebDriverWait wait;
	protected static Predicate<WebDriver> pageLoaded;
	static WebDriver input;
	static String suite="Email_Marketing_Corporate_Execution.html";
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
	  public void BlankCorporateTemplateCreation_From_TemplatePageCorporate() throws IOException, InterruptedException, AWTException{
		 
		 Corporate_Templates.BlankCorporateTemplateCreation_From_TemplatePage_Corporate();
		 
	}
  @Test(priority=3)
  public void Corporate_TemplatePreview() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.Corporate_Template_Preview();
	 
}
  @Test(priority=4)
  public void NewCorporateTemplate_WithConfigurationCreation() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.NewCorporateTemplate_WithConfiguration_Creation();
	 
}
  @Test(priority=5)
  public void CorporateTemplate_FilterCountVerification() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.CorporateTemplate_FilterCount_Verification();
	 
}
  @Test(priority=6)
  public void ChildUser_CorporateTemplatePublish_Verification_FromCorporateTenent() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.ChildUser_CorporateTemplatePublish_Verification_From_CorporateTenent();
	 
}
  @Test(priority=7)
  public void AIA_ListContactMovedVerification() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.AIA_ListContactMoved_Verification();
	 
}
  @Test(priority=8)
  public void ChildList_VeriifcationCorporateParent() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.ChildList_Veriifcation_CorporateParent();
	 
}
  @Test(priority=9)
  public void List_Owner_ActionButton_FromListPageVerification() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.List_Owner_ActionButton_FromListPage_Verification();
	 
}
  @Test(priority=10)
  public void ContactUnderList_TextUpdationVerification_AccordingToFunctionalityAvaialable() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.ContactUnderList_TextUpdationVerification_AccordingToFunctionality_Avaialable();
	 
}
  @Test(priority=11)
  public void ChildUser_CorporateTemplateUnPublish_VerificationFromCorporateTenent() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.ChildUser_CorporateTemplateUnPublish_Verification_FromCorporateTenent();
	 
}
  @Test(priority=12)
  public void ADDContactsFromCRM_ParentChildVerification() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.ADDContactsFromCRM_Parent_ChildVerification();
	 
}
  @Test(priority=13)
  public void Corporate_TemplateDelete() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.Corporate_Template_Delete();
	 
}
  @Test(priority=14)
  public void ChildUser_CorporateTemplateUnPublish_VerificationFrom_CorporateTenent() throws IOException, InterruptedException, AWTException{
	 
	 Corporate_Templates.ChildUser_CorporateTemplateUnPublish_Verification_From_CorporateTenent();
	 
}
 
	 @Test(priority=15)
	  public void BlankMyTemplateCreation_From_TemplatePageCorporate() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.BlankMyTemplateCreation_From_TemplatePage_Corporate();
		 
	}
	 @Test(priority=16)
	  public void My_TemplatePreview() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.My_Template_Preview();
		 
	}
	 @Test(priority=17)
	  public void NewTemplate_WithConfigurationCreation() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.NewTemplate_WithConfiguration_Creation();
		 
	}
	 @Test(priority=18)
	  public void MyTemplate_FilterCountVerification() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.MyTemplate_FilterCount_Verification();
		 
	}
	 @Test(priority=19)
	  public void ChildUser_MyTemplatePublish_Verification_FromCorporateTenent() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.ChildUser_MyTemplatePublish_Verification_From_CorporateTenent();
		 
	}
	 @Test(priority=20)
	  public void BlankMyTemplateCreation_FromChildUser_TemplatePageCorporate() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.BlankMyTemplateCreation_FromChildUser_TemplatePage_Corporate();
		 
	}
	 @Test(priority=21)
	  public void ChildUser_MyTemplate_Verification_InCorporateMyTemplatesFilter() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.ChildUser_MyTemplate_Verification_InCorporate_MyTemplatesFilter();
		 
	}
	 @Test(priority=22)
	  public void MyTemplateDelete() throws IOException, InterruptedException, AWTException{
		 
		 My_Templates.MyTemplate_Delete();
		 
	}
	 
	 @Test(priority=23)
	  public void UserTemplates() throws IOException, InterruptedException, AWTException{
		 
		 UserTemplate_CorporateNonAdmin.UserTemplateCreation_With_Verification_AtCorporateUser();
		 
	}

	 @Test(priority=24)
	  public void HideShareTemplates() throws IOException, InterruptedException, AWTException{
		 
		 HideShareCategoriesTemplate_FromToChildUser.HideShareTemplate_Categories();
		 
	}
	 
	 @Test(priority=25)
	  public void HideShareSupplierTemplates() throws IOException, InterruptedException, AWTException{
		 
		 HideShareSupplierFlyerTemplate_FromToChildUser.HideShareTemplate_SupplierFlyer();
		 
		 
		 
	}
	 
	 @Test(priority=26)
	  public void CorporateSettings_Settings() throws IOException, InterruptedException, AWTException{
		 
		 Settings_Corporate.CorporateSettings();
		 
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
		EMS_Corporate_Execution.driver = driver;
	}


	public static ExtentReports getExtent() {
		return extent;
	}


	public static void setExtent(ExtentReports extent) {
		EMS_Corporate_Execution.extent = extent;
	}


	public static ExtentTest getTest() {
		return test;
	}


	public static void setTest(ExtentTest test) {
		EMS_Corporate_Execution.test = test;
	}

	 public static ExtentHtmlReporter getHtmlReporter() {
			return htmlReporter;
		}


		public static void setHtmlReporter(ExtentHtmlReporter htmlReporter) {
			EMS_Corporate_Execution.htmlReporter = htmlReporter;
		}


}
