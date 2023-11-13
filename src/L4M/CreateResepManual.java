package L4M;

import org.openqa.selenium.WebElement;

import Interfaces.AdministrationRoutes;
import Interfaces.Area;
import Interfaces.Dosages;
import Interfaces.Medicine;
import Interfaces.StringHelper;
import Utils.AddPatient;
import Utils.LaunchHelper;
import Utils.LoginHelper;
import Utils.MainMenuHelper;
import Utils.PopUpTNC;
import Utils.ManualPrescription.AddMedicineHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class CreateResepManual {
    public static void main(String[] args) {

        //memulai driver
        AppiumDriver appiumDriver = LaunchHelper.getAppiumDriver();

        //otomasisasi login setelah otp
        LoginHelper.autoLogin(appiumDriver, "81389143707");

        MainMenuHelper.createPrescriptionByManual(appiumDriver);
        
        //pilih klik buat resep baru
        //WebElement createResep = appiumDriver.findElement(AppiumBy.accessibilityId("Buat Resep Obat, Input obat dan kirim ke pasien, "));
        //createResep.click();

        PopUpTNC.popUpTNCBox(appiumDriver);

        //pop up syarat - checkbox
        //WebElement checkboxSyarat = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup"));
        //checkboxSyarat.click();
        
        //pop up syarat - selanjutnya
        //WebElement selanjutnyaSyarat = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        //selanjutnyaSyarat.click();

        AddMedicineHelper.addMedicines(appiumDriver, Medicine.ABILIFY+", "+Medicine.LAPICEF+", "+Medicine.IMBOOST,  Area.BEKASI, AdministrationRoutes.VAGINAL, Dosages.TABLET);

        //dropdown pilih obat
        //WebElement pilihObat = appiumDriver.findElement(AppiumBy.accessibilityId("Pilih obat, "));
        //pilihObat.click();
        
        //buka dropdown list kota
        //GetCityList.getCities(appiumDriver);

        //pilih kotanya
        //GetCityList.pickCity(appiumDriver, Area.JAKARTA_SELATAN);
        
        //WebElement pilihKota = appiumDriver.findElement(AppiumBy.accessibilityId("Pilih Kota Pasien Anda, "));
        //pilihKota.click();
        
        //WebElement jakartaPusat = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Jakarta Pusat\"]/android.view.ViewGroup"));
        //jakartaPusat.click();
        
        //isi form nama obat
        //WebElement searchObat = appiumDriver.findElement(AppiumBy.className("android.widget.EditText"));
        //searchObat.sendKeys("nalgestan");
        
        //klik pilih pada obat tsb
        //WebElement nalgestanObat = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Pilih\"])[1]"));
        //nalgestanObat.click();

        //isi jumlah obat
        //WebElement jumlahObat = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
        //jumlahObat.sendKeys("2");

        //isi dosis 1
        //WebElement dosis1 = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[1]"));
        //dosis1.sendKeys("1");

        //isi dosis 2
        //WebElement dosis2 = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[2]"));
        //dosis2.sendKeys("2");

        //buka administration rute
        //GetAdmRouteList.getAdmRoutes(appiumDriver);

        //pilih administration rute nya
        //GetAdmRouteList.getAdmRoutesList(appiumDriver, AdministrationRoutes.ORAL);

        //buka dosis
        //GetDosageList.getDosages(appiumDriver);

        //pilih dosis
        //GetDosageList.pickDosage(appiumDriver, Dosages.TABLET);
       
        //WebElement pilihDosis = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"\"])[1]/android.view.ViewGroup/android.widget.EditText"));
        //pilihDosis.click();

        //WebElement pilihDosisTablet = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
        //pilihDosisTablet.click();
        

        //pilih waktu konsumsi
        //ChooseComsumptionTime.comsumptionTime(appiumDriver, ConsumptionTime.PAGI);
        //ChooseComsumptionTime.comsumptionTime(appiumDriver, ConsumptionTime.SAAT_MAKAN);

        //pilih waktu konsumsi
        //WebElement pagi = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.CheckBox/android.view.ViewGroup/android.widget.TextView"));
        //pagi.click();
        
        //pilih waktu konsumsi
        //WebElement sebelumMakan = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup"));
        //sebelumMakan.click();

        //Catatan Pasien
        //WebElement inputCatatan = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[3]"));
        //inputCatatan.sendKeys("minum dengan teh hangat");
        
        //WebElement buttonSimpan = appiumDriver.findElement(AppiumBy.accessibilityId("Simpan"));
        //buttonSimpan.click();
        
        AddMedicineHelper.selanjutnyaMedicine(appiumDriver);

        //WebElement buttonSelanjutnyaResep = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        //buttonSelanjutnyaResep.click();
        
        //WebElement buttonSelanjutnyaKonsultasi = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        //buttonSelanjutnyaKonsultasi.click();
        
        WebElement pilihKonsultasi = appiumDriver.findElement(AppiumBy.accessibilityId("Dipilih"));
        pilihKonsultasi.click();
        WebElement selanjutnyaKonsultasi = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        selanjutnyaKonsultasi.click();

        AddPatient.getPatientData(appiumDriver, StringHelper.LIFEPACK);

        //AddPatient.choosePatientDataFromLifepack(appiumDriver);

        //cari pasien pakai nama
        //AddPasien.byNamaPatient(appiumDriver, "eduardus", "Eduardus Guntur, 0852-8191-5959 - PT. ITMI TESTING aja");

        //cari pasien pakai nomor telephone
        AddPatient.byPhoneNumber(appiumDriver, "085281915958", "Eduardus Guntur, Partner : PT. ITMI TESTING aja");
        
        AddPatient.submitPatientData(appiumDriver, StringHelper.YES_NEXT);

        //AddPatient.yesNext(appiumDriver);
        
        WebElement doneCreatePrescription = appiumDriver.findElement(AppiumBy.accessibilityId("Selesai"));
        doneCreatePrescription.click();
        
        //WebElement kembaliKeBeranda = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup"));
        //kembaliKeBeranda.click();
    }
    
}
