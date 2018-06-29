package DesiredCapabilitiesAndroid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class baseDesired {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		// Gives the key value pairs to server using JSON wire protocol
		DesiredCapabilities desire = new DesiredCapabilities();
		desire.setCapability("deviceName", "Android device");
		desire.setCapability("appPackage", "io.appium.android.apis");
		desire.setCapability("fullReset", false);
		desire.setCapability("noReset", false);
		desire.setCapability("autoAcceptAlerts", true);
		desire.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		// desire.setCapability("APP", "APPPATH");
		//Android Element - Its an interface which supports Appium methods
		AndroidDriver<AndroidElement> And = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), desire); // driver object to
																								// handle Android OS

	}

}
