package ee.hm.dop.components;

import org.openqa.selenium.By;

import ee.hm.dop.page.MaterialPage;

public class AddMaterialPopup extends PageComponent {

    private By linkField = By.id("add-material-url-input");
    private By firstTitleField = By
            .xpath("//input[@class='ng-pristine md-input ng-invalid ng-invalid-required ng-touched']");
    private By createMaterialButton = By.id("add-material-create-button");

    public AddMaterialPopup setLink(String linkUrl) {
        getDriver().findElement(linkField).sendKeys(linkUrl);
        return this;
    }

    public AddMaterialPopup setTitle(String title) {
        getDriver().findElement(firstTitleField).sendKeys(title);
        return this;
    }

    public MaterialPage clickAddMaterial() {
        getDriver().findElement(createMaterialButton).click();
        return new MaterialPage();

    }

}
