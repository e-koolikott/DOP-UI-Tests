package ee.hm.dop.page;

import org.openqa.selenium.By;

public class LandingPage extends Page {

    private static String landingPage = "https://oxygen.netgroupdigital.com/";
    private By aboutLink = By.xpath("//a[contains(@data-translate, 'ABOUT_PAGE_LINK_TITLE')]");
    private By helpLink = By.xpath("//a[contains(@data-translate, 'HELP_PAGE_LINK_TITLE')]");

    public static LandingPage goToLandingPage() {
        getDriver().get(landingPage);
        return new LandingPage();
    }

    public AboutPage clickAboutLink() {
        getDriver().findElement(aboutLink).click();
        return new AboutPage();

    }

    public HelpPage clickHelpLink() {
        getDriver().findElement(helpLink).click();
        return new HelpPage();
    }

}
