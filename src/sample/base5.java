package sample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class base5 extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver <AndroidElement> driver=capabality();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		WebElement first=driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement second=driver.findElementById("io.appium.android.apis:id/drag_dot_2");
		
		TouchAction t=new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(first))).moveTo(element(second)).release().perform();

	}

}
