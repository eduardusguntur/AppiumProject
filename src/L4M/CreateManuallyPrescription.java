package L4M;

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
import Utils.ManualPrescription.DonePrescription;
import Utils.ManualPrescription.GetConsultation;
import io.appium.java_client.AppiumDriver;

public class CreateManuallyPrescription {
    public static void main(String[] args) {

        AppiumDriver appiumDriver = LaunchHelper.getAppiumDriver();

        LoginHelper.autoLogin(appiumDriver, "81389143707");

        MainMenuHelper.createPrescriptionByManual(appiumDriver);

        PopUpTNC.popUpTNCBox(appiumDriver);

        AddMedicineHelper.addMedicines(appiumDriver, Medicine.ABILIFY,  Area.JAKARTA_SELATAN, AdministrationRoutes.ORAL, Dosages.TABLET);

        AddMedicineHelper.selanjutnyaMedicine(appiumDriver);

        //null untuk pilih default, isi consultation.(int) untuk pilih konsultasi
        GetConsultation.pickConsultations(appiumDriver, null);

        AddPatient.getPatientData(appiumDriver, StringHelper.LIFEPACK);
        AddPatient.byPhoneNumber(appiumDriver, "085281915958", "Eduardus Guntur, Partner : PT. ITMI TESTING aja");
        AddPatient.submitPatientData(appiumDriver, StringHelper.YES_NEXT);

        DonePrescription.doneSubmitPrescription(appiumDriver, StringHelper.BACK_TO_HOME);
    }
    
}
