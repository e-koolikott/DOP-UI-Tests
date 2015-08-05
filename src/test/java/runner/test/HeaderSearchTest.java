package runner.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderSearchTest {

    static WebDriver driver;

    @BeforeClass
    public static void openBrowser() {
        driver = new FirefoxDriver();
    }

    @Test
    public void headerSearch() throws InterruptedException {
        GoTo goTo = new GoTo();
        Header header = new Header();
        goTo.LandingPage(driver);

        driver.get("http://oxygen.netgroupdigital.com/#/material?materialId=3918");
        driver.get("http://oxygen.netgroupdigital.com/#/material?materialId=1");
        driver.get("http://oxygen.netgroupdigital.com/#/material?materialId=2");
        driver.get("http://oxygen.netgroupdigital.com/#/material?materialId=3");
        driver.get("http://oxygen.netgroupdigital.com/#/material?materialId=4");

        header.clickLogo(driver);

        String search = "Automated";
        header.searchFor(driver, search);

        driver.quit();

    }

}
