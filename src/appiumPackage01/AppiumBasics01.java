package appiumPackage01;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBasics01 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities desCape = new DesiredCapabilities();
		
		//Set DEVICE NAME capability
		desCape.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_25");
		
		//Set APP capability
		/*desCape.setCapability(MobileCapabilityType.APP, "");
		 * Java's File class is a great way to construct the ABSTRACT path instance of the APK file. 
		 * By leveraging its .getAbsolutePath method, you can get an ABSOLUTE path based on the ABSTRACT path instance
		 */
		
		/*desCape.setCapability(MobileCapabilityType.APP,"");
		 * Form the ABSTRACT FILE PATH INSTANCE so you can obtain the ABSOLUTE PATH from it
		 * Then pass the ABSOLUTE PATH to .setCapability()
		 */
		File fileParent = new File("src");
		File fileChild = new File(fileParent, "ApiDemos.apk");
		String fileChildPath = fileChild.getAbsolutePath();
		
		desCape.setCapability(MobileCapabilityType.APP,fileChildPath);
		/*Those are the BARE MINIMUM CAPABILITIES you require in order for the SERVER to connect to the CLIENT
		 * Also set:
		 * 1. Appium version capabilities if you have more than SERVER versions on your machine
		 * 2. Set browser capabilities of using a browser based app
		 * 3. As of now, we are going to play around a NATIVE APP. So, setting browser capabilities is not necessary
		 */
		
		/*Connect to your ANDROID DRIVER (SERVER) - comparable to invoking your browser driver on Selenium
		 */
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), desCape);
		/*If this were IOS, you would do a new IOSDriver<IOSElement> and reference to AppiumDriver<IOSElement> instead because 
		 * AndroidDriver EXTENDS AppiumDriver
		 */
		
	}

}
