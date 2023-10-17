import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.example.pages.CatatanKeuangan;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCatatanKeuanganTest {
    private static AndroidDriver<MobileElement> driver;
    private CatatanKeuangan catatanKeuangan;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_2_API_25");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.chad.financialrecord");
        capabilities.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @BeforeMethod
    public void pageObject() {
        catatanKeuangan = new CatatanKeuangan(driver);
    }
    @Test
    public void testAdd() {
        catatanKeuangan.calcAdd();
        System.out.println("Hasil Test 1 = "+catatanKeuangan.getTxtResult());
        Assert.assertEquals(catatanKeuangan.getTxtResult(), "100");
    }
    @Test
    public void testasup() {
        catatanKeuangan.asup();
        System.out.println("Hasil Test 2 = "+catatanKeuangan.getTxtHasil());
        Assert.assertEquals(catatanKeuangan.getTxtHasil(),"alhamdulillah");
    }


}
