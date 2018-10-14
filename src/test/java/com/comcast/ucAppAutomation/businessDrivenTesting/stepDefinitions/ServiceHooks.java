package com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.comcast.ucAppAutomation.utils.DriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;

public class ServiceHooks {
	public static Scenario scenario;
	public static RemoteWebDriver driver = null;
	public static WebDriverWait waitVar = null;
	
    @Before("@initiateDriver")
    public void initializeTest() throws MalformedURLException{
		// Code to setup initial configurations
    }
    
    @Before("@Second")
    public void secondBefore() throws MalformedURLException{
        // Code to setup initial configurations
    }
    
    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}