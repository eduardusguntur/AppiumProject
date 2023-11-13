package Utils.ManualPrescription;

import org.openqa.selenium.WebElement;

import Interfaces.Area;
import Utils.SwipeHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GetCityList {
    public static void getCities (AppiumDriver appiumDriver, String city){

        try {

        //klik dropdown kota
        WebElement pilihKota = appiumDriver.findElement(AppiumBy.accessibilityId("Pilih Kota Pasien Anda, "));
        pilihKota.click();
  
        if (Area.DEPOK.equalsIgnoreCase(city) || Area.JAKARTA_UTARA.equalsIgnoreCase(city) || Area.JAKARTA_UTARA.equalsIgnoreCase(city) || Area.BEKASI.equalsIgnoreCase(city)) {
            SwipeHelper.verticalSwipe(appiumDriver, "up");
        }

        //Thread.sleep(1000);

        //pilih kotanya mau apa
        WebElement pickCity = appiumDriver.findElement(AppiumBy.accessibilityId(city));
        pickCity.click();

        } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();    
        }
    }
}