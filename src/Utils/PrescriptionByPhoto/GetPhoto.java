package Utils.PrescriptionByPhoto;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GetPhoto {

    public static void takePhoto(AppiumDriver appiumDriver) {

        WebElement takePhotoButton = appiumDriver.findElement(AppiumBy.accessibilityId("Take Photo..."));
        takePhotoButton.click();
        
        // Periksa apakah permission dialog ditampilkan
        if (isPermissionDialogVisible(appiumDriver)) {
            WebElement allowPermissionPhoto = appiumDriver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
            allowPermissionPhoto.click();
    }

        WebElement shutterButton = appiumDriver.findElement(AppiumBy.accessibilityId("\"Shutter\" button"));
        shutterButton.click();
        WebElement doneButton = appiumDriver.findElement(AppiumBy.id("com.oplus.camera:id/done_button"));
        doneButton.click();
        
    }

    private static boolean isPermissionDialogVisible(AppiumDriver appiumDriver) {
        try {
            WebElement permissionDialog = appiumDriver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }  
    
    public static void addMorePhotos(AppiumDriver appiumDriver) {

        WebElement addMorePhoto = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Tambah Foto\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
        addMorePhoto.click();

    }

    public static void takeMultiplePhotos(AppiumDriver appiumDriver, int photoCount ) {

        for (int p = 0; p < photoCount; p++) {
            takePhoto(appiumDriver);
            if (p + 1 < photoCount) {
                addMorePhotos(appiumDriver);
            }
        }
       
    }
}
