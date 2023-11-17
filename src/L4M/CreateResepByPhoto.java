package L4M;

import org.openqa.selenium.WebElement;

import Interfaces.Area;
import Interfaces.StringHelper;
import Utils.AddPatient;
import Utils.LaunchHelper;
import Utils.LoginHelper;
import Utils.MainMenuHelper;
import Utils.PopUpTNC;
import Utils.SwipeHelper;
import Utils.ManualPrescription.GetCityList;
import Utils.PrescriptionByPhoto.GetPhoto;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class CreateResepByPhoto {
    public static void main(String[] args) {

        AppiumDriver appiumDriver = LaunchHelper.getAppiumDriver();

        LoginHelper.autoLogin(appiumDriver, "81389143707");

        MainMenuHelper.createPrescriptionByPhoto(appiumDriver);

        PopUpTNC.popUpTNCBox(appiumDriver);

        GetPhoto.takeMultiplePhotos(appiumDriver, 3);

        //WebElement chooseFromLibrary = appiumDriver.findElement(AppiumBy.accessibilityId("Choose from Library..."));
        //chooseFromLibrary.click();

        //WebElement pickPhoto = appiumDriver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Photo taken on Nov 10, 2023, 1:33:01 PM\"]/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView"));
        //pickPhoto.click();

        WebElement buttonSelanjutnyaPilihPhoto = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        buttonSelanjutnyaPilihPhoto.click();

        WebElement buttonSelanjutnnyaKonsultasi = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        buttonSelanjutnnyaKonsultasi.click();

        AddPatient.getPatientData(appiumDriver, StringHelper.LIFEPACK);
        AddPatient.byPhoneNumber(appiumDriver, "085281915958", "Eduardus Guntur, Partner : PT. ITMI TESTING aja");
        
        //WebElement buttonSelanjutnyaDataPatient = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        //buttonSelanjutnyaDataPatient.click();

        //WebElement el5 = (WebElement) driver.findElementByAccessibilityId("Pilih Data Pasien, ");
        //el5.click();
        //WebElement el6 = (WebElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Melalui Akun Lifepack, Dapatkan data pasien dengan nama pasien atau nomor telepon, \"]/android.view.ViewGroup");
        //el6.click();
        //WebElement el7 = (WebElement) driver.findElementByAccessibilityId("Submit");
        //el7.click();
        
        GetCityList.getCities(appiumDriver, Area.JAKARTA_SELATAN);

        //WebElement el8 = (WebElement) driver.findElementByAccessibilityId("Pilih Kota Pasien Anda, ");
        //el8.click();
        //WebElement el9 = (WebElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Jakarta Selatan\"]/android.view.ViewGroup");
        //el9.click();

        SwipeHelper.verticalSwipe(appiumDriver, "down");

        WebElement buttonSubmitDataPatient = appiumDriver.findElement(AppiumBy.accessibilityId("Submit"));
        buttonSubmitDataPatient.click();

        WebElement isiRekamMedis = appiumDriver.findElement(AppiumBy.accessibilityId("Lanjutkan isi Rekam Medis"));
        isiRekamMedis.click();

        
    }
    
}
