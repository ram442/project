package sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class base3 extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		//swiping 
		
		AndroidDriver <AndroidElement> driver=capabality();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		
		TouchAction t=new TouchAction(driver);
		WebElement pn=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement pnn=driver.findElementByXPath("//*[@content-desc='45']");
		
		System.out.print("fkfkfk");
		System.out.print("fkfkfk");
		System.out.print("fkfkfk");
		System.out.print("fkfkfk");
		
		
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).moveTo(element(pnn)).release().perform();
	}

}
