package FunctionsLibrary;


import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.google.common.base.Predicate;

import Master.EMS_Execution;

public class Reuse_Functions extends EMS_Execution implements RegularUser_Functions {

	public static int timeOutInSeconds; 
	public static WebDriver driver; 
	public static String elementXPath;
	
	
	           //@Override
				public void waitForPageLoad(WebDriver driver, WebDriverWait wait, Predicate<WebDriver> pageLoaded) {
					 wait = new WebDriverWait(driver, 400);
				       
					   //pageLoaded = new Predicate<WebDriver>() {

//					        public boolean apply(WebDriver input) {
//					            return ((JavascriptExecutor) input).executeScript("return document.readyState").toString().equals("complete");
//					        }

					    //};
					   
					   
					   System.out.println("Page Loaded Successfully");
					   
					   try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					   
					   if( driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div")).isDisplayed()){
						   waitForPageLoad(driver, wait, pageLoaded);
					   }

					
				}
				

				public void waitForElementToBeGone(WebElement element, int timeout, WebDriver driver) {
					if (isElementDisplayed(element,driver)) {
				        new WebDriverWait(driver, timeout).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
				    }
					
				}
				

				public String waitForElementToBeClickable_Xpath(int timeOutInSeconds, WebDriver driver, String elementXPath) {
					if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

				        return "Wrong usage of WaitforElementNotVisible()";
				    }
				    try {
				        (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.elementToBeClickable(By
				                .xpath(elementXPath)));
				        return null;
				    } catch (TimeoutException e) {
				        return "Build your own errormessage...";
				    }
				}
				

				public String waitForElementToBeClickable_CSS(int timeOutInSeconds, WebDriver driver, String elementXPath) {
					if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

				        return "Wrong usage of WaitforElementNotVisible()";
				    }
				    try {
				        (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.elementToBeClickable(By
				                .cssSelector(elementXPath)));
				        return null;
				    } catch (TimeoutException e) {
				        return "Build your own errormessage...";
				    }
				}
				

				public String waitForElementNotVisible_Xpath(int timeOutInSeconds, WebDriver driver, String elementXPath) {
					if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

				        return "Wrong usage of WaitforElementNotVisible()";
				    }
				    try {
				        (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.invisibilityOfElementLocated(By
				                .xpath(elementXPath)));
				        return null;
				    } catch (TimeoutException e) {
				        return "Build your own errormessage...";
				    }
				}
				

				public String waitForElementNotVisible_CSS(int timeOutInSeconds, WebDriver driver, String elementXPath) {
					if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

				        return "Wrong usage of WaitforElementNotVisible()";
				    }
				    try {
				        (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.invisibilityOfElementLocated(By
				                .cssSelector(elementXPath)));
				        return null;
				    } catch (TimeoutException e) {
				        return "Build your own errormessage...";
				    }
				}
				

				public void resultPass(String sTestName, String sTestCase) {
					try{
					  setTest(getExtent().createTest(sTestName));
					   
					  getTest().log(Status.PASS,sTestCase) ;
					  
					  getExtent().flush();
					
					 } catch (Exception e)
			{
					 e.printStackTrace();   
			}
					
				}
				

				public void resultFail(String sTestName, String sTestCase) {
					try {
						setTest(getExtent().createTest(sTestName));
						
						getTest().log(Status.FAIL, sTestCase);
						
						 getExtent().flush();
					
				 } catch (Exception e)
			{
					 e.printStackTrace();		 
			}    
					
				}
				

				public boolean isElementDisplayed(WebElement element, WebDriver driver) {
					try {
				        WebDriverWait wait = new WebDriverWait(driver, 1);
				        wait.until(ExpectedConditions.visibilityOf(element));
				        return element.isDisplayed();
				    } catch (org.openqa.selenium.NoSuchElementException
				            | org.openqa.selenium.StaleElementReferenceException
				            | org.openqa.selenium.TimeoutException e) {
				        return false;
				    }
				}
				

				public boolean isAlertPresent(WebDriver driver, WebDriverWait wait) {
					 boolean foundAlert = false;
					    wait = new WebDriverWait(driver, 13 /*timeout in seconds*/);
					    try {
					        wait.until(ExpectedConditions.alertIsPresent());
					        foundAlert = true;
					        System.out.println("Alert Displayed");
					        Alert alert=driver.switchTo().alert();
					        alert.accept();
					    } catch (TimeoutException eTO) {
					        foundAlert = false;
					        System.out.println("Alert Not Displayed");
					    }
					    return foundAlert;
				}
				

				public File getLatestFilefromDir(String dirPath) {
					File dir = new File(dirPath);
				    File[] files = dir.listFiles();
				    if (files == null || files.length == 0) {
				        return null;
				    }

				    File lastModifiedFile = files[0];
				    for (int i = 1; i < files.length; i++) {
				       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				           lastModifiedFile = files[i];
				       }
				    }
				    return lastModifiedFile;
				}
				

				public void click(WebElement element, WebDriver driver) {
					try 
				      {
				          String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
				          ((JavascriptExecutor) driver).executeScript(mouseOverScript,element);
				          try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				         


				     } catch (NoSuchElementException e) {
				         // TODO: handle exception
				    	 e.getStackTrace();
				     }
				 }
					
				
				

				public void Hover(WebElement element, WebDriver driver) {
					Actions action = new Actions(driver);
					action.moveToElement(element).build().perform();
					
				}


				public void CustomProductPageLoad(WebDriver driver, WebDriverWait wait, Predicate<WebDriver> pageLoaded) {
					 wait = new WebDriverWait(driver, 300);

//					   pageLoaded = new Predicate<WebDriver>() {
//
//					        public boolean apply(WebDriver input) {
//					            return ((JavascriptExecutor) input).executeScript("return document.readyState").toString().equals("complete");
//					        }
//
//					    };
//
					   
					   System.out.println("Page Loaded Successfully");
					   
					   try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					   
					   if( driver.findElement(By.xpath("//div[contains(@class,'block-ui-message ng-binding')]")).isDisplayed()){
						   waitForPageLoad(driver, wait, pageLoaded);
					   }

					
				}
			
			  
		}
		
		
	
