package sample;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;

public class launching extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver <AndroidElement> driver=capabality();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(5000);
		// api terminate
		//driver.terminateApp("io.appium.android.apis");
		// api install and update 
		// File appDir=new File("src");
		// File app=new File(appDir, "ApiDemos-debug.apk");
		// driver.installApp(app.getAbsolutePath(),new AndroidInstallApplicationOptions().withReplaceEnabled());
		
		// running app in background 
		
		System.out.println(driver.isAppInstalled("io.appium.android.apis"));
		driver.runAppInBackground(Duration.ofMillis(5000));
		
		
		
		//
		
		
		

	}

}
