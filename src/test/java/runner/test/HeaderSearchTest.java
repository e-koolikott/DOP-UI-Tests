package runner.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderSearchTest {
    public static FirefoxDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new FirefoxDriver();
    }

    @Test
    public void headerSearch() {

        driver.get("http://oxygen.netgroupdigital.com/#");

        // driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid")).sendKeys(GlobalConstants.SEARCH_IN_HEADER_FOR_Matemaatika);
        // driver.findElement(By.cssSelector(".btn.btn-default")).click();

        driver.quit();

    }

}
