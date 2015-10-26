package ee.hm.dop.page;

import org.openqa.selenium.By;

public class MaterialPage extends Page {

    private By linkToMaterial = By.xpath("//span[contains(@data-ng-bind, 'material.source')]");

    public String getMaterialLink() {
        return getDriver().findElement(linkToMaterial).getText();
    }

}
