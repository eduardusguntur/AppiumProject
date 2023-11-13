package Utils.ManualPrescription;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GetConsultation {

    public static void pickConsultations(AppiumDriver appiumDriver, Integer consultation) {

        if (consultation != null) {

        WebElement pickConsultation1 = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Pilih\"])["+consultation+"]/android.widget.TextView"));
        pickConsultation1.click();
        } 
        else {
            WebElement pickConsultation2 = appiumDriver.findElement(AppiumBy.accessibilityId("Dipilih"));
            pickConsultation2.click();
            }

        WebElement doneConsultation = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        doneConsultation.click();
    
    }

    
}
