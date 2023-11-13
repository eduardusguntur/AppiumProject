package Utils;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AddPatient {
    public static void getPatientData(AppiumDriver appiumDriver, String helper) {

        WebElement getPatientData =  appiumDriver.findElement(AppiumBy.accessibilityId("Pilih Data Pasien, "));
        getPatientData.click();

        WebElement choosePatientData = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\""+helper+", \"]/android.view.ViewGroup"));
        choosePatientData.click();

        //WebElement chooseFromInsurance = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Melalui Asuransi, Dapatkan data pasien dengan input dan verifikasi no. polis, \"]/android.view.ViewGroup"));
        //chooseFromInsurance.click();
        
    }
    
    public static void byNamaPatient(AppiumDriver appiumDriver, String patientName, String patientDetail) {

        WebElement tabPatientName = appiumDriver.findElement(AppiumBy.accessibilityId(", Nama Pasien"));
        tabPatientName.click();

        WebElement inputPatientName = appiumDriver.findElement(AppiumBy.accessibilityId("TextInputDefault"));
        inputPatientName.sendKeys(patientName);

        //button cari
        WebElement cariPatient = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Cari\"]/android.widget.TextView"));
        cariPatient.click();

        WebElement choosePatient = appiumDriver.findElement(AppiumBy.accessibilityId(patientDetail));
        choosePatient.click();

        WebElement buttonSelanjutnyaDataPatient = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        buttonSelanjutnyaDataPatient.click();
        
    }

    public static void byPhoneNumber(AppiumDriver appiumDriver, String phoneNumber, String patientDetail) {

        WebElement tabPhoneNumber = appiumDriver.findElement(AppiumBy.accessibilityId(", Nomor Ponsel"));
        tabPhoneNumber.click();

        WebElement inputPatientNumber = appiumDriver.findElement(AppiumBy.accessibilityId("TextInputDefault"));
        inputPatientNumber.sendKeys(phoneNumber);

        WebElement cariPatient = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Cari\"]/android.widget.TextView"));
        cariPatient.click();

        WebElement choosePatient = appiumDriver.findElement(AppiumBy.accessibilityId(patientDetail));
        choosePatient.click();

        WebElement buttonSelanjutnyaDataPatient = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        buttonSelanjutnyaDataPatient.click();
        
    }

    public static void submitPatientData(AppiumDriver appiumDriver, String helper) {

        WebElement buttonSubmitDataPatient = appiumDriver.findElement(AppiumBy.accessibilityId("Submit"));
        buttonSubmitDataPatient.click();

        WebElement chooseSubmitDataPatient = appiumDriver.findElement(AppiumBy.accessibilityId(""+helper+""));
        chooseSubmitDataPatient.click();
        
    }

    public static void noBack(AppiumDriver appiumDriver) {

        WebElement noBack = appiumDriver.findElement(AppiumBy.accessibilityId("Tidak"));
        noBack.click();
        
    }
}
