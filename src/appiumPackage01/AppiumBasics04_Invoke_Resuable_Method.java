package appiumPackage01;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumBasics04_Invoke_Resuable_Method extends AppiumBasics03_Reusable_Method {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		/*Call the Capabilities() defined in class AppiumBasics03_Reusable_Method
		 *- This class AppiumBasics04_Invoke_Resuable_Method EXTENDS AppiumBasics03_Reusable_Method
		 * and therefore INHERITS the class members of AppiumBasics03_Reusable_Method
		 * -If you weren't EXTENDING, you'd instantiate AppiumBasics03_Reusable_Method instead to invoke
		 * Capabilities()
		 * -If you want to avoid instantiation and do a no-frills call the method Capabilities() from
		 * main(), then in your method definition, insert the STATIC keyword
		 */
		AppiumBasics04_Invoke_Resuable_Method thisClass = new AppiumBasics04_Invoke_Resuable_Method();
		AndroidDriver<AndroidElement> driver = thisClass.Capabilities();

	}

}
