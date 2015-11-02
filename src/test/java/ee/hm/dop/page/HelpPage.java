package ee.hm.dop.page;

import org.openqa.selenium.By;

public class HelpPage extends Page {

    private By mainTitle = By.xpath("//div/h1");
    private By aboutLink = By.xpath("//a[contains(@data-translate, 'ABOUT_PAGE_LINK_TITLE')]");

    public String getMainTitle() {
        return getDriver().findElement(mainTitle).getText();
    }

    public AboutPage clickAboutLink() {
        getDriver().findElement(aboutLink).click();
        return new AboutPage();

    }

}
