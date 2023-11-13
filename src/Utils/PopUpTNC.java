package Utils;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class PopUpTNC {
    public static void popUpTNCBox(AppiumDriver appiumDriver) {

         //pop up syarat - checkbox
        WebElement checkboxSyarat = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup"));
        checkboxSyarat.click();
        
        //pop up syarat - selanjutnya
        WebElement selanjutnyaSyarat = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        selanjutnyaSyarat.click();
        
    }
    
}
