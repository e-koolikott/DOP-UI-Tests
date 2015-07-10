package runner.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderSearchTest {

    @Test
    public void headerSearch() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://oxygen.netgroupdigital.com/#");
        // driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid")).sendKeys(GlobalConstants.SEARCH_IN_HEADER_FOR_Matemaatika);
        // driver.findElement(By.cssSelector(".btn.btn-default")).click();

        driver.quit();

    }

}
