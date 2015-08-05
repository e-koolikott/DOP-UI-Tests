package runner.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class header {
    private static FirefoxDriver driver;

    // logo
    public void logo() {
        driver.findElement(By.className("navbar-brand"));
    }

    // searchfield

    public void searchFor(String searchFor) {
        driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid")).sendKeys(searchFor);
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
    }

    // languageselection
    public void languageSelection(String setLanguage) {
        driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid"));
    }

}
