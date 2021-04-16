package appiumPackage01;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBasics02 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		/*Ensure the AVD is open and Appium Server has been started
		 * Set desired capabilities - device name
		 * Ensure desired APP(APK fle) is uploaded under "src" of this package
		 * Form abstract path to APP (APK file)
		 * Get absolute path to APP (APK file) 
		 * Set desired capabilities - APP
		 * Set desired capabilities - newCommandTimeout
		 * Invoke AndroidDriver - pass the Capabilities and Path to Appium Server
		 */
		
		DesiredCapabilities desCape = new DesiredCapabilities();
		desCape.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_25");
		
		File parentFile = new File("src");
		File childFile = new File(parentFile, "ApiDemos.apk");
		String childFilePath = childFile.getAbsolutePath();
		desCape.setCapability(MobileCapabilityType.APP, childFilePath);
		
		desCape.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 5);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.01:4723/wd/hub"), desCape);
	}

}
