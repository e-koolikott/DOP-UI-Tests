package ee.hm.dop.page;

import org.openqa.selenium.By;

public class SelectLanguage extends Page {

    private By estonian = By.xpath("//a[conatins(@data-ng-click, 'setLanguage('est')')]");
    private By russian = By.xpath("//a[conatins(@data-ng-click, 'setLanguage('rus')')]");
    private By english = By.xpath("//a[conatins(@data-ng-click, 'setLanguage('eng')')]");

    public void estonian() {
        getDriver().findElement(estonian).click();
    }

    public void russian() {
        getDriver().findElement(russian).click();
    }

    public void english() {
        getDriver().findElement(english).click();
    }

}
