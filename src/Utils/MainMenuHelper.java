package Utils;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class MainMenuHelper {
    public static void createPrescriptionByManual(AppiumDriver appiumDrivers) {
       
        //Buat Resep Obat
        WebElement createPrescription = appiumDrivers.findElement(AppiumBy.accessibilityId("Buat Resep Obat, Input obat dan kirim ke pasien, "));
        createPrescription.click();

    }
        
    public static void createPrescriptionByPhoto(AppiumDriver appiumDriver) {
    
        //Buat Resep Pakai Foto
        WebElement createPrescription = appiumDriver.findElement(AppiumBy.accessibilityId("Foto Resep Obat, Siapkan resep original dan foto, "));
        createPrescription.click();

    }

    public static void formulariumList(AppiumDriver appiumDriver) {
        
        //Formulariom, Lihat Daftar Obat
        WebElement formulariumList = appiumDriver.findElement(AppiumBy.accessibilityId("Formularium, Lihat daftar obat yang tersedia, "));
        formulariumList.click();

    }

    public static void historyPatientList(AppiumDriver appiumDriver) {
        
        //Lihat Riwayat Pasien
        WebElement historyPatientList = appiumDriver.findElement(AppiumBy.accessibilityId("Riwayat Pasien, Baru, Lihat rekam medis dan riwayat pasien, "));
        historyPatientList.click();

    }

    public static void myAccount(AppiumDriver appiumDriver) {
    
        //Buka Profile Akun
        WebElement myAccountMenu = appiumDriver.findElement(AppiumBy.accessibilityId("Akun Saya, Lihat lokasi praktek, Kelola asisten, "));
        myAccountMenu.click();
        
    }
    
}
