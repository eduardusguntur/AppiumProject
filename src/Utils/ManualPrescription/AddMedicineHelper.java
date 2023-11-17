package Utils.ManualPrescription;

import org.openqa.selenium.WebElement;

import Interfaces.ConsumptionTime;
import Utils.SwipeHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AddMedicineHelper {

    public static void addMedicines(AppiumDriver appiumDriver, String med, String city, Integer pickAdmRoutes, Integer pickDosages) {

        try {
            
            String[] meds = med.split(", ");
            Integer totalMedicines = meds.length; 

            //untuk looping script tambah obat (lebih dari 1)
            for (int m = 0; m < totalMedicines; m++) {

                //Tekan pilih obat
                WebElement pilihObat = appiumDriver.findElement(AppiumBy.accessibilityId("Pilih obat, "));
                pilihObat.click();

                Thread.sleep(1000);

                if (m < 1) {

                    //Buka Kota dan Pilih Kota
                    GetCityList.getCities(appiumDriver, String.valueOf(city));

                }

                Thread.sleep(1000);

                WebElement searchMedicine = appiumDriver.findElement(AppiumBy.className("android.widget.EditText"));
                searchMedicine.sendKeys(meds[m]);

                Thread.sleep(1000);

                //pastikan obat paling atas
                WebElement pickMedicine = appiumDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Pilih\"])[1]"));
                pickMedicine.click();

                //isi jumlah obat
                WebElement totalMedicine = appiumDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
                totalMedicine.sendKeys("2");

                //isi dosis 1
                WebElement dosage1 = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[1]"));
                dosage1.sendKeys("1");

                //isi dosis 2
                WebElement dosage2 = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[2]"));
                dosage2.sendKeys("2");

                //buka administration rute & Pilih Route nya
                GetAdmRouteList.getAdmRoutes(appiumDriver, Integer.valueOf(pickAdmRoutes));

                Thread.sleep(1000);

                //buka dosis & Pilih Dosis
                GetDosageList.getDosages(appiumDriver, Integer.valueOf(pickDosages));

                //pilih waktu konsumsi
                ChooseComsumptionTime.comsumptionTime(appiumDriver, ConsumptionTime.PAGI);
                ChooseComsumptionTime.comsumptionTime(appiumDriver, ConsumptionTime.SAAT_MAKAN);

                SwipeHelper.verticalSwipe(appiumDriver, "up");

                WebElement inputNotes = appiumDriver.findElement(AppiumBy.xpath("(//android.widget.EditText[@content-desc=\"TextInputDefault\"])[3]"));
                inputNotes.sendKeys("minum dengan teh hangat");

                WebElement saveMedicine = appiumDriver.findElement(AppiumBy.accessibilityId("Simpan"));
                saveMedicine.click();

                if  (m + 1 < totalMedicines) {
                    addMoreMedicine(appiumDriver);
                }

            }

        } catch (Exception e) {
            //todo: Handle exception
            e.printStackTrace();
        }
    }

    public static void addMoreMedicine(AppiumDriver appiumDriver) {
        
        //Tambah Obat lagi
        WebElement moreMedicine = appiumDriver.findElement(AppiumBy.accessibilityId("+ Tambah obat baru"));
        moreMedicine.click();
        
    }

    public static void selanjutnyaMedicine(AppiumDriver appiumDriver) {

        WebElement buttonSelanjutnyaMedicine = appiumDriver.findElement(AppiumBy.accessibilityId("Selanjutnya"));
        buttonSelanjutnyaMedicine.click();
        
    }

    

    
}
