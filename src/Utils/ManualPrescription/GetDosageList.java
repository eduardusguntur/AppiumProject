package Utils.ManualPrescription;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GetDosageList {
    public static void getDosages (AppiumDriver appiumDriver, Integer dosage){

        //click dropdown dosis
        WebElement clickGetDosage = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"\"])[1]/android.view.ViewGroup/android.widget.EditText"));
        clickGetDosage.click();
        
        //pilih dosis
        WebElement pickDosage = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["+dosage+"]"));
        pickDosage.click();
    
    }
}
