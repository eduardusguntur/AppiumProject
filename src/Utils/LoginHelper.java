package Utils;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginHelper {
    public static void autoLogin (AppiumDriver appiumDriver, String NomorHP){

    WebElement allowNotif = appiumDriver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
    allowNotif.click();

    WebElement buttonLoginn = appiumDriver.findElement(AppiumBy.accessibilityId("GoToLoginScreen"));
    buttonLoginn.click();

    WebElement fieldPhone = appiumDriver.findElement(AppiumBy.accessibilityId("PhoneNumberTextInput"));
    fieldPhone.sendKeys(""+NomorHP+"");

    WebElement buttonSelanjutnyaLogin = appiumDriver.findElement(AppiumBy.accessibilityId("LoginNextButton"));
    buttonSelanjutnyaLogin.click();

    //rumus untuk OTP 1234
    for (int i = 1; i <= 4; i++){
        WebElement otpBox = appiumDriver.findElement(AppiumBy.accessibilityId("OtpTextInput" + i));
        otpBox.sendKeys(String.valueOf(i));
        }
    }
}
