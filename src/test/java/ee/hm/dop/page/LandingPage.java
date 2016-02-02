package ee.hm.dop.page;

import org.openqa.selenium.By;

import ee.hm.dop.helpers.PageHelper;

public class LandingPage extends Page {

    private static String landingPage = "https://oxygen.netgroupdigital.com/#/";
    private By aboutLink = By.xpath("//a[contains(@data-translate, 'ABOUT_PAGE_LINK_TITLE')]");
    private By helpLink = By.xpath("//a[contains(@data-translate, 'HELP_PAGE_LINK_TITLE')]");
    private By uusimadTitle = By.xpath("//h1[contains(@data-translate, 'LANDING_PAGE_TITLE_NEWEST')]");
    private By howToUse = By.xpath("//h1");
    private By whatIs = By.xpath("//h1");
    private static By anyMaterialCard = By.xpath("//md-card-content");

    public static LandingPage goToLandingPage() {
        getDriver().get(landingPage);
        PageHelper.waitForClickable(anyMaterialCard);
        return new LandingPage();
    }

    public AboutPage clickAboutLink() {
        getDriver().findElement(aboutLink).click();
        PageHelper.waitForText(whatIs, "Digitaalse õppevara keskus");
        return new AboutPage();

    }

    public HelpPage clickHelpLink() {
        getDriver().findElement(helpLink).click();
        PageHelper.waitForText(howToUse, "Otsing");
        return new HelpPage();
    }

    public String getTitle() {
        return getDriver().findElement(uusimadTitle).getText();
    }

    public ProfilePage goToProfilePage(String userName) {
        getDriver().get(landingPage + userName);
        return new ProfilePage();
    }

}
