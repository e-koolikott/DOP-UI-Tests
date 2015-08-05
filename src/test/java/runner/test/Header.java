package runner.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {

    // logo
    public void clickLogo(WebDriver driver) {
        driver.findElement(By.className("navbar-brand")).click();
    }

    // search field
    public void searchFor(WebDriver driver, String searchFor) {
        driver.findElement(By.xpath("//input[@placeholder='Otsi']")).sendKeys(searchFor);

        // (By.cssSelector(".form-control")).sendKeys(searchFor);
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
    }

    // language selection
    public void languageSelection(WebDriver driver, String setLanguage) {
        driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid"));
    }

}