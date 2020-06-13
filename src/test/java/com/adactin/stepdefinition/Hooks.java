package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactinpages.Baseclass;

import cucumber.api.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass {
	
	@Before
	public void beforeHooks(Scenario scenario)
	{
		System.out.println(scenario.getName());
	}
    @After
    public void afterHooks(Scenario scenario) throws IOException
    {
    	System.out.println("    Status:"+scenario.getStatus());
    	if(scenario.isFailed())
    	{
    		getScreenshot(scenario.getId());
    	}
    }
}
