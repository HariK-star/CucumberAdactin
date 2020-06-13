package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties P;
	
	public ConfigurationReader() throws IOException
	{
		File file=new File(".//src//test//java//com//adactin//properties//Adactin.properties");
		FileInputStream fis = new FileInputStream(file);
		//Properties p = new Properties();
		P = new Properties();
		P.load(fis);
		
		
	}
	
	public static String getBrowserName()
	{
		String browserName =P.getProperty("browsername");
	//	System.out.println(browserName);
		return browserName;
	}
public static String getUrl()
{
	String url = P.getProperty("Url");
	return url;
	//String username = P.getProperty("AppUsername");
	//String password = P.getProperty("AppPassword");
	//System.out.println(url);
	//System.out.println(username);
	//System.out.println(password);
	
}
//public static void main(String[] args) throws IOException
//{
//	ConfigurationReader cr =new ConfigurationReader();
//	getbrowserName();
//	getUrl();
//}//
}
