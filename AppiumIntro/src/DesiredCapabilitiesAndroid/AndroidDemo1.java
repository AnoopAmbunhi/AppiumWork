package DesiredCapabilitiesAndroid;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidDemo1 extends baseDesired {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//baseDesired base = new baseDesired();
		AndroidDriver<AndroidElement> driver = baseDesired.AndroidCapabilities1();
		driver.findElementsByClassName("classname").get(2).click();// 0,1,2 are index
		driver.findElementByAndroidUIAutomator("attribute('value')");
		
	}

}
