package com.adactinpages;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	 public static WebDriver driver;
		
		public static WebDriver browserLaunch(String browsername)
		{
			if(browsername.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\KANNADHASAN\\workspace\\selenium project\\driver1\\chromedriver.exe");
				driver = new ChromeDriver();
			}else
			{
				System.out.println("invalid browsername");
			}
			return driver;
		}
		
	public static void driver() 
		
	 {
		driver.manage().window().maximize();
	 }
	// To get the URL//
public static void getUrl(String Url) {
	driver.get(Url);
}
//Waiting for next action//
public static void implicitwait() {
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
}
//close the application//

public static void Closeapplication() {
	driver.close();
}
//taking screenshot//

public static void capturescreenshot(WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	File desfile = new File("C:\\Users\\KANNADHASAN\\workspace\\selenium project\\screenshots\\test.png");
	FileUtils.copyFile(srcfile, desfile);
	
}

public static void getScreenshot(String filename) throws IOException
{
	try {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\Screenshots\\" +filename+" .png");
		FileUtils.copyFile(source, destination);
	} catch (WebDriverException e) {
		e.printStackTrace();
	}
}
//Common method to click on any element//

public static void clickonWebElement(WebElement element) {
	try {
		waitforElementVisiblity(element);
		if(elementIsDisplayed(element)){
			element.click();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
} 
public static boolean elementIsEnabled(WebElement element) {
	try {
		boolean enabled = element.isEnabled();
		return enabled;
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}
}
public static void waitforElementVisiblity(WebElement element) {
	try {
		WebDriverWait wb = new WebDriverWait(driver, 60);
		wb.until(ExpectedConditions.visibilityOf(element));
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
public static void inputValuestoWebelement(WebElement element, String value) {
	try {
		waitforElementVisiblity(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element))
		
		{
			element.sendKeys(value);
		}
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}
	
}

public static boolean elementIsDisplayed(WebElement element) {
	try {
		boolean displayed = element.isDisplayed();
		return displayed;
	} catch ( Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}
	
}

public static void selectDropDownOption(WebElement element , String option , String value) {
	try {
		waitforElementVisiblity(element);
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			
		}else if (option.equalsIgnoreCase("visibletext")) {
			s.deselectByVisibleText(value);
			
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
			
		
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
}
	
public static void ConfirmAlert(WebElement element,String condition) {
	try {
		waitforElementVisiblity(element);
		Alert ConfirmAlert = driver.switchTo().alert();
		 if (condition.equalsIgnoreCase("accept")) {
			 ConfirmAlert.accept();
			 driver.switchTo().defaultContent();
			
		}else if (condition.equalsIgnoreCase("dismiss")) {
			ConfirmAlert.dismiss();
			driver.switchTo().defaultContent();
		}
	} catch ( Exception e) {
		e.printStackTrace();
	}
	
}
public static void switchToFrameUsingId(String option, WebElement element) {
	try {
		if(option.equals("element")){
			driver.switchTo().frame(element);
		}
			
		}
		catch ( Exception e) {
		e.printStackTrace();
	}
	
}

public static void switchToFrameUsingName(String option, String framename) {
try {
	if (option.equals("name")) {
		driver.switchTo().frame(framename);
	}
} catch ( Exception e) {
	e.printStackTrace();
}

}

public static void switchToFrameUsingElement(String option, WebElement element) {
try {
	if (option.equals("element")) {
		driver.switchTo().frame(element);
	}
} catch ( Exception e) {
	e.printStackTrace();
}
}

public static void mouseHoverToElement(WebElement element)
{
	try {
	waitforElementVisiblity(element);
	Actions ac = new Actions(driver);
	ac.moveToElement(element).build().perform();
} catch (Exception e) {
	e.printStackTrace();
}
	}


public static void SearchFunctionality(WebElement element) {
	try {
		waitforElementVisiblity(element);
		Actions ac = new Actions(driver);
		ac.perform();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	
}
public static void ScrollDown(WebDriver driver) {
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("window.scrollby(0,2000)", "");
	
}
}
