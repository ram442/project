
package sample;


import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import java.lang.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	 public AppiumDriver<MobileElement> driver;
	
	@BeforeMethod
    public void start() throws MalformedURLException
	{
		
		File appDir=new File("src");
		File app=new File(appDir, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ramEmulator");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		
		//cap.setCapability("appPackage", "io.appium.android.apis");
		//cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("unlockType", "pin");
		cap.setCapability("unlockKey", "1111"); 
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		
		

	}
	public void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		TouchAction t=new TouchAction(driver);
		WebElement k=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		
		t.tap(tapOptions().withElement(element(k))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement pn=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(10))).release().perform();
		Thread.sleep(5000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
	}

}
