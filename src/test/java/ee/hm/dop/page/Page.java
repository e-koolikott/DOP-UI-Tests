package ee.hm.dop.page;

import org.openqa.selenium.By;

import ee.hm.dop.SeleniumUser;
import ee.hm.dop.components.AddPortfolio;
import ee.hm.dop.components.Footer;
import ee.hm.dop.components.Header;

public abstract class Page extends SeleniumUser {

    private static final Header header = new Header();
    private static final Footer footer = new Footer();

    private By addPortfolioButton = By.xpath("//button[contains(@ng-click,'ShowAddPortfolioDialog')]");

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

    public AddPortfolio clickAddPortfolio() {
        getDriver().findElement(addPortfolioButton).click();
        return new AddPortfolio();
    }

}