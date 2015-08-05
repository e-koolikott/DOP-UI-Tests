package runner.test;

import org.openqa.selenium.WebDriver;

public class GoTo {

    // Contains all movements that go to a generic page. Going to specific
    // material etc. should be handled by the test.
    public void LandingPage(WebDriver driver) {
        driver.get("http://oxygen.netgroupdigital.com/");
    }

}
