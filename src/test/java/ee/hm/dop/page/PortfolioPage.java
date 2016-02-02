package ee.hm.dop.page;

import org.openqa.selenium.By;

import ee.hm.dop.helpers.PageHelper;

public class PortfolioPage extends Page {

    private By portfolioSummaryLocation = By.xpath("//div/div/p[contains(@class, 'md-body-1 ng-binding')]");
    private By portfolioTableOfContents = By.xpath("//span[@data-translate='TABLE_OF_CONTENTS']");

    public String getPortfolioSummary() {
        PageHelper.waitForVisibility(portfolioTableOfContents);
        return getDriver().findElement(portfolioSummaryLocation).getText();
    }

}
