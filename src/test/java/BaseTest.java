import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    //    WebDriver driver;
    WebDriverWait wait;

    ThreadLocal<RemoteWebDriver> threadDriver;

    @BeforeMethod
    public void beforeMethodSetup() throws MalformedURLException {

        threadDriver = new ThreadLocal<RemoteWebDriver>();

        DesiredCapabilities dc = new DesiredCapabilities();
        switch (System.getProperty("browser")) {
            case "safari":
                dc.setBrowserName(DesiredCapabilities.safari().getBrowserName());
                break;
            case "chrome":
                dc.setBrowserName(DesiredCapabilities.chrome().getBrowserName());
                break;
            case "firefox":
                dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
                break;
            default:
                dc.setBrowserName(DesiredCapabilities.chrome().getBrowserName());
        }

        dc.setPlatform(Platform.MAC);


        threadDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc));
        wait = new WebDriverWait(getDriver(),20);
    }

    public WebDriver getDriver() {
        return threadDriver.get();
    }

//
//
//        driver = new ChromeDriver();
//        driver.get("https://deens-master.now.sh/login");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//



    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
