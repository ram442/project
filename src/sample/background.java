package sample;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class background extends base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver <AndroidElement> driver=capabality();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
	// activate app
		driver.activateApp("com.android.settings");
		Thread.sleep(5000);
		driver.activateApp("io.appium.android.apis");
     
		
	// app state 
		System.out.println(driver.queryAppState("io.appium.android.apis"));
		System.out.println(driver.queryAppState("io.appium.android.apis"));
		
	//lock and unlock of app
		driver.lockDevice();
		System.out.println(driver.isDeviceLocked());
		driver.unlockDevice();
		
		
	}

}
