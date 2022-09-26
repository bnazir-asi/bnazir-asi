package EMSTestCases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import FunctionsLibrary.Reuse_Functions;
import Master.EMS_Execution;
import PageFactoryandTestData.EMS_Locators;
import PageFactoryandTestData.EMS_TestData;


public class ExportReports extends EMS_Execution{

	static Reuse_Functions Reuse_func=new Reuse_Functions();	
	
	static EMS_Locators ExportReport = PageFactory.initElements(getDriver(), EMS_Locators.class);
	public static void ExportAll_Report_For_Distributor() throws IOException, InterruptedException, AWTException{
		try{
			JavascriptExecutor js = (JavascriptExecutor) driver;
    	 //Press the Dashboard Tab
    	 ExportReport.DashboardTab.click();
    	 
    	 Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
         
         Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", ExportReport.ExportAllReport_Link);
    	//Press the Export All Report to download and verify it
  	    ExportReport.ExportAllReport_Link.click();
  	    
  	    Thread.sleep(5000);
  	    
  	   Assert.assertTrue(ExportReport.SendEmailTest_Veriifcation.getText().contains("Your report is being generated"));
		 
	/*	if(ExportReport.SendEmailTest_Veriifcation.getText().contains("Your report is being generated"))
		{
			System.out.println("ExportAll Report For Distributor Sent Successfully");
			
			Reuse_func.resultPass("ExportAll_Report_For Distributor", "ExportAll Report For Distributor Sent Successfully");
		}
		else{
            System.out.println("ExportAll Report Sent UnSuccessfully");
			
			Reuse_func.resultFail("ExportAll_Report_For Distributor", "ExportAll Report For Distributor Sent Successfully");
		}*/
	}catch(NoSuchElementException e){
		e.getMessage();
	}
}	
		
		public static void Campaign_Summary_Report_Download() throws InterruptedException{
			try{
		
		//Press the Export Campaign button
    	 ExportReport.Dashboard_CampaignExportButton.click();
    	 
    	 
    	 //Press the downloadButton naow
    	 ExportReport.Campaign_SummaryReport.click();
    	 
    	 Thread.sleep(5000);
    	   
    	   File ExcelFile = Reuse_func.getLatestFilefromDir(EMS_TestData.downloadPath);
    		String DownloadExcelFile = ExcelFile.getName();
    		 Assert.assertTrue(DownloadExcelFile.contains("Campaign_Summary"));
    		/* if(DownloadExcelFile.contains("Campaign_Summary"))
    		 {
    			 System.out.println("Campaign Summary file downloaded Successfully");
    			 Reuse_func.resultPass("Campaign Summary Report Download", "Campaign Summary file downloaded Successfully");
    			 
    		 }
    		 else{
    			 System.out.println("Campaign Summary file downloaded unsucessfully");
    			 Reuse_func.resultFail("Campaign Summary Report Download", "Campaign Summary file downloaded unsucessfully"); 
    			
    		 } */
			}
			catch(NoSuchElementException e){
				e.getMessage();
			}
		}	
	public static void Campaign_Detail_Report_Download() throws InterruptedException{
		try{
    		 //Press the Export Campaign button
        	 ExportReport.Dashboard_CampaignExportButton.click();
        	 
        	 
        	 //Press the downloadButton naow
        	 ExportReport.Campaign_DetailReport.click();
        	 
        	 Thread.sleep(5000);
        	   
        	   File ExcelFile1 = Reuse_func.getLatestFilefromDir(EMS_TestData.downloadPath);
        		String DownloadExcelFile1 = ExcelFile1.getName();
        		 Assert.assertTrue(DownloadExcelFile1.contains("Campaign_Detail"));
        		/* if(DownloadExcelFile1.contains("Campaign_Detail")){
        			 System.out.println("Campaign Detail Report file downloaded Successfully");
        			 Reuse_func.resultPass("Campaign Detail Report Download", "Campaign Detail Report file downloaded Successfully");
        			 
        		 }
        		 else{
        			 System.out.println("Campaign Detail Report file downloaded unsucessfully");
        			 Reuse_func.resultFail("Campaign Detail Report Download", "Campaign Detail Report file downloaded unsucessfully"); 
        			
        		 } */
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	public static void Unsubscribers_Report_file_Download() throws InterruptedException{
		try{
		//Go to Campaigns and download the Unsubscribe Report For Campaigns
       ExportReport.CampaignsTab.click();
       
       Reuse_func.waitForPageLoad(getDriver(), wait, pageLoaded);
       
       Thread.sleep(1000);
       
       //Press the Unsubscribe report Button
       ExportReport.Campaign_UnsubscribeReports_Button.click();
		
       Thread.sleep(10000);
       
       File ExcelFile2 = Reuse_func.getLatestFilefromDir(EMS_TestData.downloadPath);
		String DownloadExcelFile2 = ExcelFile2.getName();
		 Assert.assertTrue(DownloadExcelFile2.contains("Unsubscribers_"));
		/* if(DownloadExcelFile2.contains("Unsubscribers_")){
			 System.out.println("Unsubscribers Report file downloaded Successfully");
			 Reuse_func.resultPass("Unsubscribers Report file Download", "Unsubscribers Report file downloaded Successfully");
			 
		 }
		 else{
			 System.out.println("Unsubscribers Report file downloaded unsucessfully");
			 Reuse_func.resultFail("Unsubscribers Report file", "Unsubscribers Report file downloaded unsucessfully"); 
			
		 } */
		
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		   e.getStackTrace();
		}
	}
	
}
