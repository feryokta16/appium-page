package org.example.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CatatanKeuangan {
    public AndroidDriver<MobileElement> driver;

    public CatatanKeuangan(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    private MobileElement add;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private MobileElement alow;
    @AndroidFindBy(id = "android:id/button2")
    private MobileElement tutup;


    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private MobileElement tanggal;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"23 Oktober 2023\"]")
    private MobileElement enamBelas;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    private MobileElement ok;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvName")
    private MobileElement kategori;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement pajak;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement jumlah;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.EditText")
    private MobileElement ket;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement submitKeluar;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvAmount")
    private MobileElement TotalDuid;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btnIncome")
    private MobileElement masukButton;

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private MobileElement tanggalMasuk;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"24 Oktober 2023\"]")
    private MobileElement duaEmpat;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okMasuk;

    @AndroidFindBy(id = "com.chad.financialrecord:id/llForm")
    private MobileElement kategoriMasuk;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement hibah;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.EditText")
    private MobileElement jumlahMasuk;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement ketMasuk;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement saveMasuk;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
    private MobileElement keterangan;




    //Method
    public void calcAdd() {
        delay(5);
        alow.click();
        delay(5);
        tutup.click();
        delay(5);
        add.click();
        delay(5);
        tanggal.click();
        delay(5);
        enamBelas.click();
        delay(5);
        ok.click();
        delay(5);
        kategori.click();
        delay(5);
        pajak.click();
        delay(5);
        jumlah.sendKeys("100");
        delay(5);
        ket.sendKeys("olahraga");
        submitKeluar.click();

    }

    public void asup(){
        delay(10);
        add.click();
        delay(5);
        masukButton.click();
        delay(5);
        tanggalMasuk.click();
        delay(5);
        duaEmpat.click();
        delay(5);
        okMasuk.click();
        delay(5);
        kategoriMasuk.click();
        delay(5);
        hibah.click();
        delay(5);
        jumlahMasuk.sendKeys("100");
        delay(5);
        ketMasuk.sendKeys("alhamdulillah");
        delay(5);
        saveMasuk.click();
        delay(10);



    }

    //
    public String getTxtResult() {
        return TotalDuid.getText();
    }
    public String getTxtHasil() {
        return keterangan.getText();
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
