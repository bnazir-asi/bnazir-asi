package EMS_Corporate_CampaignList_TestCases_Prod;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Master.EMS_Corporate_CampaignList_Execution_Mirror_Prod;
import PageFactoryandTestData.EMS_TestData;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserInitiation extends EMS_Corporate_CampaignList_Execution_Mirror_Prod {
	

	public static void StartBrowser(String suite){
		
				
			    WebDriverManager.chromedriver().setup();
				setDriver(new ChromeDriver());
				setHtmlReporter(new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/EmailMarketing_Corporate_CampaignList_Report"+".html"));
				setExtent(new ExtentReports());
				getExtent().attachReporter(getHtmlReporter());
				getExtent().setSystemInfo("HostName", "Bilal Mubarik");
				getExtent().setSystemInfo("Environment", EMS_TestData.CRMandOrders_URL);
				getHtmlReporter().config().setDocumentTitle("Automation Testing Report");
				getHtmlReporter().config().setReportName("Email Marketing");
				getHtmlReporter().config().setTestViewChartLocation(ChartLocation.TOP);
				getHtmlReporter().config().setTheme(Theme.DARK);
				getHtmlReporter().getStartTime();
				getHtmlReporter().getEndTime();	
			
		getDriver().get(EMS_TestData.CRMandOrders_URL);
	    getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
	}
	
	}
