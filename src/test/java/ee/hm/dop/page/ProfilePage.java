package ee.hm.dop.page;

import org.openqa.selenium.By;

import ee.hm.dop.components.AddPortfolio;
import ee.hm.dop.helpers.PageHelper;

public class ProfilePage extends Page {

    private By userName = By.xpath("//strong");
    private By otherUsersName = By.xpath("//h2[@data-ng-if='!myProfile']");

    public static ProfilePage goToMyProfilePage() {
        getDriver().get("https://oxygen.netgroupdigital.com/");
        return new ProfilePage();
    }

    public String getUserName() {
        return getDriver().findElement(userName).getText();
    }

    public String isCreatedPortfolioTitlePresent() {
        String createdPortfolioId = AddPortfolio.createdPortfoliosId();
        // By titleText = By.id("portfolio-card-" + createdPortfolioId);
        By titleText = By.xpath(
                "//md-card[@id='portfolio-card-" + createdPortfolioId + "']//h4[@data-ng-bind='portfolio.title']");

        return getDriver().findElement(titleText).getText();
    }

    public String getOtherUsersName() {
        PageHelper.waitForVisibility(otherUsersName);
        return getDriver().findElement(otherUsersName).getText();
    }
}
