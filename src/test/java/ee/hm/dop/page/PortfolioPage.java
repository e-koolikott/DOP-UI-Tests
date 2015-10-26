package ee.hm.dop.page;

import org.openqa.selenium.By;

public class PortfolioPage extends Page {

    private By portfolioSummaryLocation = By.xpath("//div[contains(@data-ng-if, 'portfolio.summary')]");

    public String getPortfolioSummary() {
        return getDriver().findElement(portfolioSummaryLocation).getText();
    }

}
