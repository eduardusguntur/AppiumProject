package Utils.ManualPrescription;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SubmitPatientData {

    public static void doneSubmitPrescription(AppiumDriver appiumDriver, String helper) {

        WebElement doneCreatePrescription = appiumDriver.findElement(AppiumBy.accessibilityId("Selesai"));
        doneCreatePrescription.click();
        
        WebElement chooseAction = appiumDriver.findElement(AppiumBy.xpath(""+helper+""));
        chooseAction.click();
        
    }


    
}
