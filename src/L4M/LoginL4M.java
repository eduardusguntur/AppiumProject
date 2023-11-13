package L4M;

import org.openqa.selenium.WebElement;

import Utils.LaunchHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginL4M {
    public static void main(String[] args) {
        
    
    AppiumDriver appiumDriver = LaunchHelper.getAppiumDriver();

    WebElement allowNotif = appiumDriver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
    allowNotif.click();

    WebElement buttonLoginn = appiumDriver.findElement(AppiumBy.accessibilityId("GoToLoginScreen"));
    buttonLoginn.click();

    WebElement fieldPhone = appiumDriver.findElement(AppiumBy.accessibilityId("PhoneNumberTextInput"));
    fieldPhone.sendKeys("81389143707");

    WebElement buttonSelanjutnyaLogin = appiumDriver.findElement(AppiumBy.accessibilityId("LoginNextButton"));
    buttonSelanjutnyaLogin.click();

    //rumus untuk OTP 1234
    for (int i = 1; i <= 4; i++){
        WebElement otpBox = appiumDriver.findElement(AppiumBy.accessibilityId("OtpTextInput" + i));
        otpBox.sendKeys(String.valueOf(i));
    }
    
    WebElement createResep = appiumDriver.findElement(AppiumBy.accessibilityId("Buat Resep Obat, Input obat dan kirim ke pasien, "));
    createResep.click();

    WebElement checkboxSyarat = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup"));
    checkboxSyarat.click();
    
    WebElement selanjutnyaSyarat = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
    selanjutnyaSyarat.click();

    WebElement pilihObat = appiumDriver.findElement(AppiumBy.accessibilityId("Pilih obat, "));
    pilihObat.click();
    
    WebElement pilihKota = appiumDriver.findElement(AppiumBy.accessibilityId("Pilih Kota Pasien Anda, "));
    pilihKota.click();
    
    WebElement jakartaPusat = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Jakarta Pusat\"]/android.view.ViewGroup"));
    jakartaPusat.click();
    
    WebElement searchObat = appiumDriver.findElement(AppiumBy.className("android.widget.EditText"));
    searchObat.sendKeys("nalgestan");
    
    WebElement nalgestanObat = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Pilih\"])[1]"));
    nalgestanObat.click();

    WebElement jumlahObat = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
    jumlahObat.sendKeys("10");

    WebElement dosis1 = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[1]"));
    dosis1.sendKeys("1");

    WebElement dosis2 = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[2]"));
    dosis2.sendKeys("2");

    WebElement pilihDosis = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"\"])[1]/android.view.ViewGroup/android.widget.EditText"));
    pilihDosis.click();

    WebElement pilihDosisTablet = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
    pilihDosisTablet.click();
    
    WebElement pagi = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.CheckBox/android.view.ViewGroup/android.widget.TextView"));
    pagi.click();
    
    WebElement sebelumMakan = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup"));
    sebelumMakan.click();
    
    WebElement buttonSimpan = appiumDriver.findElement(AppiumBy.accessibilityId("Simpan"));
    buttonSimpan.click();
    
    WebElement buttonSelanjutnyaResep = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
    buttonSelanjutnyaResep.click();
    
    WebElement buttonSelanjutnyaKonsultasi = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
    buttonSelanjutnyaKonsultasi.click();
    
    WebElement pilihDataPasien = appiumDriver.findElement(AppiumBy.accessibilityId("Pilih Data Pasien, "));
    pilihDataPasien.click();
    
    WebElement melaluiNomorTelephone = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Melalui Nomor Ponsel, dapatkan data pasien dengan \nmemasukan nomor Ponsel pasien, \"]/android.view.ViewGroup"));
    melaluiNomorTelephone.click();
    
    WebElement inputNomorTelephone = appiumDriver.findElement(AppiumBy.accessibilityId("TextInputDefault"));
    inputNomorTelephone.sendKeys("08988780605");
    
    WebElement verifikasiButton = appiumDriver.findElement(AppiumBy.accessibilityId("Verifikasi"));
    verifikasiButton.click();
    
    WebElement namaPasien1 = appiumDriver.findElement(AppiumBy.accessibilityId("edo dua stag dua"));
    namaPasien1.click();
    
    WebElement buttonSelanjutnyaDataPasien = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
    buttonSelanjutnyaDataPasien.click();
    
    WebElement buttonSelanjutnyaProfilPasien = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
    buttonSelanjutnyaProfilPasien.click();
    
    WebElement buttonYaLanjut = appiumDriver.findElement(AppiumBy.accessibilityId("Ya, Lanjut"));
    buttonYaLanjut.click();
    
    WebElement buttonSubmit = appiumDriver.findElement(AppiumBy.accessibilityId("Submit"));
    buttonSubmit.click();
    
    WebElement kembaliKeBeranda = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup"));
    kembaliKeBeranda.click();
    
}
}
