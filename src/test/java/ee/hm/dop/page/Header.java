package ee.hm.dop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header extends Page {

    // logo
    public void clickLogo() {
        getDriver().findElement(By.className("navbar-brand")).click();
    }

    // type in search field and execute search
    public void searchFor(String searchFor) {
        getDriver().findElement(By.xpath("//input[@placeholder='Otsi']")).sendKeys(searchFor);

        // (By.cssSelector(".form-control")).sendKeys(searchFor);
        getDriver().findElement(By.cssSelector(".btn.btn-default")).click();
    }

    // search field, checking for click (this is just for testing purpose)
    public void clickSearchField(String searchFor) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Otsi']")));
        getDriver().findElement(By.xpath("//input[@placeholder='Otsi']")).sendKeys(searchFor);

        // (By.cssSelector(".form-control")).sendKeys(searchFor);
        getDriver().findElement(By.cssSelector(".btn.btn-default")).click();
    }

    // language selection
    public void languageSelection(String setLanguage) {
        getDriver().findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid"));
    }

}