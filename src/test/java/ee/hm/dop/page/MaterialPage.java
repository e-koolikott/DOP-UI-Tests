package ee.hm.dop.page;

import org.openqa.selenium.By;

public class MaterialPage extends Page {

    private By linkToMaterial = By.xpath("//span[contains(@data-ng-bind, 'material.source')]");
    private By creatorName = By.xpath("//a[@class, 'ng-binding')]");

    public String getMaterialLink() {
        return getDriver().findElement(linkToMaterial).getText();
    }

    public String getCreatorName() {
        return getDriver().findElement(creatorName).getText();
    }

}
