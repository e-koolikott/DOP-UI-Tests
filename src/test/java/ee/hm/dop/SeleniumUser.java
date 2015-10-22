package ee.hm.dop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class SeleniumUser {

    private static WebDriver driver;

    protected static WebDriver getDriver() {
        initDriver();

        return driver;
    }

    // initiates driver
    private static void initDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    if (driver != null) {
                        driver.quit();
                    }
                }
            });
        }
    }

}
