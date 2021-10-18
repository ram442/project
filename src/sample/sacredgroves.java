package sample;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class sacredgroves {
	
	
	
	public static AndroidDriver<AndroidElement> ram() throws MalformedURLException
	{
		// TODO Auto-generated method stub
		File appDir=new File("src");
		File app=new File(appDir, "base.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ram1");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
		
		

	}
}
 