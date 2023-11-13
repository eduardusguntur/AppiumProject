package Utils;

import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class LaunchHelper {
    public static AppiumDriver getAppiumDriver(){
    AppiumDriver appiumDriver=null;
        try {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability("platformVersion", "13");
            desiredCapabilities.setCapability("deviceName", "CPH2333");
            desiredCapabilities.setCapability("automationName", "UiAutomator2");
            //desiredCapabilities.setCapability("app", "/Users/ITMI-USER/Downloads/L4M-stag2.apk");
            desiredCapabilities.setCapability("uiautomator2ServerLaunchTimeout", 60000);
            desiredCapabilities.setCapability("newCommandTimeout", 300);
            desiredCapabilities.setCapability("appPackage", "com.itmi.eprescription.stag");
            desiredCapabilities.setCapability("appActivity", "com.itmi.eprescription.MainActivity");  

            URI serverURI = new URI("http://localhost:4723/");
            URL appiumserver = serverURI.toURL();

            appiumDriver = new AppiumDriver(appiumserver, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            
        }
        return appiumDriver;
    }
}
