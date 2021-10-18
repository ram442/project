
package sample;


import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import sample.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class webview extends base  {
	
    @Test
	public  void ram() throws InterruptedException  {
		// TODO Auto-generated method stub
    	login();
        
		
    }
    @Test
    public void runinbackground() {
    	System.out.println(driver.isAppInstalled("io.appium.android.apis"));
		driver.runAppInBackground(Duration.ofMillis(5000));
	
    	
    	
    }
    @Test
    public void scroll() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");

    }
    @Test
    public void longpress() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		
		TouchAction t=new TouchAction(driver);
		WebElement pn=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement pnn=driver.findElementByXPath("//*[@content-desc='45']");
		
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).moveTo(element(pnn)).release().perform();
	}
    @Test
    public void activateapp() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		driver.activateApp("com.android.settings");
		Thread.sleep(5000);
		driver.activateApp("io.appium.android.apis");
		System.out.println(driver.queryAppState("io.appium.android.apis"));
		System.out.println(driver.queryAppState("io.appium.android.apis"));
    }
    	
	@Test
	public void lock() {
		((LocksDevice) driver).lockDevice();
		System.out.println(((LocksDevice) driver).isDeviceLocked());
		((LocksDevice) driver).unlockDevice();
		
	}
	
		
		
	}

	



