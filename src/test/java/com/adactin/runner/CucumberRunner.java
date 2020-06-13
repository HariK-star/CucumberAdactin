package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.adactin.utility.ConfigurationReader;
import com.adactinpages.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",
							glue="com\\adactin\\stepdefinition",
							//tags= {"@Login"},
							monochrome = true,
							dryRun=false,
							strict=true,
							plugin= {"pretty","html:Report\\CucumberReport","com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"})
											

public class CucumberRunner extends Baseclass  {

	
	public static WebDriver driver;
	
@BeforeClass
	public static void browerOpen() throws IOException
	{
		ConfigurationReader con=new ConfigurationReader();
		String getbrowser = con.getBrowserName();
		driver = browserLaunch(getbrowser);
	}
	
	@AfterClass
	public static void browserclose()
	{
		driver.close();
	}
		
	
}
