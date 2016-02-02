package ee.hm.dop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ee.hm.dop.SeleniumUser;
import ee.hm.dop.components.AddMaterialPopup;
import ee.hm.dop.components.AddPortfolio;
import ee.hm.dop.components.Footer;
import ee.hm.dop.components.Header;
import ee.hm.dop.helpers.PageHelper;

public abstract class Page extends SeleniumUser {

    private static final Header header = new Header();
    private static final Footer footer = new Footer();

    // private By addPortfolioButton = By.xpath("//button[@aria-label='Lisa
    // kogumik']");
    private By fabButton = By.xpath("//md-fab-trigger");
    private By addMaterialButton = By.xpath("//button[@data-ng-click='showAddMaterialDialog($event)']");

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

    public AddPortfolio clickAddPortfolio() {
        PageHelper.waitForVisibility(fabButton);
        getDriver().findElement(fabButton).click();
        return new AddPortfolio();
    }

    public Page moveCursorToFAB() {
        PageHelper.waitForVisibility(fabButton);
        Actions builder = new Actions(getDriver());
        WebElement fab = getDriver().findElement(fabButton);
        builder.moveToElement(fab).perform();
        return this;
    }

    public Page moveCursorToAddPortfolio() {
        Actions builder = new Actions(getDriver());
        WebElement addPortfolio = getDriver().findElement(fabButton);
        builder.moveToElement(addPortfolio).perform();

        return this;
    }

    public void moveCursorToAddMaterial() {
        Actions builder = new Actions(getDriver());
        WebElement addPortfolio = getDriver().findElement(addMaterialButton);
        builder.moveToElement(addPortfolio).perform();
    }

    public AddMaterialPopup clickAddMaterial() {

        moveCursorToAddPortfolio();
        moveCursorToAddMaterial();
        getDriver().findElement(addMaterialButton).click();

        return new AddMaterialPopup();
    }

}