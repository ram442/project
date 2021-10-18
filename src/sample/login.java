package sample;


import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;

public class login extends sacredgroves {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		AndroidDriver <AndroidElement> driver=ram();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@content-desc='Login']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.EditText[@text='example@email.com']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='example@email.com']").sendKeys("ram442001@gmail.com");
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.EditText[@text='Enter your Password']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Enter your Password']").sendKeys("Shanuma@1");
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.Button[@content-desc='Login']").click();
		

	    driver.findElementByXPath("//android.widget.ImageView[@content-desc='Profile']").click();
	    AndroidElement e2=driver.findElementByXPath("//android.widget.ImageView[@content-desc='Interests']");
	    
	     
		

	}
  
    	
		
		
		
    	
    }
