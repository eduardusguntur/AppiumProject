package Utils.ManualPrescription;

import org.openqa.selenium.WebElement;

import Utils.SwipeHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GetAdmRouteList {
    public static void getAdmRoutes (AppiumDriver appiumDriver, Integer route){
         
        try {
            
        //pilih Administrasi Rute
        WebElement AdmRouteList = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"\"])[2]/android.view.ViewGroup/android.widget.EditText"));
        AdmRouteList.click();

        SwipeHelper.verticalSwipe(appiumDriver, "down");

        Thread.sleep(1000);
    
        if (route > 10) {
            SwipeHelper.verticalSwipe(appiumDriver, "up");
        }

        Thread.sleep(1000);

        WebElement pickAdmRoute = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["+route+"]"));
        pickAdmRoute.click();  

    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();    
        }
    }
}