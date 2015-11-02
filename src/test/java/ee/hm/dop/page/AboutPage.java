package ee.hm.dop.page;

import org.openqa.selenium.By;

public class AboutPage extends Page {

    private By mainTitle = By.xpath("//div/h1");
    private By helpLink = By.xpath("//a[contains(@data-translate, 'HELP_PAGE_LINK_TITLE')]");

    public String getMainTitle() {
        return getDriver().findElement(mainTitle).getText();
    }

    public HelpPage clickHelpLink() {
        getDriver().findElement(helpLink).click();
        return new HelpPage();
    }

}
