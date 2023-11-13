package PopUp;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class PatientDataPopUp {

    public static void addPatient(AppiumDriver appiumDriver) {

        WebElement clickPilihDataPatient =  appiumDriver.findElement(AppiumBy.accessibilityId("Pilih Data Pasien, "));
        clickPilihDataPatient.click();   
        
    }

    public static void choosePatientDataFromLifepack(AppiumDriver appiumDriver) {

        WebElement chooseFromLifepackAccount = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Melalui Akun Lifepack, Dapatkan data pasien dengan nama pasien atau nomor telepon, \"]/android.view.ViewGroup"));
        chooseFromLifepackAccount.click();
            
    }

    public static void choosePatientDataFromInsurance(AppiumDriver appiumDriver) {

        WebElement chooseFromInsurance = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Melalui Asuransi, Dapatkan data pasien dengan input dan verifikasi no. polis, \"]/android.view.ViewGroup"));
        chooseFromInsurance.click();
        
    }
    
}
