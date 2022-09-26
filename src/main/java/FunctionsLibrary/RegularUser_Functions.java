package FunctionsLibrary;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public interface RegularUser_Functions  {
	
public void resultPass(String sTestName, String sTestCase);

public void resultFail(String sTestName, String sTestCase);
	
public void Hover(WebElement element,WebDriver driver);
	
public String waitForElementNotVisible_Xpath (int timeOutInSeconds, WebDriver driver, String elementXPath);
	
public String waitForElementToBeClickable_Xpath(int timeOutInSeconds, WebDriver driver, String elementXPath);
	
public String waitForElementNotVisible_CSS(int timeOutInSeconds, WebDriver driver, String elementXPath);
	    
public String waitForElementToBeClickable_CSS(int timeOutInSeconds, WebDriver driver, String elementXPath);
	    
public void waitForPageLoad(WebDriver driver,WebDriverWait wait,Predicate<WebDriver> pageLoaded);
		
public  void CustomProductPageLoad(WebDriver driver,WebDriverWait wait,Predicate<WebDriver> pageLoaded);
		
public boolean isAlertPresent(WebDriver driver,WebDriverWait wait);
	   
public File getLatestFilefromDir(String dirPath);
	    
public boolean isElementDisplayed(WebElement element,WebDriver driver);
	   
public void waitForElementToBeGone(WebElement element, int timeout,WebDriver driver);
	    
public void click(WebElement element,WebDriver driver);
 
     
}



